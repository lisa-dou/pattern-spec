/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns.impl;

import designPatterns.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignPatternsFactoryImpl extends EFactoryImpl implements DesignPatternsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DesignPatternsFactory init() {
		try
		{
			DesignPatternsFactory theDesignPatternsFactory = (DesignPatternsFactory)EPackage.Registry.INSTANCE.getEFactory("designPatterns.liuqiang"); 
			if (theDesignPatternsFactory != null)
			{
				return theDesignPatternsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DesignPatternsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID())
		{
			case DesignPatternsPackage.OBSERVER_PATTERN: return createObserverPattern();
			case DesignPatternsPackage.MEDIATOR_PATTERN: return createMediatorPattern();
			case DesignPatternsPackage.MEDIATED_OBSERVER_PATTERN: return createMediatedObserverPattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverPattern createObserverPattern() {
		ObserverPatternImpl observerPattern = new ObserverPatternImpl();
		return observerPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediatorPattern createMediatorPattern()
	{
		MediatorPatternImpl mediatorPattern = new MediatorPatternImpl();
		return mediatorPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediatedObserverPattern createMediatedObserverPattern()
	{
		MediatedObserverPatternImpl mediatedObserverPattern = new MediatedObserverPatternImpl();
		return mediatedObserverPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternsPackage getDesignPatternsPackage() {
		return (DesignPatternsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DesignPatternsPackage getPackage() {
		return DesignPatternsPackage.eINSTANCE;
	}

} //DesignPatternsFactoryImpl
