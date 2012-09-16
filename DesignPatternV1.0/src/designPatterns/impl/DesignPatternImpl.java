/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns.impl;

import designPatterns.DesignPattern;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import designPatterns.DesignPatternsPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.resource.UMLResource;

import Utils.UML2Helpers;
import Utils.UML2ProfileHelpers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link designPatterns.impl.DesignPatternImpl#getIntPrimType <em>Int Prim Type</em>}</li>
 *   <li>{@link designPatterns.impl.DesignPatternImpl#getStringPrimType <em>String Prim Type</em>}</li>
 *   <li>{@link designPatterns.impl.DesignPatternImpl#getBoolPrimType <em>Bool Prim Type</em>}</li>
 *   <li>{@link designPatterns.impl.DesignPatternImpl#getUmlModel <em>Uml Model</em>}</li>
 *   <li>{@link designPatterns.impl.DesignPatternImpl#getPatternProfile <em>Pattern Profile</em>}</li>
 *   <li>{@link designPatterns.impl.DesignPatternImpl#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DesignPatternImpl extends ModelImpl implements DesignPattern {
	/**
	 * The cached value of the '{@link #getIntPrimType() <em>Int Prim Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntPrimType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType intPrimType;
	/**
	 * The cached value of the '{@link #getStringPrimType() <em>String Prim Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringPrimType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType stringPrimType;
	/**
	 * The cached value of the '{@link #getBoolPrimType() <em>Bool Prim Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolPrimType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType boolPrimType;

	/**
	 * The cached value of the '{@link #getUmlModel() <em>Uml Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlModel()
	 * @generated
	 * @ordered
	 */
	protected Model umlModel;

	/**
	 * The cached value of the '{@link #getPatternProfile() <em>Pattern Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProfile()
	 * @generated
	 * @ordered
	 */
	protected Profile patternProfile;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class map;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	@SuppressWarnings("restriction")
	protected DesignPatternImpl() {
		super();
		this.setUmlModel(UML2Helpers.createModel("DesignPattern"));
		this.setIntPrimType(UML2Helpers.createPrimitiveType(this.getUmlModel(), "Integer"));
		this.setBoolPrimType(UML2Helpers.createPrimitiveType(this.getUmlModel(), "Boolean"));
		this.setStringPrimType(UML2Helpers.createPrimitiveType(this.getUmlModel(), "String"));
		this.setMap(UML2Helpers.createClass(this.getUmlModel(), "Map", false));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignPatternsPackage.Literals.DESIGN_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getIntPrimType() {
		if (intPrimType != null && intPrimType.eIsProxy())
		{
			InternalEObject oldIntPrimType = (InternalEObject)intPrimType;
			intPrimType = (PrimitiveType)eResolveProxy(oldIntPrimType);
			if (intPrimType != oldIntPrimType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.DESIGN_PATTERN__INT_PRIM_TYPE, oldIntPrimType, intPrimType));
			}
		}
		return intPrimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType basicGetIntPrimType() {
		return intPrimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntPrimType(PrimitiveType newIntPrimType) {
		PrimitiveType oldIntPrimType = intPrimType;
		intPrimType = newIntPrimType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.DESIGN_PATTERN__INT_PRIM_TYPE, oldIntPrimType, intPrimType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getStringPrimType() {
		if (stringPrimType != null && stringPrimType.eIsProxy())
		{
			InternalEObject oldStringPrimType = (InternalEObject)stringPrimType;
			stringPrimType = (PrimitiveType)eResolveProxy(oldStringPrimType);
			if (stringPrimType != oldStringPrimType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.DESIGN_PATTERN__STRING_PRIM_TYPE, oldStringPrimType, stringPrimType));
			}
		}
		return stringPrimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType basicGetStringPrimType() {
		return stringPrimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringPrimType(PrimitiveType newStringPrimType) {
		PrimitiveType oldStringPrimType = stringPrimType;
		stringPrimType = newStringPrimType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.DESIGN_PATTERN__STRING_PRIM_TYPE, oldStringPrimType, stringPrimType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getBoolPrimType() {
		if (boolPrimType != null && boolPrimType.eIsProxy())
		{
			InternalEObject oldBoolPrimType = (InternalEObject)boolPrimType;
			boolPrimType = (PrimitiveType)eResolveProxy(oldBoolPrimType);
			if (boolPrimType != oldBoolPrimType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.DESIGN_PATTERN__BOOL_PRIM_TYPE, oldBoolPrimType, boolPrimType));
			}
		}
		return boolPrimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType basicGetBoolPrimType() {
		return boolPrimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolPrimType(PrimitiveType newBoolPrimType) {
		PrimitiveType oldBoolPrimType = boolPrimType;
		boolPrimType = newBoolPrimType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.DESIGN_PATTERN__BOOL_PRIM_TYPE, oldBoolPrimType, boolPrimType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getUmlModel()
	{
		if (umlModel != null && umlModel.eIsProxy())
		{
			InternalEObject oldUmlModel = (InternalEObject)umlModel;
			umlModel = (Model)eResolveProxy(oldUmlModel);
			if (umlModel != oldUmlModel)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.DESIGN_PATTERN__UML_MODEL, oldUmlModel, umlModel));
			}
		}
		return umlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetUmlModel()
	{
		return umlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlModel(Model newUmlModel)
	{
		Model oldUmlModel = umlModel;
		umlModel = newUmlModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.DESIGN_PATTERN__UML_MODEL, oldUmlModel, umlModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getPatternProfile()
	{
		if (patternProfile != null && patternProfile.eIsProxy())
		{
			InternalEObject oldPatternProfile = (InternalEObject)patternProfile;
			patternProfile = (Profile)eResolveProxy(oldPatternProfile);
			if (patternProfile != oldPatternProfile)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.DESIGN_PATTERN__PATTERN_PROFILE, oldPatternProfile, patternProfile));
			}
		}
		return patternProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetPatternProfile()
	{
		return patternProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternProfile(Profile newPatternProfile)
	{
		Profile oldPatternProfile = patternProfile;
		patternProfile = newPatternProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.DESIGN_PATTERN__PATTERN_PROFILE, oldPatternProfile, patternProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getMap()
	{
		if (map != null && map.eIsProxy())
		{
			InternalEObject oldMap = (InternalEObject)map;
			map = (org.eclipse.uml2.uml.Class)eResolveProxy(oldMap);
			if (map != oldMap)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignPatternsPackage.DESIGN_PATTERN__MAP, oldMap, map));
			}
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetMap()
	{
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(org.eclipse.uml2.uml.Class newMap)
	{
		org.eclipse.uml2.uml.Class oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsPackage.DESIGN_PATTERN__MAP, oldMap, map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public void SaveAsUML(String uri) {
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// Add Pattern Specifications:In this case,JML Specifications
		//this.CreatePatternSpecification();

	    // Apply Stereotype Profile
		this.ApplyPatternProfile();
		
		//Save Profile
		UML2ProfileHelpers.save(this.getPatternProfile(), URI.createURI(uri).appendSegment(this.getUmlModel().getName())
				.appendFileExtension(UMLResource.PROFILE_FILE_EXTENSION));

		// Save Model
		UML2ProfileHelpers.save(this.getUmlModel(), URI.createURI(uri).appendSegment(this.getUmlModel().getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CreateInitialPatternStructure()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object CreatePrimitiveTypes()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	Map<String,org.eclipse.uml2.uml.Class> mcmap=new HashMap<String,org.eclipse.uml2.uml.Class>();
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	public void ApplyPatternProfile()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		DesignPatternsPackage dpp=DesignPatternsPackage.eINSTANCE;
		Iterator<EClassifier> ecs=dpp.getEClassifiers().iterator();
		while(ecs.hasNext())
		{
			
			EClassifier classifier=ecs.next();
			if(classifier instanceof EClass)
			{
				EClass eclass=(EClass)classifier;
				String s1=this.getClass().getSimpleName();
				String s2=eclass.getName()+"Impl";
				if(this.getClass().getSimpleName().equals(eclass.getName()+"Impl"))
				{
					Profile profile = UML2ProfileHelpers.createProfile("Pf");
					this.setPatternProfile(profile);
					Class classMetaclass = UML2ProfileHelpers.referenceMetaclass(
							profile, UMLPackage.Literals.CLASS.getName());
					Class propertyMetaclass = UML2ProfileHelpers.referenceMetaclass(
							profile, UMLPackage.Literals.PROPERTY.getName());
					Class operationMetaclass = UML2ProfileHelpers.referenceMetaclass(
							profile, UMLPackage.Literals.OPERATION.getName());
					Class parameterMetaclass = UML2ProfileHelpers.referenceMetaclass(
							profile, UMLPackage.Literals.PARAMETER.getName());
					Class associationMetaclass = UML2ProfileHelpers.referenceMetaclass(
							profile, UMLPackage.Literals.ASSOCIATION.getName());
					mcmap.put("Class", classMetaclass);
					mcmap.put("Property", propertyMetaclass);
					mcmap.put("Operation", operationMetaclass);
					mcmap.put("Parameter", parameterMetaclass);
					mcmap.put("Association", associationMetaclass);
					
					
					Iterator<EReference> eRefs = eclass.getEReferences().iterator(); 
	                while(eRefs.hasNext())
	                {               	
	                	EReference curRef=eRefs.next();
	                	Iterator<EAnnotation> eAnnos=curRef.getEAnnotations().iterator();
	                	while(eAnnos.hasNext())
	                	{                		
	                		EAnnotation curAnno=eAnnos.next();
	                		if(curAnno.getSource().equals("RoleName"))
	                		{
	                			EMap<String,String> pair=curAnno.getDetails();
	                		    String stetypeName=pair.get(curRef.getName());	                		    
	                		    Stereotype stereo = UML2ProfileHelpers.createStereotype(profile,stetypeName,false);
	                		    Class currmc=mcmap.get(curRef.getEType().getName());
	                		    UML2ProfileHelpers.createExtension(currmc, stereo, false);
	                		    UML2ProfileHelpers.defineProfile(profile);
	                		    UML2ProfileHelpers.applyProfile(this.getUmlModel(), profile);
	               	    
	                		    
	                		    if(curRef.getUpperBound()==1&&curRef.getLowerBound()==1)
	                		    {
	                		    	NamedElement eo=(NamedElement)this.eGet(curRef);
	                		    	UML2ProfileHelpers.applyStereotype(eo, stereo);
	                		    }
	                		    else if(curRef.isMany())
	                		    {
	                		    	EList<NamedElement> el=(EList)this.eGet(curRef);
	                		    	Iterator<NamedElement> elit=el.iterator();
	                		    	while(elit.hasNext())
	                		    	{
	                		    		NamedElement eo=elit.next();
	                		    		UML2ProfileHelpers.applyStereotype(eo, stereo);
	                		    	}
	                		    }
	                		}	                			                		              		
	                	}
	                }
				}
				
				
				
			}
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CreatePatternSpecification()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case DesignPatternsPackage.DESIGN_PATTERN__INT_PRIM_TYPE:
				if (resolve) return getIntPrimType();
				return basicGetIntPrimType();
			case DesignPatternsPackage.DESIGN_PATTERN__STRING_PRIM_TYPE:
				if (resolve) return getStringPrimType();
				return basicGetStringPrimType();
			case DesignPatternsPackage.DESIGN_PATTERN__BOOL_PRIM_TYPE:
				if (resolve) return getBoolPrimType();
				return basicGetBoolPrimType();
			case DesignPatternsPackage.DESIGN_PATTERN__UML_MODEL:
				if (resolve) return getUmlModel();
				return basicGetUmlModel();
			case DesignPatternsPackage.DESIGN_PATTERN__PATTERN_PROFILE:
				if (resolve) return getPatternProfile();
				return basicGetPatternProfile();
			case DesignPatternsPackage.DESIGN_PATTERN__MAP:
				if (resolve) return getMap();
				return basicGetMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case DesignPatternsPackage.DESIGN_PATTERN__INT_PRIM_TYPE:
				setIntPrimType((PrimitiveType)newValue);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__STRING_PRIM_TYPE:
				setStringPrimType((PrimitiveType)newValue);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__BOOL_PRIM_TYPE:
				setBoolPrimType((PrimitiveType)newValue);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__UML_MODEL:
				setUmlModel((Model)newValue);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__PATTERN_PROFILE:
				setPatternProfile((Profile)newValue);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__MAP:
				setMap((org.eclipse.uml2.uml.Class)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case DesignPatternsPackage.DESIGN_PATTERN__INT_PRIM_TYPE:
				setIntPrimType((PrimitiveType)null);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__STRING_PRIM_TYPE:
				setStringPrimType((PrimitiveType)null);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__BOOL_PRIM_TYPE:
				setBoolPrimType((PrimitiveType)null);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__UML_MODEL:
				setUmlModel((Model)null);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__PATTERN_PROFILE:
				setPatternProfile((Profile)null);
				return;
			case DesignPatternsPackage.DESIGN_PATTERN__MAP:
				setMap((org.eclipse.uml2.uml.Class)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case DesignPatternsPackage.DESIGN_PATTERN__INT_PRIM_TYPE:
				return intPrimType != null;
			case DesignPatternsPackage.DESIGN_PATTERN__STRING_PRIM_TYPE:
				return stringPrimType != null;
			case DesignPatternsPackage.DESIGN_PATTERN__BOOL_PRIM_TYPE:
				return boolPrimType != null;
			case DesignPatternsPackage.DESIGN_PATTERN__UML_MODEL:
				return umlModel != null;
			case DesignPatternsPackage.DESIGN_PATTERN__PATTERN_PROFILE:
				return patternProfile != null;
			case DesignPatternsPackage.DESIGN_PATTERN__MAP:
				return map != null;
		}
		return super.eIsSet(featureID);
	}

	

} //DesignPatternImpl
