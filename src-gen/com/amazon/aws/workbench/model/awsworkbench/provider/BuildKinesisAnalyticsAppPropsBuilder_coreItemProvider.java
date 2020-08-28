/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildKinesisAnalyticsAppPropsBuilder_coreItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildKinesisAnalyticsAppPropsBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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

			addKinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReferencePropertyDescriptor(
					object);
			addKinesisAnalyticsProps_java_lang_Object_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kinesis Firehose With Cfn Delivery Stream software amazon awscdk services kinesisfirehose Cfn Delivery Stream As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_kinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_kinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference_feature",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__KINESIS_FIREHOSE_WITH_CFN_DELIVERY_STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_KINESISFIREHOSE_CFN_DELIVERY_STREAM_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Kinesis Analytics Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKinesisAnalyticsProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_kinesisAnalyticsProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_kinesisAnalyticsProps_java_lang_Object__feature",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__KINESIS_ANALYTICS_PROPS_JAVA_LANG_OBJECT_,
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
				getString("_UI_BuildKinesisAnalyticsAppPropsBuilder_core_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_generatedClassName_feature",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME,
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
				getString("_UI_BuildKinesisAnalyticsAppPropsBuilder_core_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_varName_feature",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__VAR_NAME, true, false,
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
				getString("_UI_BuildKinesisAnalyticsAppPropsBuilder_core_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_identifier_feature",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__IDENTIFIER, true, false,
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
				getString("_UI_BuildKinesisAnalyticsAppPropsBuilder_core_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_additionalCode_feature",
						"_UI_BuildKinesisAnalyticsAppPropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BuildKinesisAnalyticsAppPropsBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/BuildKinesisAnalyticsAppPropsBuilder_core"));
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
		return "BuildKinesisAnalyticsAppProps " + ((BuildKinesisAnalyticsAppPropsBuilder_core) object).getVarName();

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

		switch (notification.getFeatureID(BuildKinesisAnalyticsAppPropsBuilder_core.class)) {
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__KINESIS_FIREHOSE_WITH_CFN_DELIVERY_STREAM_SOFTWARE_AMAZON_AWSCDK_SERVICES_KINESISFIREHOSE_CFN_DELIVERY_STREAM_AS_REFERENCE:
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__KINESIS_ANALYTICS_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__VAR_NAME:
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__IDENTIFIER:
		case AwsworkbenchPackage.BUILD_KINESIS_ANALYTICS_APP_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
