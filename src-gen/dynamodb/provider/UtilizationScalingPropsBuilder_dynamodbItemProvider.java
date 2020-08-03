/**
 */
package dynamodb.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import dynamodb.DynamodbPackage;
import dynamodb.UtilizationScalingPropsBuilder_dynamodb;

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
 * This is the item provider adapter for a {@link dynamodb.UtilizationScalingPropsBuilder_dynamodb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilizationScalingPropsBuilder_dynamodbItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilizationScalingPropsBuilder_dynamodbItemProvider(AdapterFactory adapterFactory) {
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

			addTargetUtilizationPercent_java_lang_Number_PropertyDescriptor(object);
			addDisableScaleIn_java_lang_Boolean_PropertyDescriptor(object);
			addPolicyName_java_lang_String_PropertyDescriptor(object);
			addScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Utilization Percent java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetUtilizationPercent_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UtilizationScalingPropsBuilder_dynamodb_targetUtilizationPercent_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_targetUtilizationPercent_java_lang_Number__feature",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Disable Scale In java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisableScaleIn_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UtilizationScalingPropsBuilder_dynamodb_disableScaleIn_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_disableScaleIn_java_lang_Boolean__feature",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Policy Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolicyName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UtilizationScalingPropsBuilder_dynamodb_policyName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_policyName_java_lang_String__feature",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scale In Cooldown With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UtilizationScalingPropsBuilder_dynamodb_scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_scaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UtilizationScalingPropsBuilder_dynamodb_scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_scaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_UtilizationScalingPropsBuilder_dynamodb_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_generatedClassName_feature",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_UtilizationScalingPropsBuilder_dynamodb_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UtilizationScalingPropsBuilder_dynamodb_varName_feature",
								"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
						DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME, true, false,
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
				getString("_UI_UtilizationScalingPropsBuilder_dynamodb_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_identifier_feature",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER, true, false, false,
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
				getString("_UI_UtilizationScalingPropsBuilder_dynamodb_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_additionalCode_feature",
						"_UI_UtilizationScalingPropsBuilder_dynamodb_type"),
				DynamodbPackage.Literals.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns UtilizationScalingPropsBuilder_dynamodb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/UtilizationScalingPropsBuilder_dynamodb"));
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
		String label = ((UtilizationScalingPropsBuilder_dynamodb) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_UtilizationScalingPropsBuilder_dynamodb_type")
				: getString("_UI_UtilizationScalingPropsBuilder_dynamodb_type") + " " + label;
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

		switch (notification.getFeatureID(UtilizationScalingPropsBuilder_dynamodb.class)) {
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__TARGET_UTILIZATION_PERCENT_JAVA_LANG_NUMBER_:
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__DISABLE_SCALE_IN_JAVA_LANG_BOOLEAN_:
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__POLICY_NAME_JAVA_LANG_STRING_:
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_IN_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__SCALE_OUT_COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__GENERATED_CLASS_NAME:
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__VAR_NAME:
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__IDENTIFIER:
		case DynamodbPackage.UTILIZATION_SCALING_PROPS_BUILDER_DYNAMODB__ADDITIONAL_CODE:
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
