/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PostgresInstanceEnginePropsBuilder_rds;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.PostgresInstanceEnginePropsBuilder_rds} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PostgresInstanceEnginePropsBuilder_rdsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostgresInstanceEnginePropsBuilder_rdsItemProvider(AdapterFactory adapterFactory) {
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

			addVersionWithPostgresEngineVersion_software_amazon_awscdk_services_rds_PostgresEngineVersion_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version With Postgres Engine Version software amazon awscdk services rds Postgres Engine Version As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionWithPostgresEngineVersion_software_amazon_awscdk_services_rds_PostgresEngineVersion_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_PostgresInstanceEnginePropsBuilder_rds_versionWithPostgresEngineVersion_software_amazon_awscdk_services_rds_PostgresEngineVersion_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PostgresInstanceEnginePropsBuilder_rds_versionWithPostgresEngineVersion_software_amazon_awscdk_services_rds_PostgresEngineVersion_AsReference_feature",
						"_UI_PostgresInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_POSTGRES_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_POSTGRES_ENGINE_VERSION_AS_REFERENCE,
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
				getString("_UI_PostgresInstanceEnginePropsBuilder_rds_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PostgresInstanceEnginePropsBuilder_rds_generatedClassName_feature",
						"_UI_PostgresInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_PostgresInstanceEnginePropsBuilder_rds_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PostgresInstanceEnginePropsBuilder_rds_varName_feature",
								"_UI_PostgresInstanceEnginePropsBuilder_rds_type"),
						AwsworkbenchPackage.Literals.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME, true, false,
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
				getString("_UI_PostgresInstanceEnginePropsBuilder_rds_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PostgresInstanceEnginePropsBuilder_rds_identifier_feature",
						"_UI_PostgresInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER, true, false, false,
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
				getString("_UI_PostgresInstanceEnginePropsBuilder_rds_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PostgresInstanceEnginePropsBuilder_rds_additionalCode_feature",
						"_UI_PostgresInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PostgresInstanceEnginePropsBuilder_rds.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PostgresInstanceEnginePropsBuilder_rds"));
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
		return "PostgresInstanceEngineProps " + ((PostgresInstanceEnginePropsBuilder_rds) object).getVarName();

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

		switch (notification.getFeatureID(PostgresInstanceEnginePropsBuilder_rds.class)) {
		case AwsworkbenchPackage.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_POSTGRES_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_POSTGRES_ENGINE_VERSION_AS_REFERENCE:
		case AwsworkbenchPackage.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME:
		case AwsworkbenchPackage.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER:
		case AwsworkbenchPackage.POSTGRES_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE:
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
