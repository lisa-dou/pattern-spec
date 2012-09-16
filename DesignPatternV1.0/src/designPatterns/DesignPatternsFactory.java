/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see designPatterns.DesignPatternsPackage
 * @generated
 */
public interface DesignPatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DesignPatternsFactory eINSTANCE = designPatterns.impl.DesignPatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Observer Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observer Pattern</em>'.
	 * @generated
	 */
	ObserverPattern createObserverPattern();

	/**
	 * Returns a new object of class '<em>Mediator Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mediator Pattern</em>'.
	 * @generated
	 */
	MediatorPattern createMediatorPattern();

	/**
	 * Returns a new object of class '<em>Mediated Observer Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mediated Observer Pattern</em>'.
	 * @generated
	 */
	MediatedObserverPattern createMediatedObserverPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DesignPatternsPackage getDesignPatternsPackage();

} //DesignPatternsFactory
