/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.IotToLambdaBuilder_iotlambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.IotToLambdaBuilder_iotlambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IotToLambdaBuilder_iotlambdaItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotToLambdaBuilder_iotlambdaItemProvider(AdapterFactory adapterFactory) {
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

			addIotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReferencePropertyDescriptor(
					object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Iot Topic Rule Props With Cfn Topic Rule Props software amazon awscdk services iot Cfn Topic Rule Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IotToLambdaBuilder_iotlambda_iotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaBuilder_iotlambda_iotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference_feature",
						"_UI_IotToLambdaBuilder_iotlambda_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__IOT_TOPIC_RULE_PROPS_WITH_CFN_TOPIC_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IOT_CFN_TOPIC_RULE_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IotToLambdaBuilder_iotlambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaBuilder_iotlambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_IotToLambdaBuilder_iotlambda_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IotToLambdaBuilder_iotlambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaBuilder_iotlambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_IotToLambdaBuilder_iotlambda_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_IotToLambdaBuilder_iotlambda_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IotToLambdaBuilder_iotlambda_generatedClassName_feature",
								"_UI_IotToLambdaBuilder_iotlambda_type"),
						AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__GENERATED_CLASS_NAME, false,
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
				getString("_UI_IotToLambdaBuilder_iotlambda_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IotToLambdaBuilder_iotlambda_varName_feature",
						"_UI_IotToLambdaBuilder_iotlambda_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__VAR_NAME, true, false, false,
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
				getString("_UI_IotToLambdaBuilder_iotlambda_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IotToLambdaBuilder_iotlambda_identifier_feature",
						"_UI_IotToLambdaBuilder_iotlambda_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_IotToLambdaBuilder_iotlambda_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IotToLambdaBuilder_iotlambda_additionalCode_feature",
								"_UI_IotToLambdaBuilder_iotlambda_type"),
						AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns IotToLambdaBuilder_iotlambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IotToLambdaBuilder_iotlambda"));
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
		return "IotToLambda " + ((IotToLambdaBuilder_iotlambda) object).getVarName();

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

		switch (notification.getFeatureID(IotToLambdaBuilder_iotlambda.class)) {
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__IOT_TOPIC_RULE_PROPS_WITH_CFN_TOPIC_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IOT_CFN_TOPIC_RULE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__VAR_NAME:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_BUILDER_IOTLAMBDA__ADDITIONAL_CODE:
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
