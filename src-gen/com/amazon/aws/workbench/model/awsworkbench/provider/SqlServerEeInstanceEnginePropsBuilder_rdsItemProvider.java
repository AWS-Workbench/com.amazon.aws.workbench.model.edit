/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SqlServerEeInstanceEnginePropsBuilder_rds;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.SqlServerEeInstanceEnginePropsBuilder_rds} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlServerEeInstanceEnginePropsBuilder_rdsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlServerEeInstanceEnginePropsBuilder_rdsItemProvider(AdapterFactory adapterFactory) {
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

			addVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference_feature",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE,
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
				getString("_UI_SqlServerEeInstanceEnginePropsBuilder_rds_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_generatedClassName_feature",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__GENERATED_CLASS_NAME,
				false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_SqlServerEeInstanceEnginePropsBuilder_rds_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_varName_feature",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME, true, false,
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
				getString("_UI_SqlServerEeInstanceEnginePropsBuilder_rds_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_identifier_feature",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_SqlServerEeInstanceEnginePropsBuilder_rds_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_additionalCode_feature",
						"_UI_SqlServerEeInstanceEnginePropsBuilder_rds_type"),
				AwsworkbenchPackage.Literals.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SqlServerEeInstanceEnginePropsBuilder_rds.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/SqlServerEeInstanceEnginePropsBuilder_rds"));
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
		return  "SqlServerEeInstanceEngineProps " + ((SqlServerEeInstanceEnginePropsBuilder_rds) object).getVarName();
		
				
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

		switch (notification.getFeatureID(SqlServerEeInstanceEnginePropsBuilder_rds.class)) {
		case AwsworkbenchPackage.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE:
		case AwsworkbenchPackage.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME:
		case AwsworkbenchPackage.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER:
		case AwsworkbenchPackage.SQL_SERVER_EE_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE:
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
