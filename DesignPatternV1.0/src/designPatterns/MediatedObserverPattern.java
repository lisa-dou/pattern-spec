/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediated Observer Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link designPatterns.MediatedObserverPattern#getObserverPattern <em>Observer Pattern</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getMediatorPattern <em>Mediator Pattern</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getChangeManager <em>Change Manager</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getMediatedSubject <em>Mediated Subject</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getMediatedObserver <em>Mediated Observer</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getConcreteChangeManagers <em>Concrete Change Managers</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getConcreteMediatedSubjects <em>Concrete Mediated Subjects</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getConcreteMediatedObservers <em>Concrete Mediated Observers</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getAttachOp <em>Attach Op</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getAttachPara <em>Attach Para</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getDetachOp <em>Detach Op</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getDetachPara <em>Detach Para</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getSubjectNotifyOp <em>Subject Notify Op</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getRegisterOp <em>Register Op</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getRegisterOpPara1 <em>Register Op Para1</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getRegisterOpPara2 <em>Register Op Para2</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getUnRegisterOp <em>Un Register Op</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getUnRegisterOpPara1 <em>Un Register Op Para1</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getUnRegisterOpPara2 <em>Un Register Op Para2</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getChangeManagerNotifyOp <em>Change Manager Notify Op</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getSubToObsMapping <em>Sub To Obs Mapping</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getMediatedObserverUpdateOp <em>Mediated Observer Update Op</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectGetStateOps <em>Concrete Mediated Subject Get State Ops</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectSetStateOps <em>Concrete Mediated Subject Set State Ops</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getConcreteMediatedObserverUpdateOps <em>Concrete Mediated Observer Update Ops</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getConcreteMediatedObserverStates <em>Concrete Mediated Observer States</em>}</li>
 *   <li>{@link designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectStates <em>Concrete Mediated Subject States</em>}</li>
 * </ul>
 * </p>
 *
 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern()
 * @model
 * @generated
 */
public interface MediatedObserverPattern extends DesignPattern
{
	/**
	 * Returns the value of the '<em><b>Observer Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer Pattern</em>' reference.
	 * @see #setObserverPattern(ObserverPattern)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ObserverPattern()
	 * @model
	 * @generated
	 */
	ObserverPattern getObserverPattern();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getObserverPattern <em>Observer Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer Pattern</em>' reference.
	 * @see #getObserverPattern()
	 * @generated
	 */
	void setObserverPattern(ObserverPattern value);

	/**
	 * Returns the value of the '<em><b>Mediator Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediator Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator Pattern</em>' reference.
	 * @see #setMediatorPattern(MediatorPattern)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_MediatorPattern()
	 * @model
	 * @generated
	 */
	MediatorPattern getMediatorPattern();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getMediatorPattern <em>Mediator Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator Pattern</em>' reference.
	 * @see #getMediatorPattern()
	 * @generated
	 */
	void setMediatorPattern(MediatorPattern value);

	/**
	 * Returns the value of the '<em><b>Change Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Manager</em>' reference.
	 * @see #setChangeManager(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ChangeManager()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getChangeManager();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getChangeManager <em>Change Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Manager</em>' reference.
	 * @see #getChangeManager()
	 * @generated
	 */
	void setChangeManager(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Mediated Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediated Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediated Subject</em>' reference.
	 * @see #setMediatedSubject(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_MediatedSubject()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getMediatedSubject();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getMediatedSubject <em>Mediated Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediated Subject</em>' reference.
	 * @see #getMediatedSubject()
	 * @generated
	 */
	void setMediatedSubject(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Mediated Observer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediated Observer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediated Observer</em>' reference.
	 * @see #setMediatedObserver(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_MediatedObserver()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getMediatedObserver();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getMediatedObserver <em>Mediated Observer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediated Observer</em>' reference.
	 * @see #getMediatedObserver()
	 * @generated
	 */
	void setMediatedObserver(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Concrete Change Managers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Change Managers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Change Managers</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ConcreteChangeManagers()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getConcreteChangeManagers();

	/**
	 * Returns the value of the '<em><b>Concrete Mediated Subjects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediated Subjects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediated Subjects</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ConcreteMediatedSubjects()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getConcreteMediatedSubjects();

	/**
	 * Returns the value of the '<em><b>Concrete Mediated Observers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediated Observers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediated Observers</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ConcreteMediatedObservers()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getConcreteMediatedObservers();

	/**
	 * Returns the value of the '<em><b>Attach Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach Op</em>' reference.
	 * @see #setAttachOp(Operation)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_AttachOp()
	 * @model required="true"
	 * @generated
	 */
	Operation getAttachOp();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getAttachOp <em>Attach Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach Op</em>' reference.
	 * @see #getAttachOp()
	 * @generated
	 */
	void setAttachOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Attach Para</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach Para</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach Para</em>' reference.
	 * @see #setAttachPara(Parameter)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_AttachPara()
	 * @model required="true"
	 * @generated
	 */
	Parameter getAttachPara();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getAttachPara <em>Attach Para</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach Para</em>' reference.
	 * @see #getAttachPara()
	 * @generated
	 */
	void setAttachPara(Parameter value);

	/**
	 * Returns the value of the '<em><b>Detach Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detach Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detach Op</em>' reference.
	 * @see #setDetachOp(Operation)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_DetachOp()
	 * @model required="true"
	 * @generated
	 */
	Operation getDetachOp();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getDetachOp <em>Detach Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detach Op</em>' reference.
	 * @see #getDetachOp()
	 * @generated
	 */
	void setDetachOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Detach Para</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detach Para</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detach Para</em>' reference.
	 * @see #setDetachPara(Parameter)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_DetachPara()
	 * @model required="true"
	 * @generated
	 */
	Parameter getDetachPara();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getDetachPara <em>Detach Para</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detach Para</em>' reference.
	 * @see #getDetachPara()
	 * @generated
	 */
	void setDetachPara(Parameter value);

	/**
	 * Returns the value of the '<em><b>Subject Notify Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Notify Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Notify Op</em>' reference.
	 * @see #setSubjectNotifyOp(Operation)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_SubjectNotifyOp()
	 * @model required="true"
	 * @generated
	 */
	Operation getSubjectNotifyOp();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getSubjectNotifyOp <em>Subject Notify Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Notify Op</em>' reference.
	 * @see #getSubjectNotifyOp()
	 * @generated
	 */
	void setSubjectNotifyOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Register Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Op</em>' reference.
	 * @see #setRegisterOp(Operation)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_RegisterOp()
	 * @model required="true"
	 * @generated
	 */
	Operation getRegisterOp();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getRegisterOp <em>Register Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Op</em>' reference.
	 * @see #getRegisterOp()
	 * @generated
	 */
	void setRegisterOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Register Op Para1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Op Para1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Op Para1</em>' reference.
	 * @see #setRegisterOpPara1(Parameter)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_RegisterOpPara1()
	 * @model required="true"
	 * @generated
	 */
	Parameter getRegisterOpPara1();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getRegisterOpPara1 <em>Register Op Para1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Op Para1</em>' reference.
	 * @see #getRegisterOpPara1()
	 * @generated
	 */
	void setRegisterOpPara1(Parameter value);

	/**
	 * Returns the value of the '<em><b>Register Op Para2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Op Para2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Op Para2</em>' reference.
	 * @see #setRegisterOpPara2(Parameter)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_RegisterOpPara2()
	 * @model required="true"
	 * @generated
	 */
	Parameter getRegisterOpPara2();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getRegisterOpPara2 <em>Register Op Para2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Op Para2</em>' reference.
	 * @see #getRegisterOpPara2()
	 * @generated
	 */
	void setRegisterOpPara2(Parameter value);

	/**
	 * Returns the value of the '<em><b>Un Register Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Register Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Register Op</em>' reference.
	 * @see #setUnRegisterOp(Operation)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_UnRegisterOp()
	 * @model required="true"
	 * @generated
	 */
	Operation getUnRegisterOp();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getUnRegisterOp <em>Un Register Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Register Op</em>' reference.
	 * @see #getUnRegisterOp()
	 * @generated
	 */
	void setUnRegisterOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Un Register Op Para1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Register Op Para1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Register Op Para1</em>' reference.
	 * @see #setUnRegisterOpPara1(Parameter)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_UnRegisterOpPara1()
	 * @model required="true"
	 * @generated
	 */
	Parameter getUnRegisterOpPara1();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getUnRegisterOpPara1 <em>Un Register Op Para1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Register Op Para1</em>' reference.
	 * @see #getUnRegisterOpPara1()
	 * @generated
	 */
	void setUnRegisterOpPara1(Parameter value);

	/**
	 * Returns the value of the '<em><b>Un Register Op Para2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Register Op Para2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Register Op Para2</em>' reference.
	 * @see #setUnRegisterOpPara2(Parameter)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_UnRegisterOpPara2()
	 * @model required="true"
	 * @generated
	 */
	Parameter getUnRegisterOpPara2();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getUnRegisterOpPara2 <em>Un Register Op Para2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Register Op Para2</em>' reference.
	 * @see #getUnRegisterOpPara2()
	 * @generated
	 */
	void setUnRegisterOpPara2(Parameter value);

	/**
	 * Returns the value of the '<em><b>Change Manager Notify Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Manager Notify Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Manager Notify Op</em>' reference.
	 * @see #setChangeManagerNotifyOp(Operation)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ChangeManagerNotifyOp()
	 * @model required="true"
	 * @generated
	 */
	Operation getChangeManagerNotifyOp();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getChangeManagerNotifyOp <em>Change Manager Notify Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Manager Notify Op</em>' reference.
	 * @see #getChangeManagerNotifyOp()
	 * @generated
	 */
	void setChangeManagerNotifyOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Sub To Obs Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub To Obs Mapping</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub To Obs Mapping</em>' reference.
	 * @see #setSubToObsMapping(Property)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_SubToObsMapping()
	 * @model required="true"
	 * @generated
	 */
	Property getSubToObsMapping();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getSubToObsMapping <em>Sub To Obs Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub To Obs Mapping</em>' reference.
	 * @see #getSubToObsMapping()
	 * @generated
	 */
	void setSubToObsMapping(Property value);

	/**
	 * Returns the value of the '<em><b>Mediated Observer Update Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediated Observer Update Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediated Observer Update Op</em>' reference.
	 * @see #setMediatedObserverUpdateOp(Operation)
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_MediatedObserverUpdateOp()
	 * @model required="true"
	 * @generated
	 */
	Operation getMediatedObserverUpdateOp();

	/**
	 * Sets the value of the '{@link designPatterns.MediatedObserverPattern#getMediatedObserverUpdateOp <em>Mediated Observer Update Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediated Observer Update Op</em>' reference.
	 * @see #getMediatedObserverUpdateOp()
	 * @generated
	 */
	void setMediatedObserverUpdateOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Concrete Mediated Subject Get State Ops</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediated Subject Get State Ops</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediated Subject Get State Ops</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ConcreteMediatedSubjectGetStateOps()
	 * @model
	 * @generated
	 */
	EList<Operation> getConcreteMediatedSubjectGetStateOps();

	/**
	 * Returns the value of the '<em><b>Concrete Mediated Subject Set State Ops</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediated Subject Set State Ops</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediated Subject Set State Ops</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ConcreteMediatedSubjectSetStateOps()
	 * @model
	 * @generated
	 */
	EList<Operation> getConcreteMediatedSubjectSetStateOps();

	/**
	 * Returns the value of the '<em><b>Concrete Mediated Observer Update Ops</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediated Observer Update Ops</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediated Observer Update Ops</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ConcreteMediatedObserverUpdateOps()
	 * @model
	 * @generated
	 */
	EList<Operation> getConcreteMediatedObserverUpdateOps();

	/**
	 * Returns the value of the '<em><b>Concrete Mediated Observer States</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediated Observer States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediated Observer States</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ConcreteMediatedObserverStates()
	 * @model
	 * @generated
	 */
	EList<Property> getConcreteMediatedObserverStates();

	/**
	 * Returns the value of the '<em><b>Concrete Mediated Subject States</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediated Subject States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediated Subject States</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatedObserverPattern_ConcreteMediatedSubjectStates()
	 * @model
	 * @generated
	 */
	EList<Property> getConcreteMediatedSubjectStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Compose(ObserverPattern ObserverPattern, MediatorPattern MediatorPattern);

} // MediatedObserverPattern
