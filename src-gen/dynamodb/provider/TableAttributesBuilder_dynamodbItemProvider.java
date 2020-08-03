/**
 */
package dynamodb.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import dynamodb.DynamodbPackage;
import dynamodb.TableAttributesBuilder_dynamodb;

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
 * This is the item provider adapter for a {@link dynamodb.TableAttributesBuilder_dynamodb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableAttributesBuilder_dynamodbItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableAttributesBuilder_dynamodbItemProvider(AdapterFactory adapterFactory) {
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

			addEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(object);
			addGlobalIndexes_java_lang_String_AsListPropertyDescriptor(object);
			addLocalIndexes_java_lang_String_AsListPropertyDescriptor(object);
			addTableArn_java_lang_String_PropertyDescriptor(object);
			addTableName_java_lang_String_PropertyDescriptor(object);
			addTableStreamArn_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						"_UI_TableAttributesBuilder_dynamodb_encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TableAttributesBuilder_dynamodb_encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_TableAttributesBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Global Indexes java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalIndexes_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TableAttributesBuilder_dynamodb_globalIndexes_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TableAttributesBuilder_dynamodb_globalIndexes_java_lang_String_AsList_feature",
						"_UI_TableAttributesBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Local Indexes java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalIndexes_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TableAttributesBuilder_dynamodb_localIndexes_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TableAttributesBuilder_dynamodb_localIndexes_java_lang_String_AsList_feature",
						"_UI_TableAttributesBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Table Arn java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableArn_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TableAttributesBuilder_dynamodb_tableArn_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TableAttributesBuilder_dynamodb_tableArn_java_lang_String__feature",
						"_UI_TableAttributesBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_TableAttributesBuilder_dynamodb_tableName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TableAttributesBuilder_dynamodb_tableName_java_lang_String__feature",
						"_UI_TableAttributesBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Table Stream Arn java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableStreamArn_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TableAttributesBuilder_dynamodb_tableStreamArn_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TableAttributesBuilder_dynamodb_tableStreamArn_java_lang_String__feature",
						"_UI_TableAttributesBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_TableAttributesBuilder_dynamodb_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TableAttributesBuilder_dynamodb_generatedClassName_feature",
						"_UI_TableAttributesBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GENERATED_CLASS_NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_TableAttributesBuilder_dynamodb_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TableAttributesBuilder_dynamodb_varName_feature",
						"_UI_TableAttributesBuilder_dynamodb_type"),
				DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_TableAttributesBuilder_dynamodb_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TableAttributesBuilder_dynamodb_identifier_feature",
								"_UI_TableAttributesBuilder_dynamodb_type"),
						DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_TableAttributesBuilder_dynamodb_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TableAttributesBuilder_dynamodb_additionalCode_feature",
								"_UI_TableAttributesBuilder_dynamodb_type"),
						DynamodbPackage.Literals.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns TableAttributesBuilder_dynamodb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TableAttributesBuilder_dynamodb"));
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
		String label = ((TableAttributesBuilder_dynamodb) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_TableAttributesBuilder_dynamodb_type")
				: getString("_UI_TableAttributesBuilder_dynamodb_type") + " " + label;
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

		switch (notification.getFeatureID(TableAttributesBuilder_dynamodb.class)) {
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GLOBAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__LOCAL_INDEXES_JAVA_LANG_STRING_AS_LIST:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_ARN_JAVA_LANG_STRING_:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_NAME_JAVA_LANG_STRING_:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__TABLE_STREAM_ARN_JAVA_LANG_STRING_:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__VAR_NAME:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__IDENTIFIER:
		case DynamodbPackage.TABLE_ATTRIBUTES_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
