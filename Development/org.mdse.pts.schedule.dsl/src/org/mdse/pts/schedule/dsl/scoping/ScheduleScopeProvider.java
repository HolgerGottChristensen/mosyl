/*
 * generated by Xtext 2.20.0
 */
package org.mdse.pts.schedule.dsl.scoping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.TrainSchedule;


import org.mdse.pts.common.util.*;
import org.mdse.pts.depot.Root;
import org.mdse.pts.depot.Train;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Network;
import org.mdse.pts.network.Station;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class ScheduleScopeProvider extends AbstractScheduleScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		//TODO: Implement custom scope provider if needed.
		
		if (context instanceof Schedule && reference.getName().equals("network")) {
			URI resource = context.eResource().getURI();
			IFile file = EclipseUtil.resolveRelativeFileFromResourceURI(resource);
			IWorkspace workspace = file.getWorkspace();
			try {
				List<IFile> networkFile = processContainer(workspace.getRoot(), "network");
				List<Network> networks = networkFile.stream().map(x -> EcoreIOUtil.<Network>loadModel(x)).collect(Collectors.toList());
				return Scopes.scopeFor(networks, x -> {
					String name = EcoreUtil.getURI(x).lastSegment();
					return QualifiedName.create(name.split("\\.")[0]);
					}, IScope.NULLSCOPE);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		if (context instanceof Schedule && reference.getName().equals("depot")) {
			URI resource = context.eResource().getURI();
			IFile file = EclipseUtil.resolveRelativeFileFromResourceURI(resource);
			IWorkspace workspace = file.getWorkspace();
			try {
				List<IFile> networkFile = processContainer(workspace.getRoot(), "depot");
				List<Root> networks = networkFile.stream().map(x -> EcoreIOUtil.<Root>loadModel(x)).collect(Collectors.toList());
				
				return Scopes.scopeFor(networks, x -> {
					String name = EcoreUtil.getURI(x).lastSegment();
					return QualifiedName.create(name.split("\\.")[0]);
					}, IScope.NULLSCOPE);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		if (context instanceof TrainSchedule && reference.getName().equals("train")) {
			Schedule schedule = (Schedule) EcoreUtil.getRootContainer(context);
			List<Train> trains = schedule.getDepot().get(0).getDepot().getTrain();
			
			return Scopes.scopeFor(trains);
		}
		
		if (context instanceof TrainSchedule && reference.getName().equals("train")) {
			Schedule schedule = (Schedule) EcoreUtil.getRootContainer(context);
			List<Train> trains = schedule.getDepot().get(0).getDepot().getTrain();
			
			return Scopes.scopeFor(trains);
		}
		
		if (context instanceof Stop && reference.getName().equals("station")) {
			Schedule schedule = (Schedule) EcoreUtil.getRootContainer(context);
			List<Station> stations = schedule.getNetwork().getStations();
			
			return Scopes.scopeFor(stations);
		}
		
		if (context instanceof Stop && reference.getName().equals("via")) {
			Schedule schedule = (Schedule) EcoreUtil.getRootContainer(context);
			List<Leg> legs = schedule.getNetwork().getLegs();
			return Scopes.scopeFor(legs, x -> {
				if (x.getName().isEmpty()) {
					return null;
				}
				return QualifiedName.create(x.getName());
				}, IScope.NULLSCOPE);
		}
		
		return super.getScope(context, reference);
	}

	List<IFile> processContainer(IContainer container, String extension) throws CoreException {

		List<IFile> filesWithExtension = new ArrayList<>();
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IContainer)
				filesWithExtension.addAll(processContainer((IContainer) member, extension));
			else if (member instanceof IFile) {
				IFile file = (IFile) member;
				//System.out.println(file.getFileExtension());
				if (file.getFileExtension().equals(extension)) {
					filesWithExtension.add(file);
				}
			}
		}
		
		return filesWithExtension;
	}
}
