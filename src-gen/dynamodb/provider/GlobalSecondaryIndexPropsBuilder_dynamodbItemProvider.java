/**
 */
package dynamodb.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import dynamodb.DynamodbPackage;
import dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb;

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
 * This is the item provider adapter for a {@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalSecondaryIndexPropsBuilder_dynamodbItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalSecondaryIndexPropsBuilder_dynamodbItemProvider(AdapterFactory adapterFactory) {
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

			addPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReferencePropertyDescriptor(
					object);
			addReadCapacity_java_lang_Number_PropertyDescriptor(object);
			addSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReferencePropertyDescriptor(
					object);
			addWriteCapacity_java_lang_Number_PropertyDescriptor(object);
			addIndexName_java_lang_String_PropertyDescriptor(object);
			addNonKeyAttributes_java_lang_String_AsListPropertyDescriptor(object);
			addProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_partitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference_feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_readCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_readCapacity_java_lang_Number__feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_sortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference_feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_writeCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_writeCapacity_java_lang_Number__feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Index Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_indexName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_indexName_java_lang_String__feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Non Key Attributes java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNonKeyAttributes_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_nonKeyAttributes_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_nonKeyAttributes_java_lang_String_AsList_feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Projection Type software amazon awscdk services dynamodb Projection Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_projectionType_software_amazon_awscdk_services_dynamodb_ProjectionType__feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_,
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
				getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_generatedClassName_feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_varName_feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME, true, false, false,
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
				getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_identifier_feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER, true, false, false,
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
				getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_additionalCode_feature",
						"_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns GlobalSecondaryIndexPropsBuilder_dynamodb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/GlobalSecondaryIndexPropsBuilder_dynamodb"));
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
		String label = ((GlobalSecondaryIndexPropsBuilder_dynamodb) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type")
				: getString("_UI_GlobalSecondaryIndexPropsBuilder_dynamodb_type") + " " + label;
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

		switch (notification.getFeatureID(GlobalSecondaryIndexPropsBuilder_dynamodb.class)) {
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PARTITION_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__READ_CAPACITY_JAVA_LANG_NUMBER_:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__SORT_KEY_WITH_ATTRIBUTE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_ATTRIBUTE_AS_REFERENCE:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__WRITE_CAPACITY_JAVA_LANG_NUMBER_:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__INDEX_NAME_JAVA_LANG_STRING_:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__NON_KEY_ATTRIBUTES_JAVA_LANG_STRING_AS_LIST:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__PROJECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_PROJECTION_TYPE_:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__VAR_NAME:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
		case DynamodbPackage.GLOBAL_SECONDARY_INDEX_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
