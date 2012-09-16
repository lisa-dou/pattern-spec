/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;

// The Process of Defining Design Patterns
// 1. Identify Structural Roles in a Pattern
// 2. Identify Dynamic Relations in this Pattern
// 3. Identify Evolution and Composition Operations for this pattern
// 4. Create a Profile for this Pattern
// 5. Implement the ApplyPatternProfile() method 
// 6. Implement the CreatePatternSpecification() method
// 7. Implement Evolution and Composition Operations
// 8. Implement the CreateInitialPatternStructure() method

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link designPatterns.DesignPattern#getIntPrimType <em>Int Prim Type</em>}</li>
 *   <li>{@link designPatterns.DesignPattern#getStringPrimType <em>String Prim Type</em>}</li>
 *   <li>{@link designPatterns.DesignPattern#getBoolPrimType <em>Bool Prim Type</em>}</li>
 *   <li>{@link designPatterns.DesignPattern#getUmlModel <em>Uml Model</em>}</li>
 *   <li>{@link designPatterns.DesignPattern#getPatternProfile <em>Pattern Profile</em>}</li>
 *   <li>{@link designPatterns.DesignPattern#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see designPatterns.DesignPatternsPackage#getDesignPattern()
 * @model abstract="true"
 * @generated
 */
public interface DesignPattern extends Model {
	/**
	 * Returns the value of the '<em><b>Int Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Prim Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Prim Type</em>' reference.
	 * @see #setIntPrimType(PrimitiveType)
	 * @see designPatterns.DesignPatternsPackage#getDesignPattern_IntPrimType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getIntPrimType();

	/**
	 * Sets the value of the '{@link designPatterns.DesignPattern#getIntPrimType <em>Int Prim Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Prim Type</em>' reference.
	 * @see #getIntPrimType()
	 * @generated
	 */
	void setIntPrimType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>String Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Prim Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Prim Type</em>' reference.
	 * @see #setStringPrimType(PrimitiveType)
	 * @see designPatterns.DesignPatternsPackage#getDesignPattern_StringPrimType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getStringPrimType();

	/**
	 * Sets the value of the '{@link designPatterns.DesignPattern#getStringPrimType <em>String Prim Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Prim Type</em>' reference.
	 * @see #getStringPrimType()
	 * @generated
	 */
	void setStringPrimType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Bool Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Prim Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Prim Type</em>' reference.
	 * @see #setBoolPrimType(PrimitiveType)
	 * @see designPatterns.DesignPatternsPackage#getDesignPattern_BoolPrimType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getBoolPrimType();

	/**
	 * Sets the value of the '{@link designPatterns.DesignPattern#getBoolPrimType <em>Bool Prim Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Prim Type</em>' reference.
	 * @see #getBoolPrimType()
	 * @generated
	 */
	void setBoolPrimType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Uml Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Model</em>' reference.
	 * @see #setUmlModel(Model)
	 * @see designPatterns.DesignPatternsPackage#getDesignPattern_UmlModel()
	 * @model required="true"
	 * @generated
	 */
	Model getUmlModel();

	/**
	 * Sets the value of the '{@link designPatterns.DesignPattern#getUmlModel <em>Uml Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Model</em>' reference.
	 * @see #getUmlModel()
	 * @generated
	 */
	void setUmlModel(Model value);

	/**
	 * Returns the value of the '<em><b>Pattern Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Profile</em>' reference.
	 * @see #setPatternProfile(Profile)
	 * @see designPatterns.DesignPatternsPackage#getDesignPattern_PatternProfile()
	 * @model required="true"
	 * @generated
	 */
	Profile getPatternProfile();

	/**
	 * Sets the value of the '{@link designPatterns.DesignPattern#getPatternProfile <em>Pattern Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Profile</em>' reference.
	 * @see #getPatternProfile()
	 * @generated
	 */
	void setPatternProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(org.eclipse.uml2.uml.Class)
	 * @see designPatterns.DesignPatternsPackage#getDesignPattern_Map()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getMap();

	/**
	 * Sets the value of the '{@link designPatterns.DesignPattern#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(org.eclipse.uml2.uml.Class value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SaveAsUML(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CreateInitialPatternStructure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object CreatePrimitiveTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ApplyPatternProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CreatePatternSpecification();

} // DesignPattern
