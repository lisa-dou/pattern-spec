package main;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.resource.UMLResource;

import Utils.UML2ProfileHelpers;
import Utils.UML2Util;
import Utils.UML2Helpers;


import designPatterns.MediatedObserverPattern;
import designPatterns.MediatorPattern;
import designPatterns.ObserverPattern;
import designPatterns.DesignPatternsFactory;
import designPatterns.util.DesignPatternsValidator;

public class Main {
// The Process of Defining Design Patterns
// 1. Identify Structural Roles in a Pattern
// 2. Identify Dynamic Relations in this Pattern
// 3. Identify Evolution and Composition Operations for this pattern
// 3. Build a Profile for this Pattern
// 4. Implement the ApplyPatternProfile() method 
// 5. Implement the CreatePatternSpecification() method
// 6. Implement Evolution and Composition Operations
// 7. Implement the CreateInitialPatternStructure() method
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		//RegisterOCLDelegations();
		UML2Util.registerResourceFactories();
		UML2Util.registerPathmaps(URI.createURI(args[1]));
		
		
		//Class newsub = op.CreateConcreteSubject("MyConSub1", null, op.getIntPrimType(), null, null);
		//Class newsub1 = op.CreateConcreteSubject("MyConSub2", null, op.getIntPrimType(), null, null);
		//op.CreateConcreteObserver("MyConObs1", null, op.getIntPrimType(), newsub);		
		//op.ApplyPatternProfile();
		Boolean d=false;
		
		
		// Pattern Instantiation							
		// Create An Instance of Observer Pattern						
		ObserverPattern op=DesignPatternsFactory.eINSTANCE.createObserverPattern();				
		op.CreateInitialPatternStructure();
		Class newsub = op.CreateConcreteSubject("MyConSub1", null, op.getIntPrimType(), null, null);					
		op.CreateConcreteObserver("MyConObs1",null,op.getIntPrimType(),newsub);
        op.CreateConcreteObserver("MyConObs2",null,op.getIntPrimType(),newsub);
		op.SaveAsUML(args[0]);
		/*
		//  Create An Instance of Mediator Pattern
		MediatorPattern mp=DesignPatternsFactory.eINSTANCE.createMediatorPattern();	
		mp.setUmlModel(op.getUmlModel());
		mp.CreateInitialPatternStructure();
		Class concoll1=mp.CreateConcreteColleague("MyConColl1");
		Class concoll2=mp.CreateConcreteColleague("MyConColl2");
		EList<Class> concolls= new BasicEList<Class>();
		concolls.add(concoll1);	
		concolls.add(concoll2);
		
		op.AddConcreteObserver(concoll1, null, op.getIntPrimType(), newsub);
		
		UML2Util.registerResourceFactories();
		UML2Util.registerPathmaps(URI.createURI(args[1]));
		
		mp.ApplyPatternProfile();
		UML2ProfileHelpers.save(mp.getPatternProfile(), URI.createURI(args[0]).appendSegment("MediatorPattern")
				.appendFileExtension(UMLResource.PROFILE_FILE_EXTENSION));
		op.SaveAsUML(args[0]);
		
		
		
		MediatedObserverPattern mop=DesignPatternsFactory.eINSTANCE.createMediatedObserverPattern();
		mop.Compose(op, null);
		//mop.SaveAsUML(args[0]);
		//MediatorPattern mp=DesignPatternsFactory.eINSTANCE.createMediatorPattern();
		//mp.CreateInitialPatternStructure();
		//	
		//mop.CreateInitialPatternStructure();
		
		
		/*
		Class newsub = op.AddConcreteSubject("ConSubj1", null, op.getStringPrimType(), null, null);
		op.AddConcreteObserver("Ben", null, op.getIntPrimType(), newsub);
		op.AddConcreteObserver("John", null, op.getIntPrimType(), newsub);
		
		Class Class1=mp.AddConcreteColleague("Class1");
		Class Class2=mp.AddConcreteColleague("Class2");
		EList<Class> concolls= new BasicEList<Class>();
		concolls.add(Class1);
		concolls.add(Class2);
		mp.AddConcreteMediator("Med1", concolls);
		Operation Op=mp.AddCommunicationOp(Class1, "C", null, null, null);
		
		Class Class3=UML2Helpers.createClass(mp.getUmlModel(), "Class3", false);
		UML2Helpers.createGeneralization(Class3, Class2);
		EList<Classifier> ap=Class3.allParents();
		Iterator<Classifier> apit=ap.iterator();
		while(apit.hasNext())
		{
			Classifier cls=apit.next();
			UML2Helpers.out("Name is "+cls.getName());
		}

		// Add Pattern Specifications:In this case,JML Specifications
		//op.CreatePatternSpecification();

		// Apply Stereotype Profile
		mp.ApplyPatternProfile();
		
		//mp.SaveAsUML(args[0]);
		
		//mop.getObserverPattern().SaveAsUML(args[0]);
		*/
		
		
		
	}
}
