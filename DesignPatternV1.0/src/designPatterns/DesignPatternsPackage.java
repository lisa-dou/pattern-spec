/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see designPatterns.DesignPatternsFactory
 * @model kind="package"
 * @generated
 */
public interface DesignPatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "designPatterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "designPatterns.liuqiang";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DesignPatternsPackage eINSTANCE = designPatterns.impl.DesignPatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link designPatterns.impl.DesignPatternImpl <em>Design Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatterns.impl.DesignPatternImpl
	 * @see designPatterns.impl.DesignPatternsPackageImpl#getDesignPattern()
	 * @generated
	 */
	int DESIGN_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__EANNOTATIONS = UMLPackage.MODEL__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__OWNED_ELEMENT = UMLPackage.MODEL__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__OWNER = UMLPackage.MODEL__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__OWNED_COMMENT = UMLPackage.MODEL__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__NAME = UMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__VISIBILITY = UMLPackage.MODEL__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__QUALIFIED_NAME = UMLPackage.MODEL__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__CLIENT_DEPENDENCY = UMLPackage.MODEL__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__NAMESPACE = UMLPackage.MODEL__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__NAME_EXPRESSION = UMLPackage.MODEL__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__ELEMENT_IMPORT = UMLPackage.MODEL__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__PACKAGE_IMPORT = UMLPackage.MODEL__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__OWNED_RULE = UMLPackage.MODEL__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__MEMBER = UMLPackage.MODEL__MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__IMPORTED_MEMBER = UMLPackage.MODEL__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__OWNED_MEMBER = UMLPackage.MODEL__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__OWNING_TEMPLATE_PARAMETER = UMLPackage.MODEL__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__TEMPLATE_PARAMETER = UMLPackage.MODEL__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__TEMPLATE_BINDING = UMLPackage.MODEL__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__OWNED_TEMPLATE_SIGNATURE = UMLPackage.MODEL__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__OWNED_TYPE = UMLPackage.MODEL__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__PACKAGE_MERGE = UMLPackage.MODEL__PACKAGE_MERGE;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__PACKAGED_ELEMENT = UMLPackage.MODEL__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__NESTED_PACKAGE = UMLPackage.MODEL__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__NESTING_PACKAGE = UMLPackage.MODEL__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__PROFILE_APPLICATION = UMLPackage.MODEL__PROFILE_APPLICATION;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__VIEWPOINT = UMLPackage.MODEL__VIEWPOINT;

	/**
	 * The feature id for the '<em><b>Int Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__INT_PRIM_TYPE = UMLPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__STRING_PRIM_TYPE = UMLPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bool Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__BOOL_PRIM_TYPE = UMLPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uml Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__UML_MODEL = UMLPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pattern Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__PATTERN_PROFILE = UMLPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN__MAP = UMLPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Design Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_FEATURE_COUNT = UMLPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link designPatterns.impl.ObserverPatternImpl <em>Observer Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatterns.impl.ObserverPatternImpl
	 * @see designPatterns.impl.DesignPatternsPackageImpl#getObserverPattern()
	 * @generated
	 */
	int OBSERVER_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__EANNOTATIONS = DESIGN_PATTERN__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OWNED_ELEMENT = DESIGN_PATTERN__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OWNER = DESIGN_PATTERN__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OWNED_COMMENT = DESIGN_PATTERN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__NAME = DESIGN_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__VISIBILITY = DESIGN_PATTERN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__QUALIFIED_NAME = DESIGN_PATTERN__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CLIENT_DEPENDENCY = DESIGN_PATTERN__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__NAMESPACE = DESIGN_PATTERN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__NAME_EXPRESSION = DESIGN_PATTERN__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__ELEMENT_IMPORT = DESIGN_PATTERN__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__PACKAGE_IMPORT = DESIGN_PATTERN__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OWNED_RULE = DESIGN_PATTERN__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__MEMBER = DESIGN_PATTERN__MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__IMPORTED_MEMBER = DESIGN_PATTERN__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OWNED_MEMBER = DESIGN_PATTERN__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OWNING_TEMPLATE_PARAMETER = DESIGN_PATTERN__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__TEMPLATE_PARAMETER = DESIGN_PATTERN__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__TEMPLATE_BINDING = DESIGN_PATTERN__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OWNED_TEMPLATE_SIGNATURE = DESIGN_PATTERN__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OWNED_TYPE = DESIGN_PATTERN__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__PACKAGE_MERGE = DESIGN_PATTERN__PACKAGE_MERGE;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__PACKAGED_ELEMENT = DESIGN_PATTERN__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__NESTED_PACKAGE = DESIGN_PATTERN__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__NESTING_PACKAGE = DESIGN_PATTERN__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__PROFILE_APPLICATION = DESIGN_PATTERN__PROFILE_APPLICATION;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__VIEWPOINT = DESIGN_PATTERN__VIEWPOINT;

	/**
	 * The feature id for the '<em><b>Int Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__INT_PRIM_TYPE = DESIGN_PATTERN__INT_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>String Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__STRING_PRIM_TYPE = DESIGN_PATTERN__STRING_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>Bool Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__BOOL_PRIM_TYPE = DESIGN_PATTERN__BOOL_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>Uml Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__UML_MODEL = DESIGN_PATTERN__UML_MODEL;

	/**
	 * The feature id for the '<em><b>Pattern Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__PATTERN_PROFILE = DESIGN_PATTERN__PATTERN_PROFILE;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__MAP = DESIGN_PATTERN__MAP;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OBSERVER = DESIGN_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Observers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CONCRETE_OBSERVERS = DESIGN_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__SUBJECT = DESIGN_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concrete Subjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CONCRETE_SUBJECTS = DESIGN_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concrete Observer States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CONCRETE_OBSERVER_STATES = DESIGN_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Concrete Subject States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CONCRETE_SUBJECT_STATES = DESIGN_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__ATTACH = DESIGN_PATTERN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attach Para</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__ATTACH_PARA = DESIGN_PATTERN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Detach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__DETACH = DESIGN_PATTERN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Detach Para</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__DETACH_PARA = DESIGN_PATTERN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__NOTIFY = DESIGN_PATTERN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Update</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__UPDATE = DESIGN_PATTERN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Concrete Subject Get State Ops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CONCRETE_SUBJECT_GET_STATE_OPS = DESIGN_PATTERN_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Concrete Subject Set State Ops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CONCRETE_SUBJECT_SET_STATE_OPS = DESIGN_PATTERN_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Concrete Observers Update Ops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CONCRETE_OBSERVERS_UPDATE_OPS = DESIGN_PATTERN_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Subject Asso observers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS = DESIGN_PATTERN_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Concrete Observer Assos subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__CONCRETE_OBSERVER_ASSOS_SUBJECT = DESIGN_PATTERN_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pattern Predicates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__PATTERN_PREDICATES = DESIGN_PATTERN_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pattern Attached</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__PATTERN_ATTACHED = DESIGN_PATTERN_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pattern Updated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__PATTERN_UPDATED = DESIGN_PATTERN_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Observer Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN_FEATURE_COUNT = DESIGN_PATTERN_FEATURE_COUNT + 20;


	/**
	 * The meta object id for the '{@link designPatterns.impl.MediatorPatternImpl <em>Mediator Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatterns.impl.MediatorPatternImpl
	 * @see designPatterns.impl.DesignPatternsPackageImpl#getMediatorPattern()
	 * @generated
	 */
	int MEDIATOR_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__EANNOTATIONS = DESIGN_PATTERN__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__OWNED_ELEMENT = DESIGN_PATTERN__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__OWNER = DESIGN_PATTERN__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__OWNED_COMMENT = DESIGN_PATTERN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__NAME = DESIGN_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__VISIBILITY = DESIGN_PATTERN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__QUALIFIED_NAME = DESIGN_PATTERN__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__CLIENT_DEPENDENCY = DESIGN_PATTERN__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__NAMESPACE = DESIGN_PATTERN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__NAME_EXPRESSION = DESIGN_PATTERN__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__ELEMENT_IMPORT = DESIGN_PATTERN__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__PACKAGE_IMPORT = DESIGN_PATTERN__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__OWNED_RULE = DESIGN_PATTERN__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__MEMBER = DESIGN_PATTERN__MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__IMPORTED_MEMBER = DESIGN_PATTERN__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__OWNED_MEMBER = DESIGN_PATTERN__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__OWNING_TEMPLATE_PARAMETER = DESIGN_PATTERN__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__TEMPLATE_PARAMETER = DESIGN_PATTERN__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__TEMPLATE_BINDING = DESIGN_PATTERN__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__OWNED_TEMPLATE_SIGNATURE = DESIGN_PATTERN__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__OWNED_TYPE = DESIGN_PATTERN__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__PACKAGE_MERGE = DESIGN_PATTERN__PACKAGE_MERGE;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__PACKAGED_ELEMENT = DESIGN_PATTERN__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__NESTED_PACKAGE = DESIGN_PATTERN__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__NESTING_PACKAGE = DESIGN_PATTERN__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__PROFILE_APPLICATION = DESIGN_PATTERN__PROFILE_APPLICATION;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__VIEWPOINT = DESIGN_PATTERN__VIEWPOINT;

	/**
	 * The feature id for the '<em><b>Int Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__INT_PRIM_TYPE = DESIGN_PATTERN__INT_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>String Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__STRING_PRIM_TYPE = DESIGN_PATTERN__STRING_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>Bool Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__BOOL_PRIM_TYPE = DESIGN_PATTERN__BOOL_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>Uml Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__UML_MODEL = DESIGN_PATTERN__UML_MODEL;

	/**
	 * The feature id for the '<em><b>Pattern Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__PATTERN_PROFILE = DESIGN_PATTERN__PATTERN_PROFILE;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__MAP = DESIGN_PATTERN__MAP;

	/**
	 * The feature id for the '<em><b>Mediator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__MEDIATOR = DESIGN_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Colleague</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__COLLEAGUE = DESIGN_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concrete Mediators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__CONCRETE_MEDIATORS = DESIGN_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concrete Colleagues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__CONCRETE_COLLEAGUES = DESIGN_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concrete Mediator Asso colleague</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__CONCRETE_MEDIATOR_ASSO_COLLEAGUE = DESIGN_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__COMMUNICATION_INTERFACE = DESIGN_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Colleague Asso mediator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR = DESIGN_PATTERN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Mediator Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_PATTERN_FEATURE_COUNT = DESIGN_PATTERN_FEATURE_COUNT + 7;


	/**
	 * The meta object id for the '{@link designPatterns.impl.MediatedObserverPatternImpl <em>Mediated Observer Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatterns.impl.MediatedObserverPatternImpl
	 * @see designPatterns.impl.DesignPatternsPackageImpl#getMediatedObserverPattern()
	 * @generated
	 */
	int MEDIATED_OBSERVER_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__EANNOTATIONS = DESIGN_PATTERN__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OWNED_ELEMENT = DESIGN_PATTERN__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OWNER = DESIGN_PATTERN__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OWNED_COMMENT = DESIGN_PATTERN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__NAME = DESIGN_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__VISIBILITY = DESIGN_PATTERN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__QUALIFIED_NAME = DESIGN_PATTERN__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CLIENT_DEPENDENCY = DESIGN_PATTERN__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__NAMESPACE = DESIGN_PATTERN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__NAME_EXPRESSION = DESIGN_PATTERN__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__ELEMENT_IMPORT = DESIGN_PATTERN__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__PACKAGE_IMPORT = DESIGN_PATTERN__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OWNED_RULE = DESIGN_PATTERN__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__MEMBER = DESIGN_PATTERN__MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__IMPORTED_MEMBER = DESIGN_PATTERN__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OWNED_MEMBER = DESIGN_PATTERN__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OWNING_TEMPLATE_PARAMETER = DESIGN_PATTERN__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__TEMPLATE_PARAMETER = DESIGN_PATTERN__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__TEMPLATE_BINDING = DESIGN_PATTERN__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OWNED_TEMPLATE_SIGNATURE = DESIGN_PATTERN__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OWNED_TYPE = DESIGN_PATTERN__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__PACKAGE_MERGE = DESIGN_PATTERN__PACKAGE_MERGE;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__PACKAGED_ELEMENT = DESIGN_PATTERN__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__NESTED_PACKAGE = DESIGN_PATTERN__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__NESTING_PACKAGE = DESIGN_PATTERN__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__PROFILE_APPLICATION = DESIGN_PATTERN__PROFILE_APPLICATION;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__VIEWPOINT = DESIGN_PATTERN__VIEWPOINT;

	/**
	 * The feature id for the '<em><b>Int Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__INT_PRIM_TYPE = DESIGN_PATTERN__INT_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>String Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__STRING_PRIM_TYPE = DESIGN_PATTERN__STRING_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>Bool Prim Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__BOOL_PRIM_TYPE = DESIGN_PATTERN__BOOL_PRIM_TYPE;

	/**
	 * The feature id for the '<em><b>Uml Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__UML_MODEL = DESIGN_PATTERN__UML_MODEL;

	/**
	 * The feature id for the '<em><b>Pattern Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__PATTERN_PROFILE = DESIGN_PATTERN__PATTERN_PROFILE;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__MAP = DESIGN_PATTERN__MAP;

	/**
	 * The feature id for the '<em><b>Observer Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN = DESIGN_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mediator Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN = DESIGN_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER = DESIGN_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mediated Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT = DESIGN_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mediated Observer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER = DESIGN_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Concrete Change Managers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CONCRETE_CHANGE_MANAGERS = DESIGN_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Concrete Mediated Subjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECTS = DESIGN_PATTERN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Concrete Mediated Observers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVERS = DESIGN_PATTERN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attach Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__ATTACH_OP = DESIGN_PATTERN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attach Para</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__ATTACH_PARA = DESIGN_PATTERN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Detach Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__DETACH_OP = DESIGN_PATTERN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Detach Para</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__DETACH_PARA = DESIGN_PATTERN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Subject Notify Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP = DESIGN_PATTERN_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Register Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__REGISTER_OP = DESIGN_PATTERN_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Register Op Para1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1 = DESIGN_PATTERN_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Register Op Para2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2 = DESIGN_PATTERN_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Un Register Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP = DESIGN_PATTERN_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Un Register Op Para1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1 = DESIGN_PATTERN_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Un Register Op Para2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2 = DESIGN_PATTERN_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Change Manager Notify Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP = DESIGN_PATTERN_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Sub To Obs Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING = DESIGN_PATTERN_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Mediated Observer Update Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP = DESIGN_PATTERN_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Concrete Mediated Subject Get State Ops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_GET_STATE_OPS = DESIGN_PATTERN_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Concrete Mediated Subject Set State Ops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_SET_STATE_OPS = DESIGN_PATTERN_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Concrete Mediated Observer Update Ops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_UPDATE_OPS = DESIGN_PATTERN_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Concrete Mediated Observer States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_STATES = DESIGN_PATTERN_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Concrete Mediated Subject States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_STATES = DESIGN_PATTERN_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Mediated Observer Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATED_OBSERVER_PATTERN_FEATURE_COUNT = DESIGN_PATTERN_FEATURE_COUNT + 27;


	/**
	 * Returns the meta object for class '{@link designPatterns.DesignPattern <em>Design Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Pattern</em>'.
	 * @see designPatterns.DesignPattern
	 * @generated
	 */
	EClass getDesignPattern();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.DesignPattern#getIntPrimType <em>Int Prim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Int Prim Type</em>'.
	 * @see designPatterns.DesignPattern#getIntPrimType()
	 * @see #getDesignPattern()
	 * @generated
	 */
	EReference getDesignPattern_IntPrimType();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.DesignPattern#getStringPrimType <em>String Prim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>String Prim Type</em>'.
	 * @see designPatterns.DesignPattern#getStringPrimType()
	 * @see #getDesignPattern()
	 * @generated
	 */
	EReference getDesignPattern_StringPrimType();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.DesignPattern#getBoolPrimType <em>Bool Prim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bool Prim Type</em>'.
	 * @see designPatterns.DesignPattern#getBoolPrimType()
	 * @see #getDesignPattern()
	 * @generated
	 */
	EReference getDesignPattern_BoolPrimType();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.DesignPattern#getUmlModel <em>Uml Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Model</em>'.
	 * @see designPatterns.DesignPattern#getUmlModel()
	 * @see #getDesignPattern()
	 * @generated
	 */
	EReference getDesignPattern_UmlModel();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.DesignPattern#getPatternProfile <em>Pattern Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern Profile</em>'.
	 * @see designPatterns.DesignPattern#getPatternProfile()
	 * @see #getDesignPattern()
	 * @generated
	 */
	EReference getDesignPattern_PatternProfile();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.DesignPattern#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see designPatterns.DesignPattern#getMap()
	 * @see #getDesignPattern()
	 * @generated
	 */
	EReference getDesignPattern_Map();

	/**
	 * Returns the meta object for class '{@link designPatterns.ObserverPattern <em>Observer Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer Pattern</em>'.
	 * @see designPatterns.ObserverPattern
	 * @generated
	 */
	EClass getObserverPattern();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getObserver <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observer</em>'.
	 * @see designPatterns.ObserverPattern#getObserver()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Observer();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.ObserverPattern#getConcreteObservers <em>Concrete Observers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Observers</em>'.
	 * @see designPatterns.ObserverPattern#getConcreteObservers()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ConcreteObservers();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see designPatterns.ObserverPattern#getSubject()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Subject();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.ObserverPattern#getConcreteSubjects <em>Concrete Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Subjects</em>'.
	 * @see designPatterns.ObserverPattern#getConcreteSubjects()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ConcreteSubjects();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.ObserverPattern#getConcreteObserverStates <em>Concrete Observer States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Observer States</em>'.
	 * @see designPatterns.ObserverPattern#getConcreteObserverStates()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ConcreteObserverStates();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.ObserverPattern#getConcreteSubjectStates <em>Concrete Subject States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Subject States</em>'.
	 * @see designPatterns.ObserverPattern#getConcreteSubjectStates()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ConcreteSubjectStates();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getAttach <em>Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attach</em>'.
	 * @see designPatterns.ObserverPattern#getAttach()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Attach();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getAttachPara <em>Attach Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attach Para</em>'.
	 * @see designPatterns.ObserverPattern#getAttachPara()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_AttachPara();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getDetach <em>Detach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detach</em>'.
	 * @see designPatterns.ObserverPattern#getDetach()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Detach();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getDetachPara <em>Detach Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detach Para</em>'.
	 * @see designPatterns.ObserverPattern#getDetachPara()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_DetachPara();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getNotify <em>Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notify</em>'.
	 * @see designPatterns.ObserverPattern#getNotify()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Notify();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update</em>'.
	 * @see designPatterns.ObserverPattern#getUpdate()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Update();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.ObserverPattern#getConcreteSubjectGetStateOps <em>Concrete Subject Get State Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Subject Get State Ops</em>'.
	 * @see designPatterns.ObserverPattern#getConcreteSubjectGetStateOps()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ConcreteSubjectGetStateOps();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.ObserverPattern#getConcreteSubjectSetStateOps <em>Concrete Subject Set State Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Subject Set State Ops</em>'.
	 * @see designPatterns.ObserverPattern#getConcreteSubjectSetStateOps()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ConcreteSubjectSetStateOps();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.ObserverPattern#getConcreteObserversUpdateOps <em>Concrete Observers Update Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Observers Update Ops</em>'.
	 * @see designPatterns.ObserverPattern#getConcreteObserversUpdateOps()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ConcreteObserversUpdateOps();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getSubjectAsso_observers <em>Subject Asso observers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject Asso observers</em>'.
	 * @see designPatterns.ObserverPattern#getSubjectAsso_observers()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_SubjectAsso_observers();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.ObserverPattern#getConcreteObserverAssos_subject <em>Concrete Observer Assos subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Observer Assos subject</em>'.
	 * @see designPatterns.ObserverPattern#getConcreteObserverAssos_subject()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ConcreteObserverAssos_subject();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getPattern_Predicates <em>Pattern Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern Predicates</em>'.
	 * @see designPatterns.ObserverPattern#getPattern_Predicates()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Pattern_Predicates();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getPattern_Attached <em>Pattern Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern Attached</em>'.
	 * @see designPatterns.ObserverPattern#getPattern_Attached()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Pattern_Attached();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.ObserverPattern#getPattern_Updated <em>Pattern Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern Updated</em>'.
	 * @see designPatterns.ObserverPattern#getPattern_Updated()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_Pattern_Updated();

	/**
	 * Returns the meta object for class '{@link designPatterns.MediatorPattern <em>Mediator Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Pattern</em>'.
	 * @see designPatterns.MediatorPattern
	 * @generated
	 */
	EClass getMediatorPattern();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatorPattern#getMediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mediator</em>'.
	 * @see designPatterns.MediatorPattern#getMediator()
	 * @see #getMediatorPattern()
	 * @generated
	 */
	EReference getMediatorPattern_Mediator();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatorPattern#getColleague <em>Colleague</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colleague</em>'.
	 * @see designPatterns.MediatorPattern#getColleague()
	 * @see #getMediatorPattern()
	 * @generated
	 */
	EReference getMediatorPattern_Colleague();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatorPattern#getConcreteMediators <em>Concrete Mediators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediators</em>'.
	 * @see designPatterns.MediatorPattern#getConcreteMediators()
	 * @see #getMediatorPattern()
	 * @generated
	 */
	EReference getMediatorPattern_ConcreteMediators();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatorPattern#getConcreteColleagues <em>Concrete Colleagues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Colleagues</em>'.
	 * @see designPatterns.MediatorPattern#getConcreteColleagues()
	 * @see #getMediatorPattern()
	 * @generated
	 */
	EReference getMediatorPattern_ConcreteColleagues();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatorPattern#getConcreteMediatorAsso_colleague <em>Concrete Mediator Asso colleague</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediator Asso colleague</em>'.
	 * @see designPatterns.MediatorPattern#getConcreteMediatorAsso_colleague()
	 * @see #getMediatorPattern()
	 * @generated
	 */
	EReference getMediatorPattern_ConcreteMediatorAsso_colleague();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatorPattern#getCommunicationInterface <em>Communication Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Interface</em>'.
	 * @see designPatterns.MediatorPattern#getCommunicationInterface()
	 * @see #getMediatorPattern()
	 * @generated
	 */
	EReference getMediatorPattern_CommunicationInterface();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatorPattern#getColleagueAsso_mediator <em>Colleague Asso mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colleague Asso mediator</em>'.
	 * @see designPatterns.MediatorPattern#getColleagueAsso_mediator()
	 * @see #getMediatorPattern()
	 * @generated
	 */
	EReference getMediatorPattern_ColleagueAsso_mediator();

	/**
	 * Returns the meta object for class '{@link designPatterns.MediatedObserverPattern <em>Mediated Observer Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediated Observer Pattern</em>'.
	 * @see designPatterns.MediatedObserverPattern
	 * @generated
	 */
	EClass getMediatedObserverPattern();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getObserverPattern <em>Observer Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observer Pattern</em>'.
	 * @see designPatterns.MediatedObserverPattern#getObserverPattern()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ObserverPattern();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getMediatorPattern <em>Mediator Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mediator Pattern</em>'.
	 * @see designPatterns.MediatedObserverPattern#getMediatorPattern()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_MediatorPattern();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getChangeManager <em>Change Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Manager</em>'.
	 * @see designPatterns.MediatedObserverPattern#getChangeManager()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ChangeManager();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getMediatedSubject <em>Mediated Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mediated Subject</em>'.
	 * @see designPatterns.MediatedObserverPattern#getMediatedSubject()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_MediatedSubject();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getMediatedObserver <em>Mediated Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mediated Observer</em>'.
	 * @see designPatterns.MediatedObserverPattern#getMediatedObserver()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_MediatedObserver();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatedObserverPattern#getConcreteChangeManagers <em>Concrete Change Managers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Change Managers</em>'.
	 * @see designPatterns.MediatedObserverPattern#getConcreteChangeManagers()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ConcreteChangeManagers();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatedObserverPattern#getConcreteMediatedSubjects <em>Concrete Mediated Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediated Subjects</em>'.
	 * @see designPatterns.MediatedObserverPattern#getConcreteMediatedSubjects()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ConcreteMediatedSubjects();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatedObserverPattern#getConcreteMediatedObservers <em>Concrete Mediated Observers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediated Observers</em>'.
	 * @see designPatterns.MediatedObserverPattern#getConcreteMediatedObservers()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ConcreteMediatedObservers();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getAttachOp <em>Attach Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attach Op</em>'.
	 * @see designPatterns.MediatedObserverPattern#getAttachOp()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_AttachOp();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getAttachPara <em>Attach Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attach Para</em>'.
	 * @see designPatterns.MediatedObserverPattern#getAttachPara()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_AttachPara();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getDetachOp <em>Detach Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detach Op</em>'.
	 * @see designPatterns.MediatedObserverPattern#getDetachOp()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_DetachOp();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getDetachPara <em>Detach Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detach Para</em>'.
	 * @see designPatterns.MediatedObserverPattern#getDetachPara()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_DetachPara();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getSubjectNotifyOp <em>Subject Notify Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject Notify Op</em>'.
	 * @see designPatterns.MediatedObserverPattern#getSubjectNotifyOp()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_SubjectNotifyOp();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getRegisterOp <em>Register Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Register Op</em>'.
	 * @see designPatterns.MediatedObserverPattern#getRegisterOp()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_RegisterOp();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getRegisterOpPara1 <em>Register Op Para1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Register Op Para1</em>'.
	 * @see designPatterns.MediatedObserverPattern#getRegisterOpPara1()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_RegisterOpPara1();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getRegisterOpPara2 <em>Register Op Para2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Register Op Para2</em>'.
	 * @see designPatterns.MediatedObserverPattern#getRegisterOpPara2()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_RegisterOpPara2();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getUnRegisterOp <em>Un Register Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Un Register Op</em>'.
	 * @see designPatterns.MediatedObserverPattern#getUnRegisterOp()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_UnRegisterOp();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getUnRegisterOpPara1 <em>Un Register Op Para1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Un Register Op Para1</em>'.
	 * @see designPatterns.MediatedObserverPattern#getUnRegisterOpPara1()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_UnRegisterOpPara1();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getUnRegisterOpPara2 <em>Un Register Op Para2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Un Register Op Para2</em>'.
	 * @see designPatterns.MediatedObserverPattern#getUnRegisterOpPara2()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_UnRegisterOpPara2();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getChangeManagerNotifyOp <em>Change Manager Notify Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Manager Notify Op</em>'.
	 * @see designPatterns.MediatedObserverPattern#getChangeManagerNotifyOp()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ChangeManagerNotifyOp();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getSubToObsMapping <em>Sub To Obs Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub To Obs Mapping</em>'.
	 * @see designPatterns.MediatedObserverPattern#getSubToObsMapping()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_SubToObsMapping();

	/**
	 * Returns the meta object for the reference '{@link designPatterns.MediatedObserverPattern#getMediatedObserverUpdateOp <em>Mediated Observer Update Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mediated Observer Update Op</em>'.
	 * @see designPatterns.MediatedObserverPattern#getMediatedObserverUpdateOp()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_MediatedObserverUpdateOp();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectGetStateOps <em>Concrete Mediated Subject Get State Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediated Subject Get State Ops</em>'.
	 * @see designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectGetStateOps()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ConcreteMediatedSubjectGetStateOps();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectSetStateOps <em>Concrete Mediated Subject Set State Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediated Subject Set State Ops</em>'.
	 * @see designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectSetStateOps()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ConcreteMediatedSubjectSetStateOps();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatedObserverPattern#getConcreteMediatedObserverUpdateOps <em>Concrete Mediated Observer Update Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediated Observer Update Ops</em>'.
	 * @see designPatterns.MediatedObserverPattern#getConcreteMediatedObserverUpdateOps()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ConcreteMediatedObserverUpdateOps();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatedObserverPattern#getConcreteMediatedObserverStates <em>Concrete Mediated Observer States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediated Observer States</em>'.
	 * @see designPatterns.MediatedObserverPattern#getConcreteMediatedObserverStates()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ConcreteMediatedObserverStates();

	/**
	 * Returns the meta object for the reference list '{@link designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectStates <em>Concrete Mediated Subject States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Mediated Subject States</em>'.
	 * @see designPatterns.MediatedObserverPattern#getConcreteMediatedSubjectStates()
	 * @see #getMediatedObserverPattern()
	 * @generated
	 */
	EReference getMediatedObserverPattern_ConcreteMediatedSubjectStates();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DesignPatternsFactory getDesignPatternsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link designPatterns.impl.DesignPatternImpl <em>Design Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatterns.impl.DesignPatternImpl
		 * @see designPatterns.impl.DesignPatternsPackageImpl#getDesignPattern()
		 * @generated
		 */
		EClass DESIGN_PATTERN = eINSTANCE.getDesignPattern();

		/**
		 * The meta object literal for the '<em><b>Int Prim Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN__INT_PRIM_TYPE = eINSTANCE.getDesignPattern_IntPrimType();

		/**
		 * The meta object literal for the '<em><b>String Prim Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN__STRING_PRIM_TYPE = eINSTANCE.getDesignPattern_StringPrimType();

		/**
		 * The meta object literal for the '<em><b>Bool Prim Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN__BOOL_PRIM_TYPE = eINSTANCE.getDesignPattern_BoolPrimType();

		/**
		 * The meta object literal for the '<em><b>Uml Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN__UML_MODEL = eINSTANCE.getDesignPattern_UmlModel();

		/**
		 * The meta object literal for the '<em><b>Pattern Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN__PATTERN_PROFILE = eINSTANCE.getDesignPattern_PatternProfile();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN__MAP = eINSTANCE.getDesignPattern_Map();

		/**
		 * The meta object literal for the '{@link designPatterns.impl.ObserverPatternImpl <em>Observer Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatterns.impl.ObserverPatternImpl
		 * @see designPatterns.impl.DesignPatternsPackageImpl#getObserverPattern()
		 * @generated
		 */
		EClass OBSERVER_PATTERN = eINSTANCE.getObserverPattern();

		/**
		 * The meta object literal for the '<em><b>Observer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__OBSERVER = eINSTANCE.getObserverPattern_Observer();

		/**
		 * The meta object literal for the '<em><b>Concrete Observers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__CONCRETE_OBSERVERS = eINSTANCE.getObserverPattern_ConcreteObservers();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__SUBJECT = eINSTANCE.getObserverPattern_Subject();

		/**
		 * The meta object literal for the '<em><b>Concrete Subjects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__CONCRETE_SUBJECTS = eINSTANCE.getObserverPattern_ConcreteSubjects();

		/**
		 * The meta object literal for the '<em><b>Concrete Observer States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__CONCRETE_OBSERVER_STATES = eINSTANCE.getObserverPattern_ConcreteObserverStates();

		/**
		 * The meta object literal for the '<em><b>Concrete Subject States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__CONCRETE_SUBJECT_STATES = eINSTANCE.getObserverPattern_ConcreteSubjectStates();

		/**
		 * The meta object literal for the '<em><b>Attach</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__ATTACH = eINSTANCE.getObserverPattern_Attach();

		/**
		 * The meta object literal for the '<em><b>Attach Para</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__ATTACH_PARA = eINSTANCE.getObserverPattern_AttachPara();

		/**
		 * The meta object literal for the '<em><b>Detach</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__DETACH = eINSTANCE.getObserverPattern_Detach();

		/**
		 * The meta object literal for the '<em><b>Detach Para</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__DETACH_PARA = eINSTANCE.getObserverPattern_DetachPara();

		/**
		 * The meta object literal for the '<em><b>Notify</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__NOTIFY = eINSTANCE.getObserverPattern_Notify();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__UPDATE = eINSTANCE.getObserverPattern_Update();

		/**
		 * The meta object literal for the '<em><b>Concrete Subject Get State Ops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__CONCRETE_SUBJECT_GET_STATE_OPS = eINSTANCE.getObserverPattern_ConcreteSubjectGetStateOps();

		/**
		 * The meta object literal for the '<em><b>Concrete Subject Set State Ops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__CONCRETE_SUBJECT_SET_STATE_OPS = eINSTANCE.getObserverPattern_ConcreteSubjectSetStateOps();

		/**
		 * The meta object literal for the '<em><b>Concrete Observers Update Ops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__CONCRETE_OBSERVERS_UPDATE_OPS = eINSTANCE.getObserverPattern_ConcreteObserversUpdateOps();

		/**
		 * The meta object literal for the '<em><b>Subject Asso observers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS = eINSTANCE.getObserverPattern_SubjectAsso_observers();

		/**
		 * The meta object literal for the '<em><b>Concrete Observer Assos subject</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__CONCRETE_OBSERVER_ASSOS_SUBJECT = eINSTANCE.getObserverPattern_ConcreteObserverAssos_subject();

		/**
		 * The meta object literal for the '<em><b>Pattern Predicates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__PATTERN_PREDICATES = eINSTANCE.getObserverPattern_Pattern_Predicates();

		/**
		 * The meta object literal for the '<em><b>Pattern Attached</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__PATTERN_ATTACHED = eINSTANCE.getObserverPattern_Pattern_Attached();

		/**
		 * The meta object literal for the '<em><b>Pattern Updated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__PATTERN_UPDATED = eINSTANCE.getObserverPattern_Pattern_Updated();

		/**
		 * The meta object literal for the '{@link designPatterns.impl.MediatorPatternImpl <em>Mediator Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatterns.impl.MediatorPatternImpl
		 * @see designPatterns.impl.DesignPatternsPackageImpl#getMediatorPattern()
		 * @generated
		 */
		EClass MEDIATOR_PATTERN = eINSTANCE.getMediatorPattern();

		/**
		 * The meta object literal for the '<em><b>Mediator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_PATTERN__MEDIATOR = eINSTANCE.getMediatorPattern_Mediator();

		/**
		 * The meta object literal for the '<em><b>Colleague</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_PATTERN__COLLEAGUE = eINSTANCE.getMediatorPattern_Colleague();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_PATTERN__CONCRETE_MEDIATORS = eINSTANCE.getMediatorPattern_ConcreteMediators();

		/**
		 * The meta object literal for the '<em><b>Concrete Colleagues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_PATTERN__CONCRETE_COLLEAGUES = eINSTANCE.getMediatorPattern_ConcreteColleagues();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediator Asso colleague</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_PATTERN__CONCRETE_MEDIATOR_ASSO_COLLEAGUE = eINSTANCE.getMediatorPattern_ConcreteMediatorAsso_colleague();

		/**
		 * The meta object literal for the '<em><b>Communication Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_PATTERN__COMMUNICATION_INTERFACE = eINSTANCE.getMediatorPattern_CommunicationInterface();

		/**
		 * The meta object literal for the '<em><b>Colleague Asso mediator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR = eINSTANCE.getMediatorPattern_ColleagueAsso_mediator();

		/**
		 * The meta object literal for the '{@link designPatterns.impl.MediatedObserverPatternImpl <em>Mediated Observer Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatterns.impl.MediatedObserverPatternImpl
		 * @see designPatterns.impl.DesignPatternsPackageImpl#getMediatedObserverPattern()
		 * @generated
		 */
		EClass MEDIATED_OBSERVER_PATTERN = eINSTANCE.getMediatedObserverPattern();

		/**
		 * The meta object literal for the '<em><b>Observer Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN = eINSTANCE.getMediatedObserverPattern_ObserverPattern();

		/**
		 * The meta object literal for the '<em><b>Mediator Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN = eINSTANCE.getMediatedObserverPattern_MediatorPattern();

		/**
		 * The meta object literal for the '<em><b>Change Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER = eINSTANCE.getMediatedObserverPattern_ChangeManager();

		/**
		 * The meta object literal for the '<em><b>Mediated Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT = eINSTANCE.getMediatedObserverPattern_MediatedSubject();

		/**
		 * The meta object literal for the '<em><b>Mediated Observer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER = eINSTANCE.getMediatedObserverPattern_MediatedObserver();

		/**
		 * The meta object literal for the '<em><b>Concrete Change Managers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CONCRETE_CHANGE_MANAGERS = eINSTANCE.getMediatedObserverPattern_ConcreteChangeManagers();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediated Subjects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECTS = eINSTANCE.getMediatedObserverPattern_ConcreteMediatedSubjects();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediated Observers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVERS = eINSTANCE.getMediatedObserverPattern_ConcreteMediatedObservers();

		/**
		 * The meta object literal for the '<em><b>Attach Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__ATTACH_OP = eINSTANCE.getMediatedObserverPattern_AttachOp();

		/**
		 * The meta object literal for the '<em><b>Attach Para</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__ATTACH_PARA = eINSTANCE.getMediatedObserverPattern_AttachPara();

		/**
		 * The meta object literal for the '<em><b>Detach Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__DETACH_OP = eINSTANCE.getMediatedObserverPattern_DetachOp();

		/**
		 * The meta object literal for the '<em><b>Detach Para</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__DETACH_PARA = eINSTANCE.getMediatedObserverPattern_DetachPara();

		/**
		 * The meta object literal for the '<em><b>Subject Notify Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP = eINSTANCE.getMediatedObserverPattern_SubjectNotifyOp();

		/**
		 * The meta object literal for the '<em><b>Register Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__REGISTER_OP = eINSTANCE.getMediatedObserverPattern_RegisterOp();

		/**
		 * The meta object literal for the '<em><b>Register Op Para1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1 = eINSTANCE.getMediatedObserverPattern_RegisterOpPara1();

		/**
		 * The meta object literal for the '<em><b>Register Op Para2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2 = eINSTANCE.getMediatedObserverPattern_RegisterOpPara2();

		/**
		 * The meta object literal for the '<em><b>Un Register Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP = eINSTANCE.getMediatedObserverPattern_UnRegisterOp();

		/**
		 * The meta object literal for the '<em><b>Un Register Op Para1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1 = eINSTANCE.getMediatedObserverPattern_UnRegisterOpPara1();

		/**
		 * The meta object literal for the '<em><b>Un Register Op Para2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2 = eINSTANCE.getMediatedObserverPattern_UnRegisterOpPara2();

		/**
		 * The meta object literal for the '<em><b>Change Manager Notify Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP = eINSTANCE.getMediatedObserverPattern_ChangeManagerNotifyOp();

		/**
		 * The meta object literal for the '<em><b>Sub To Obs Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING = eINSTANCE.getMediatedObserverPattern_SubToObsMapping();

		/**
		 * The meta object literal for the '<em><b>Mediated Observer Update Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP = eINSTANCE.getMediatedObserverPattern_MediatedObserverUpdateOp();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediated Subject Get State Ops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_GET_STATE_OPS = eINSTANCE.getMediatedObserverPattern_ConcreteMediatedSubjectGetStateOps();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediated Subject Set State Ops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_SET_STATE_OPS = eINSTANCE.getMediatedObserverPattern_ConcreteMediatedSubjectSetStateOps();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediated Observer Update Ops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_UPDATE_OPS = eINSTANCE.getMediatedObserverPattern_ConcreteMediatedObserverUpdateOps();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediated Observer States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_STATES = eINSTANCE.getMediatedObserverPattern_ConcreteMediatedObserverStates();

		/**
		 * The meta object literal for the '<em><b>Concrete Mediated Subject States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_STATES = eINSTANCE.getMediatedObserverPattern_ConcreteMediatedSubjectStates();

	}

} //DesignPatternsPackage
