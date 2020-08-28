/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.FunctionBuilder_lambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBuilder_lambdaItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBuilder_lambdaItemProvider(AdapterFactory adapterFactory) {
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
			addAllowAllOutbound_java_lang_Boolean_PropertyDescriptor(object);
			addCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReferencePropertyDescriptor(
					object);
			addDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReferencePropertyDescriptor(
					object);
			addDeadLetterQueueEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addEnvironment_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addEvents_software_amazon_awscdk_services_lambda_IEventSource_AsListPropertyDescriptor(object);
			addFunctionName_java_lang_String_PropertyDescriptor(object);
			addInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsListPropertyDescriptor(object);
			addLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsListPropertyDescriptor(object);
			addLogRetention_software_amazon_awscdk_services_logs_RetentionDays_PropertyDescriptor(object);
			addLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
					object);
			addMemorySize_java_lang_Number_PropertyDescriptor(object);
			addReservedConcurrentExecutions_java_lang_Number_PropertyDescriptor(object);
			addRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReferencePropertyDescriptor(
					object);
			addSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsListPropertyDescriptor(object);
			addTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addTracing_software_amazon_awscdk_services_lambda_Tracing_PropertyDescriptor(object);
			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
					object);
			addCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReferencePropertyDescriptor(object);
			addHandler_java_lang_String_PropertyDescriptor(object);
			addRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReferencePropertyDescriptor(object);
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
						"_UI_FunctionBuilder_lambda_maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_maxEventAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
						"_UI_FunctionBuilder_lambda_onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_onFailureWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE,
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
						"_UI_FunctionBuilder_lambda_onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_onSuccessWithIDestination_software_amazon_awscdk_services_lambda_IDestination_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE,
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
				getString("_UI_FunctionBuilder_lambda_retryAttempts_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_retryAttempts_java_lang_Number__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow All Outbound java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowAllOutbound_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FunctionBuilder_lambda_allowAllOutbound_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_allowAllOutbound_java_lang_Boolean__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Current Version Options With Version Options software amazon awscdk services lambda Version Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_currentVersionOptionsWithVersionOptions_software_amazon_awscdk_services_lambda_VersionOptions_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dead Letter Queue With IQueue software amazon awscdk services sqs IQueue As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_deadLetterQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dead Letter Queue Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadLetterQueueEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FunctionBuilder_lambda_deadLetterQueueEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_deadLetterQueueEnabled_java_lang_Boolean__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_FunctionBuilder_lambda_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_description_java_lang_String__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Environment java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvironment_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FunctionBuilder_lambda_environment_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_environment_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Events software amazon awscdk services lambda IEvent Source As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvents_software_amazon_awscdk_services_lambda_IEventSource_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_events_software_amazon_awscdk_services_lambda_IEventSource_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_events_software_amazon_awscdk_services_lambda_IEventSource_AsList_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Function Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FunctionBuilder_lambda_functionName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_functionName_java_lang_String__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__FUNCTION_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Initial Policy software amazon awscdk services iam Policy Statement As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_initialPolicy_software_amazon_awscdk_services_iam_PolicyStatement_AsList_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Layers software amazon awscdk services lambda ILayer Version As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayers_software_amazon_awscdk_services_lambda_ILayerVersion_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_layers_software_amazon_awscdk_services_lambda_ILayerVersion_AsList_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Log Retention software amazon awscdk services logs Retention Days  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogRetention_software_amazon_awscdk_services_logs_RetentionDays_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_logRetention_software_amazon_awscdk_services_logs_RetentionDays__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_logRetention_software_amazon_awscdk_services_logs_RetentionDays__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Log Retention Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_logRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Memory Size java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySize_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FunctionBuilder_lambda_memorySize_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_memorySize_java_lang_Number__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__MEMORY_SIZE_JAVA_LANG_NUMBER_, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reserved Concurrent Executions java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservedConcurrentExecutions_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FunctionBuilder_lambda_reservedConcurrentExecutions_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_reservedConcurrentExecutions_java_lang_Number__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_securityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Security Groups software amazon awscdk services ec2 ISecurity Group As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeout With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tracing software amazon awscdk services lambda Tracing  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTracing_software_amazon_awscdk_services_lambda_Tracing_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FunctionBuilder_lambda_tracing_software_amazon_awscdk_services_lambda_Tracing__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_tracing_software_amazon_awscdk_services_lambda_Tracing__feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Code With Code software amazon awscdk services lambda Code As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Handler java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHandler_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FunctionBuilder_lambda_handler_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_FunctionBuilder_lambda_handler_java_lang_String__feature",
								"_UI_FunctionBuilder_lambda_type"),
						AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__HANDLER_JAVA_LANG_STRING_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Runtime With Runtime software amazon awscdk services lambda Runtime As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuntimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FunctionBuilder_lambda_runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FunctionBuilder_lambda_runtimeWithRuntime_software_amazon_awscdk_services_lambda_Runtime_AsReference_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE,
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
				getString("_UI_FunctionBuilder_lambda_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FunctionBuilder_lambda_generatedClassName_feature",
						"_UI_FunctionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_FunctionBuilder_lambda_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FunctionBuilder_lambda_varName_feature",
								"_UI_FunctionBuilder_lambda_type"),
						AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_FunctionBuilder_lambda_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FunctionBuilder_lambda_identifier_feature",
								"_UI_FunctionBuilder_lambda_type"),
						AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_FunctionBuilder_lambda_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_FunctionBuilder_lambda_additionalCode_feature", "_UI_FunctionBuilder_lambda_type"),
						AwsworkbenchPackage.Literals.FUNCTION_BUILDER_LAMBDA__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns FunctionBuilder_lambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionBuilder_lambda"));
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
		return "Function " + ((FunctionBuilder_lambda) object).getVarName();

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

		switch (notification.getFeatureID(FunctionBuilder_lambda.class)) {
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MAX_EVENT_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_FAILURE_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ON_SUCCESS_WITH_IDESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IDESTINATION_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RETRY_ATTEMPTS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CURRENT_VERSION_OPTIONS_WITH_VERSION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_VERSION_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DEAD_LETTER_QUEUE_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__EVENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IEVENT_SOURCE_AS_LIST:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__FUNCTION_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__INITIAL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LAYERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_ILAYER_VERSION_AS_LIST:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__LOG_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__MEMORY_SIZE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RESERVED_CONCURRENT_EXECUTIONS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__TRACING_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_TRACING_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__HANDLER_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__RUNTIME_WITH_RUNTIME_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_REFERENCE:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__VAR_NAME:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.FUNCTION_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
