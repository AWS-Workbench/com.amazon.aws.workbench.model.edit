/**
 */
package apigateway.provider;

import apigateway.ApigatewayPackage;
import apigateway.IntegrationOptionsBuilder_apigateway;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

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
 * This is the item provider adapter for a {@link apigateway.IntegrationOptionsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationOptionsBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationOptionsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addCacheKeyParameters_java_lang_String_AsListPropertyDescriptor(object);
			addCacheNamespace_java_lang_String_PropertyDescriptor(object);
			addConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_PropertyDescriptor(object);
			addContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_PropertyDescriptor(object);
			addCredentialsPassthrough_java_lang_Boolean_PropertyDescriptor(object);
			addCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsListPropertyDescriptor(
					object);
			addPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_PropertyDescriptor(
					object);
			addRequestParameters_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addRequestTemplates_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cache Key Parameters java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheKeyParameters_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_cacheKeyParameters_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_cacheKeyParameters_java_lang_String_AsList_feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cache Namespace java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheNamespace_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IntegrationOptionsBuilder_apigateway_cacheNamespace_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_cacheNamespace_java_lang_String__feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Connection Type software amazon awscdk services apigateway Connection Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionType_software_amazon_awscdk_services_apigateway_ConnectionType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_connectionType_software_amazon_awscdk_services_apigateway_ConnectionType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_connectionType_software_amazon_awscdk_services_apigateway_ConnectionType__feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Content Handling software amazon awscdk services apigateway Content Handling  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling__feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Credentials Passthrough java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCredentialsPassthrough_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IntegrationOptionsBuilder_apigateway_credentialsPassthrough_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_credentialsPassthrough_java_lang_Boolean__feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Credentials Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCredentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_credentialsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Integration Responses software amazon awscdk services apigateway Integration Response As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntegrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_integrationResponses_software_amazon_awscdk_services_apigateway_IntegrationResponse_AsList_feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Passthrough Behavior software amazon awscdk services apigateway Passthrough Behavior  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_passthroughBehavior_software_amazon_awscdk_services_apigateway_PassthroughBehavior__feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request Parameters java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestParameters_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_requestParameters_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_requestParameters_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request Templates java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestTemplates_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_requestTemplates_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_requestTemplates_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Link With IVpc Link software amazon awscdk services apigateway IVpc Link As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationOptionsBuilder_apigateway_vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_vpcLinkWithIVpcLink_software_amazon_awscdk_services_apigateway_IVpcLink_AsReference_feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE,
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
				getString("_UI_IntegrationOptionsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_generatedClassName_feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_IntegrationOptionsBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IntegrationOptionsBuilder_apigateway_varName_feature",
								"_UI_IntegrationOptionsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_IntegrationOptionsBuilder_apigateway_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IntegrationOptionsBuilder_apigateway_identifier_feature",
								"_UI_IntegrationOptionsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
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
				getString("_UI_IntegrationOptionsBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationOptionsBuilder_apigateway_additionalCode_feature",
						"_UI_IntegrationOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns IntegrationOptionsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IntegrationOptionsBuilder_apigateway"));
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
		String label = ((IntegrationOptionsBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_IntegrationOptionsBuilder_apigateway_type")
				: getString("_UI_IntegrationOptionsBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(IntegrationOptionsBuilder_apigateway.class)) {
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_KEY_PARAMETERS_JAVA_LANG_STRING_AS_LIST:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CACHE_NAMESPACE_JAVA_LANG_STRING_:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONNECTION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONNECTION_TYPE_:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_PASSTHROUGH_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__CREDENTIALS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__INTEGRATION_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_RESPONSE_AS_LIST:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__PASSTHROUGH_BEHAVIOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_PASSTHROUGH_BEHAVIOR_:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__REQUEST_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VPC_LINK_WITH_IVPC_LINK_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IVPC_LINK_AS_REFERENCE:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.INTEGRATION_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
