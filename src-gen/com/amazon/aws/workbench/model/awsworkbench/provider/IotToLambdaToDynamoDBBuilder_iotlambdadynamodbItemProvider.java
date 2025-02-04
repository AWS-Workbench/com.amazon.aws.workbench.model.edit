/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.IotToLambdaToDynamoDBBuilder_iotlambdadynamodb;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.IotToLambdaToDynamoDBBuilder_iotlambdadynamodb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IotToLambdaToDynamoDBBuilder_iotlambdadynamodbItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotToLambdaToDynamoDBBuilder_iotlambdadynamodbItemProvider(AdapterFactory adapterFactory) {
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
			addDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReferencePropertyDescriptor(
					object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
					object);
			addTablePermissions_java_lang_String_PropertyDescriptor(object);
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
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_iotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_iotTopicRulePropsWithCfnTopicRuleProps_software_amazon_awscdk_services_iot_CfnTopicRuleProps_AsReference_feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__IOT_TOPIC_RULE_PROPS_WITH_CFN_TOPIC_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IOT_CFN_TOPIC_RULE_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference_feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE,
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
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
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
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Table Permissions java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTablePermissions_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_tablePermissions_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_tablePermissions_java_lang_String__feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_,
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
				getString("_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_generatedClassName_feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__GENERATED_CLASS_NAME,
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
				getString("_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_varName_feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__VAR_NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_identifier_feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__IDENTIFIER, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_additionalCode_feature",
						"_UI_IotToLambdaToDynamoDBBuilder_iotlambdadynamodb_type"),
				AwsworkbenchPackage.Literals.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/IotToLambdaToDynamoDBBuilder_iotlambdadynamodb"));
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
		return "IotToLambdaToDynamoDB " + ((IotToLambdaToDynamoDBBuilder_iotlambdadynamodb) object).getVarName();

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

		switch (notification.getFeatureID(IotToLambdaToDynamoDBBuilder_iotlambdadynamodb.class)) {
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__IOT_TOPIC_RULE_PROPS_WITH_CFN_TOPIC_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IOT_CFN_TOPIC_RULE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__VAR_NAME:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__IDENTIFIER:
		case AwsworkbenchPackage.IOT_TO_LAMBDA_TO_DYNAMO_DB_BUILDER_IOTLAMBDADYNAMODB__ADDITIONAL_CODE:
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
