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
import designPatterns.ObserverPattern;

import designPatterns.util.DesignPatternsValidator;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

import Utils.*;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observer Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getObserver <em>Observer</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getConcreteObservers <em>Concrete Observers</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getConcreteSubjects <em>Concrete Subjects</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getConcreteObserverStates <em>Concrete Observer States</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getConcreteSubjectStates <em>Concrete Subject States</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getAttach <em>Attach</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getAttachPara <em>Attach Para</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getDetach <em>Detach</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getDetachPara <em>Detach Para</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getNotify <em>Notify</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getConcreteSubjectGetStateOps <em>Concrete Subject Get State Ops</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getConcreteSubjectSetStateOps <em>Concrete Subject Set State Ops</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getConcreteObserversUpdateOps <em>Concrete Observers Update Ops</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getSubjectAsso_observers <em>Subject Asso observers</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getConcreteObserverAssos_subject <em>Concrete Observer Assos subject</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getPattern_Predicates <em>Pattern Predicates</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getPattern_Attached <em>Pattern Attached</em>}</li>
 *   <li>{@link designPatterns.impl.ObserverPatternImpl#getPattern_Updated <em>Pattern Updated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObserverPatternImpl extends DesignPatternImpl implements ObserverPattern {
	/**
	 * The cached value of the '{@link #getObserver() <em>Observer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class observer;

	/**
	 * The cached value of the '{@link #getConcreteObservers() <em>Concrete Observers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteObservers()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.uml2.uml.Class> concreteObservers;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class subject;

	/**
	 * The cached value of the '{@link #getConcreteSubjects() <em>Concrete Subjects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.uml2.uml.Class> concreteSubjects;

	/**
	 * The cached value of the '{@link #getConcreteObserverStates() <em>Concrete Observer States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteObserverStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> concreteObserverStates;

	/**
	 * The cached value of the '{@link #getConcreteSubjectStates() <em>Concrete Subject States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteSubjectStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> concreteSubjectStates;

	/**
	 * The cached value of the '{@link #getAttach() <em>Attach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach()
	 * @generated
	 * @ordered
	 */
	protected Operation attach;

	/**
	 * The cached value of the '{@link #getAttachPara() <em>Attach Para</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachPara()
	 * @generated
	 * @ordered
	 */
	protected Parameter attachPara;

	/**
	 * The cached value of the '{@link #getDetach() <em>Detach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetach()
	 * @generated
	 * @ordered
	 */
	protected Operation detach;

	/**
	 * The cached value of the '{@link #getDetachPara() <em>Detach Para</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetachPara()
	 * @generated
	 * @ordered
	 */
	protected Parameter detachPara;

	/**
	 * The cached value of the '{@link #getNotify() <em>Notify</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotify()
	 * @generated
	 * @ordered
	 */
	protected Operation notify;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected Operation update;

	/**
	 * The cached value of the '{@link #getConcreteSubjectGetStateOps() <em>Concrete Subject Get State Ops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteSubjectGetStateOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> concreteSubjectGetStateOps;

	/**
	 * The cached value of the '{@link #getConcreteSubjectSetStateOps() <em>Concrete Subject Set State Ops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteSubjectSetStateOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> concreteSubjectSetStateOps;

	/**
	 * The cached value of the '{@link #getConcreteObserversUpdateOps() <em>Concrete Observers Update Ops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteObserversUpdateOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> concreteObserversUpdateOps;

	/**
	 * The cached value of the '{@link #getSubjectAsso_observers() <em>Subject Asso observers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectAsso_observers()
	 * @generated
	 * @ordered
	 */
	protected Association subjectAsso_observers;

	/**
	 * The cached value of the '{@link #getConcreteObserverAssos_subject() <em>Concrete Observer Assos subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteObserverAssos_subject()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> concreteObserverAssos_subject;

	/**
	 * The cached value of the '{@link #getPattern_Predicates() <em>Pattern Predicates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern_Predicates()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class pattern_Predicates;

	/**
	 * The cached value of the '{@link #getPattern_Attached() <em>Pattern Attached</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern_Attached()
	 * @generated
	 * @ordered
	 */
	protected Operation pattern_Attached;

	/**
	 * The cached value of the '{@link #getPattern_Updated() <em>Pattern Updated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern_Updated()
	 * @generated
	 * @ordered
	 */
	protected Operation pattern_Updated;
	
	//protected Model umlOP;
	
	

	
	public DesignPattern GetInitialStructure()
	{
		ObserverPattern op = DesignPatternsFactory.eINSTANCE.createObserverPattern();
		

		op.setUmlModel(UML2Helpers.createModel("ObserverPattern"));
		
		op.setIntPrimType(UML2Helpers.createPrimitiveType(op.getUmlModel(), "Integer"));
		op.setBoolPrimType(UML2Helpers.createPrimitiveType(op.getUmlModel(), "Boolean"));
		op.setStringPrimType(UML2Helpers.createPrimitiveType(op.getUmlModel(), "String"));
		
				
		// 1
		op.setObserver(UML2Helpers.createClass(op.getUmlModel(), "Observer", true));
		// 2
		op.setSubject(UML2Helpers.createClass(op.getUmlModel(), "Subject", true));
		// 3		
		op.getConcreteSubjects(); 
		// 4
		op.getConcreteObservers();
		// 5
		op.getConcreteSubjectStates();
		// 6
		op.getConcreteObserverStates();
		// 7
		op.setAttach(op.getSubject().createOwnedOperation("Attach", null, null));		
		// 8
		op.setAttachPara(op.getAttach().createOwnedParameter("obs", op.getObserver()));
		// 9
		op.setDetach(op.getSubject().createOwnedOperation("Detach", null, null));
		// 10
		op.setDetachPara(op.getDetach().createOwnedParameter("obs", op.getObserver()));
		// 11
		op.setNotify(op.getSubject().createOwnedOperation("Notify", null, null));
		// 12
		op.setUpdate(op.getObserver().createOwnedOperation("Update", null, null));
		op.getUpdate().setIsAbstract(true);
		// 13
		op.getConcreteSubjectGetStateOps();
		// 14
		op.getConcreteSubjectSetStateOps();
		// 15
		op.setSubjectAsso_observers(UML2Helpers.createAssociation(op.getSubject(), true,
				AggregationKind.NONE_LITERAL, "observers", 0, -1,
				op.getObserver(), false, AggregationKind.NONE_LITERAL, "", 1, 1));
		// 16
		op.getConcreteObserverAssos_subject();
		// 17
		op.setPattern_Predicates(UML2Helpers.createClass(op.getUmlModel(), "Predicates", false)); 
		// 18
		op.setPattern_Attached(op.getPattern_Predicates().createOwnedOperation("Attached", null,null, this.getBoolPrimType())); 
		op.getPattern_Attached().createOwnedParameter("subject", op.getSubject());
		op.getPattern_Attached().createOwnedParameter("observer",op.getObserver());
		op.getPattern_Attached().setIsStatic(true);
		// 19
		op.setPattern_Updated(op.getPattern_Predicates().createOwnedOperation("Updated", null,null, this.getBoolPrimType())); 
		op.getPattern_Updated().createOwnedParameter("subject", op.getSubject());
		op.getPattern_Updated().createOwnedParameter("observer", op.getObserver());
		op.getPattern_Updated().setIsStatic(true);
		// 20
		op.getConcreteObserversUpdateOps();
		
		return op;
	}	
		
	
	public ObserverPatternProfile opp;
	
	public void ApplyPatternProfile()
	{
		//super.ApplyPatternProfile();
		// TODO Auto-generated method stub		
		
		opp=ObserverPatternProfile.getProfile();
		UML2ProfileHelpers.applyProfile(this.getUmlModel(), opp.profile);
		//this.getUmlModel().unapplyProfile(opp.profile);
		this.setPatternProfile(opp.profile);
		// Applying Stereotypes
		// 1
		UML2ProfileHelpers.applyStereotype(this.getSubject(), opp.subjectRole);
		// 2
		UML2ProfileHelpers.applyStereotype(this.getObserver(), opp.observerRole);
		// 3
		Iterator<Class> itc1 = this.getConcreteSubjects().iterator();
		while (itc1.hasNext()) {
			Class c = itc1.next();
			UML2ProfileHelpers.applyStereotype(c, opp.conSubjectRole);
		}
		// 4
		Iterator<Class> itc22 = this.getConcreteObservers().iterator();
		while (itc22.hasNext()) {
			Class c = itc22.next();
			UML2ProfileHelpers.applyStereotype(c, opp.conObserverRole);
		}
		// 5
		Iterator<Property> itconss = this.getConcreteSubjectStates().iterator();
		while (itconss.hasNext()) {
			Property p = itconss.next();
			UML2ProfileHelpers.applyStereotype(p, opp.conSubStateRole);
		}
		// 6
		Iterator<Property> itconos = this.getConcreteObserverStates().iterator();
		while (itconos.hasNext()) {
			Property p = itconos.next();
			UML2ProfileHelpers.applyStereotype(p, opp.conObsStateRole);
		}
		// 7
		UML2ProfileHelpers.applyStereotype(this.getAttach(), opp.AttachRoleRole);
		// 8
		UML2ProfileHelpers.applyStereotype(this.getAttachPara(), opp.attachParaRole);
		// 9
		UML2ProfileHelpers.applyStereotype(this.getDetach(), opp.DetachRole);
		// 10
		UML2ProfileHelpers.applyStereotype(this.getDetachPara(), opp.detachParaRole);
		// 11
		UML2ProfileHelpers.applyStereotype(this.getNotify(), opp.NotifyRole);
		// 12
		UML2ProfileHelpers.applyStereotype(this.getUpdate(), opp.UpdateRole);
		// 13
		for(Iterator<Operation> itgetop = this.getConcreteSubjectGetStateOps().iterator();
				itgetop.hasNext();)
		{
			Operation op = itgetop.next();
			UML2ProfileHelpers.applyStereotype(op, opp.GetStateOpRole);
		}
			
		
		
		/*
		Iterator<Operation> itgetop = this.getConcreteSubjectGetStateOps().iterator();
		while (itgetop.hasNext()) {
			Operation op = itgetop.next();
			UML2ProfileHelpers.applyStereotype(op, opp.GetStateOpRole);
		}
		*/
		// 14
		Iterator<Operation> itsetop = this.getConcreteSubjectSetStateOps().iterator();
		while (itsetop.hasNext()) {
			Operation op = itsetop.next();
			UML2ProfileHelpers.applyStereotype(op, opp.SetStateOpRole);
		}
		// 15
		UML2ProfileHelpers.applyStereotype(this.getSubjectAsso_observers(), opp.observersAssoRole);
		// 16
		Iterator<Association> itasso = this.getConcreteObserverAssos_subject().iterator();
		while (itasso.hasNext()) {
			Association a = itasso.next();
			UML2ProfileHelpers.applyStereotype(a, opp.subjectsAssoRole);
		}
		// 17
		Iterator<Operation> itconobsop=this.getConcreteObserversUpdateOps().iterator();
		while(itconobsop.hasNext()){
			Operation o=itconobsop.next();
			UML2ProfileHelpers.applyStereotype(o, opp.conobsUpdated);
		}
		
	}



	public void CreateInitialPatternStructure()
	{
		// TODO Auto-generated method stub
		//ObserverPattern op = DesignPatternsFactory.eINSTANCE.createObserverPattern();		
		//op.setUmlModel(UML2Helpers.createModel("ObserverPattern"));
		
		
				
		// 1
		this.setObserver(UML2Helpers.createClass(getUmlModel(), "Observer", true));
		// 2
		this.setSubject(UML2Helpers.createClass(getUmlModel(), "Subject", true));
		// 3		
		this.getConcreteSubjects(); 
		// 4
		this.getConcreteObservers();
		// 5
		this.getConcreteSubjectStates();
		// 6
		this.getConcreteObserverStates();
		// 7
		this.setAttach(this.getSubject().createOwnedOperation("Attach", null, null));		
		// 8
		this.setAttachPara(this.getAttach().createOwnedParameter("obs", this.getObserver()));
		// 9
		this.setDetach(this.getSubject().createOwnedOperation("Detach", null, null));
		// 10
		this.setDetachPara(this.getDetach().createOwnedParameter("obs", this.getObserver()));
		// 11
		this.setNotify(this.getSubject().createOwnedOperation("Notify", null, null));
		// 12
		this.setUpdate(this.getObserver().createOwnedOperation("Update", null, null));
		this.getUpdate().setIsAbstract(true);
		// 13
		this.getConcreteSubjectGetStateOps();
		// 14
		this.getConcreteSubjectSetStateOps();
		// 15
		this.setSubjectAsso_observers(UML2Helpers.createAssociation(this.getSubject(), true,
				AggregationKind.NONE_LITERAL, "observers", 0, -1,
				this.getObserver(), false, AggregationKind.NONE_LITERAL, "", 1, 1));
		// 16
		this.getConcreteObserverAssos_subject();
		// 17
		this.setPattern_Predicates(UML2Helpers.createClass(this.getUmlModel(), "Predicates", false)); 
		// 18
		this.setPattern_Attached(this.getPattern_Predicates().createOwnedOperation("Attached", null,null, (Type)this.getUmlModel().getPackagedElement("Boolean"))); 
		this.getPattern_Attached().createOwnedParameter("subject", this.getSubject());
		this.getPattern_Attached().createOwnedParameter("observer",this.getObserver());
		this.getPattern_Attached().setIsStatic(true);
		// 19
		this.setPattern_Updated(this.getPattern_Predicates().createOwnedOperation("Updated", null,null, (Type)this.getUmlModel().getPackagedElement("Boolean"))); 
		this.getPattern_Updated().createOwnedParameter("subject", this.getSubject());
		this.getPattern_Updated().createOwnedParameter("observer", this.getObserver());
		this.getPattern_Updated().setIsStatic(true);
		// 20
		this.getConcreteObserversUpdateOps();		
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	protected ObserverPatternImpl() {
		super();
		this.getUmlModel().setName("ObserverPattern");
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignPatternsPackage.Literals.OBSERVER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getObserver() {
		if (observer != null && observer.eIsProxy())
		{
			InternalEObject oldObserver = (InternalEObject)observer;
			observer = (org.eclipse.uml2.uml.Class)eResolveProxy(oldObserver);
			if (observer != oldObserver)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__OBSERVER, oldObserver, observer));
			}
		}
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetObserver() {
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserver(org.eclipse.uml2.uml.Class newObserver) {
		org.eclipse.uml2.uml.Class oldObserver = observer;
		observer = newObserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__OBSERVER, oldObserver, observer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getConcreteObservers() {
		if (concreteObservers == null)
		{
			concreteObservers = new EObjectResolvingEList<org.eclipse.uml2.uml.Class>(org.eclipse.uml2.uml.Class.class, this, DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS);
		}
		return concreteObservers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getSubject() {
		if (subject != null && subject.eIsProxy())
		{
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (org.eclipse.uml2.uml.Class)eResolveProxy(oldSubject);
			if (subject != oldSubject)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(org.eclipse.uml2.uml.Class newSubject) {
		org.eclipse.uml2.uml.Class oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getConcreteSubjects() {
		if (concreteSubjects == null)
		{
			concreteSubjects = new EObjectResolvingEList<org.eclipse.uml2.uml.Class>(org.eclipse.uml2.uml.Class.class, this, DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECTS);
		}
		return concreteSubjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getConcreteObserverStates() {
		if (concreteObserverStates == null)
		{
			concreteObserverStates = new EObjectResolvingEList<Property>(Property.class, this, DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_STATES);
		}
		return concreteObserverStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getConcreteSubjectStates() {
		if (concreteSubjectStates == null)
		{
			concreteSubjectStates = new EObjectResolvingEList<Property>(Property.class, this, DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_STATES);
		}
		return concreteSubjectStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getAttach() {
		if (attach != null && attach.eIsProxy())
		{
			InternalEObject oldAttach = (InternalEObject)attach;
			attach = (Operation)eResolveProxy(oldAttach);
			if (attach != oldAttach)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__ATTACH, oldAttach, attach));
			}
		}
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetAttach() {
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttach(Operation newAttach) {
		Operation oldAttach = attach;
		attach = newAttach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__ATTACH, oldAttach, attach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getAttachPara() {
		if (attachPara != null && attachPara.eIsProxy())
		{
			InternalEObject oldAttachPara = (InternalEObject)attachPara;
			attachPara = (Parameter)eResolveProxy(oldAttachPara);
			if (attachPara != oldAttachPara)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__ATTACH_PARA, oldAttachPara, attachPara));
			}
		}
		return attachPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetAttachPara() {
		return attachPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachPara(Parameter newAttachPara) {
		Parameter oldAttachPara = attachPara;
		attachPara = newAttachPara;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__ATTACH_PARA, oldAttachPara, attachPara));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getDetach() {
		if (detach != null && detach.eIsProxy())
		{
			InternalEObject oldDetach = (InternalEObject)detach;
			detach = (Operation)eResolveProxy(oldDetach);
			if (detach != oldDetach)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__DETACH, oldDetach, detach));
			}
		}
		return detach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetDetach() {
		return detach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetach(Operation newDetach) {
		Operation oldDetach = detach;
		detach = newDetach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__DETACH, oldDetach, detach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getDetachPara() {
		if (detachPara != null && detachPara.eIsProxy())
		{
			InternalEObject oldDetachPara = (InternalEObject)detachPara;
			detachPara = (Parameter)eResolveProxy(oldDetachPara);
			if (detachPara != oldDetachPara)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__DETACH_PARA, oldDetachPara, detachPara));
			}
		}
		return detachPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetDetachPara() {
		return detachPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetachPara(Parameter newDetachPara) {
		Parameter oldDetachPara = detachPara;
		detachPara = newDetachPara;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__DETACH_PARA, oldDetachPara, detachPara));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getNotify() {
		if (notify != null && notify.eIsProxy())
		{
			InternalEObject oldNotify = (InternalEObject)notify;
			notify = (Operation)eResolveProxy(oldNotify);
			if (notify != oldNotify)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__NOTIFY, oldNotify, notify));
			}
		}
		return notify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetNotify() {
		return notify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotify(Operation newNotify) {
		Operation oldNotify = notify;
		notify = newNotify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__NOTIFY, oldNotify, notify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getUpdate() {
		if (update != null && update.eIsProxy())
		{
			InternalEObject oldUpdate = (InternalEObject)update;
			update = (Operation)eResolveProxy(oldUpdate);
			if (update != oldUpdate)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__UPDATE, oldUpdate, update));
			}
		}
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(Operation newUpdate) {
		Operation oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getConcreteSubjectGetStateOps() {
		if (concreteSubjectGetStateOps == null)
		{
			concreteSubjectGetStateOps = new EObjectResolvingEList<Operation>(Operation.class, this, DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_GET_STATE_OPS);
		}
		return concreteSubjectGetStateOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getConcreteSubjectSetStateOps() {
		if (concreteSubjectSetStateOps == null)
		{
			concreteSubjectSetStateOps = new EObjectResolvingEList<Operation>(Operation.class, this, DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_SET_STATE_OPS);
		}
		return concreteSubjectSetStateOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getConcreteObserversUpdateOps() {
		if (concreteObserversUpdateOps == null)
		{
			concreteObserversUpdateOps = new EObjectResolvingEList<Operation>(Operation.class, this, DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS_UPDATE_OPS);
		}
		return concreteObserversUpdateOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getSubjectAsso_observers() {
		if (subjectAsso_observers != null && subjectAsso_observers.eIsProxy())
		{
			InternalEObject oldSubjectAsso_observers = (InternalEObject)subjectAsso_observers;
			subjectAsso_observers = (Association)eResolveProxy(oldSubjectAsso_observers);
			if (subjectAsso_observers != oldSubjectAsso_observers)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS, oldSubjectAsso_observers, subjectAsso_observers));
			}
		}
		return subjectAsso_observers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetSubjectAsso_observers() {
		return subjectAsso_observers;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectAsso_observers(Association newSubjectAsso_observers) {
		Association oldSubjectAsso_observers = subjectAsso_observers;
		subjectAsso_observers = newSubjectAsso_observers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS, oldSubjectAsso_observers, subjectAsso_observers));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getConcreteObserverAssos_subject() {
		if (concreteObserverAssos_subject == null)
		{
			concreteObserverAssos_subject = new EObjectResolvingEList<Association>(Association.class, this, DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_ASSOS_SUBJECT);
		}
		return concreteObserverAssos_subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getPattern_Predicates() {
		if (pattern_Predicates != null && pattern_Predicates.eIsProxy())
		{
			InternalEObject oldPattern_Predicates = (InternalEObject)pattern_Predicates;
			pattern_Predicates = (org.eclipse.uml2.uml.Class)eResolveProxy(oldPattern_Predicates);
			if (pattern_Predicates != oldPattern_Predicates)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_PREDICATES, oldPattern_Predicates, pattern_Predicates));
			}
		}
		return pattern_Predicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetPattern_Predicates() {
		return pattern_Predicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern_Predicates(org.eclipse.uml2.uml.Class newPattern_Predicates) {
		org.eclipse.uml2.uml.Class oldPattern_Predicates = pattern_Predicates;
		pattern_Predicates = newPattern_Predicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_PREDICATES, oldPattern_Predicates, pattern_Predicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPattern_Attached() {
		if (pattern_Attached != null && pattern_Attached.eIsProxy())
		{
			InternalEObject oldPattern_Attached = (InternalEObject)pattern_Attached;
			pattern_Attached = (Operation)eResolveProxy(oldPattern_Attached);
			if (pattern_Attached != oldPattern_Attached)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_ATTACHED, oldPattern_Attached, pattern_Attached));
			}
		}
		return pattern_Attached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetPattern_Attached() {
		return pattern_Attached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern_Attached(Operation newPattern_Attached) {
		Operation oldPattern_Attached = pattern_Attached;
		pattern_Attached = newPattern_Attached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_ATTACHED, oldPattern_Attached, pattern_Attached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPattern_Updated() {
		if (pattern_Updated != null && pattern_Updated.eIsProxy())
		{
			InternalEObject oldPattern_Updated = (InternalEObject)pattern_Updated;
			pattern_Updated = (Operation)eResolveProxy(oldPattern_Updated);
			if (pattern_Updated != oldPattern_Updated)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_UPDATED, oldPattern_Updated, pattern_Updated));
			}
		}
		return pattern_Updated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetPattern_Updated() {
		return pattern_Updated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern_Updated(Operation newPattern_Updated) {
		Operation oldPattern_Updated = pattern_Updated;
		pattern_Updated = newPattern_Updated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_UPDATED, oldPattern_Updated, pattern_Updated));
	}

	




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public Property GetSubjectState(ObserverPattern OP, org.eclipse.uml2.uml.Class subject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Property result = null;
		Iterator<Property> itp = OP.getConcreteSubjectStates().iterator();
		while (itp.hasNext()) {
			Property p = itp.next();
			if (subject.getOwnedAttributes().contains(p)) {
				result = p;
				break;
			}
		}
		return result;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public org.eclipse.uml2.uml.Class CreateConcreteObserver(String conObserverName, String observerStateName, Type observerStateType, org.eclipse.uml2.uml.Class ListentoSubject)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (conObserverName == null)
		{
			conObserverName = "ConcreteObserver";
		}
		if (observerStateName == null)
		{
			observerStateName = "observerState";
		}

		// Create a new Concrete Subject
		Class newobs = UML2Helpers.createClass(this.getUmlModel(), conObserverName,false);
		this.getConcreteObservers().add(newobs);

		// Add Generalization from newsub to the Subject role
		UML2Helpers.createGeneralization(newobs, this.getObserver());

		// Redefine The Update Operation
		Operation op = newobs.createOwnedOperation("Update", null, null);
		this.getConcreteObserversUpdateOps().add(op);

		// Add property for newsub to satisfy the Invariant
		Property ps1 = UML2Helpers.createAttribute(newobs, observerStateName,
				observerStateType, 1, 1);
		this.getConcreteObserverStates().add(ps1);

		// Add an association to the given Concrete Subject
		Association asso = UML2Helpers.createAssociation(newobs, true,
				AggregationKind.NONE_LITERAL, "subject", 1, 1, ListentoSubject,
				false, AggregationKind.NONE_LITERAL, "", 1, 1);
		this.getConcreteObserverAssos_subject().add(asso);

		return newobs;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public org.eclipse.uml2.uml.Class CreateConcreteSubject(String conSubjectName, String subjectStateName, Type subjectStateType, String GetStateOpName, String SetStateOpName)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// Set Default Names
		if (conSubjectName == null)
		{
			conSubjectName = "ConcreteSubject";
		}
		if (subjectStateName == null)
		{
			subjectStateName = "subjectstate";
		}
		if (GetStateOpName == null)
		{
			GetStateOpName = "GetState";
		}
		if (SetStateOpName == null)
		{
			SetStateOpName = "SetState";
		}

		// Add the new Concrete Subject to the ConSubjects role set
		Class newsub = UML2Helpers
				.createClass(this.getUmlModel(), conSubjectName, false);
		this.getConcreteSubjects().add(newsub);

		// Add property for newsub to satisfy the Invariant
		Property ps1 = UML2Helpers.createAttribute(newsub, subjectStateName,
				subjectStateType, 1, 1);
		this.getConcreteSubjectStates().add(ps1);

		// Add Generalization from newsub to the Subject role
		UML2Helpers.createGeneralization(newsub, this.getSubject());

		// ToDo: Add the GetState and SetState Operation for the New Concrete Subject
		// The Order matters: First Create subject state, and then Create the Get and Set methods
		Operation op1 = newsub.createOwnedOperation(GetStateOpName, null, null,
				GetSubjectState(this, newsub).getType());
		this.getConcreteSubjectGetStateOps().add(op1);

		Operation op2 = newsub.createOwnedOperation(SetStateOpName, null, null);
		op2.createOwnedParameter("value", 
				GetSubjectState(this, newsub).getType());
		this.getConcreteSubjectSetStateOps().add(op2);

		return newsub;
	}




	

	public void CreatePatternSpecification()
	{
		// TODO Auto-generated method stub	
		String Attached=this.getPattern_Predicates().getName()
				+ "." + this.getPattern_Attached().getName();
		String Updated= this.getPattern_Predicates().getName() 
		        + "." + this.getPattern_Updated().getName();		
		
		// a1. Attach Method
		Constraint Attach_pre = this.getAttach().createPrecondition("Attach_Pre");
		Expression attachPreExp= Attach_pre.createNameExpression("JML", null);
	    attachPreExp.setSymbol("//@ requires " 
				+ Attached + "(this," + this.getAttachPara().getName() + ") == false; ");
		
		Constraint Attach_post = this.getAttach().createPostcondition("Attach_Post");
		Expression attachPostExp= Attach_post.createNameExpression("JML", null);
		attachPostExp.setSymbol("//@ ensures " 
				+ Attached + "(this," + this.getAttachPara().getName() + ") == true; ");
		
		// a2.  Detach Method
		Constraint Detach_pre = this.getDetach().createPrecondition("Detach_Pre");
		Expression dettachPreExp= Detach_pre.createNameExpression("JML", null);
		dettachPreExp.setSymbol("//@ requires " 
				+ Attached + "(this," + this.getDetachPara().getName() + ") == true; ");
		
		Constraint Detach_post = this.getDetach().createPostcondition("Detach_Post");
		Expression dettachPostExp= Detach_post.createNameExpression("JML", null);
		dettachPostExp.setSymbol("//@ ensures " 
				+ Attached + "(this," + this.getDetachPara().getName() + ") == false; ");
		
		// a3. Update Methods for each ConObserver
		Iterator<Operation> itUpdates = this.getConcreteObserversUpdateOps().iterator();
		while (itUpdates.hasNext())
		{
			Operation conUpdate = itUpdates.next();
			// Get the Concrete Observer's (The owner of this Update Operation) Listening Property
			Property p = this.GetListeningTo(conUpdate.getClass_());
			
			Constraint conUpdate_pre=conUpdate.createPrecondition("Update_Pre");
			Expression conUpdatePreExp=conUpdate_pre.createNameExpression("JML", null);
			conUpdatePreExp.setSymbol("//@ requires "
				+ Attached + "(this." + p.getName() + "," + "this" + ") == true; ");
						
			Constraint conUpdate_post=conUpdate.createPostcondition("Update_Post");
			Expression conUpdatePostExp=conUpdate_post.createNameExpression("JML", null);
			conUpdatePostExp.setSymbol("//@ ensures "  
				+ Updated + "(this." + p.getName() + "," + "this" + ") == true; ");
		}
		
		// a4. Notify Method
		Constraint Notify_post=this.getNotify().createPostcondition("Notify_Post");
		Expression NotifyPostExp=Notify_post.createNameExpression("JML", null);
		NotifyPostExp.setSymbol("//@ ensures " 
				+ "( \\forall "+ this.getObserver().getName() + " "+"obs; "
				+ Attached +"(this,obs) ==> " + Updated  + "(this,obs) ); ");
		
		// 
	}




	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public Property GetListeningTo(org.eclipse.uml2.uml.Class conObserver)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Iterator<Association> itasso = this.getConcreteObserverAssos_subject().iterator();
		boolean found = false;
		Property result = null;
		Association theasso = null;
		while (itasso.hasNext() && found == false) {
			Association asso = itasso.next();
			Iterator<Property> itp = asso.getMemberEnds().iterator();
			while (itp.hasNext()) {
				Property p = itp.next();
				if (p.getType() == conObserver) {
					found = true;
					theasso = asso;
					break;
				}
			}
		}
		Iterator<Property> itp = theasso.getMemberEnds().iterator();
		// UML2Util.out("Number of Owned Ends: " + theasso.getMemberEnds().size());
		while (itp.hasNext()) {
			Property p = itp.next();
			if (p.getType() != conObserver) {
				result = p;
			}
		}
		return result;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public void AddConcreteObserver(org.eclipse.uml2.uml.Class class_, String observerStateName, Type observerStateType, org.eclipse.uml2.uml.Class ListentoSubject)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (observerStateName == null)
		{
			observerStateName = "observerState";
		}
		
		this.getConcreteObservers().add(class_);

		// Add Generalization from newsub to the Subject role
		UML2Helpers.createGeneralization(class_, this.getObserver());

		// Redefine The Update Operation
		Operation op = class_.createOwnedOperation("Update", null, null);
		this.getConcreteObserversUpdateOps().add(op);

		// Add property for newsub to satisfy the Invariant
		Property ps1 = UML2Helpers.createAttribute(class_, observerStateName,
				observerStateType, 1, 1);
		this.getConcreteObserverStates().add(ps1);

		// Add an association to the given Concrete Subject
		Association asso = UML2Helpers.createAssociation(class_, true,
				AggregationKind.NONE_LITERAL, "subject", 1, 1, ListentoSubject,
				false, AggregationKind.NONE_LITERAL, "", 1, 1);
		this.getConcreteObserverAssos_subject().add(asso);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public void AddConcreteSubject(org.eclipse.uml2.uml.Class class_, String subjectStateName, Type subjectStateType, String GetStateOpName, String SetStateOpName)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (subjectStateName == null)
		{
			subjectStateName = "subjectstate";
		}
		if (GetStateOpName == null)
		{
			GetStateOpName = "GetState";
		}
		if (SetStateOpName == null)
		{
			SetStateOpName = "SetState";
		}

		// Add the new Concrete Subject to the ConSubjects role set
		
		this.getConcreteSubjects().add(class_);

		// Add property for class_ to satisfy the Invariant
		Property ps1 = UML2Helpers.createAttribute(class_, subjectStateName,
				subjectStateType, 1, 1);
		this.getConcreteSubjectStates().add(ps1);

		// Add Generalization from class_ to the Subject role
		UML2Helpers.createGeneralization(class_, this.getSubject());

		// ToDo: Add the GetState and SetState Operation for the New Concrete Subject
		// The Order matters: First Create subject state, and then Create the Get and Set methods
		Operation op1 = class_.createOwnedOperation(GetStateOpName, null, null,
				GetSubjectState(this, class_).getType());
		this.getConcreteSubjectGetStateOps().add(op1);
		

		Operation op2 = class_.createOwnedOperation(SetStateOpName, null, null);
		op2.createOwnedParameter("value", 
				GetSubjectState(this, class_).getType());
		this.getConcreteSubjectSetStateOps().add(op2);
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case DesignPatternsPackage.OBSERVER_PATTERN__OBSERVER:
				if (resolve) return getObserver();
				return basicGetObserver();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS:
				return getConcreteObservers();
			case DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECTS:
				return getConcreteSubjects();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_STATES:
				return getConcreteObserverStates();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_STATES:
				return getConcreteSubjectStates();
			case DesignPatternsPackage.OBSERVER_PATTERN__ATTACH:
				if (resolve) return getAttach();
				return basicGetAttach();
			case DesignPatternsPackage.OBSERVER_PATTERN__ATTACH_PARA:
				if (resolve) return getAttachPara();
				return basicGetAttachPara();
			case DesignPatternsPackage.OBSERVER_PATTERN__DETACH:
				if (resolve) return getDetach();
				return basicGetDetach();
			case DesignPatternsPackage.OBSERVER_PATTERN__DETACH_PARA:
				if (resolve) return getDetachPara();
				return basicGetDetachPara();
			case DesignPatternsPackage.OBSERVER_PATTERN__NOTIFY:
				if (resolve) return getNotify();
				return basicGetNotify();
			case DesignPatternsPackage.OBSERVER_PATTERN__UPDATE:
				if (resolve) return getUpdate();
				return basicGetUpdate();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_GET_STATE_OPS:
				return getConcreteSubjectGetStateOps();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_SET_STATE_OPS:
				return getConcreteSubjectSetStateOps();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS_UPDATE_OPS:
				return getConcreteObserversUpdateOps();
			case DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS:
				if (resolve) return getSubjectAsso_observers();
				return basicGetSubjectAsso_observers();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_ASSOS_SUBJECT:
				return getConcreteObserverAssos_subject();
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_PREDICATES:
				if (resolve) return getPattern_Predicates();
				return basicGetPattern_Predicates();
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_ATTACHED:
				if (resolve) return getPattern_Attached();
				return basicGetPattern_Attached();
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_UPDATED:
				if (resolve) return getPattern_Updated();
				return basicGetPattern_Updated();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case DesignPatternsPackage.OBSERVER_PATTERN__OBSERVER:
				setObserver((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS:
				getConcreteObservers().clear();
				getConcreteObservers().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT:
				setSubject((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECTS:
				getConcreteSubjects().clear();
				getConcreteSubjects().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_STATES:
				getConcreteObserverStates().clear();
				getConcreteObserverStates().addAll((Collection<? extends Property>)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_STATES:
				getConcreteSubjectStates().clear();
				getConcreteSubjectStates().addAll((Collection<? extends Property>)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__ATTACH:
				setAttach((Operation)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__ATTACH_PARA:
				setAttachPara((Parameter)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__DETACH:
				setDetach((Operation)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__DETACH_PARA:
				setDetachPara((Parameter)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__NOTIFY:
				setNotify((Operation)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__UPDATE:
				setUpdate((Operation)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_GET_STATE_OPS:
				getConcreteSubjectGetStateOps().clear();
				getConcreteSubjectGetStateOps().addAll((Collection<? extends Operation>)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_SET_STATE_OPS:
				getConcreteSubjectSetStateOps().clear();
				getConcreteSubjectSetStateOps().addAll((Collection<? extends Operation>)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS_UPDATE_OPS:
				getConcreteObserversUpdateOps().clear();
				getConcreteObserversUpdateOps().addAll((Collection<? extends Operation>)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS:
				setSubjectAsso_observers((Association)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_ASSOS_SUBJECT:
				getConcreteObserverAssos_subject().clear();
				getConcreteObserverAssos_subject().addAll((Collection<? extends Association>)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_PREDICATES:
				setPattern_Predicates((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_ATTACHED:
				setPattern_Attached((Operation)newValue);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_UPDATED:
				setPattern_Updated((Operation)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case DesignPatternsPackage.OBSERVER_PATTERN__OBSERVER:
				setObserver((org.eclipse.uml2.uml.Class)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS:
				getConcreteObservers().clear();
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT:
				setSubject((org.eclipse.uml2.uml.Class)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECTS:
				getConcreteSubjects().clear();
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_STATES:
				getConcreteObserverStates().clear();
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_STATES:
				getConcreteSubjectStates().clear();
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__ATTACH:
				setAttach((Operation)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__ATTACH_PARA:
				setAttachPara((Parameter)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__DETACH:
				setDetach((Operation)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__DETACH_PARA:
				setDetachPara((Parameter)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__NOTIFY:
				setNotify((Operation)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__UPDATE:
				setUpdate((Operation)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_GET_STATE_OPS:
				getConcreteSubjectGetStateOps().clear();
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_SET_STATE_OPS:
				getConcreteSubjectSetStateOps().clear();
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS_UPDATE_OPS:
				getConcreteObserversUpdateOps().clear();
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS:
				setSubjectAsso_observers((Association)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_ASSOS_SUBJECT:
				getConcreteObserverAssos_subject().clear();
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_PREDICATES:
				setPattern_Predicates((org.eclipse.uml2.uml.Class)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_ATTACHED:
				setPattern_Attached((Operation)null);
				return;
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_UPDATED:
				setPattern_Updated((Operation)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case DesignPatternsPackage.OBSERVER_PATTERN__OBSERVER:
				return observer != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS:
				return concreteObservers != null && !concreteObservers.isEmpty();
			case DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT:
				return subject != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECTS:
				return concreteSubjects != null && !concreteSubjects.isEmpty();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_STATES:
				return concreteObserverStates != null && !concreteObserverStates.isEmpty();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_STATES:
				return concreteSubjectStates != null && !concreteSubjectStates.isEmpty();
			case DesignPatternsPackage.OBSERVER_PATTERN__ATTACH:
				return attach != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__ATTACH_PARA:
				return attachPara != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__DETACH:
				return detach != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__DETACH_PARA:
				return detachPara != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__NOTIFY:
				return notify != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__UPDATE:
				return update != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_GET_STATE_OPS:
				return concreteSubjectGetStateOps != null && !concreteSubjectGetStateOps.isEmpty();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_SUBJECT_SET_STATE_OPS:
				return concreteSubjectSetStateOps != null && !concreteSubjectSetStateOps.isEmpty();
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVERS_UPDATE_OPS:
				return concreteObserversUpdateOps != null && !concreteObserversUpdateOps.isEmpty();
			case DesignPatternsPackage.OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS:
				return subjectAsso_observers != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__CONCRETE_OBSERVER_ASSOS_SUBJECT:
				return concreteObserverAssos_subject != null && !concreteObserverAssos_subject.isEmpty();
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_PREDICATES:
				return pattern_Predicates != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_ATTACHED:
				return pattern_Attached != null;
			case DesignPatternsPackage.OBSERVER_PATTERN__PATTERN_UPDATED:
				return pattern_Updated != null;
		}
		return super.eIsSet(featureID);
	}
	
	

} //ObserverPatternImpl
