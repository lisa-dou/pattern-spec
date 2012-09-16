/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package designPatterns.impl;

import designPatterns.DesignPattern;
import designPatterns.DesignPatternsFactory;
import designPatterns.DesignPatternsPackage;
import designPatterns.MediatedObserverPattern;
import designPatterns.MediatorPattern;
import designPatterns.ObserverPattern;

import org.eclipse.emf.common.util.URI;
import designPatterns.util.DesignPatternsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignPatternsPackageImpl extends EPackageImpl implements DesignPatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observerPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediatorPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediatedObserverPatternEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see designPatterns.DesignPatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DesignPatternsPackageImpl() {
		super(eNS_URI, DesignPatternsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DesignPatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DesignPatternsPackage init() {
		if (isInited) return (DesignPatternsPackage)EPackage.Registry.INSTANCE.getEPackage(DesignPatternsPackage.eNS_URI);

		// Obtain or create and register package
		DesignPatternsPackageImpl theDesignPatternsPackage = (DesignPatternsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DesignPatternsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DesignPatternsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDesignPatternsPackage.createPackageContents();

		// Initialize created meta-data
		theDesignPatternsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDesignPatternsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DesignPatternsPackage.eNS_URI, theDesignPatternsPackage);
		return theDesignPatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignPattern() {
		return designPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPattern_IntPrimType() {
		return (EReference)designPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPattern_StringPrimType() {
		return (EReference)designPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPattern_BoolPrimType() {
		return (EReference)designPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPattern_UmlModel()
	{
		return (EReference)designPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPattern_PatternProfile()
	{
		return (EReference)designPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignPattern_Map()
	{
		return (EReference)designPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserverPattern() {
		return observerPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Observer() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ConcreteObservers() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Subject() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ConcreteSubjects() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ConcreteObserverStates() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ConcreteSubjectStates() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Attach() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_AttachPara() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Detach() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_DetachPara() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Notify() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Update() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ConcreteSubjectGetStateOps() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ConcreteSubjectSetStateOps() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ConcreteObserversUpdateOps() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_SubjectAsso_observers() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ConcreteObserverAssos_subject() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Pattern_Predicates() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Pattern_Attached() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_Pattern_Updated() {
		return (EReference)observerPatternEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediatorPattern()
	{
		return mediatorPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorPattern_Mediator()
	{
		return (EReference)mediatorPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorPattern_Colleague()
	{
		return (EReference)mediatorPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorPattern_ConcreteMediators()
	{
		return (EReference)mediatorPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorPattern_ConcreteColleagues()
	{
		return (EReference)mediatorPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorPattern_ConcreteMediatorAsso_colleague()
	{
		return (EReference)mediatorPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorPattern_CommunicationInterface()
	{
		return (EReference)mediatorPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorPattern_ColleagueAsso_mediator()
	{
		return (EReference)mediatorPatternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediatedObserverPattern()
	{
		return mediatedObserverPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ObserverPattern()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_MediatorPattern()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ChangeManager()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_MediatedSubject()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_MediatedObserver()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ConcreteChangeManagers()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ConcreteMediatedSubjects()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ConcreteMediatedObservers()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_AttachOp()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_AttachPara()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_DetachOp()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_DetachPara()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_SubjectNotifyOp()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_RegisterOp()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_RegisterOpPara1()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_RegisterOpPara2()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_UnRegisterOp()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_UnRegisterOpPara1()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_UnRegisterOpPara2()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ChangeManagerNotifyOp()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_SubToObsMapping()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_MediatedObserverUpdateOp()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ConcreteMediatedSubjectGetStateOps()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ConcreteMediatedSubjectSetStateOps()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ConcreteMediatedObserverUpdateOps()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ConcreteMediatedObserverStates()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatedObserverPattern_ConcreteMediatedSubjectStates()
	{
		return (EReference)mediatedObserverPatternEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternsFactory getDesignPatternsFactory() {
		return (DesignPatternsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		designPatternEClass = createEClass(DESIGN_PATTERN);
		createEReference(designPatternEClass, DESIGN_PATTERN__INT_PRIM_TYPE);
		createEReference(designPatternEClass, DESIGN_PATTERN__STRING_PRIM_TYPE);
		createEReference(designPatternEClass, DESIGN_PATTERN__BOOL_PRIM_TYPE);
		createEReference(designPatternEClass, DESIGN_PATTERN__UML_MODEL);
		createEReference(designPatternEClass, DESIGN_PATTERN__PATTERN_PROFILE);
		createEReference(designPatternEClass, DESIGN_PATTERN__MAP);

		observerPatternEClass = createEClass(OBSERVER_PATTERN);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__OBSERVER);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__CONCRETE_OBSERVERS);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__SUBJECT);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__CONCRETE_SUBJECTS);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__CONCRETE_OBSERVER_STATES);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__CONCRETE_SUBJECT_STATES);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__ATTACH);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__ATTACH_PARA);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__DETACH);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__DETACH_PARA);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__NOTIFY);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__UPDATE);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__CONCRETE_SUBJECT_GET_STATE_OPS);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__CONCRETE_SUBJECT_SET_STATE_OPS);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__CONCRETE_OBSERVERS_UPDATE_OPS);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__SUBJECT_ASSO_OBSERVERS);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__CONCRETE_OBSERVER_ASSOS_SUBJECT);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__PATTERN_PREDICATES);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__PATTERN_ATTACHED);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__PATTERN_UPDATED);

		mediatorPatternEClass = createEClass(MEDIATOR_PATTERN);
		createEReference(mediatorPatternEClass, MEDIATOR_PATTERN__MEDIATOR);
		createEReference(mediatorPatternEClass, MEDIATOR_PATTERN__COLLEAGUE);
		createEReference(mediatorPatternEClass, MEDIATOR_PATTERN__CONCRETE_MEDIATORS);
		createEReference(mediatorPatternEClass, MEDIATOR_PATTERN__CONCRETE_COLLEAGUES);
		createEReference(mediatorPatternEClass, MEDIATOR_PATTERN__CONCRETE_MEDIATOR_ASSO_COLLEAGUE);
		createEReference(mediatorPatternEClass, MEDIATOR_PATTERN__COMMUNICATION_INTERFACE);
		createEReference(mediatorPatternEClass, MEDIATOR_PATTERN__COLLEAGUE_ASSO_MEDIATOR);

		mediatedObserverPatternEClass = createEClass(MEDIATED_OBSERVER_PATTERN);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__OBSERVER_PATTERN);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__MEDIATOR_PATTERN);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__MEDIATED_SUBJECT);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CONCRETE_CHANGE_MANAGERS);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECTS);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVERS);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__ATTACH_OP);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__ATTACH_PARA);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__DETACH_OP);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__DETACH_PARA);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__SUBJECT_NOTIFY_OP);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__REGISTER_OP);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA1);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__REGISTER_OP_PARA2);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA1);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__UN_REGISTER_OP_PARA2);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CHANGE_MANAGER_NOTIFY_OP);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__SUB_TO_OBS_MAPPING);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__MEDIATED_OBSERVER_UPDATE_OP);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_GET_STATE_OPS);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_SET_STATE_OPS);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_UPDATE_OPS);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_OBSERVER_STATES);
		createEReference(mediatedObserverPatternEClass, MEDIATED_OBSERVER_PATTERN__CONCRETE_MEDIATED_SUBJECT_STATES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		designPatternEClass.getESuperTypes().add(theUMLPackage.getModel());
		observerPatternEClass.getESuperTypes().add(this.getDesignPattern());
		mediatorPatternEClass.getESuperTypes().add(this.getDesignPattern());
		mediatedObserverPatternEClass.getESuperTypes().add(this.getDesignPattern());

		// Initialize classes and features; add operations and parameters
		initEClass(designPatternEClass, DesignPattern.class, "DesignPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignPattern_IntPrimType(), theUMLPackage.getPrimitiveType(), null, "IntPrimType", null, 1, 1, DesignPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignPattern_StringPrimType(), theUMLPackage.getPrimitiveType(), null, "StringPrimType", null, 1, 1, DesignPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignPattern_BoolPrimType(), theUMLPackage.getPrimitiveType(), null, "BoolPrimType", null, 1, 1, DesignPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignPattern_UmlModel(), theUMLPackage.getModel(), null, "umlModel", null, 1, 1, DesignPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignPattern_PatternProfile(), theUMLPackage.getProfile(), null, "patternProfile", null, 1, 1, DesignPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignPattern_Map(), theUMLPackage.getClass_(), null, "Map", null, 1, 1, DesignPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(designPatternEClass, null, "SaveAsUML", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(designPatternEClass, null, "CreateInitialPatternStructure", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(designPatternEClass, ecorePackage.getEJavaObject(), "CreatePrimitiveTypes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(designPatternEClass, null, "ApplyPatternProfile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(designPatternEClass, null, "CreatePatternSpecification", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(observerPatternEClass, ObserverPattern.class, "ObserverPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObserverPattern_Observer(), theUMLPackage.getClass_(), null, "Observer", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_ConcreteObservers(), theUMLPackage.getClass_(), null, "ConcreteObservers", null, 0, -1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_Subject(), theUMLPackage.getClass_(), null, "Subject", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_ConcreteSubjects(), theUMLPackage.getClass_(), null, "ConcreteSubjects", null, 0, -1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_ConcreteObserverStates(), theUMLPackage.getProperty(), null, "ConcreteObserverStates", null, 0, -1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_ConcreteSubjectStates(), theUMLPackage.getProperty(), null, "ConcreteSubjectStates", null, 0, -1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_Attach(), theUMLPackage.getOperation(), null, "Attach", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_AttachPara(), theUMLPackage.getParameter(), null, "AttachPara", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_Detach(), theUMLPackage.getOperation(), null, "Detach", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_DetachPara(), theUMLPackage.getParameter(), null, "DetachPara", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_Notify(), theUMLPackage.getOperation(), null, "Notify", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_Update(), theUMLPackage.getOperation(), null, "Update", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_ConcreteSubjectGetStateOps(), theUMLPackage.getOperation(), null, "ConcreteSubjectGetStateOps", null, 0, -1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_ConcreteSubjectSetStateOps(), theUMLPackage.getOperation(), null, "ConcreteSubjectSetStateOps", null, 0, -1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_ConcreteObserversUpdateOps(), theUMLPackage.getOperation(), null, "ConcreteObserversUpdateOps", null, 0, -1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_SubjectAsso_observers(), theUMLPackage.getAssociation(), null, "SubjectAsso_observers", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_ConcreteObserverAssos_subject(), theUMLPackage.getAssociation(), null, "ConcreteObserverAssos_subject", null, 0, -1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_Pattern_Predicates(), theUMLPackage.getClass_(), null, "Pattern_Predicates", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_Pattern_Attached(), theUMLPackage.getOperation(), null, "Pattern_Attached", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPattern_Pattern_Updated(), theUMLPackage.getOperation(), null, "Pattern_Updated", null, 1, 1, ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(observerPatternEClass, theUMLPackage.getProperty(), "GetSubjectState", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObserverPattern(), "OP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "subject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(observerPatternEClass, theUMLPackage.getClass_(), "CreateConcreteObserver", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "conObserverName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "observerStateName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getType(), "observerStateType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "ListentoSubject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(observerPatternEClass, theUMLPackage.getClass_(), "CreateConcreteSubject", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "conSubjectName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "subjectStateName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getType(), "subjectStateType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "GetStateOpName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SetStateOpName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(observerPatternEClass, theUMLPackage.getProperty(), "GetListeningTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "conObserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(observerPatternEClass, null, "AddConcreteObserver", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "class_", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "observerStateName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getType(), "observerStateType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "ListentoSubject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(observerPatternEClass, null, "AddConcreteSubject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "class_", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "subjectStateName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getType(), "subjectStateType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "GetStateOpName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SetStateOpName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mediatorPatternEClass, MediatorPattern.class, "MediatorPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediatorPattern_Mediator(), theUMLPackage.getClass_(), null, "Mediator", null, 1, 1, MediatorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorPattern_Colleague(), theUMLPackage.getClass_(), null, "Colleague", null, 1, 1, MediatorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorPattern_ConcreteMediators(), theUMLPackage.getClass_(), null, "ConcreteMediators", null, 0, -1, MediatorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorPattern_ConcreteColleagues(), theUMLPackage.getClass_(), null, "ConcreteColleagues", null, 0, -1, MediatorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorPattern_ConcreteMediatorAsso_colleague(), theUMLPackage.getAssociation(), null, "ConcreteMediatorAsso_colleague", null, 0, -1, MediatorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorPattern_CommunicationInterface(), theUMLPackage.getOperation(), null, "CommunicationInterface", null, 0, -1, MediatorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorPattern_ColleagueAsso_mediator(), theUMLPackage.getAssociation(), null, "ColleagueAsso_mediator", null, 1, 1, MediatorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(mediatorPatternEClass, theUMLPackage.getClass_(), "CreateConcreteMediator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getString(), "ConMediatorName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "ConColleagues", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mediatorPatternEClass, theUMLPackage.getClass_(), "CreateConcreteColleague", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getString(), "ConColleagueName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mediatorPatternEClass, theUMLPackage.getOperation(), "CreateCommunicationOp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "ConMediator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getString(), "OperationName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getString(), "ParameterNames", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getType(), "ParameterTypes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getType(), "ReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mediatorPatternEClass, null, "AddConcreteColleage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "class_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mediatorPatternEClass, null, "AddConcreteMediator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "class_", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getClass_(), "ConColleagues", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(mediatedObserverPatternEClass, MediatedObserverPattern.class, "MediatedObserverPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediatedObserverPattern_ObserverPattern(), this.getObserverPattern(), null, "ObserverPattern", null, 0, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_MediatorPattern(), this.getMediatorPattern(), null, "MediatorPattern", null, 0, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ChangeManager(), theUMLPackage.getClass_(), null, "ChangeManager", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_MediatedSubject(), theUMLPackage.getClass_(), null, "MediatedSubject", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_MediatedObserver(), theUMLPackage.getClass_(), null, "MediatedObserver", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ConcreteChangeManagers(), theUMLPackage.getClass_(), null, "ConcreteChangeManagers", null, 0, -1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ConcreteMediatedSubjects(), theUMLPackage.getClass_(), null, "ConcreteMediatedSubjects", null, 0, -1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ConcreteMediatedObservers(), theUMLPackage.getClass_(), null, "ConcreteMediatedObservers", null, 0, -1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_AttachOp(), theUMLPackage.getOperation(), null, "AttachOp", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_AttachPara(), theUMLPackage.getParameter(), null, "AttachPara", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_DetachOp(), theUMLPackage.getOperation(), null, "DetachOp", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_DetachPara(), theUMLPackage.getParameter(), null, "DetachPara", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_SubjectNotifyOp(), theUMLPackage.getOperation(), null, "SubjectNotifyOp", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_RegisterOp(), theUMLPackage.getOperation(), null, "RegisterOp", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_RegisterOpPara1(), theUMLPackage.getParameter(), null, "RegisterOpPara1", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_RegisterOpPara2(), theUMLPackage.getParameter(), null, "RegisterOpPara2", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_UnRegisterOp(), theUMLPackage.getOperation(), null, "UnRegisterOp", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_UnRegisterOpPara1(), theUMLPackage.getParameter(), null, "UnRegisterOpPara1", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_UnRegisterOpPara2(), theUMLPackage.getParameter(), null, "UnRegisterOpPara2", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ChangeManagerNotifyOp(), theUMLPackage.getOperation(), null, "ChangeManagerNotifyOp", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_SubToObsMapping(), theUMLPackage.getProperty(), null, "SubToObsMapping", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_MediatedObserverUpdateOp(), theUMLPackage.getOperation(), null, "MediatedObserverUpdateOp", null, 1, 1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ConcreteMediatedSubjectGetStateOps(), theUMLPackage.getOperation(), null, "ConcreteMediatedSubjectGetStateOps", null, 0, -1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ConcreteMediatedSubjectSetStateOps(), theUMLPackage.getOperation(), null, "ConcreteMediatedSubjectSetStateOps", null, 0, -1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ConcreteMediatedObserverUpdateOps(), theUMLPackage.getOperation(), null, "ConcreteMediatedObserverUpdateOps", null, 0, -1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ConcreteMediatedObserverStates(), theUMLPackage.getProperty(), null, "ConcreteMediatedObserverStates", null, 0, -1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatedObserverPattern_ConcreteMediatedSubjectStates(), theUMLPackage.getProperty(), null, "ConcreteMediatedSubjectStates", null, 0, -1, MediatedObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(mediatedObserverPatternEClass, null, "Compose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObserverPattern(), "ObserverPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMediatorPattern(), "MediatorPattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// RoleName
		createRoleNameAnnotations();
	}

	/**
	 * Initializes the annotations for <b>RoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRoleNameAnnotations()
	{
		String source = "RoleName";		
		addAnnotation
		  (getObserverPattern_Observer(), 
		   source, 
		   new String[] 
		   {
			 "Observer", "Observer"
		   });		
		addAnnotation
		  (getObserverPattern_ConcreteSubjectGetStateOps(), 
		   source, 
		   new String[] 
		   {
			 "ConcreteSubjectGetStateOps", "GetStateOp"
		   });
	}

} //DesignPatternsPackageImpl
