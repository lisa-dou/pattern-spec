/*
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: IntroductionToUML2Profiles.java,v 1.3 2006/07/18 14:13:48 khussey Exp $
 */
package Utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * Source code for the "Introduction to UML2 Profiles" article.
 */
public class UML2ProfileHelpers
		extends UML2Util {

	public static Profile createProfile(String name) {
		Profile profile = UMLFactory.eINSTANCE.createProfile();
		profile.setName(name);

		out("Profile '" + profile.getQualifiedName() + "' created.");

		return profile;
	}

	protected static PrimitiveType importPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {
		Model umlLibrary = (Model) load(URI
			.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));

		PrimitiveType primitiveType = (PrimitiveType) umlLibrary
			.getOwnedType(name);

		package_.createElementImport(primitiveType);

		out("Primitive type '" + primitiveType.getQualifiedName()
			+ "' imported.");

		return primitiveType;
	}

	public static Stereotype createStereotype(Profile profile, String name,
			boolean isAbstract) {
		Stereotype stereotype = profile.createOwnedStereotype(name, isAbstract);

		out("Stereotype '" + stereotype.getQualifiedName() + "' created.");

		return stereotype;
	}

	public static org.eclipse.uml2.uml.Class referenceMetaclass(
			Profile profile, String name) {
		Model umlMetamodel = (Model) load(URI
			.createURI(UMLResource.UML_METAMODEL_URI));

		org.eclipse.uml2.uml.Class metaclass = (org.eclipse.uml2.uml.Class) umlMetamodel
			.getOwnedType(name);

		profile.createMetaclassReference(metaclass);

		out("Metaclass '" + metaclass.getQualifiedName() + "' referenced.");

		return metaclass;
	}

	public static Extension createExtension(
			org.eclipse.uml2.uml.Class metaclass, Stereotype stereotype,
			boolean required) {
		Extension extension = stereotype.createExtension(metaclass, required);

		out((required
			? "Required extension '"
			: "Extension '") + extension.getQualifiedName() + "' created.");

		return extension;
	}

	public static void defineProfile(Profile profile) {
		profile.define();

		out("Profile '" + profile.getQualifiedName() + "' defined.");
	}

	public static void applyProfile(org.eclipse.uml2.uml.Package package_,
			Profile profile) {
		package_.applyProfile(profile);

		out("Profile '" + profile.getQualifiedName() + "' applied to package '"
			+ package_.getQualifiedName() + "'.");
	}

	public static void applyStereotype(NamedElement namedElement,
			Stereotype stereotype) {
		namedElement.applyStereotype(stereotype);

		out("Stereotype '" + stereotype.getQualifiedName()
			+ "' applied to element '" + namedElement.getQualifiedName() + "'.");
	}

	protected static Object getStereotypePropertyValue(
			NamedElement namedElement, Stereotype stereotype, Property property) {
		Object value = namedElement.getValue(stereotype, property.getName());

		out("Value of stereotype property '" + property.getQualifiedName()
			+ "' on element '" + namedElement.getQualifiedName() + "' is "
			+ String.valueOf(value) + ".");

		return value;
	}

	protected static void setStereotypePropertyValue(NamedElement namedElement,
			Stereotype stereotype, Property property, Object value) {
		namedElement.setValue(stereotype, property.getName(), value);

		out("Value of stereotype property '" + property.getQualifiedName()
			+ "' on element '" + namedElement.getQualifiedName() + "' set to "
			+ String.valueOf(value) + ".");
	}

	public static void main(String[] args) {

		if (2 != args.length) {
			err("Usage: java IntroductionToUML2Profiles <URI> <URI>");
			System.exit(1);
		}

		registerResourceFactories();

		registerPathmaps(URI.createURI(args[1]));

		out("Creating profile...");

		Profile ecoreProfile = createProfile("ecore");

		out("Importing primitive types...");

		PrimitiveType booleanPrimitiveType = importPrimitiveType(ecoreProfile,
			"Boolean");
		PrimitiveType stringPrimitiveType = importPrimitiveType(ecoreProfile,
			"String");

		out("Creating enumerations...");

		Enumeration visibilityKindEnumeration = UML2Helpers
			.createEnumeration(ecoreProfile, "VisibilityKind");
		Enumeration featureKindEnumeration = UML2Helpers
			.createEnumeration(ecoreProfile, "FeatureKind");

		out("Creating enumeration literals...");

		UML2Helpers.createEnumerationLiteral(
			visibilityKindEnumeration, "Unspecified");
		UML2Helpers.createEnumerationLiteral(
			visibilityKindEnumeration, "None");
		UML2Helpers.createEnumerationLiteral(
			visibilityKindEnumeration, "ReadOnly");
		UML2Helpers.createEnumerationLiteral(
			visibilityKindEnumeration, "ReadWrite");
		UML2Helpers.createEnumerationLiteral(
			visibilityKindEnumeration, "ReadOnlyUnsettable");
		UML2Helpers.createEnumerationLiteral(
			visibilityKindEnumeration, "ReadWriteUnsettable");

		UML2Helpers.createEnumerationLiteral(featureKindEnumeration,
			"Unspecified");
		UML2Helpers.createEnumerationLiteral(featureKindEnumeration,
			"Simple");
		UML2Helpers.createEnumerationLiteral(featureKindEnumeration,
			"Attribute");
		UML2Helpers.createEnumerationLiteral(featureKindEnumeration,
			"Element");
		UML2Helpers.createEnumerationLiteral(featureKindEnumeration,
			"AttributeWildcard");
		UML2Helpers.createEnumerationLiteral(featureKindEnumeration,
			"ElementWildcard");
		UML2Helpers.createEnumerationLiteral(featureKindEnumeration,
			"Group");

		out("Creating stereotypes...");

		Stereotype eStructuralFeatureStereotype = createStereotype(
			ecoreProfile, "EStructuralFeature", true);

		Stereotype eAttributeStereotype = createStereotype(ecoreProfile,
			"EAttribute", false);

		Stereotype eReferenceStereotype = createStereotype(ecoreProfile,
			"EReference", false);

		out("Creating stereotype generalizations...");

		UML2Helpers.createGeneralization(eAttributeStereotype,
			eStructuralFeatureStereotype);

		UML2Helpers.createGeneralization(eReferenceStereotype,
			eStructuralFeatureStereotype);

		out("Creating stereotype properties...");

		Property isTransientProperty = UML2Helpers.createAttribute(
			eStructuralFeatureStereotype, "isTransient", booleanPrimitiveType,
			0, 1);
		UML2Helpers.createAttribute(eStructuralFeatureStereotype,
			"isUnsettable", booleanPrimitiveType, 0, 1);
		Property isVolatileProperty = UML2Helpers.createAttribute(
			eStructuralFeatureStereotype, "isVolatile", booleanPrimitiveType,
			0, 1);
		UML2Helpers.createAttribute(eStructuralFeatureStereotype,
			"visibility", visibilityKindEnumeration, 0, 1);
		UML2Helpers.createAttribute(eStructuralFeatureStereotype,
			"xmlName", stringPrimitiveType, 0, 1);
		UML2Helpers.createAttribute(eStructuralFeatureStereotype,
			"xmlNamespace", stringPrimitiveType, 0, 1);
		UML2Helpers.createAttribute(eStructuralFeatureStereotype,
			"xmlFeatureKind", featureKindEnumeration, 0, 1);

		UML2Helpers.createAttribute(eAttributeStereotype,
			"attributeName", stringPrimitiveType, 0, 1);
		UML2Helpers.createAttribute(eAttributeStereotype, "isID",
			booleanPrimitiveType, 0, 1);

		UML2Helpers.createAttribute(eReferenceStereotype,
			"referenceName", stringPrimitiveType, 0, 1);
		Property isResolveProxiesProperty = UML2Helpers
			.createAttribute(eReferenceStereotype, "isResolveProxies",
				booleanPrimitiveType, 0, 1);

		isResolveProxiesProperty.setBooleanDefaultValue(true);

		out("Referencing metaclasses...");

		org.eclipse.uml2.uml.Class propertyMetaclass = referenceMetaclass(
			ecoreProfile, UMLPackage.Literals.PROPERTY.getName());

		out("Creating extensions...");

		createExtension(propertyMetaclass, eAttributeStereotype, false);
		createExtension(propertyMetaclass, eReferenceStereotype, false);

		out("Defining profile...");

		defineProfile(ecoreProfile);

		out("Saving profile...");

		save(ecoreProfile, URI.createURI(args[0]).appendSegment("Ecore")
			.appendFileExtension(UMLResource.PROFILE_FILE_EXTENSION));

		out("Loading model...");

		Model epo2Model = (Model) load(URI.createURI(args[0]).appendSegment(
			"ExtendedPO2").appendFileExtension(UMLResource.FILE_EXTENSION));

		out("Applying profile...");

		applyProfile(epo2Model, ecoreProfile);

		out("Applying stereotypes...");

		org.eclipse.uml2.uml.Class supplierClass = (org.eclipse.uml2.uml.Class) epo2Model
			.getOwnedType("Supplier");

		Property pendingOrdersProperty = supplierClass.getOwnedAttribute(
			"pendingOrders", null);
		applyStereotype(pendingOrdersProperty, eReferenceStereotype);

		Property shippedOrdersProperty = supplierClass.getOwnedAttribute(
			"shippedOrders", null);
		applyStereotype(shippedOrdersProperty, eReferenceStereotype);

		org.eclipse.uml2.uml.Class purchaseOrderClass = (org.eclipse.uml2.uml.Class) epo2Model
			.getOwnedType("PurchaseOrder");

		Property totalAmountProperty = purchaseOrderClass.getOwnedAttribute(
			"totalAmount", null);
		applyStereotype(totalAmountProperty, eAttributeStereotype);

		Property previousOrderProperty = purchaseOrderClass.getOwnedAttribute(
			"previousOrder", null);
		applyStereotype(previousOrderProperty, eReferenceStereotype);

		Property customerProperty = purchaseOrderClass.getOwnedAttribute(
			"customer", null);
		applyStereotype(customerProperty, eReferenceStereotype);

		org.eclipse.uml2.uml.Class customerClass = (org.eclipse.uml2.uml.Class) epo2Model
			.getOwnedType("Customer");

		Property ordersProperty = customerClass.getOwnedAttribute("orders",
			null);
		applyStereotype(ordersProperty, eReferenceStereotype);

		out("Getting stereotype property values...");

		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isVolatileProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isTransientProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		getStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isVolatileProperty);
		getStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isTransientProperty);
		getStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isVolatileProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isTransientProperty);

		getStereotypePropertyValue(previousOrderProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		getStereotypePropertyValue(customerProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		getStereotypePropertyValue(ordersProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		out("Setting stereotype property values...");

		setStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isVolatileProperty, Boolean.TRUE);
		setStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isTransientProperty, Boolean.TRUE);
		setStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty, Boolean.FALSE);

		setStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isVolatileProperty, Boolean.TRUE);
		setStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isTransientProperty, Boolean.TRUE);
		setStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty, Boolean.FALSE);

		setStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isVolatileProperty, Boolean.TRUE);
		setStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isTransientProperty, Boolean.TRUE);

		setStereotypePropertyValue(previousOrderProperty, eReferenceStereotype,
			isResolveProxiesProperty, Boolean.FALSE);

		setStereotypePropertyValue(customerProperty, eReferenceStereotype,
			isResolveProxiesProperty, Boolean.FALSE);

		setStereotypePropertyValue(ordersProperty, eReferenceStereotype,
			isResolveProxiesProperty, Boolean.FALSE);

		out("Getting stereotype property values...");

		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isVolatileProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isTransientProperty);
		getStereotypePropertyValue(pendingOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		getStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isVolatileProperty);
		getStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isTransientProperty);
		getStereotypePropertyValue(shippedOrdersProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isVolatileProperty);
		getStereotypePropertyValue(totalAmountProperty, eAttributeStereotype,
			isTransientProperty);

		getStereotypePropertyValue(previousOrderProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		getStereotypePropertyValue(customerProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		getStereotypePropertyValue(ordersProperty, eReferenceStereotype,
			isResolveProxiesProperty);

		out("Saving model...");

		save(epo2Model, URI.createURI(args[0]).appendSegment(
			"ExtendedPO2_Ecore")
			.appendFileExtension(UMLResource.FILE_EXTENSION));
	}
}