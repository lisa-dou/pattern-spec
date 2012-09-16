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
import designPatterns.MediatedObserverPattern;
import designPatterns.MediatorPattern;
import designPatterns.ObserverPattern;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.Class;

import Utils.UML2Helpers;
import Utils.UML2ProfileHelpers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediated Observer Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getObserverPattern <em>Observer Pattern</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getMediatorPattern <em>Mediator Pattern</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getChangeManager <em>Change Manager</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getMediatedSubject <em>Mediated Subject</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getMediatedObserver <em>Mediated Observer</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getConcreteChangeManagers <em>Concrete Change Managers</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getConcreteMediatedSubjects <em>Concrete Mediated Subjects</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getConcreteMediatedObservers <em>Concrete Mediated Observers</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getAttachOp <em>Attach Op</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getAttachPara <em>Attach Para</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getDetachOp <em>Detach Op</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getDetachPara <em>Detach Para</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getSubjectNotifyOp <em>Subject Notify Op</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getRegisterOp <em>Register Op</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getRegisterOpPara1 <em>Register Op Para1</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getRegisterOpPara2 <em>Register Op Para2</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getUnRegisterOp <em>Un Register Op</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getUnRegisterOpPara1 <em>Un Register Op Para1</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getUnRegisterOpPara2 <em>Un Register Op Para2</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getChangeManagerNotifyOp <em>Change Manager Notify Op</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getSubToObsMapping <em>Sub To Obs Mapping</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getMediatedObserverUpdateOp <em>Mediated Observer Update Op</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getConcreteMediatedSubjectGetStateOps <em>Concrete Mediated Subject Get State Ops</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getConcreteMediatedSubjectSetStateOps <em>Concrete Mediated Subject Set State Ops</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getConcreteMediatedObserverUpdateOps <em>Concrete Mediated Observer Update Ops</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getConcreteMediatedObserverStates <em>Concrete Mediated Observer States</em>}</li>
 *   <li>{@link designPatterns.impl.MediatedObserverPatternImpl#getConcreteMediatedSubjectStates <em>Concrete Mediated Subject States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediatedObserverPatternImpl extends DesignPatternImpl implements MediatedObserverPattern
{
	/**
	 * The cached value of the '{@link #getObserverPattern() <em>Observer Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserverPattern()
	 * @generated
	 * @ordered
	 */
	protected ObserverPattern observerPattern;

	/**
	 * The cached value of the '{@link #getMediatorPattern() <em>Mediator Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediatorPattern()
	 * @generated
	 * @ordered
	 */
	protected MediatorPattern mediatorPattern;

	/**
	 * The cached value of the '{@link #getChangeManager() <em>Change Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeManager()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class changeManager;

	/**
	 * The cached value of the '{@link #getMediatedSubject() <em>Mediated Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediatedSubject()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class mediatedSubject;

	/**
	 * The cached value of the '{@link #getMediatedObserver() <em>Mediated Observer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediatedObserver()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class mediatedObserver;

	/**
	 * The cached value of the '{@link #getConcreteChangeManagers() <em>Concrete Change Managers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteChangeManagers()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.uml2.uml.Class> concreteChangeManagers;

	/**
	 * The cached value of the '{@link #getConcreteMediatedSubjects() <em>Concrete Mediated Subjects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediatedSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.uml2.uml.Class> concreteMediatedSubjects;

	/**
	 * The cached value of the '{@link #getConcreteMediatedObservers() <em>Concrete Mediated Observers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediatedObservers()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.uml2.uml.Class> concreteMediatedObservers;

	/**
	 * The cached value of the '{@link #getAttachOp() <em>Attach Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachOp()
	 * @generated
	 * @ordered
	 */
	protected Operation attachOp;

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
	 * The cached value of the '{@link #getDetachOp() <em>Detach Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetachOp()
	 * @generated
	 * @ordered
	 */
	protected Operation detachOp;

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
	 * The cached value of the '{@link #getSubjectNotifyOp() <em>Subject Notify Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectNotifyOp()
	 * @generated
	 * @ordered
	 */
	protected Operation subjectNotifyOp;

	/**
	 * The cached value of the '{@link #getRegisterOp() <em>Register Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterOp()
	 * @generated
	 * @ordered
	 */
	protected Operation registerOp;

	/**
	 * The cached value of the '{@link #getRegisterOpPara1() <em>Register Op Para1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterOpPara1()
	 * @generated
	 * @ordered
	 */
	protected Parameter registerOpPara1;

	/**
	 * The cached value of the '{@link #getRegisterOpPara2() <em>Register Op Para2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterOpPara2()
	 * @generated
	 * @ordered
	 */
	protected Parameter registerOpPara2;

	/**
	 * The cached value of the '{@link #getUnRegisterOp() <em>Un Register Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnRegisterOp()
	 * @generated
	 * @ordered
	 */
	protected Operation unRegisterOp;

	/**
	 * The cached value of the '{@link #getUnRegisterOpPara1() <em>Un Register Op Para1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnRegisterOpPara1()
	 * @generated
	 * @ordered
	 */
	protected Parameter unRegisterOpPara1;

	/**
	 * The cached value of the '{@link #getUnRegisterOpPara2() <em>Un Register Op Para2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnRegisterOpPara2()
	 * @generated
	 * @ordered
	 */
	protected Parameter unRegisterOpPara2;

	/**
	 * The cached value of the '{@link #getChangeManagerNotifyOp() <em>Change Manager Notify Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeManagerNotifyOp()
	 * @generated
	 * @ordered
	 */
	protected Operation changeManagerNotifyOp;

	/**
	 * The cached value of the '{@link #getSubToObsMapping() <em>Sub To Obs Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubToObsMapping()
	 * @generated
	 * @ordered
	 */
	protected Property subToObsMapping;

	/**
	 * The cached value of the '{@link #getMediatedObserverUpdateOp() <em>Mediated Observer Update Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediatedObserverUpdateOp()
	 * @generated
	 * @ordered
	 */
	protected Operation mediatedObserverUpdateOp;

	/**
	 * The cached value of the '{@link #getConcreteMediatedSubjectGetStateOps() <em>Concrete Mediated Subject Get State Ops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediatedSubjectGetStateOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> concreteMediatedSubjectGetStateOps;

	/**
	 * The cached value of the '{@link #getConcreteMediatedSubjectSetStateOps() <em>Concrete Mediated Subject Set State Ops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediatedSubjectSetStateOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> concreteMediatedSubjectSetStateOps;

	/**
	 * The cached value of the '{@link #getConcreteMediatedObserverUpdateOps() <em>Concrete Mediated Observer Update Ops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediatedObserverUpdateOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> concreteMediatedObserverUpdateOps;

	/**
	 * The cached value of the '{@link #getConcreteMediatedObserverStates() <em>Concrete Mediated Observer States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediatedObserverStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> concreteMediatedObserverStates;

	/**
	 * The cached value of the '{@link #getConcreteMediatedSubjectStates() <em>Concrete Mediated Subject States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMediatedSubjectStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> concreteMediatedSubjectStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	protected MediatedObserverPatternImpl()
	{
		super();
		this.getUmlModel().setName("MediatedObserverPattern");
	}

	public void CreateInitialPatternStructure()
	{
		// TODO Auto-generated method stub			
		// Set the Observer Pattern
		this.setObserverPattern(DesignPatternsFactory.eINSTANCE.createObserverPattern());
		// Set the Mediator Pattern
		this.setMediatorPattern(DesignPatternsFactory.eINSTANCE.createMediatorPattern());
		// Set the model for Observer Pattern
		this.getObserverPattern().setUmlModel(this.getUmlModel());	
		// Set the Model for Mediator Pattern
		this.getMediatorPattern().setUmlModel(this.getUmlModel());
		// Construct the Initial Structure of Observer Pattern
		this.getObserverPattern().CreateInitialPatternStructure();
		// Construct the Initial Structure of Mediator Pattern
		this.getMediatorPattern().CreateInitialPatternStructure();
		// Compose these two patterns
		this.getMediatorPattern().AddConcreteColleage(this.getObserverPattern().getObserver());
		this.getMediatorPattern().AddConcreteColleage(this.getObserverPattern().getSubject());
		
		EList<Class> el=new BasicEList<Class>();
		el.add(this.getObserverPattern().getObserver());
		el.add(this.getObserverPattern().getSubject());
		this.getMediatorPattern().CreateConcreteMediator("ChangeManager",el);		
	}

	public void SaveAsUML(String uri)
	{
		// TODO Auto-generated method stub
		// Apply Stereotype Profile
		//this.getObserverPattern().ApplyPatternProfile();
		//this.getMediatorPattern().ApplyPatternProfile();
		// Save Profile
		//UML2ProfileHelpers.save(this.getObserverPattern().getPatternProfile(), URI.createURI(uri).appendSegment("ObserverPattern")
		//		.appendFileExtension(UMLResource.PROFILE_FILE_EXTENSION));
		//UML2ProfileHelpers.save(this.getMediatorPattern().getPatternProfile(), URI.createURI(uri).appendSegment("MediatorPattern")
		//		.appendFileExtension(UMLResource.PROFILE_FILE_EXTENSION));		
		
		// Save Model
		UML2ProfileHelpers.save(this.getUmlModel(), URI.createURI(uri).appendSegment(this.getUmlModel().getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DesignPatternsPackage.Literals.MEDIATED_OBSERVER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverPattern getObserverPattern()
	{
		if (observerPattern != null && observerPattern.eIsProxy())
		{
			InternalEObject oldObserverPattern = (InternalEObject)observerPattern;
			observerPattern = (ObserverPattern)eResolveProxy(oldObserverPattern);
			if (observerPattern != oldObserverPattern)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN, oldObserverPattern, observerPattern));
			}
		}
		return observerPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverPattern basicGetObserverPattern()
	{
		return observerPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserverPattern(ObserverPattern newObserverPattern)
	{
		ObserverPattern oldObserverPattern = observerPattern;
		observerPattern = newObserverPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN, oldObserverPattern, observerPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediatorPattern getMediatorPattern()
	{
		if (mediatorPattern != null && mediatorPattern.eIsProxy())
		{
			InternalEObject oldMediatorPattern = (InternalEObject)mediatorPattern;
			mediatorPattern = (MediatorPattern)eResolveProxy(oldMediatorPattern);
			if (mediatorPattern != oldMediatorPattern)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN, oldMediatorPattern, mediatorPattern));
			}
		}
		return mediatorPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediatorPattern basicGetMediatorPattern()
	{
		return mediatorPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediatorPattern(MediatorPattern newMediatorPattern)
	{
		MediatorPattern oldMediatorPattern = mediatorPattern;
		mediatorPattern = newMediatorPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN, oldMediatorPattern, mediatorPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getChangeManager()
	{
		if (changeManager != null && changeManager.eIsProxy())
		{
			InternalEObject oldChangeManager = (InternalEObject)changeManager;
			changeManager = (org.eclipse.uml2.uml.Class)eResolveProxy(oldChangeManager);
			if (changeManager != oldChangeManager)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER, oldChangeManager, changeManager));
			}
		}
		return changeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetChangeManager()
	{
		return changeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeManager(org.eclipse.uml2.uml.Class newChangeManager)
	{
		org.eclipse.uml2.uml.Class oldChangeManager = changeManager;
		changeManager = newChangeManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER, oldChangeManager, changeManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getMediatedSubject()
	{
		if (mediatedSubject != null && mediatedSubject.eIsProxy())
		{
			InternalEObject oldMediatedSubject = (InternalEObject)mediatedSubject;
			mediatedSubject = (org.eclipse.uml2.uml.Class)eResolveProxy(oldMediatedSubject);
			if (mediatedSubject != oldMediatedSubject)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT, oldMediatedSubject, mediatedSubject));
			}
		}
		return mediatedSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetMediatedSubject()
	{
		return mediatedSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediatedSubject(org.eclipse.uml2.uml.Class newMediatedSubject)
	{
		org.eclipse.uml2.uml.Class oldMediatedSubject = mediatedSubject;
		mediatedSubject = newMediatedSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT, oldMediatedSubject, mediatedSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getMediatedObserver()
	{
		if (mediatedObserver != null && mediatedObserver.eIsProxy())
		{
			InternalEObject oldMediatedObserver = (InternalEObject)mediatedObserver;
			mediatedObserver = (org.eclipse.uml2.uml.Class)eResolveProxy(oldMediatedObserver);
			if (mediatedObserver != oldMediatedObserver)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER, oldMediatedObserver, mediatedObserver));
			}
		}
		return mediatedObserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetMediatedObserver()
	{
		return mediatedObserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediatedObserver(org.eclipse.uml2.uml.Class newMediatedObserver)
	{
		org.eclipse.uml2.uml.Class oldMediatedObserver = mediatedObserver;
		mediatedObserver = newMediatedObserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER, oldMediatedObserver, mediatedObserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getConcreteChangeManagers()
	{
		if (concreteChangeManagers == null)
		{
			concreteChangeManagers = new EObjectResolvingEList<org.eclipse.uml2.uml.Class>(org.eclipse.uml2.uml.Class.class, this, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_CHANGE_MANAGERS);
		}
		return concreteChangeManagers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getConcreteMediatedSubjects()
	{
		if (concreteMediatedSubjects == null)
		{
			concreteMediatedSubjects = new EObjectResolvingEList<org.eclipse.uml2.uml.Class>(org.eclipse.uml2.uml.Class.class, this, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECTS);
		}
		return concreteMediatedSubjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getConcreteMediatedObservers()
	{
		if (concreteMediatedObservers == null)
		{
			concreteMediatedObservers = new EObjectResolvingEList<org.eclipse.uml2.uml.Class>(org.eclipse.uml2.uml.Class.class, this, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVERS);
		}
		return concreteMediatedObservers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getAttachOp()
	{
		if (attachOp != null && attachOp.eIsProxy())
		{
			InternalEObject oldAttachOp = (InternalEObject)attachOp;
			attachOp = (Operation)eResolveProxy(oldAttachOp);
			if (attachOp != oldAttachOp)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_OP, oldAttachOp, attachOp));
			}
		}
		return attachOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetAttachOp()
	{
		return attachOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachOp(Operation newAttachOp)
	{
		Operation oldAttachOp = attachOp;
		attachOp = newAttachOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_OP, oldAttachOp, attachOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getAttachPara()
	{
		if (attachPara != null && attachPara.eIsProxy())
		{
			InternalEObject oldAttachPara = (InternalEObject)attachPara;
			attachPara = (Parameter)eResolveProxy(oldAttachPara);
			if (attachPara != oldAttachPara)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_PARA, oldAttachPara, attachPara));
			}
		}
		return attachPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetAttachPara()
	{
		return attachPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachPara(Parameter newAttachPara)
	{
		Parameter oldAttachPara = attachPara;
		attachPara = newAttachPara;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_PARA, oldAttachPara, attachPara));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getDetachOp()
	{
		if (detachOp != null && detachOp.eIsProxy())
		{
			InternalEObject oldDetachOp = (InternalEObject)detachOp;
			detachOp = (Operation)eResolveProxy(oldDetachOp);
			if (detachOp != oldDetachOp)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_OP, oldDetachOp, detachOp));
			}
		}
		return detachOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetDetachOp()
	{
		return detachOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetachOp(Operation newDetachOp)
	{
		Operation oldDetachOp = detachOp;
		detachOp = newDetachOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_OP, oldDetachOp, detachOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getDetachPara()
	{
		if (detachPara != null && detachPara.eIsProxy())
		{
			InternalEObject oldDetachPara = (InternalEObject)detachPara;
			detachPara = (Parameter)eResolveProxy(oldDetachPara);
			if (detachPara != oldDetachPara)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_PARA, oldDetachPara, detachPara));
			}
		}
		return detachPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetDetachPara()
	{
		return detachPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetachPara(Parameter newDetachPara)
	{
		Parameter oldDetachPara = detachPara;
		detachPara = newDetachPara;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_PARA, oldDetachPara, detachPara));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getSubjectNotifyOp()
	{
		if (subjectNotifyOp != null && subjectNotifyOp.eIsProxy())
		{
			InternalEObject oldSubjectNotifyOp = (InternalEObject)subjectNotifyOp;
			subjectNotifyOp = (Operation)eResolveProxy(oldSubjectNotifyOp);
			if (subjectNotifyOp != oldSubjectNotifyOp)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP, oldSubjectNotifyOp, subjectNotifyOp));
			}
		}
		return subjectNotifyOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetSubjectNotifyOp()
	{
		return subjectNotifyOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectNotifyOp(Operation newSubjectNotifyOp)
	{
		Operation oldSubjectNotifyOp = subjectNotifyOp;
		subjectNotifyOp = newSubjectNotifyOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP, oldSubjectNotifyOp, subjectNotifyOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getRegisterOp()
	{
		if (registerOp != null && registerOp.eIsProxy())
		{
			InternalEObject oldRegisterOp = (InternalEObject)registerOp;
			registerOp = (Operation)eResolveProxy(oldRegisterOp);
			if (registerOp != oldRegisterOp)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP, oldRegisterOp, registerOp));
			}
		}
		return registerOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetRegisterOp()
	{
		return registerOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterOp(Operation newRegisterOp)
	{
		Operation oldRegisterOp = registerOp;
		registerOp = newRegisterOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP, oldRegisterOp, registerOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getRegisterOpPara1()
	{
		if (registerOpPara1 != null && registerOpPara1.eIsProxy())
		{
			InternalEObject oldRegisterOpPara1 = (InternalEObject)registerOpPara1;
			registerOpPara1 = (Parameter)eResolveProxy(oldRegisterOpPara1);
			if (registerOpPara1 != oldRegisterOpPara1)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1, oldRegisterOpPara1, registerOpPara1));
			}
		}
		return registerOpPara1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetRegisterOpPara1()
	{
		return registerOpPara1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterOpPara1(Parameter newRegisterOpPara1)
	{
		Parameter oldRegisterOpPara1 = registerOpPara1;
		registerOpPara1 = newRegisterOpPara1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1, oldRegisterOpPara1, registerOpPara1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getRegisterOpPara2()
	{
		if (registerOpPara2 != null && registerOpPara2.eIsProxy())
		{
			InternalEObject oldRegisterOpPara2 = (InternalEObject)registerOpPara2;
			registerOpPara2 = (Parameter)eResolveProxy(oldRegisterOpPara2);
			if (registerOpPara2 != oldRegisterOpPara2)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2, oldRegisterOpPara2, registerOpPara2));
			}
		}
		return registerOpPara2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetRegisterOpPara2()
	{
		return registerOpPara2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterOpPara2(Parameter newRegisterOpPara2)
	{
		Parameter oldRegisterOpPara2 = registerOpPara2;
		registerOpPara2 = newRegisterOpPara2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2, oldRegisterOpPara2, registerOpPara2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getUnRegisterOp()
	{
		if (unRegisterOp != null && unRegisterOp.eIsProxy())
		{
			InternalEObject oldUnRegisterOp = (InternalEObject)unRegisterOp;
			unRegisterOp = (Operation)eResolveProxy(oldUnRegisterOp);
			if (unRegisterOp != oldUnRegisterOp)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP, oldUnRegisterOp, unRegisterOp));
			}
		}
		return unRegisterOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetUnRegisterOp()
	{
		return unRegisterOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnRegisterOp(Operation newUnRegisterOp)
	{
		Operation oldUnRegisterOp = unRegisterOp;
		unRegisterOp = newUnRegisterOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP, oldUnRegisterOp, unRegisterOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getUnRegisterOpPara1()
	{
		if (unRegisterOpPara1 != null && unRegisterOpPara1.eIsProxy())
		{
			InternalEObject oldUnRegisterOpPara1 = (InternalEObject)unRegisterOpPara1;
			unRegisterOpPara1 = (Parameter)eResolveProxy(oldUnRegisterOpPara1);
			if (unRegisterOpPara1 != oldUnRegisterOpPara1)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1, oldUnRegisterOpPara1, unRegisterOpPara1));
			}
		}
		return unRegisterOpPara1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetUnRegisterOpPara1()
	{
		return unRegisterOpPara1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnRegisterOpPara1(Parameter newUnRegisterOpPara1)
	{
		Parameter oldUnRegisterOpPara1 = unRegisterOpPara1;
		unRegisterOpPara1 = newUnRegisterOpPara1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1, oldUnRegisterOpPara1, unRegisterOpPara1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getUnRegisterOpPara2()
	{
		if (unRegisterOpPara2 != null && unRegisterOpPara2.eIsProxy())
		{
			InternalEObject oldUnRegisterOpPara2 = (InternalEObject)unRegisterOpPara2;
			unRegisterOpPara2 = (Parameter)eResolveProxy(oldUnRegisterOpPara2);
			if (unRegisterOpPara2 != oldUnRegisterOpPara2)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2, oldUnRegisterOpPara2, unRegisterOpPara2));
			}
		}
		return unRegisterOpPara2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetUnRegisterOpPara2()
	{
		return unRegisterOpPara2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnRegisterOpPara2(Parameter newUnRegisterOpPara2)
	{
		Parameter oldUnRegisterOpPara2 = unRegisterOpPara2;
		unRegisterOpPara2 = newUnRegisterOpPara2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2, oldUnRegisterOpPara2, unRegisterOpPara2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getChangeManagerNotifyOp()
	{
		if (changeManagerNotifyOp != null && changeManagerNotifyOp.eIsProxy())
		{
			InternalEObject oldChangeManagerNotifyOp = (InternalEObject)changeManagerNotifyOp;
			changeManagerNotifyOp = (Operation)eResolveProxy(oldChangeManagerNotifyOp);
			if (changeManagerNotifyOp != oldChangeManagerNotifyOp)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP, oldChangeManagerNotifyOp, changeManagerNotifyOp));
			}
		}
		return changeManagerNotifyOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetChangeManagerNotifyOp()
	{
		return changeManagerNotifyOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeManagerNotifyOp(Operation newChangeManagerNotifyOp)
	{
		Operation oldChangeManagerNotifyOp = changeManagerNotifyOp;
		changeManagerNotifyOp = newChangeManagerNotifyOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP, oldChangeManagerNotifyOp, changeManagerNotifyOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSubToObsMapping()
	{
		if (subToObsMapping != null && subToObsMapping.eIsProxy())
		{
			InternalEObject oldSubToObsMapping = (InternalEObject)subToObsMapping;
			subToObsMapping = (Property)eResolveProxy(oldSubToObsMapping);
			if (subToObsMapping != oldSubToObsMapping)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING, oldSubToObsMapping, subToObsMapping));
			}
		}
		return subToObsMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetSubToObsMapping()
	{
		return subToObsMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubToObsMapping(Property newSubToObsMapping)
	{
		Property oldSubToObsMapping = subToObsMapping;
		subToObsMapping = newSubToObsMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING, oldSubToObsMapping, subToObsMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getMediatedObserverUpdateOp()
	{
		if (mediatedObserverUpdateOp != null && mediatedObserverUpdateOp.eIsProxy())
		{
			InternalEObject oldMediatedObserverUpdateOp = (InternalEObject)mediatedObserverUpdateOp;
			mediatedObserverUpdateOp = (Operation)eResolveProxy(oldMediatedObserverUpdateOp);
			if (mediatedObserverUpdateOp != oldMediatedObserverUpdateOp)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP, oldMediatedObserverUpdateOp, mediatedObserverUpdateOp));
			}
		}
		return mediatedObserverUpdateOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetMediatedObserverUpdateOp()
	{
		return mediatedObserverUpdateOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediatedObserverUpdateOp(Operation newMediatedObserverUpdateOp)
	{
		Operation oldMediatedObserverUpdateOp = mediatedObserverUpdateOp;
		mediatedObserverUpdateOp = newMediatedObserverUpdateOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP, oldMediatedObserverUpdateOp, mediatedObserverUpdateOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getConcreteMediatedSubjectGetStateOps()
	{
		if (concreteMediatedSubjectGetStateOps == null)
		{
			concreteMediatedSubjectGetStateOps = new EObjectResolvingEList<Operation>(Operation.class, this, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_GET_STATE_OPS);
		}
		return concreteMediatedSubjectGetStateOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getConcreteMediatedSubjectSetStateOps()
	{
		if (concreteMediatedSubjectSetStateOps == null)
		{
			concreteMediatedSubjectSetStateOps = new EObjectResolvingEList<Operation>(Operation.class, this, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_SET_STATE_OPS);
		}
		return concreteMediatedSubjectSetStateOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getConcreteMediatedObserverUpdateOps()
	{
		if (concreteMediatedObserverUpdateOps == null)
		{
			concreteMediatedObserverUpdateOps = new EObjectResolvingEList<Operation>(Operation.class, this, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_UPDATE_OPS);
		}
		return concreteMediatedObserverUpdateOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getConcreteMediatedObserverStates()
	{
		if (concreteMediatedObserverStates == null)
		{
			concreteMediatedObserverStates = new EObjectResolvingEList<Property>(Property.class, this, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_STATES);
		}
		return concreteMediatedObserverStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getConcreteMediatedSubjectStates()
	{
		if (concreteMediatedSubjectStates == null)
		{
			concreteMediatedSubjectStates = new EObjectResolvingEList<Property>(Property.class, this, DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_STATES);
		}
		return concreteMediatedSubjectStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	
	public void Compose(ObserverPattern ObserverPattern, MediatorPattern MediatorPattern)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		this.setMediatorPattern(MediatorPattern);
		this.setObserverPattern(ObserverPattern);
		// Set the model for Observer Pattern
		this.setUmlModel(this.getObserverPattern().getUmlModel());
		this.getUmlModel().unapplyProfile(this.getObserverPattern().getPatternProfile());
		this.getUmlModel().setName("MediatedObserverPattern");
		// Set the Model for Mediator Pattern
		//this.getMediatorPattern().setUmlModel(this.getUmlModel());
		// Compose these two patterns
		// 1. Define each role of the MediatedObserverPattern
		// 2. Reuse as many elements in the ObserverPattern and MediatorPattern as possible	
		// r1.
		this.setMediatedSubject(this.getObserverPattern().getSubject());
		// r2.
		this.setMediatedObserver(this.getObserverPattern().getObserver());
		// r3.
		this.getConcreteMediatedSubjects().addAll(this.getObserverPattern().getConcreteSubjects());
		// r4.
		this.getConcreteMediatedObservers().addAll(this.getObserverPattern().getConcreteObservers());
		// r5
		this.setAttachOp(this.getObserverPattern().getAttach());
		// r6
		this.setAttachPara(this.getObserverPattern().getAttachPara());
		// r7
		this.setDetachOp(this.getObserverPattern().getDetach());
		// r8
		this.setDetachPara(this.getObserverPattern().getDetachPara());
		// r9
		this.setSubjectNotifyOp(this.getObserverPattern().getNotify());
		// r10
		this.setMediatedObserverUpdateOp(this.getObserverPattern().getUpdate());
		// r11
		this.getConcreteMediatedSubjectGetStateOps().addAll(this.getObserverPattern().getConcreteSubjectGetStateOps());
		// r12
		this.getConcreteMediatedSubjectSetStateOps().addAll(this.getObserverPattern().getConcreteSubjectSetStateOps());
		// r13
		this.getConcreteMediatedObserverUpdateOps().addAll(this.getObserverPattern().getConcreteObserversUpdateOps());
		// r14
		this.getConcreteMediatedObserverStates().addAll(this.getObserverPattern().getConcreteObserverStates());
		// r15
		this.getConcreteMediatedSubjectStates().addAll(this.getObserverPattern().getConcreteSubjectStates());
		// r16
		Class changmge=UML2Helpers.createClass(this.getUmlModel(), "ChangeManager", true);
		this.setChangeManager(changmge);
		// r17
		this.getConcreteChangeManagers();
		// r18
		Operation regOp=this.getChangeManager().createOwnedOperation("Register", null, null);
		this.setRegisterOp(regOp);
		// r19
		Parameter regp1=regOp.createOwnedParameter("subject", this.getMediatedSubject());
		this.setRegisterOpPara1(regp1);
		// r20
		Parameter regp2=regOp.createOwnedParameter("observer", this.getMediatedObserver());
		this.setRegisterOpPara2(regp2);
		// r21
		Operation unregOp=this.getChangeManager().createOwnedOperation("Unregister", null, null);
		this.setUnRegisterOp(unregOp);
		// r22
		Parameter unregp1=unregOp.createOwnedParameter("subject", this.getMediatedSubject());
		this.setUnRegisterOpPara1(unregp1);
		// r23
		Parameter unregp2=unregOp.createOwnedParameter("observer", this.getMediatedObserver());
		this.setUnRegisterOpPara2(unregp2);
		// r24
		Operation cmnop=this.getChangeManager().createOwnedOperation("Notify", null, null);
		this.setChangeManagerNotifyOp(cmnop);
		// r25
		Property sompro=this.getChangeManager().createOwnedAttribute("SubObsMapping", (Type) this.getUmlModel().getPackagedElement("Map"));
		this.setSubToObsMapping(sompro);

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
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN:
				if (resolve) return getObserverPattern();
				return basicGetObserverPattern();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN:
				if (resolve) return getMediatorPattern();
				return basicGetMediatorPattern();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER:
				if (resolve) return getChangeManager();
				return basicGetChangeManager();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT:
				if (resolve) return getMediatedSubject();
				return basicGetMediatedSubject();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER:
				if (resolve) return getMediatedObserver();
				return basicGetMediatedObserver();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_CHANGE_MANAGERS:
				return getConcreteChangeManagers();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECTS:
				return getConcreteMediatedSubjects();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVERS:
				return getConcreteMediatedObservers();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_OP:
				if (resolve) return getAttachOp();
				return basicGetAttachOp();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_PARA:
				if (resolve) return getAttachPara();
				return basicGetAttachPara();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_OP:
				if (resolve) return getDetachOp();
				return basicGetDetachOp();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_PARA:
				if (resolve) return getDetachPara();
				return basicGetDetachPara();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP:
				if (resolve) return getSubjectNotifyOp();
				return basicGetSubjectNotifyOp();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP:
				if (resolve) return getRegisterOp();
				return basicGetRegisterOp();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1:
				if (resolve) return getRegisterOpPara1();
				return basicGetRegisterOpPara1();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2:
				if (resolve) return getRegisterOpPara2();
				return basicGetRegisterOpPara2();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP:
				if (resolve) return getUnRegisterOp();
				return basicGetUnRegisterOp();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1:
				if (resolve) return getUnRegisterOpPara1();
				return basicGetUnRegisterOpPara1();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2:
				if (resolve) return getUnRegisterOpPara2();
				return basicGetUnRegisterOpPara2();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP:
				if (resolve) return getChangeManagerNotifyOp();
				return basicGetChangeManagerNotifyOp();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING:
				if (resolve) return getSubToObsMapping();
				return basicGetSubToObsMapping();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP:
				if (resolve) return getMediatedObserverUpdateOp();
				return basicGetMediatedObserverUpdateOp();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_GET_STATE_OPS:
				return getConcreteMediatedSubjectGetStateOps();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_SET_STATE_OPS:
				return getConcreteMediatedSubjectSetStateOps();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_UPDATE_OPS:
				return getConcreteMediatedObserverUpdateOps();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_STATES:
				return getConcreteMediatedObserverStates();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_STATES:
				return getConcreteMediatedSubjectStates();
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
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN:
				setObserverPattern((ObserverPattern)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN:
				setMediatorPattern((MediatorPattern)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER:
				setChangeManager((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT:
				setMediatedSubject((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER:
				setMediatedObserver((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_CHANGE_MANAGERS:
				getConcreteChangeManagers().clear();
				getConcreteChangeManagers().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECTS:
				getConcreteMediatedSubjects().clear();
				getConcreteMediatedSubjects().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVERS:
				getConcreteMediatedObservers().clear();
				getConcreteMediatedObservers().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_OP:
				setAttachOp((Operation)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_PARA:
				setAttachPara((Parameter)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_OP:
				setDetachOp((Operation)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_PARA:
				setDetachPara((Parameter)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP:
				setSubjectNotifyOp((Operation)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP:
				setRegisterOp((Operation)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1:
				setRegisterOpPara1((Parameter)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2:
				setRegisterOpPara2((Parameter)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP:
				setUnRegisterOp((Operation)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1:
				setUnRegisterOpPara1((Parameter)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2:
				setUnRegisterOpPara2((Parameter)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP:
				setChangeManagerNotifyOp((Operation)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING:
				setSubToObsMapping((Property)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP:
				setMediatedObserverUpdateOp((Operation)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_GET_STATE_OPS:
				getConcreteMediatedSubjectGetStateOps().clear();
				getConcreteMediatedSubjectGetStateOps().addAll((Collection<? extends Operation>)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_SET_STATE_OPS:
				getConcreteMediatedSubjectSetStateOps().clear();
				getConcreteMediatedSubjectSetStateOps().addAll((Collection<? extends Operation>)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_UPDATE_OPS:
				getConcreteMediatedObserverUpdateOps().clear();
				getConcreteMediatedObserverUpdateOps().addAll((Collection<? extends Operation>)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_STATES:
				getConcreteMediatedObserverStates().clear();
				getConcreteMediatedObserverStates().addAll((Collection<? extends Property>)newValue);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_STATES:
				getConcreteMediatedSubjectStates().clear();
				getConcreteMediatedSubjectStates().addAll((Collection<? extends Property>)newValue);
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
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN:
				setObserverPattern((ObserverPattern)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN:
				setMediatorPattern((MediatorPattern)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER:
				setChangeManager((org.eclipse.uml2.uml.Class)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT:
				setMediatedSubject((org.eclipse.uml2.uml.Class)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER:
				setMediatedObserver((org.eclipse.uml2.uml.Class)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_CHANGE_MANAGERS:
				getConcreteChangeManagers().clear();
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECTS:
				getConcreteMediatedSubjects().clear();
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVERS:
				getConcreteMediatedObservers().clear();
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_OP:
				setAttachOp((Operation)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_PARA:
				setAttachPara((Parameter)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_OP:
				setDetachOp((Operation)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_PARA:
				setDetachPara((Parameter)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP:
				setSubjectNotifyOp((Operation)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP:
				setRegisterOp((Operation)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1:
				setRegisterOpPara1((Parameter)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2:
				setRegisterOpPara2((Parameter)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP:
				setUnRegisterOp((Operation)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1:
				setUnRegisterOpPara1((Parameter)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2:
				setUnRegisterOpPara2((Parameter)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP:
				setChangeManagerNotifyOp((Operation)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING:
				setSubToObsMapping((Property)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP:
				setMediatedObserverUpdateOp((Operation)null);
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_GET_STATE_OPS:
				getConcreteMediatedSubjectGetStateOps().clear();
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_SET_STATE_OPS:
				getConcreteMediatedSubjectSetStateOps().clear();
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_UPDATE_OPS:
				getConcreteMediatedObserverUpdateOps().clear();
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_STATES:
				getConcreteMediatedObserverStates().clear();
				return;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_STATES:
				getConcreteMediatedSubjectStates().clear();
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
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN:
				return observerPattern != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN:
				return mediatorPattern != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER:
				return changeManager != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT:
				return mediatedSubject != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER:
				return mediatedObserver != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_CHANGE_MANAGERS:
				return concreteChangeManagers != null && !concreteChangeManagers.isEmpty();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECTS:
				return concreteMediatedSubjects != null && !concreteMediatedSubjects.isEmpty();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVERS:
				return concreteMediatedObservers != null && !concreteMediatedObservers.isEmpty();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_OP:
				return attachOp != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__ATTACH_PARA:
				return attachPara != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_OP:
				return detachOp != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__DETACH_PARA:
				return detachPara != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP:
				return subjectNotifyOp != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP:
				return registerOp != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1:
				return registerOpPara1 != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2:
				return registerOpPara2 != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP:
				return unRegisterOp != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1:
				return unRegisterOpPara1 != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2:
				return unRegisterOpPara2 != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP:
				return changeManagerNotifyOp != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING:
				return subToObsMapping != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP:
				return mediatedObserverUpdateOp != null;
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_GET_STATE_OPS:
				return concreteMediatedSubjectGetStateOps != null && !concreteMediatedSubjectGetStateOps.isEmpty();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_SET_STATE_OPS:
				return concreteMediatedSubjectSetStateOps != null && !concreteMediatedSubjectSetStateOps.isEmpty();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_UPDATE_OPS:
				return concreteMediatedObserverUpdateOps != null && !concreteMediatedObserverUpdateOps.isEmpty();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_STATES:
				return concreteMediatedObserverStates != null && !concreteMediatedObserverStates.isEmpty();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_STATES:
				return concreteMediatedSubjectStates != null && !concreteMediatedSubjectStates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MediatedObserverPatternImpl
