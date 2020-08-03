/**
 */
package dynamodb.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import dynamodb.DynamodbPackage;
import dynamodb.TablePropsBuilder_dynamodb;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dynamodb.TablePropsBuilder_dynamodb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TablePropsBuilder_dynamodbItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablePropsBuilder_dynamodbItemProvider(AdapterFactory adapterFactory) {
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

			addTableName_java_lang_String_PropertyDescriptor(object);
			addPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReferencePropertyDescriptor(
					object);
			addBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_PropertyDescriptor(object);
			addEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_PropertyDescriptor(object);
			addEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(object);
			addPointInTimeRecovery_java_lang_Boolean_PropertyDescriptor(object);
			addReadCapacity_java_lang_Number_PropertyDescriptor(object);
			addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(object);
			addReplicationRegions_java_lang_String_AsListPropertyDescriptor(object);
			addServerSideEncryption_java_lang_Boolean_PropertyDescriptor(object);
			addSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReferencePropertyDescriptor(
					object);
			addStream_software_amazon_awscdk_services_dynamodb_StreamViewType_PropertyDescriptor(object);
			addTimeToLiveAttribute_java_lang_String_PropertyDescriptor(object);
			addWriteCapacity_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Table Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TablePropsBuilder_dynamodb_tableName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_tableName_java_lang_String__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TablePropsBuilder_dynamodb_partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference_feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Billing Mode software amazon awscdk services dynamodb Billing Mode  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBillingMode_software_amazon_awscdk_services_dynamodb_BillingMode_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TablePropsBuilder_dynamodb_billingMode_software_amazon_awscdk_services_dynamodb_BillingMode__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_billingMode_software_amazon_awscdk_services_dynamodb_BillingMode__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encryption software amazon awscdk services dynamodb Table Encryption  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryption_software_amazon_awscdk_services_dynamodb_TableEncryption_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TablePropsBuilder_dynamodb_encryption_software_amazon_awscdk_services_dynamodb_TableEncryption__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_encryption_software_amazon_awscdk_services_dynamodb_TableEncryption__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encryption Key With IKey software amazon awscdk services kms IKey As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TablePropsBuilder_dynamodb_encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Point In Time Recovery java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointInTimeRecovery_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TablePropsBuilder_dynamodb_pointInTimeRecovery_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_pointInTimeRecovery_java_lang_Boolean__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Read Capacity java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadCapacity_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TablePropsBuilder_dynamodb_readCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_readCapacity_java_lang_Number__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						"_UI_TablePropsBuilder_dynamodb_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Replication Regions java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplicationRegions_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TablePropsBuilder_dynamodb_replicationRegions_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_replicationRegions_java_lang_String_AsList_feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server Side Encryption java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerSideEncryption_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TablePropsBuilder_dynamodb_serverSideEncryption_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_serverSideEncryption_java_lang_Boolean__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TablePropsBuilder_dynamodb_sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference_feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stream software amazon awscdk services dynamodb Stream View Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStream_software_amazon_awscdk_services_dynamodb_StreamViewType_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TablePropsBuilder_dynamodb_stream_software_amazon_awscdk_services_dynamodb_StreamViewType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_stream_software_amazon_awscdk_services_dynamodb_StreamViewType__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Time To Live Attribute java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeToLiveAttribute_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TablePropsBuilder_dynamodb_timeToLiveAttribute_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_timeToLiveAttribute_java_lang_String__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Write Capacity java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriteCapacity_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TablePropsBuilder_dynamodb_writeCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TablePropsBuilder_dynamodb_writeCapacity_java_lang_Number__feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_TablePropsBuilder_dynamodb_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TablePropsBuilder_dynamodb_generatedClassName_feature",
								"_UI_TablePropsBuilder_dynamodb_type"),
						DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_TablePropsBuilder_dynamodb_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TablePropsBuilder_dynamodb_varName_feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__VAR_NAME, true, false, false,
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
				getString("_UI_TablePropsBuilder_dynamodb_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TablePropsBuilder_dynamodb_identifier_feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__IDENTIFIER, true, false, false,
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
				getString("_UI_TablePropsBuilder_dynamodb_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TablePropsBuilder_dynamodb_additionalCode_feature",
						"_UI_TablePropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns TablePropsBuilder_dynamodb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TablePropsBuilder_dynamodb"));
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
		String label = ((TablePropsBuilder_dynamodb) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_TablePropsBuilder_dynamodb_type")
				: getString("_UI_TablePropsBuilder_dynamodb_type") + " " + label;
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

		switch (notification.getFeatureID(TablePropsBuilder_dynamodb.class)) {
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__BILLING_MODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_BILLING_MODE_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_ENCRYPTION_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__POINT_IN_TIME_RECOVERY_JAVA_LANG_BOOLEAN_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__REPLICATION_REGIONS_JAVA_LANG_STRING_AS_LIST:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__SERVER_SIDE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_STREAM_VIEW_TYPE_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__TIME_TO_LIVE_ATTRIBUTE_JAVA_LANG_STRING_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__VAR_NAME:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
		case DynamodbPackage.TABLE_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AwsworkbenchEditPlugin.INSTANCE;
	}

}
