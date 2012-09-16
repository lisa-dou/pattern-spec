package Utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class ObserverPatternProfile{

	public Profile profile = UML2ProfileHelpers.createProfile("OPPf");
	
    // The final boolean parameter indicates Abstract or not. 
    // If a stereotype is abstract, then it can not be applied to a NamedElement	
    
    public void setProfile(Profile profile) {
		this.profile = profile;
	}

	// Create Stereotypes
    //1
    public Stereotype subjectRole = UML2ProfileHelpers.createStereotype(
			profile, "Subject", false);
	//2        
    public Stereotype observerRole = UML2ProfileHelpers.createStereotype(
			profile, "Observer", false);
	//3
    public Stereotype conSubjectRole = UML2ProfileHelpers.createStereotype(
			profile, "ConcreteSubject", false);
	//4
    public Stereotype conObserverRole = UML2ProfileHelpers.createStereotype(
			profile, "ConcreteObserver", false);	
	//5
    public Stereotype conSubStateRole = UML2ProfileHelpers.createStereotype(
			profile, "ConSubjectState", false);
	//6
    public Stereotype conObsStateRole = UML2ProfileHelpers.createStereotype(
			profile, "ConObserverState", false);
	//7
    public Stereotype AttachRoleRole = UML2ProfileHelpers.createStereotype(
			profile, "AttachOp", false);
	//8
    public Stereotype attachParaRole = UML2ProfileHelpers.createStereotype(
			profile, "AttachPara", false);
	//9
    public Stereotype DetachRole = UML2ProfileHelpers.createStereotype(
			profile, "DetachOp", false);
	//10
    public Stereotype detachParaRole = UML2ProfileHelpers.createStereotype(
			profile, "DetachPara", false);
	//11
    public Stereotype NotifyRole = UML2ProfileHelpers.createStereotype(
			profile, "NotifyOp", false);
	//12
    public Stereotype UpdateRole = UML2ProfileHelpers.createStereotype(
			profile, "UpdateOp", false);
	//13
    public Stereotype GetStateOpRole = UML2ProfileHelpers.createStereotype(
			profile, "GetStateOp", false);
	//14
    public Stereotype SetStateOpRole = UML2ProfileHelpers.createStereotype(
			profile, "SetStateOp", false);
	//15
    public Stereotype observersAssoRole = UML2ProfileHelpers.createStereotype(
			profile, "ObserversAsso", false);
	//16
    public Stereotype subjectsAssoRole = UML2ProfileHelpers.createStereotype(
			profile, "SubjectAsso", false);
    
    //17. Updated concrete observers
    public Stereotype conobsUpdated = UML2ProfileHelpers.createStereotype(
			profile, "ConObserverUpdate", false);
	
	// Reference of Metaclass
	Class classMetaclass = UML2ProfileHelpers.referenceMetaclass(
			profile, UMLPackage.Literals.CLASS.getName());
	Class propertyMetaclass = UML2ProfileHelpers.referenceMetaclass(
			profile, UMLPackage.Literals.PROPERTY.getName());
	Class operationMetaclass = UML2ProfileHelpers.referenceMetaclass(
			profile, UMLPackage.Literals.OPERATION.getName());
	Class parameterMetaclass = UML2ProfileHelpers.referenceMetaclass(
			profile, UMLPackage.Literals.PARAMETER.getName());
	Class associationMetaclass = UML2ProfileHelpers.referenceMetaclass(
			profile, UMLPackage.Literals.ASSOCIATION.getName());
	
	private ObserverPatternProfile()
	{
		// Create Extensions
		//1
		UML2ProfileHelpers.createExtension(classMetaclass, subjectRole, false);
		//2
		UML2ProfileHelpers.createExtension(classMetaclass, observerRole, false);
		//3
		UML2ProfileHelpers.createExtension(classMetaclass, this.conSubjectRole, false);
		//4
		UML2ProfileHelpers.createExtension(classMetaclass, this.conObserverRole, false);	
		//5
		UML2ProfileHelpers.createExtension(this.propertyMetaclass, this.conSubStateRole, false);
		//6
		UML2ProfileHelpers.createExtension(this.propertyMetaclass, this.conObsStateRole, false);
		//7
		UML2ProfileHelpers.createExtension(this.operationMetaclass, this.AttachRoleRole, false);
		//8
		UML2ProfileHelpers.createExtension(this.parameterMetaclass, this.attachParaRole, false);
		//9
		UML2ProfileHelpers.createExtension(this.operationMetaclass, this.DetachRole, false);
		//10
		UML2ProfileHelpers.createExtension(this.parameterMetaclass, this.detachParaRole, false);
		//11
		UML2ProfileHelpers.createExtension(this.operationMetaclass, this.NotifyRole, false);
		//12
		UML2ProfileHelpers.createExtension(this.operationMetaclass, this.UpdateRole, false);
		//13
		UML2ProfileHelpers.createExtension(this.operationMetaclass, this.GetStateOpRole, false);
		//14
		UML2ProfileHelpers.createExtension(this.operationMetaclass, this.SetStateOpRole, false);
		//15
		UML2ProfileHelpers.createExtension(this.associationMetaclass, this.observersAssoRole, false);
		//16
		UML2ProfileHelpers.createExtension(this.associationMetaclass, this.subjectsAssoRole, false);
		// 17
		UML2ProfileHelpers.createExtension(this.operationMetaclass, this.conobsUpdated, false);
		UML2ProfileHelpers.defineProfile(profile);					
	}
	
	public static ObserverPatternProfile getProfile()
	{
		return new ObserverPatternProfile();
	}
	
}
