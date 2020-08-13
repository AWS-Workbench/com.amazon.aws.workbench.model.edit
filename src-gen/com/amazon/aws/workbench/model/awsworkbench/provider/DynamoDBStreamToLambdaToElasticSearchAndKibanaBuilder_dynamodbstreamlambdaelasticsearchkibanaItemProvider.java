/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaItemProvider
		extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibanaItemProvider(
			AdapterFactory adapterFactory) {
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

			addDomainName_java_lang_String_PropertyDescriptor(object);
			addDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReferencePropertyDescriptor(
					object);
			addEsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReferencePropertyDescriptor(
					object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReferencePropertyDescriptor(
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
	 * This adds a property descriptor for the Domain Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_domainName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_domainName_java_lang_String__feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__DOMAIN_NAME_JAVA_LANG_STRING_,
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
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Es Domain Props With Cfn Domain Props software amazon awscdk services elasticsearch Cfn Domain Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_esDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_esDomainPropsWithCfnDomainProps_software_amazon_awscdk_services_elasticsearch_CfnDomainProps_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__ES_DOMAIN_PROPS_WITH_CFN_DOMAIN_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICSEARCH_CFN_DOMAIN_PROPS_AS_REFERENCE,
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
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE,
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
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
				getString(
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_generatedClassName_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__GENERATED_CLASS_NAME,
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
				getString(
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_varName_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__VAR_NAME,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString(
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_identifier_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__IDENTIFIER,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString(
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_additionalCode_feature",
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana"));
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
		String label = ((DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana) object)
				.getGeneratedClassName();
		return label == null || label.length() == 0 ? getString(
				"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type")
				: getString(
						"_UI_DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana_type")
						+ " " + label;
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

		switch (notification.getFeatureID(
				DynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana.class)) {
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__DOMAIN_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__ES_DOMAIN_PROPS_WITH_CFN_DOMAIN_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICSEARCH_CFN_DOMAIN_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__VAR_NAME:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__IDENTIFIER:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_TO_ELASTIC_SEARCH_AND_KIBANA_BUILDER_DYNAMODBSTREAMLAMBDAELASTICSEARCHKIBANA__ADDITIONAL_CODE:
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
