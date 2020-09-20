/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ServiceResources} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceResourcesItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceResourcesItemProvider(AdapterFactory adapterFactory) {
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

			addImportExistingResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Import Existing Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportExistingResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ServiceResources_importExistingResource_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ServiceResources_importExistingResource_feature", "_UI_ServiceResources_type"),
						AwsworkbenchPackage.Literals.SERVICE_RESOURCES__IMPORT_EXISTING_RESOURCE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ServiceResources.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceResources"));
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
		ServiceResources serviceResources = (ServiceResources) object;
		return getString("_UI_ServiceResources_type") + " " + serviceResources.getImportExistingResource();
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

		switch (notification.getFeatureID(ServiceResources.class)) {
		case AwsworkbenchPackage.SERVICE_RESOURCES__IMPORT_EXISTING_RESOURCE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AwsworkbenchPackage.SERVICE_RESOURCES__DEPENDS_ON:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createFlowLogOptionsBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createVpcBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSubnetBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSubnetSelectionBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createGatewayVpcEndpointBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createMethodDeploymentOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createEndpointConfigurationBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createStageOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createHostedZoneBuilder_route53()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createDnsValidatedCertificateBuilder_certificatemanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createIntegrationResponseBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCertificateBuilder_certificatemanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createDomainNameOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancerBuilder_elasticloadbalancingv2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createVpcLinkBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createIntegrationOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createIntegrationBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCorsOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createKeyBuilder_kms()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createDeadLetterQueueBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createQueueBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createVersionOptionsBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLayerVersionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSecurityGroupBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createFunctionPropsBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createFunctionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRequestAuthorizerBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createTokenAuthorizerBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createJsonSchemaBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createModelBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRequestValidatorOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRequestValidatorBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createMethodResponseBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createMethodOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRestApiPropsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToDynamoDBBuilder_apigatewaydynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaRestApiPropsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaRestApiBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToLambdaBuilder_apigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createQueuePropsBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToSqsBuilder_apigatewaysqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createVersionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaFunctionAssociationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBehaviorBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCustomOriginConfigBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBlockPublicAccessBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCorsRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNoncurrentVersionTransitionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createTransitionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLifecycleRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBucketMetricsBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRedirectTargetBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRoutingRuleConditionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRoutingRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBucketBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBucketPropsBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOriginAccessIdentityBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createS3OriginConfigBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSourceConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAliasConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLoggingConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontWebDistributionPropsBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontToApiGatewayBuilder_cloudfrontapigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE
						.createCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontToS3Builder_cloudfronts3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAutoVerifiedAttrsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createUserPoolTriggersBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createEmailSettingsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createPasswordPolicyBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createMfaSecondFactorBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRequiredAttributesBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSignInAliasesBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createUserInvitationConfigBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createUserVerificationConfigBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createUserPoolPropsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createUserPoolBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAuthFlowBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOAuthFlowsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOAuthSettingsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createUserPoolClientPropsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildDeadLetterQueuePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildQueuePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildS3BucketPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildEncryptionKeyPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCognitoOptionsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildKinesisStreamPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildKinesisAnalyticsAppPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildLambdaFunctionPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildDynamoDBTablePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBuildTopicPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE
						.createDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createEventBusBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createEventPatternBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRulePropsBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCronOptionsBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createEventsRuleToLambdaBuilder_eventsrulelambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createStateMachinePropsBuilder_stepfunctions()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createEventsRuleToStepFunctionBuilder_eventsrulestepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createIotToLambdaBuilder_iotlambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createIotToLambdaToDynamoDBBuilder_iotlambdadynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createKinesisFirehoseToS3Builder_kinesisfirehoses3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE
						.createKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createKinesisStreamsToLambdaBuilder_kinesisstreamslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createTableBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaToDynamoDBBuilder_lambdadynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaToS3Builder_lambdas3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createTopicPropsBuilder_sns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaToSnsBuilder_lambdasns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaToSqsBuilder_lambdasqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLambdaToStepFunctionBuilder_lambdastepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createS3ToLambdaBuilder_s3lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createS3ToStepFunctionBuilder_s3stepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSnsToLambdaBuilder_snslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createManagedPolicyBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createUserBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createGroupBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRoleBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createPolicyStatementBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createPolicyDocumentBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSqsToLambdaBuilder_sqslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAttributeBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createTablePropsBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createPrivateDnsNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createPublicDnsNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createHttpNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCloudMapOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createBlockDeviceBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createHealthCheckBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAmazonLinuxImageBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRollingUpdateConfigurationBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAddCapacityOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCloudMapNamespaceOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createClusterBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancerBuilder_elasticloadbalancingv2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createDockerImageAssetBuilder_assets()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAssetImageBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSecretStringGeneratorBuilder_secretsmanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSecretBuilder_secretsmanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAwsLogDriverBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createLogGroupBuilder_logs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAwsLogDriverPropsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAppMeshProxyConfigurationPropsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAppMeshProxyConfigurationBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createHostBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createDockerVolumeConfigurationBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createVolumeBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createEc2TaskDefinitionBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createFargateTaskDefinitionBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationMultipleTargetGroupsFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationListenerPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancerPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationTargetPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedTaskImagePropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNetworkTargetPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedTaskImagePropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createNetworkMultipleTargetGroupsFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createScalingIntervalBuilder_applicationautoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createQueueProcessingFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createCronOptionsBuilder_applicationautoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskDefinitionOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createQueueProcessingEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskDefinitionOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createTopicBuilder_sns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createEc2HealthCheckOptionsBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAutoScalingGroupBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOptionConfigurationBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOptionGroupBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createPortBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createProcessorFeaturesBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOracleEeInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOracleSe1InstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOracleSe2InstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createOracleSeInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createPostgresInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSqlServerEeInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSqlServerExInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSqlServerSeInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createSqlServerWebInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createMySqlInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createMariaDbInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createParameterGroupBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createDatabaseInstanceBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createRestApiBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createMethodBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.SERVICE_RESOURCES__DEPENDS_ON,
				AwsworkbenchFactory.eINSTANCE.createAddRulePropsBuilder_elasticloadbalancingv2()));
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
