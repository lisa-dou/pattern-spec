package Utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class MediatorPatternProfile{

	public Profile profile = UML2ProfileHelpers.createProfile("MPPf");
	
    // The final boolean parameter indicates Abstract or not. 
    // If a stereotype is abstract, then it can not be applied to a NamedElement	
    
    public void setProfile(Profile profile) {
		this.profile = profile;
	}

	
    //1
    public Stereotype MediatorRole = UML2ProfileHelpers.createStereotype(
			profile, "Mediator", false);
	//2        
    public Stereotype ColleagueRole = UML2ProfileHelpers.createStereotype(
			profile, "Colleague", false);
	//3
    public Stereotype ConcreteMediatorRole = UML2ProfileHelpers.createStereotype(
			profile, "ConcreteMediator", false);
	//4
    public Stereotype ConcreteColleagueRole = UML2ProfileHelpers.createStereotype(
			profile, "ConcreteColleague", false);	
	//5
    public Stereotype ConcreteMediatorAssoRole = UML2ProfileHelpers.createStereotype(
			profile, "ConcreteMediatorAsso", false);
	//6
    public Stereotype CommunicationInterfaceOpRole = UML2ProfileHelpers.createStereotype(
			profile, "CommInterfOp", false);
	//7
    public Stereotype ColleagueAssoRole = UML2ProfileHelpers.createStereotype(
			profile, "ColleagueAsso", false);
	
	
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
	
	private MediatorPatternProfile()
	{
		// Create Extensions
		//1
		UML2ProfileHelpers.createExtension(classMetaclass, MediatorRole, false);
		//2
		UML2ProfileHelpers.createExtension(classMetaclass, ColleagueRole, false);
		//3
		UML2ProfileHelpers.createExtension(classMetaclass, this.ConcreteMediatorRole, false);
		//4
		UML2ProfileHelpers.createExtension(classMetaclass, this.ConcreteColleagueRole, false);	
		//5
		UML2ProfileHelpers.createExtension(this.associationMetaclass, this.ConcreteMediatorAssoRole, false);		
		//6
		UML2ProfileHelpers.createExtension(this.operationMetaclass, this.CommunicationInterfaceOpRole, false);
		//7
		UML2ProfileHelpers.createExtension(this.associationMetaclass, this.ColleagueAssoRole, false);
				
		UML2ProfileHelpers.defineProfile(profile);					
	}
	
	public static MediatorPatternProfile getProfile()
	{
		return new MediatorPatternProfile();
	}
	
}
