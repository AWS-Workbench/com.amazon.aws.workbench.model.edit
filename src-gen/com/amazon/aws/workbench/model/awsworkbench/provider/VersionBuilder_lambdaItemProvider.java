/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.VersionBuilder_lambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VersionBuilder_lambdaItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionBuilder_lambdaItemProvider(AdapterFactory adapterFactory) {
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

			addMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReferencePropertyDescriptor(
					object);
			addOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReferencePropertyDescriptor(
					object);
			addRetryAttempts_java_lang_Number_PropertyDescriptor(object);
			addCodeSha256_java_lang_String_PropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addProvisionedConcurrentExecutions_java_lang_Number_PropertyDescriptor(object);
			addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(object);
			addLambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Event Age With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VersionBuilder_lambda_maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Failure With IDestination software amazon awscdk services lambda IDestination As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VersionBuilder_lambda_onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference_feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Success With IDestination software amazon awscdk services lambda IDestination As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VersionBuilder_lambda_onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference_feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Retry Attempts java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetryAttempts_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VersionBuilder_lambda_retryAttempts_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_retryAttempts_java_lang_Number__feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Code Sha256 java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodeSha256_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VersionBuilder_lambda_codeSha256_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_codeSha256_java_lang_String__feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__CODE_SHA256_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescription_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VersionBuilder_lambda_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_description_java_lang_String__feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Provisioned Concurrent Executions java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvisionedConcurrentExecutions_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VersionBuilder_lambda_provisionedConcurrentExecutions_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_provisionedConcurrentExecutions_java_lang_Number__feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Removal Policy software amazon awscdk core Removal Policy  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VersionBuilder_lambda_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VersionBuilder_lambda_lambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VersionBuilder_lambda_lambdaWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__LAMBDA_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
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
				getString("_UI_VersionBuilder_lambda_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VersionBuilder_lambda_generatedClassName_feature",
						"_UI_VersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__GENERATED_CLASS_NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_VersionBuilder_lambda_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VersionBuilder_lambda_varName_feature",
								"_UI_VersionBuilder_lambda_type"),
						AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__VAR_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VersionBuilder_lambda_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VersionBuilder_lambda_identifier_feature",
								"_UI_VersionBuilder_lambda_type"),
						AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__IDENTIFIER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Additional Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VersionBuilder_lambda_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VersionBuilder_lambda_additionalCode_feature", "_UI_VersionBuilder_lambda_type"),
						AwsworkbenchPackage.Literals.VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns VersionBuilder_lambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VersionBuilder_lambda"));
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VersionBuilder_lambda) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_VersionBuilder_lambda_type")
				: getString("_UI_VersionBuilder_lambda_type") + " " + label;
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

		switch (notification.getFeatureID(VersionBuilder_lambda.class)) {
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__CODE_SHA256_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__PROVISIONED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__LAMBDA_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__VAR_NAME:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
