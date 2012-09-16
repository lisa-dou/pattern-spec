/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns.impl;

import designPatterns.DesignPattern;
import designPatterns.DesignPatternsFactory;
import designPatterns.DesignPatternsPackage;
import designPatterns.MediatorPattern;

import org.eclipse.emf.common.util.URI;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Device;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.resource.UMLResource;


import Utils.MediatorPatternProfile;
import Utils.UML2Helpers;
import Utils.UML2ProfileHelpers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediator Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link designPatterns.impl.MediatorPatternImpl#getMediator <em>Mediator</em>}</li>
 *   <li>{@link designPatterns.impl.MediatorPatternImpl#getColleague <em>Colleague</em>}</li>
 *   <li>{@link designPatterns.impl.MediatorPatternImpl#getConcreteMediators <em>Concrete Mediators</em>}</li>
 *   <li>{@link designPatterns.impl.MediatorPatternImpl#getConcreteColleagues <em>Concrete Colleagues</em>}</li>
 *   <li>{@link designPatterns.impl.MediatorPatternImpl#getConcreteMediatorAsso_colleague <em>Concrete Mediator Asso colleague</em>}</li>
 *   <li>{@link designPatterns.impl.MediatorPatternImpl#getCommunicationInterface <em>Communication Interface</em>}</li>
 *   <li>{@link designPatterns.impl.MediatorPatternImpl#getColleagueAsso_mediator <em>Colleague Asso mediator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediatorPatternImpl extends DesignPatternImpl implements MediatorPattern
{
	/**
	 * The cached value of the '{@link #getMediator() <em>Mediator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediator()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class mediator;

	/**
	 * The cached value of the '{@link #getColleague() <em>Colleague</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColleague()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class colleague;

	/**
	 * The cached value of the '{@link #getConcreteMediators() <em>Concrete Mediators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediators()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.uml2.uml.Class> concreteMediators;

	/**
	 * The cached value of the '{@link #getConcreteColleagues() <em>Concrete Colleagues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteColleagues()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.uml2.uml.Class> concreteColleagues;

	public void CreateInitialPatternStructure()
	{
		// TODO Auto-generated method stub
			
		// 1.
		this.setMediator(UML2Helpers.createClass(this.getUmlModel(), "Mediator", true));
		// 2.
		this.setColleague(UML2Helpers.createClass(this.getUmlModel(), "Colleague", true));
		// 3.
		this.getConcreteMediators();
		// 4.
		this.getConcreteColleagues();
		// 5.
		this.getConcreteMediatorAsso_colleague();
		// 6.
		this.getCommunicationInterface();
		// 7.
		this.setColleagueAsso_mediator(UML2Helpers.createAssociation(this.getMediator(), false,
				AggregationKind.NONE_LITERAL, "", 1, 1,
				this.getColleague(), true, AggregationKind.NONE_LITERAL, "mediator", 1, 1));
	}

	public void ApplyPatternProfile()
	{
		// TODO Auto-generated method stub
		MediatorPatternProfile mpp=MediatorPatternProfile.getProfile();
		UML2ProfileHelpers.applyProfile(this.getUmlModel(), mpp.profile);
		this.setPatternProfile(mpp.profile);
		// Applying Stereotypes
		// 1
		UML2ProfileHelpers.applyStereotype(this.getMediator(), mpp.MediatorRole);
		// 2
		UML2ProfileHelpers.applyStereotype(this.getColleague(), mpp.ColleagueRole);
		// 3
		Iterator<Class> itc1 = this.getConcreteMediators().iterator();
		while (itc1.hasNext()) {
			Class c = itc1.next();
			UML2ProfileHelpers.applyStereotype(c, mpp.ConcreteMediatorRole);
		}
		// 4
		Iterator<Class> itc22 = this.getConcreteColleagues().iterator();
		while (itc22.hasNext()) {
			Class c = itc22.next();
			UML2ProfileHelpers.applyStereotype(c, mpp.ConcreteColleagueRole);
		}
		// 5
		Iterator<Association> itconss = this.getConcreteMediatorAsso_colleague().iterator();
		while (itconss.hasNext()) {
			Association p = itconss.next();
			UML2ProfileHelpers.applyStereotype(p, mpp.ColleagueAssoRole);
		}
		// 6
		Iterator<Operation> itconos = this.getCommunicationInterface().iterator();
		while (itconos.hasNext()) {
			Operation p = itconos.next();
			UML2ProfileHelpers.applyStereotype(p, mpp.CommunicationInterfaceOpRole);
		}
		// 7
		UML2ProfileHelpers.applyStereotype(this.getColleagueAsso_mediator(), mpp.ColleagueAssoRole);
	}
		

	/**
	 * The cached value of the '{@link #getConcreteMediatorAsso_colleague() <em>Concrete Mediator Asso colleague</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediatorAsso_colleague()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> concreteMediatorAsso_colleague;

	/**
	 * The cached value of the '{@link #getCommunicationInterface() <em>Communication Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> communicationInterface;

	/**
	 * The cached value of the '{@link #getColleagueAsso_mediator() <em>Colleague Asso mediator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColleagueAsso_mediator()
	 * @generated
	 * @ordered
	 */
	protected Association colleagueAsso_mediator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	protected MediatorPatternImpl()
	{
		super();
		this.getUmlModel().setName("MediatorPattern");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DesignPatternsPackage.Literals.MEDIATOR_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getMediator()
	{
		if (mediator != null && mediator.eIsProxy())
		{
			InternalEObject oldMediator = (InternalEObject)mediator;
			mediator = (org.eclipse.uml2.uml.Class)eResolveProxy(oldMediator);
			if (mediator != oldMediator)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATOR_PATTERN__MEDIATOR, oldMediator, mediator));
			}
		}
		return mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetMediator()
	{
		return mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediator(org.eclipse.uml2.uml.Class newMediator)
	{
		org.eclipse.uml2.uml.Class oldMediator = mediator;
		mediator = newMediator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATOR_PATTERN__MEDIATOR, oldMediator, mediator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getColleague()
	{
		if (colleague != null && colleague.eIsProxy())
		{
			InternalEObject oldColleague = (InternalEObject)colleague;
			colleague = (org.eclipse.uml2.uml.Class)eResolveProxy(oldColleague);
			if (colleague != oldColleague)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE, oldColleague, colleague));
			}
		}
		return colleague;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetColleague()
	{
		return colleague;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColleague(org.eclipse.uml2.uml.Class newColleague)
	{
		org.eclipse.uml2.uml.Class oldColleague = colleague;
		colleague = newColleague;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE, oldColleague, colleague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getConcreteMediators()
	{
		if (concreteMediators == null)
		{
			concreteMediators = new EObjectResolvingEList<org.eclipse.uml2.uml.Class>(org.eclipse.uml2.uml.Class.class, this, DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATORS);
		}
		return concreteMediators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getConcreteColleagues()
	{
		if (concreteColleagues == null)
		{
			concreteColleagues = new EObjectResolvingEList<org.eclipse.uml2.uml.Class>(org.eclipse.uml2.uml.Class.class, this, DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_COLLEAGUES);
		}
		return concreteColleagues;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getConcreteMediatorAsso_colleague()
	{
		if (concreteMediatorAsso_colleague == null)
		{
			concreteMediatorAsso_colleague = new EObjectResolvingEList<Association>(Association.class, this, DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATOR_ASSO_COLLEAGUE);
		}
		return concreteMediatorAsso_colleague;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getCommunicationInterface()
	{
		if (communicationInterface == null)
		{
			communicationInterface = new EObjectResolvingEList<Operation>(Operation.class, this, DesignPatternsPackage.MEDIATOR_PATTERN__COMMUNICATION_INTERFACE);
		}
		return communicationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getColleagueAsso_mediator()
	{
		if (colleagueAsso_mediator != null && colleagueAsso_mediator.eIsProxy())
		{
			InternalEObject oldColleagueAsso_mediator = (InternalEObject)colleagueAsso_mediator;
			colleagueAsso_mediator = (Association)eResolveProxy(oldColleagueAsso_mediator);
			if (colleagueAsso_mediator != oldColleagueAsso_mediator)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR, oldColleagueAsso_mediator, colleagueAsso_mediator));
			}
		}
		return colleagueAsso_mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetColleagueAsso_mediator()
	{
		return colleagueAsso_mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColleagueAsso_mediator(Association newColleagueAsso_mediator)
	{
		Association oldColleagueAsso_mediator = colleagueAsso_mediator;
		colleagueAsso_mediator = newColleagueAsso_mediator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR, oldColleagueAsso_mediator, colleagueAsso_mediator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public org.eclipse.uml2.uml.Class CreateConcreteMediator(String ConMediatorName, EList<org.eclipse.uml2.uml.Class> ConColleagues)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (ConMediatorName == null)
		{
			ConMediatorName = "ConcreteMediator";
		}
		Class newmed = UML2Helpers.createClass(this.getUmlModel(), ConMediatorName,false);
		this.getConcreteMediators().add(newmed);
		// 2. Add Association to each member in the ConColleagues
		Iterator<Class> ItColl=ConColleagues.iterator();
		while(ItColl.hasNext())
		{
			Class concoll=ItColl.next();
			Association asso = UML2Helpers.createAssociation(newmed, true,
				AggregationKind.NONE_LITERAL, concoll.getName(), 1, 1, 
				concoll,false, AggregationKind.NONE_LITERAL, "", 1, 1);
			this.getConcreteMediatorAsso_colleague().add(asso);
		}		
		// 3. Inherit from Mediator
		UML2Helpers.createGeneralization(newmed, this.getMediator());
		return newmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public org.eclipse.uml2.uml.Class CreateConcreteColleague(String ConColleagueName)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (ConColleagueName == null)
		{
			ConColleagueName = "ConcreteColleague";
		}
		// 2. Add it to the ConColleague set
		Class newcoll = UML2Helpers.createClass(this.getUmlModel(), ConColleagueName,false);
		this.getConcreteColleagues().add(newcoll);
		// 3. Inherit from the Colleague Class		
		UML2Helpers.createGeneralization(newcoll, this.getColleague());
		
		return newcoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public Operation CreateCommunicationOp(org.eclipse.uml2.uml.Class ConMediator, String OperationName, EList<String> ParameterNames, EList<Type> ParameterTypes, Type ReturnType)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// 1. Create the Operation
		Operation op=ConMediator.createOwnedOperation(OperationName, ParameterNames, ParameterTypes,ReturnType);
		// 2. Add op to ComInterface
		this.getCommunicationInterface().add(op);
		return op;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public void AddConcreteColleage(org.eclipse.uml2.uml.Class class_)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// Add class_ to the Set of Concrete Colleagues
		this.getConcreteColleagues().add(class_);
		// Make it Inherit from the Colleague
		UML2Helpers.createGeneralization(class_, this.getColleague());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public void AddConcreteMediator(org.eclipse.uml2.uml.Class class_, EList<org.eclipse.uml2.uml.Class> ConColleagues)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		this.getConcreteMediators().add(class_);
		// 2. Add Association to each member in the ConColleagues
		Iterator<Class> ItColl=ConColleagues.iterator();
		while(ItColl.hasNext())
		{
			Class concoll=ItColl.next();
			Association asso = UML2Helpers.createAssociation(class_, true,
				AggregationKind.NONE_LITERAL, concoll.getName(), 1, 1, 
				concoll,false, AggregationKind.NONE_LITERAL, "", 1, 1);
			this.getConcreteMediatorAsso_colleague().add(asso);
		}		
		// 3. Inherit from Mediator
		UML2Helpers.createGeneralization(class_, this.getMediator());		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case DesignPatternsPackage.MEDIATOR_PATTERN__MEDIATOR:
				if (resolve) return getMediator();
				return basicGetMediator();
			case DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE:
				if (resolve) return getColleague();
				return basicGetColleague();
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATORS:
				return getConcreteMediators();
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_COLLEAGUES:
				return getConcreteColleagues();
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATOR_ASSO_COLLEAGUE:
				return getConcreteMediatorAsso_colleague();
			case DesignPatternsPackage.MEDIATOR_PATTERN__COMMUNICATION_INTERFACE:
				return getCommunicationInterface();
			case DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR:
				if (resolve) return getColleagueAsso_mediator();
				return basicGetColleagueAsso_mediator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DesignPatternsPackage.MEDIATOR_PATTERN__MEDIATOR:
				setMediator((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE:
				setColleague((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATORS:
				getConcreteMediators().clear();
				getConcreteMediators().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_COLLEAGUES:
				getConcreteColleagues().clear();
				getConcreteColleagues().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATOR_ASSO_COLLEAGUE:
				getConcreteMediatorAsso_colleague().clear();
				getConcreteMediatorAsso_colleague().addAll((Collection<? extends Association>)newValue);
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__COMMUNICATION_INTERFACE:
				getCommunicationInterface().clear();
				getCommunicationInterface().addAll((Collection<? extends Operation>)newValue);
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR:
				setColleagueAsso_mediator((Association)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case DesignPatternsPackage.MEDIATOR_PATTERN__MEDIATOR:
				setMediator((org.eclipse.uml2.uml.Class)null);
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE:
				setColleague((org.eclipse.uml2.uml.Class)null);
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATORS:
				getConcreteMediators().clear();
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_COLLEAGUES:
				getConcreteColleagues().clear();
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATOR_ASSO_COLLEAGUE:
				getConcreteMediatorAsso_colleague().clear();
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__COMMUNICATION_INTERFACE:
				getCommunicationInterface().clear();
				return;
			case DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR:
				setColleagueAsso_mediator((Association)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case DesignPatternsPackage.MEDIATOR_PATTERN__MEDIATOR:
				return mediator != null;
			case DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE:
				return colleague != null;
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATORS:
				return concreteMediators != null && !concreteMediators.isEmpty();
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_COLLEAGUES:
				return concreteColleagues != null && !concreteColleagues.isEmpty();
			case DesignPatternsPackage.MEDIATOR_PATTERN__CONCRETE_MEDIATOR_ASSO_COLLEAGUE:
				return concreteMediatorAsso_colleague != null && !concreteMediatorAsso_colleague.isEmpty();
			case DesignPatternsPackage.MEDIATOR_PATTERN__COMMUNICATION_INTERFACE:
				return communicationInterface != null && !communicationInterface.isEmpty();
			case DesignPatternsPackage.MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR:
				return colleagueAsso_mediator != null;
		}
		return super.eIsSet(featureID);
	}

} //MediatorPatternImpl
