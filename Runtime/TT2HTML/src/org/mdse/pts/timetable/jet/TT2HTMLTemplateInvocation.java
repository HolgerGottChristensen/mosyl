package org.mdse.pts.timetable.jet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.mdse.pts.timetable.*;
import org.mdse.pts.timetable.TimetablePackage;

public class TT2HTMLTemplateInvocation {
	private static final File input = new File("./Input/My.timetable");
	
	private static Timetable loadTable(File file) {
		// Stand-alone setup of Ecore:
		// "Touch" the package once to make sure its classes are loaded.
		TimetablePackage.eINSTANCE.eClass();		
		
        // Register the XMI resource factory for the file extension
        Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> factoryMap = registry.getExtensionToFactoryMap();
        factoryMap.put("timetable", new XMIResourceFactoryImpl());

        
        // Loading of model:
        // Create a new resource set (collection of resources)
        ResourceSet resourceSet = new ResourceSetImpl();

        // Get a resource for the file
        URI uri = URI.createURI(file.getPath());
        Resource resource = resourceSet.getResource(uri, true);
        
        // Get the first model element and cast it to the right type
        return (Timetable) resource.getContents().get(0);
	}
	
	public static final void main(String[] args) throws IOException {
		//Manual invocation of the template generated by JET
		TT2HTMLTemplate template = new TT2HTMLTemplate();
		
		Timetable t = loadTable(input);
		
		for(Table table : t.getTable()) {
			String generatedContent = template.generate(table);
			File output = new File("./Output/Tables/" + table.getStation().getName() +"-timetable.html");
			Files.write(output.toPath(), generatedContent.getBytes());
		}
		
	}
}