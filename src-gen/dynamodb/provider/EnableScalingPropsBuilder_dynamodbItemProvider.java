/**
 */
package dynamodb.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import dynamodb.DynamodbPackage;
import dynamodb.EnableScalingPropsBuilder_dynamodb;

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
 * This is the item provider adapter for a {@link dynamodb.EnableScalingPropsBuilder_dynamodb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnableScalingPropsBuilder_dynamodbItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableScalingPropsBuilder_dynamodbItemProvider(AdapterFactory adapterFactory) {
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

			addMaxCapacity_java_lang_Number_PropertyDescriptor(object);
			addMinCapacity_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Capacity java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxCapacity_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EnableScalingPropsBuilder_dynamodb_maxCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EnableScalingPropsBuilder_dynamodb_maxCapacity_java_lang_Number__feature",
						"_UI_EnableScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Capacity java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinCapacity_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EnableScalingPropsBuilder_dynamodb_minCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EnableScalingPropsBuilder_dynamodb_minCapacity_java_lang_Number__feature",
						"_UI_EnableScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_EnableScalingPropsBuilder_dynamodb_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EnableScalingPropsBuilder_dynamodb_generatedClassName_feature",
						"_UI_EnableScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME, false, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_EnableScalingPropsBuilder_dynamodb_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_EnableScalingPropsBuilder_dynamodb_varName_feature",
								"_UI_EnableScalingPropsBuilder_dynamodb_type"),
						DynamodbPackage.Literals.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_EnableScalingPropsBuilder_dynamodb_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_EnableScalingPropsBuilder_dynamodb_identifier_feature",
								"_UI_EnableScalingPropsBuilder_dynamodb_type"),
						DynamodbPackage.Literals.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER, true, false, false,
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
				getString("_UI_EnableScalingPropsBuilder_dynamodb_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EnableScalingPropsBuilder_dynamodb_additionalCode_feature",
						"_UI_EnableScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EnableScalingPropsBuilder_dynamodb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EnableScalingPropsBuilder_dynamodb"));
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
		String label = ((EnableScalingPropsBuilder_dynamodb) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_EnableScalingPropsBuilder_dynamodb_type")
				: getString("_UI_EnableScalingPropsBuilder_dynamodb_type") + " " + label;
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

		switch (notification.getFeatureID(EnableScalingPropsBuilder_dynamodb.class)) {
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MAX_CAPACITY_JAVA_LANG_NUMBER_:
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__MIN_CAPACITY_JAVA_LANG_NUMBER_:
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
		case DynamodbPackage.ENABLE_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
