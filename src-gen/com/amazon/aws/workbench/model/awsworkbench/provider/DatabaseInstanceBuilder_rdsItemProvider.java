/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DatabaseInstanceBuilder_rds} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseInstanceBuilder_rdsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInstanceBuilder_rdsItemProvider(AdapterFactory adapterFactory) {
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

			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addAutoMinorVersionUpgrade_java_lang_Boolean_PropertyDescriptor(object);
			addAvailabilityZone_java_lang_String_PropertyDescriptor(object);
			addBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addCloudwatchLogsExports_java_lang_String_AsListPropertyDescriptor(object);
			addCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_PropertyDescriptor(object);
			addCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
					object);
			addCopyTagsToSnapshot_java_lang_Boolean_PropertyDescriptor(object);
			addDeleteAutomatedBackups_java_lang_Boolean_PropertyDescriptor(object);
			addDeletionProtection_java_lang_Boolean_PropertyDescriptor(object);
			addEnablePerformanceInsights_java_lang_Boolean_PropertyDescriptor(object);
			addIamAuthentication_java_lang_Boolean_PropertyDescriptor(object);
			addInstanceIdentifier_java_lang_String_PropertyDescriptor(object);
			addIops_java_lang_Number_PropertyDescriptor(object);
			addMaxAllocatedStorage_java_lang_Number_PropertyDescriptor(object);
			addMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addMultiAz_java_lang_Boolean_PropertyDescriptor(object);
			addOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReferencePropertyDescriptor(
					object);
			addPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
					object);
			addPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_PropertyDescriptor(
					object);
			addPort_java_lang_Number_PropertyDescriptor(object);
			addPreferredBackupWindow_java_lang_String_PropertyDescriptor(object);
			addPreferredMaintenanceWindow_java_lang_String_PropertyDescriptor(object);
			addProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReferencePropertyDescriptor(
					object);
			addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(object);
			addSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsListPropertyDescriptor(object);
			addStorageType_software_amazon_awscdk_services_rds_StorageType_PropertyDescriptor(object);
			addVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
					object);
			addEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReferencePropertyDescriptor(
					object);
			addAllocatedStorage_java_lang_Number_PropertyDescriptor(object);
			addAllowMajorVersionUpgrade_java_lang_Boolean_PropertyDescriptor(object);
			addDatabaseName_java_lang_String_PropertyDescriptor(object);
			addInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReferencePropertyDescriptor(
					object);
			addLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_PropertyDescriptor(object);
			addMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReferencePropertyDescriptor(
					object);
			addMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
					object);
			addParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReferencePropertyDescriptor(
					object);
			addTimezone_java_lang_String_PropertyDescriptor(object);
			addMasterUsername_java_lang_String_PropertyDescriptor(object);
			addCharacterSetName_java_lang_String_PropertyDescriptor(object);
			addStorageEncrypted_java_lang_Boolean_PropertyDescriptor(object);
			addStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						"_UI_DatabaseInstanceBuilder_rds_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Auto Minor Version Upgrade java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoMinorVersionUpgrade_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_autoMinorVersionUpgrade_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_autoMinorVersionUpgrade_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Availability Zone java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilityZone_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_availabilityZone_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_availabilityZone_java_lang_String__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__AVAILABILITY_ZONE_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Backup Retention With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_backupRetentionWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cloudwatch Logs Exports java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudwatchLogsExports_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_cloudwatchLogsExports_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_cloudwatchLogsExports_java_lang_String_AsList_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cloudwatch Logs Retention software amazon awscdk services logs Retention Days  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_cloudwatchLogsRetention_software_amazon_awscdk_services_logs_RetentionDays__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cloudwatch Logs Retention Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_cloudwatchLogsRetentionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Copy Tags To Snapshot java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyTagsToSnapshot_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_copyTagsToSnapshot_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_copyTagsToSnapshot_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Delete Automated Backups java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeleteAutomatedBackups_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_deleteAutomatedBackups_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_deleteAutomatedBackups_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Deletion Protection java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeletionProtection_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_deletionProtection_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_deletionProtection_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Performance Insights java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnablePerformanceInsights_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_enablePerformanceInsights_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_enablePerformanceInsights_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Iam Authentication java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIamAuthentication_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_iamAuthentication_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_iamAuthentication_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Instance Identifier java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceIdentifier_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_instanceIdentifier_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_instanceIdentifier_java_lang_String__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_IDENTIFIER_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Iops java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIops_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_iops_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_iops_java_lang_Number__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__IOPS_JAVA_LANG_NUMBER_, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Allocated Storage java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAllocatedStorage_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_maxAllocatedStorage_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_maxAllocatedStorage_java_lang_Number__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Monitoring Interval With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_monitoringIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Monitoring Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_monitoringRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Multi Az java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiAz_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_multiAz_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_multiAz_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__MULTI_AZ_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Option Group With IOption Group software amazon awscdk services rds IOption Group As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_optionGroupWithIOptionGroup_software_amazon_awscdk_services_rds_IOptionGroup_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Performance Insight Encryption Key With IKey software amazon awscdk services kms IKey As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_performanceInsightEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Performance Insight Retention software amazon awscdk services rds Performance Insight Retention  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_performanceInsightRetention_software_amazon_awscdk_services_rds_PerformanceInsightRetention__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Port java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPort_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_port_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_port_java_lang_Number__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Preferred Backup Window java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreferredBackupWindow_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_preferredBackupWindow_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_preferredBackupWindow_java_lang_String__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Preferred Maintenance Window java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreferredMaintenanceWindow_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_preferredMaintenanceWindow_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_preferredMaintenanceWindow_java_lang_String__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Processor Features With Processor Features software amazon awscdk services rds Processor Features As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_processorFeaturesWithProcessorFeatures_software_amazon_awscdk_services_rds_ProcessorFeatures_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString(
						"_UI_DatabaseInstanceBuilder_rds_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
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
						"_UI_DatabaseInstanceBuilder_rds_securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Storage Type software amazon awscdk services rds Storage Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageType_software_amazon_awscdk_services_rds_StorageType_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_storageType_software_amazon_awscdk_services_rds_StorageType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_storageType_software_amazon_awscdk_services_rds_StorageType__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Placement With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_vpcPlacementWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Engine With IInstance Engine software amazon awscdk services rds IInstance Engine As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allocated Storage java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocatedStorage_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_allocatedStorage_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_allocatedStorage_java_lang_Number__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__ALLOCATED_STORAGE_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Major Version Upgrade java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowMajorVersionUpgrade_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_allowMajorVersionUpgrade_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_allowMajorVersionUpgrade_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Database Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_databaseName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_databaseName_java_lang_String__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__DATABASE_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the License Model software amazon awscdk services rds License Model  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicenseModel_software_amazon_awscdk_services_rds_LicenseModel_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_licenseModel_software_amazon_awscdk_services_rds_LicenseModel__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_licenseModel_software_amazon_awscdk_services_rds_LicenseModel__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Master User Password With Secret Value software amazon awscdk core Secret Value As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_masterUserPasswordWithSecretValue_software_amazon_awscdk_core_SecretValue_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Master User Password Encryption Key With IKey software amazon awscdk services kms IKey As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_masterUserPasswordEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parameter Group With IParameter Group software amazon awscdk services rds IParameter Group As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_parameterGroupWithIParameterGroup_software_amazon_awscdk_services_rds_IParameterGroup_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Timezone java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimezone_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_timezone_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_timezone_java_lang_String__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__TIMEZONE_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Master Username java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterUsername_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_masterUsername_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_masterUsername_java_lang_String__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USERNAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Character Set Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharacterSetName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_characterSetName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_characterSetName_java_lang_String__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__CHARACTER_SET_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Storage Encrypted java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageEncrypted_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_storageEncrypted_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_storageEncrypted_java_lang_Boolean__feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Storage Encryption Key With IKey software amazon awscdk services kms IKey As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DatabaseInstanceBuilder_rds_storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DatabaseInstanceBuilder_rds_storageEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generated Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DatabaseInstanceBuilder_rds_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DatabaseInstanceBuilder_rds_generatedClassName_feature",
								"_UI_DatabaseInstanceBuilder_rds_type"),
						AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__GENERATED_CLASS_NAME, false, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Var Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DatabaseInstanceBuilder_rds_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DatabaseInstanceBuilder_rds_varName_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__VAR_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_DatabaseInstanceBuilder_rds_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DatabaseInstanceBuilder_rds_identifier_feature",
						"_UI_DatabaseInstanceBuilder_rds_type"),
				AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_DatabaseInstanceBuilder_rds_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DatabaseInstanceBuilder_rds_additionalCode_feature",
								"_UI_DatabaseInstanceBuilder_rds_type"),
						AwsworkbenchPackage.Literals.DATABASE_INSTANCE_BUILDER_RDS__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DatabaseInstanceBuilder_rds.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DatabaseInstanceBuilder_rds"));
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
		return  "DatabaseInstance " + ((DatabaseInstanceBuilder_rds) object).getVarName();
		
				
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

		switch (notification.getFeatureID(DatabaseInstanceBuilder_rds.class)) {
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AUTO_MINOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__AVAILABILITY_ZONE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__BACKUP_RETENTION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_EXPORTS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CLOUDWATCH_LOGS_RETENTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__COPY_TAGS_TO_SNAPSHOT_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETE_AUTOMATED_BACKUPS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENABLE_PERFORMANCE_INSIGHTS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IAM_AUTHENTICATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_IDENTIFIER_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IOPS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MAX_ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MONITORING_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MULTI_AZ_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__OPTION_GROUP_WITH_IOPTION_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IOPTION_GROUP_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PERFORMANCE_INSIGHT_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PERFORMANCE_INSIGHT_RETENTION_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PORT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_BACKUP_WINDOW_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PREFERRED_MAINTENANCE_WINDOW_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PROCESSOR_FEATURES_WITH_PROCESSOR_FEATURES_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_PROCESSOR_FEATURES_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_STORAGE_TYPE_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VPC_PLACEMENT_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOCATED_STORAGE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ALLOW_MAJOR_VERSION_UPGRADE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__DATABASE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__LICENSE_MODEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_LICENSE_MODEL_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_WITH_SECRET_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_SECRET_VALUE_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USER_PASSWORD_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__PARAMETER_GROUP_WITH_IPARAMETER_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IPARAMETER_GROUP_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__TIMEZONE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__MASTER_USERNAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__CHARACTER_SET_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__STORAGE_ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__VAR_NAME:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__IDENTIFIER:
		case AwsworkbenchPackage.DATABASE_INSTANCE_BUILDER_RDS__ADDITIONAL_CODE:
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
