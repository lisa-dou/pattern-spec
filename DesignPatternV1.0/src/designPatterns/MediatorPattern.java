/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Device;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediator Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link designPatterns.MediatorPattern#getMediator <em>Mediator</em>}</li>
 *   <li>{@link designPatterns.MediatorPattern#getColleague <em>Colleague</em>}</li>
 *   <li>{@link designPatterns.MediatorPattern#getConcreteMediators <em>Concrete Mediators</em>}</li>
 *   <li>{@link designPatterns.MediatorPattern#getConcreteColleagues <em>Concrete Colleagues</em>}</li>
 *   <li>{@link designPatterns.MediatorPattern#getConcreteMediatorAsso_colleague <em>Concrete Mediator Asso colleague</em>}</li>
 *   <li>{@link designPatterns.MediatorPattern#getCommunicationInterface <em>Communication Interface</em>}</li>
 *   <li>{@link designPatterns.MediatorPattern#getColleagueAsso_mediator <em>Colleague Asso mediator</em>}</li>
 * </ul>
 * </p>
 *
 * @see designPatterns.DesignPatternsPackage#getMediatorPattern()
 * @model
 * @generated
 */
public interface MediatorPattern extends DesignPattern
{
	/**
	 * Returns the value of the '<em><b>Mediator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator</em>' reference.
	 * @see #setMediator(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getMediatorPattern_Mediator()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getMediator();

	/**
	 * Sets the value of the '{@link designPatterns.MediatorPattern#getMediator <em>Mediator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator</em>' reference.
	 * @see #getMediator()
	 * @generated
	 */
	void setMediator(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Colleague</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colleague</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colleague</em>' reference.
	 * @see #setColleague(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getMediatorPattern_Colleague()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getColleague();

	/**
	 * Sets the value of the '{@link designPatterns.MediatorPattern#getColleague <em>Colleague</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colleague</em>' reference.
	 * @see #getColleague()
	 * @generated
	 */
	void setColleague(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Concrete Mediators</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediators</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatorPattern_ConcreteMediators()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getConcreteMediators();

	/**
	 * Returns the value of the '<em><b>Concrete Colleagues</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Colleagues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Colleagues</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatorPattern_ConcreteColleagues()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getConcreteColleagues();

	/**
	 * Returns the value of the '<em><b>Concrete Mediator Asso colleague</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Mediator Asso colleague</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Mediator Asso colleague</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatorPattern_ConcreteMediatorAsso_colleague()
	 * @model
	 * @generated
	 */
	EList<Association> getConcreteMediatorAsso_colleague();

	/**
	 * Returns the value of the '<em><b>Communication Interface</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Interface</em>' reference list.
	 * @see designPatterns.DesignPatternsPackage#getMediatorPattern_CommunicationInterface()
	 * @model
	 * @generated
	 */
	EList<Operation> getCommunicationInterface();

	/**
	 * Returns the value of the '<em><b>Colleague Asso mediator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colleague Asso mediator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colleague Asso mediator</em>' reference.
	 * @see #setColleagueAsso_mediator(Association)
	 * @see designPatterns.DesignPatternsPackage#getMediatorPattern_ColleagueAsso_mediator()
	 * @model required="true"
	 * @generated
	 */
	Association getColleagueAsso_mediator();

	/**
	 * Sets the value of the '{@link designPatterns.MediatorPattern#getColleagueAsso_mediator <em>Colleague Asso mediator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colleague Asso mediator</em>' reference.
	 * @see #getColleagueAsso_mediator()
	 * @generated
	 */
	void setColleagueAsso_mediator(Association value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ConMediatorNameDataType="org.eclipse.uml2.uml.String" ConColleaguesMany="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class CreateConcreteMediator(String ConMediatorName, EList<org.eclipse.uml2.uml.Class> ConColleagues);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ConColleagueNameDataType="org.eclipse.uml2.uml.String"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class CreateConcreteColleague(String ConColleagueName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model OperationNameDataType="org.eclipse.uml2.uml.String" ParameterNamesDataType="org.eclipse.uml2.uml.String" ParameterNamesMany="true" ParameterTypesMany="true"
	 * @generated
	 */
	Operation CreateCommunicationOp(org.eclipse.uml2.uml.Class ConMediator, String OperationName, EList<String> ParameterNames, EList<Type> ParameterTypes, Type ReturnType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AddConcreteColleage(org.eclipse.uml2.uml.Class class_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ConColleaguesMany="true"
	 * @generated
	 */
	void AddConcreteMediator(org.eclipse.uml2.uml.Class class_, EList<org.eclipse.uml2.uml.Class> ConColleagues);

} // MediatorPattern
