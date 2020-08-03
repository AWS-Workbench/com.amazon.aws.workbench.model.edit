/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToDynamoDBBuilder_apigatewaydynamodb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiGatewayToDynamoDBBuilder_apigatewaydynamodbItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiGatewayToDynamoDBBuilder_apigatewaydynamodbItemProvider(AdapterFactory adapterFactory) {
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

			addAllowCreateOperation_java_lang_Boolean_PropertyDescriptor(object);
			addAllowDeleteOperation_java_lang_Boolean_PropertyDescriptor(object);
			addAllowReadOperation_java_lang_Boolean_PropertyDescriptor(object);
			addAllowUpdateOperation_java_lang_Boolean_PropertyDescriptor(object);
			addApiGatewayProps_java_lang_Object_PropertyDescriptor(object);
			addCreateRequestTemplate_java_lang_String_PropertyDescriptor(object);
			addDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReferencePropertyDescriptor(
					object);
			addUpdateRequestTemplate_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allow Create Operation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowCreateOperation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_allowCreateOperation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_allowCreateOperation_java_lang_Boolean__feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Delete Operation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowDeleteOperation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_allowDeleteOperation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_allowDeleteOperation_java_lang_Boolean__feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Read Operation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowReadOperation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_allowReadOperation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_allowReadOperation_java_lang_Boolean__feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Update Operation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowUpdateOperation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_allowUpdateOperation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_allowUpdateOperation_java_lang_Boolean__feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_UPDATE_OPERATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Api Gateway Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiGatewayProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_apiGatewayProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_apiGatewayProps_java_lang_Object__feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Create Request Template java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateRequestTemplate_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_createRequestTemplate_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_createRequestTemplate_java_lang_String__feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_,
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
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference_feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Update Request Template java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateRequestTemplate_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_updateRequestTemplate_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_updateRequestTemplate_java_lang_String__feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__UPDATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_,
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
				getString("_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_generatedClassName_feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__GENERATED_CLASS_NAME,
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
				getString("_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_varName_feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__VAR_NAME, true, false,
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
				getString("_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_identifier_feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__IDENTIFIER, true,
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
				getString("_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_additionalCode_feature",
						"_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ApiGatewayToDynamoDBBuilder_apigatewaydynamodb"));
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
		String label = ((ApiGatewayToDynamoDBBuilder_apigatewaydynamodb) object).getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type")
				: getString("_UI_ApiGatewayToDynamoDBBuilder_apigatewaydynamodb_type") + " " + label;
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

		switch (notification.getFeatureID(ApiGatewayToDynamoDBBuilder_apigatewaydynamodb.class)) {
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ALLOW_UPDATE_OPERATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__UPDATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__VAR_NAME:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__IDENTIFIER:
		case AwsworkbenchPackage.API_GATEWAY_TO_DYNAMO_DB_BUILDER_APIGATEWAYDYNAMODB__ADDITIONAL_CODE:
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
