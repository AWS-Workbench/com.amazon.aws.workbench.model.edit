/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class S3ToStepFunctionBuilder_s3stepfunctionItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S3ToStepFunctionBuilder_s3stepfunctionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReferencePropertyDescriptor(
					object);
			addBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReferencePropertyDescriptor(
					object);
			addDeployCloudTrail_java_lang_Boolean_PropertyDescriptor(object);
			addEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReferencePropertyDescriptor(
					object);
			addExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_stateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference_feature",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
				AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference_feature",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
				AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Deploy Cloud Trail java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployCloudTrail_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_S3ToStepFunctionBuilder_s3stepfunction_deployCloudTrail_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_deployCloudTrail_java_lang_Boolean__feature",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
				AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference_feature",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
				AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference_feature",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
				AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generated Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_S3ToStepFunctionBuilder_s3stepfunction_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_generatedClassName_feature",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
				AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__GENERATED_CLASS_NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Var Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_S3ToStepFunctionBuilder_s3stepfunction_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_S3ToStepFunctionBuilder_s3stepfunction_varName_feature",
								"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
						AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__VAR_NAME, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_S3ToStepFunctionBuilder_s3stepfunction_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_identifier_feature",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
				AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__IDENTIFIER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Additional Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_S3ToStepFunctionBuilder_s3stepfunction_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_additionalCode_feature",
						"_UI_S3ToStepFunctionBuilder_s3stepfunction_type"),
				AwsworkbenchPackage.Literals.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns S3ToStepFunctionBuilder_s3stepfunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/S3ToStepFunctionBuilder_s3stepfunction"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return "S3ToStepFunction " + ((S3ToStepFunctionBuilder_s3stepfunction) object).getVarName();

	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(S3ToStepFunctionBuilder_s3stepfunction.class)) {
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__STATE_MACHINE_PROPS_WITH_STATE_MACHINE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__DEPLOY_CLOUD_TRAIL_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__VAR_NAME:
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__IDENTIFIER:
		case AwsworkbenchPackage.S3_TO_STEP_FUNCTION_BUILDER_S3STEPFUNCTION__ADDITIONAL_CODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
