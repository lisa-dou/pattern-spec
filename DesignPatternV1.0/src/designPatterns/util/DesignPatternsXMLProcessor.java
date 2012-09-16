/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns.util;

import designPatterns.DesignPatternsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignPatternsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		DesignPatternsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the DesignPatternsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null)
		{
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new DesignPatternsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new DesignPatternsResourceFactoryImpl());
		}
		return registrations;
	}

} //DesignPatternsXMLProcessor
