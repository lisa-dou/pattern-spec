/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns.util;

import designPatterns.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see designPatterns.DesignPatternsPackage
 * @generated
 */
public class DesignPatternsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DesignPatternsValidator INSTANCE = new DesignPatternsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "designPatterns";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLValidator umlValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternsValidator() {
		super();
		umlValidator = UMLValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DesignPatternsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DesignPatternsPackage.DESIGN_PATTERN:
				return validateDesignPattern((DesignPattern)value, diagnostics, context);
			case DesignPatternsPackage.OBSERVER_PATTERN:
				return validateObserverPattern((ObserverPattern)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignPattern(DesignPattern designPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(designPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(designPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(designPattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObserverPattern(ObserverPattern observerPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(observerPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(observerPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateObserverPattern_AllInherit_r1(observerPattern, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AllInherit_r1 constraint of '<em>Observer Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBSERVER_PATTERN__ALL_INHERIT_R1__EEXPRESSION = "self.Inherit(Observer,Observer)";

	/**
	 * Validates the AllInherit_r1 constraint of '<em>Observer Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObserverPattern_AllInherit_r1(ObserverPattern observerPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DesignPatternsPackage.Literals.OBSERVER_PATTERN,
				 observerPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AllInherit_r1",
				 OBSERVER_PATTERN__ALL_INHERIT_R1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DesignPatternsValidator
