/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observer Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link designPatterns.ObserverPattern#getObserver <em>Observer</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getConcreteObservers <em>Concrete Observers</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getSubject <em>Subject</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getConcreteSubjects <em>Concrete Subjects</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getConcreteObserverStates <em>Concrete Observer States</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getConcreteSubjectStates <em>Concrete Subject States</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getAttach <em>Attach</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getAttachPara <em>Attach Para</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getDetach <em>Detach</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getDetachPara <em>Detach Para</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getNotify <em>Notify</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getUpdate <em>Update</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getConcreteSubjectGetStateOps <em>Concrete Subject Get State Ops</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getConcreteSubjectSetStateOps <em>Concrete Subject Set State Ops</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getConcreteObserversUpdateOps <em>Concrete Observers Update Ops</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getSubjectAsso_observers <em>Subject Asso observers</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getConcreteObserverAssos_subject <em>Concrete Observer Assos subject</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getPattern_Predicates <em>Pattern Predicates</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getPattern_Attached <em>Pattern Attached</em>}</li>
 *   <li>{@link designPatterns.ObserverPattern#getPattern_Updated <em>Pattern Updated</em>}</li>
 * </ul>
 * </p>
 *
 * @see designPatterns.DesignPatternsPackage#getObserverPattern()
 * @model
 * @generated
 */
public interface ObserverPattern extends DesignPattern {
	/**
	 * Returns the value of the '<em><b>Observer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer</em>' reference.
	 * @see #setObserver(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Observer()
	 * @model required="true"
	 *        annotation="RoleName Observer='Observer'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getObserver();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getObserver <em>Observer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer</em>' reference.
	 * @see #getObserver()
	 * @generated
	 */
	void setObserver(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Concrete Observers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Observers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Observers</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_ConcreteObservers()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getConcreteObservers();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Subject()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getSubject();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Concrete Subjects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Subjects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Subjects</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_ConcreteSubjects()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getConcreteSubjects();

	/**
	 * Returns the value of the '<em><b>Concrete Observer States</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Observer States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Observer States</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_ConcreteObserverStates()
	 * @model
	 * @generated
	 */
	EList<Property> getConcreteObserverStates();

	/**
	 * Returns the value of the '<em><b>Concrete Subject States</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Subject States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Subject States</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_ConcreteSubjectStates()
	 * @model
	 * @generated
	 */
	EList<Property> getConcreteSubjectStates();

	/**
	 * Returns the value of the '<em><b>Attach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach</em>' reference.
	 * @see #setAttach(Operation)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Attach()
	 * @model required="true"
	 * @generated
	 */
	Operation getAttach();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getAttach <em>Attach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach</em>' reference.
	 * @see #getAttach()
	 * @generated
	 */
	void setAttach(Operation value);

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
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_AttachPara()
	 * @model required="true"
	 * @generated
	 */
	Parameter getAttachPara();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getAttachPara <em>Attach Para</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach Para</em>' reference.
	 * @see #getAttachPara()
	 * @generated
	 */
	void setAttachPara(Parameter value);

	/**
	 * Returns the value of the '<em><b>Detach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detach</em>' reference.
	 * @see #setDetach(Operation)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Detach()
	 * @model required="true"
	 * @generated
	 */
	Operation getDetach();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getDetach <em>Detach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detach</em>' reference.
	 * @see #getDetach()
	 * @generated
	 */
	void setDetach(Operation value);

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
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_DetachPara()
	 * @model required="true"
	 * @generated
	 */
	Parameter getDetachPara();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getDetachPara <em>Detach Para</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detach Para</em>' reference.
	 * @see #getDetachPara()
	 * @generated
	 */
	void setDetachPara(Parameter value);

	/**
	 * Returns the value of the '<em><b>Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notify</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify</em>' reference.
	 * @see #setNotify(Operation)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Notify()
	 * @model required="true"
	 * @generated
	 */
	Operation getNotify();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getNotify <em>Notify</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify</em>' reference.
	 * @see #getNotify()
	 * @generated
	 */
	void setNotify(Operation value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' reference.
	 * @see #setUpdate(Operation)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Update()
	 * @model required="true"
	 * @generated
	 */
	Operation getUpdate();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getUpdate <em>Update</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(Operation value);

	/**
	 * Returns the value of the '<em><b>Concrete Subject Get State Ops</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Subject Get State Ops</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Subject Get State Ops</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_ConcreteSubjectGetStateOps()
	 * @model annotation="RoleName ConcreteSubjectGetStateOps='GetStateOp'"
	 * @generated
	 */
	EList<Operation> getConcreteSubjectGetStateOps();

	/**
	 * Returns the value of the '<em><b>Concrete Subject Set State Ops</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Subject Set State Ops</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Subject Set State Ops</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_ConcreteSubjectSetStateOps()
	 * @model
	 * @generated
	 */
	EList<Operation> getConcreteSubjectSetStateOps();

	/**
	 * Returns the value of the '<em><b>Concrete Observers Update Ops</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Observers Update Ops</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Observers Update Ops</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_ConcreteObserversUpdateOps()
	 * @model
	 * @generated
	 */
	EList<Operation> getConcreteObserversUpdateOps();

	/**
	 * Returns the value of the '<em><b>Subject Asso observers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Asso observers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Asso observers</em>' reference.
	 * @see #setSubjectAsso_observers(Association)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_SubjectAsso_observers()
	 * @model required="true"
	 * @generated
	 */
	Association getSubjectAsso_observers();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getSubjectAsso_observers <em>Subject Asso observers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Asso observers</em>' reference.
	 * @see #getSubjectAsso_observers()
	 * @generated
	 */
	void setSubjectAsso_observers(Association value);

	/**
	 * Returns the value of the '<em><b>Concrete Observer Assos subject</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Observer Assos subject</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Observer Assos subject</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_ConcreteObserverAssos_subject()
	 * @model
	 * @generated
	 */
	EList<Association> getConcreteObserverAssos_subject();

	/**
	 * Returns the value of the '<em><b>Pattern Predicates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Predicates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Predicates</em>' reference.
	 * @see #setPattern_Predicates(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Pattern_Predicates()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getPattern_Predicates();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getPattern_Predicates <em>Pattern Predicates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Predicates</em>' reference.
	 * @see #getPattern_Predicates()
	 * @generated
	 */
	void setPattern_Predicates(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Pattern Attached</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Attached</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Attached</em>' reference.
	 * @see #setPattern_Attached(Operation)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Pattern_Attached()
	 * @model required="true"
	 * @generated
	 */
	Operation getPattern_Attached();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getPattern_Attached <em>Pattern Attached</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Attached</em>' reference.
	 * @see #getPattern_Attached()
	 * @generated
	 */
	void setPattern_Attached(Operation value);

	/**
	 * Returns the value of the '<em><b>Pattern Updated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Updated</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Updated</em>' reference.
	 * @see #setPattern_Updated(Operation)
	 * @see designPatterns.DesignPatternsPackage#getObserverPattern_Pattern_Updated()
	 * @model required="true"
	 * @generated
	 */
	Operation getPattern_Updated();

	/**
	 * Sets the value of the '{@link designPatterns.ObserverPattern#getPattern_Updated <em>Pattern Updated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Updated</em>' reference.
	 * @see #getPattern_Updated()
	 * @generated
	 */
	void setPattern_Updated(Operation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Property GetSubjectState(ObserverPattern OP, org.eclipse.uml2.uml.Class subject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class CreateConcreteObserver(String conObserverName, String observerStateName, Type observerStateType, org.eclipse.uml2.uml.Class ListentoSubject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class CreateConcreteSubject(String conSubjectName, String subjectStateName, Type subjectStateType, String GetStateOpName, String SetStateOpName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Property GetListeningTo(org.eclipse.uml2.uml.Class conObserver);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AddConcreteObserver(org.eclipse.uml2.uml.Class class_, String observerStateName, Type observerStateType, org.eclipse.uml2.uml.Class ListentoSubject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AddConcreteSubject(org.eclipse.uml2.uml.Class class_, String subjectStateName, Type subjectStateType, String GetStateOpName, String SetStateOpName);

} // ObserverPattern
