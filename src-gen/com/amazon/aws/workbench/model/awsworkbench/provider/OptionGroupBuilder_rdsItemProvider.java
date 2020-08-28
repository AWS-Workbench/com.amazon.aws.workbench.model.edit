/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.OptionGroupBuilder_rds} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionGroupBuilder_rdsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionGroupBuilder_rdsItemProvider(AdapterFactory adapterFactory) {
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

			addConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsListPropertyDescriptor(object);
			addEngineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReferencePropertyDescriptor(
					object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Configurations software amazon awscdk services rds Option Configuration As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_OptionGroupBuilder_rds_configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OptionGroupBuilder_rds_configurations_software_amazon_awscdk_services_rds_OptionConfiguration_AsList_feature",
						"_UI_OptionGroupBuilder_rds_type"),
				AwsworkbenchPackage.Literals.OPTION_GROUP_BUILDER_RDS__CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST,
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
						"_UI_OptionGroupBuilder_rds_engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OptionGroupBuilder_rds_engineWithIInstanceEngine_software_amazon_awscdk_services_rds_IInstanceEngine_AsReference_feature",
						"_UI_OptionGroupBuilder_rds_type"),
				AwsworkbenchPackage.Literals.OPTION_GROUP_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE,
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
				getString("_UI_OptionGroupBuilder_rds_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OptionGroupBuilder_rds_description_java_lang_String__feature",
						"_UI_OptionGroupBuilder_rds_type"),
				AwsworkbenchPackage.Literals.OPTION_GROUP_BUILDER_RDS__DESCRIPTION_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_OptionGroupBuilder_rds_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OptionGroupBuilder_rds_generatedClassName_feature",
						"_UI_OptionGroupBuilder_rds_type"),
				AwsworkbenchPackage.Literals.OPTION_GROUP_BUILDER_RDS__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_OptionGroupBuilder_rds_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OptionGroupBuilder_rds_varName_feature",
								"_UI_OptionGroupBuilder_rds_type"),
						AwsworkbenchPackage.Literals.OPTION_GROUP_BUILDER_RDS__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_OptionGroupBuilder_rds_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OptionGroupBuilder_rds_identifier_feature",
								"_UI_OptionGroupBuilder_rds_type"),
						AwsworkbenchPackage.Literals.OPTION_GROUP_BUILDER_RDS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_OptionGroupBuilder_rds_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_OptionGroupBuilder_rds_additionalCode_feature", "_UI_OptionGroupBuilder_rds_type"),
						AwsworkbenchPackage.Literals.OPTION_GROUP_BUILDER_RDS__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns OptionGroupBuilder_rds.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OptionGroupBuilder_rds"));
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
		return  "OptionGroup " + ((OptionGroupBuilder_rds) object).getVarName();
		
				
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

		switch (notification.getFeatureID(OptionGroupBuilder_rds.class)) {
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_OPTION_CONFIGURATION_AS_LIST:
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ENGINE_WITH_IINSTANCE_ENGINE_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_IINSTANCE_ENGINE_AS_REFERENCE:
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__VAR_NAME:
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__IDENTIFIER:
		case AwsworkbenchPackage.OPTION_GROUP_BUILDER_RDS__ADDITIONAL_CODE:
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
