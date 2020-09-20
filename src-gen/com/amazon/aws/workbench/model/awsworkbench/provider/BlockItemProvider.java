/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.Block;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockItemProvider(AdapterFactory adapterFactory) {
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

			addLabelPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addCanDeployPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_label_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_label_feature", "_UI_Block_type"),
						AwsworkbenchPackage.Literals.BLOCK__LABEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_description_feature",
								"_UI_Block_type"),
						AwsworkbenchPackage.Literals.BLOCK__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_notes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_notes_feature", "_UI_Block_type"),
						AwsworkbenchPackage.Literals.BLOCK__NOTES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Can Deploy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanDeployPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_canDeploy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_canDeploy_feature",
								"_UI_Block_type"),
						AwsworkbenchPackage.Literals.BLOCK__CAN_DEPLOY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES);
			childrenFeatures.add(AwsworkbenchPackage.Literals.BLOCK__SUBBLOCKS);
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
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
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
		String label = ((Block) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_Block_type")
				: getString("_UI_Block_type") + " " + label;
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

		switch (notification.getFeatureID(Block.class)) {
		case AwsworkbenchPackage.BLOCK__LABEL:
		case AwsworkbenchPackage.BLOCK__DESCRIPTION:
		case AwsworkbenchPackage.BLOCK__NOTES:
		case AwsworkbenchPackage.BLOCK__CAN_DEPLOY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AwsworkbenchPackage.BLOCK__BLOCKRESOURCES:
		case AwsworkbenchPackage.BLOCK__SUBBLOCKS:
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

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createFlowLogOptionsBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVpcBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSubnetBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSubnetSelectionBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createGatewayVpcEndpointBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMethodDeploymentOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEndpointConfigurationBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createStageOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createHostedZoneBuilder_route53()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDnsValidatedCertificateBuilder_certificatemanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIntegrationResponseBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCertificateBuilder_certificatemanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDomainNameOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancerBuilder_elasticloadbalancingv2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVpcLinkBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIntegrationOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIntegrationBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCorsOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createKeyBuilder_kms()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDeadLetterQueueBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createQueueBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVersionOptionsBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLayerVersionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSecurityGroupBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createFunctionPropsBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createFunctionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRequestAuthorizerBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTokenAuthorizerBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createJsonSchemaBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createModelBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRequestValidatorOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRequestValidatorBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMethodResponseBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMethodOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRestApiPropsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToDynamoDBBuilder_apigatewaydynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaRestApiPropsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaRestApiBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToLambdaBuilder_apigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createQueuePropsBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToSqsBuilder_apigatewaysqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVersionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaFunctionAssociationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBehaviorBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCustomOriginConfigBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBlockPublicAccessBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCorsRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNoncurrentVersionTransitionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTransitionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLifecycleRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBucketMetricsBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRedirectTargetBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRoutingRuleConditionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRoutingRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBucketBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBucketPropsBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOriginAccessIdentityBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createS3OriginConfigBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSourceConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAliasConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLoggingConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontWebDistributionPropsBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontToApiGatewayBuilder_cloudfrontapigateway()));

		newChildDescriptors.add(
				createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES, AwsworkbenchFactory.eINSTANCE
						.createCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontToS3Builder_cloudfronts3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAutoVerifiedAttrsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserPoolTriggersBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEmailSettingsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPasswordPolicyBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMfaSecondFactorBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRequiredAttributesBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSignInAliasesBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserInvitationConfigBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserVerificationConfigBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserPoolPropsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserPoolBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAuthFlowBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOAuthFlowsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOAuthSettingsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserPoolClientPropsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildDeadLetterQueuePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildQueuePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildS3BucketPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildEncryptionKeyPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCognitoOptionsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildKinesisStreamPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildKinesisAnalyticsAppPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildLambdaFunctionPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildDynamoDBTablePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildTopicPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda()));

		newChildDescriptors.add(
				createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES, AwsworkbenchFactory.eINSTANCE
						.createDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEventBusBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEventPatternBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRulePropsBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCronOptionsBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEventsRuleToLambdaBuilder_eventsrulelambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createStateMachinePropsBuilder_stepfunctions()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEventsRuleToStepFunctionBuilder_eventsrulestepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIotToLambdaBuilder_iotlambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIotToLambdaToDynamoDBBuilder_iotlambdadynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createKinesisFirehoseToS3Builder_kinesisfirehoses3()));

		newChildDescriptors.add(
				createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES, AwsworkbenchFactory.eINSTANCE
						.createKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createKinesisStreamsToLambdaBuilder_kinesisstreamslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTableBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToDynamoDBBuilder_lambdadynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToS3Builder_lambdas3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTopicPropsBuilder_sns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToSnsBuilder_lambdasns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToSqsBuilder_lambdasqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToStepFunctionBuilder_lambdastepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createS3ToLambdaBuilder_s3lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createS3ToStepFunctionBuilder_s3stepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSnsToLambdaBuilder_snslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createManagedPolicyBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createGroupBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRoleBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPolicyStatementBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPolicyDocumentBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSqsToLambdaBuilder_sqslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAttributeBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTablePropsBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPrivateDnsNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPublicDnsNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createHttpNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudMapOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBlockDeviceBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createHealthCheckBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAmazonLinuxImageBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRollingUpdateConfigurationBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAddCapacityOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudMapNamespaceOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createClusterBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancerBuilder_elasticloadbalancingv2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDockerImageAssetBuilder_assets()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAssetImageBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSecretStringGeneratorBuilder_secretsmanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSecretBuilder_secretsmanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAwsLogDriverBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLogGroupBuilder_logs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAwsLogDriverPropsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAppMeshProxyConfigurationPropsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAppMeshProxyConfigurationBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createHostBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDockerVolumeConfigurationBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVolumeBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEc2TaskDefinitionBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createFargateTaskDefinitionBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationMultipleTargetGroupsFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationListenerPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancerPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationTargetPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedTaskImagePropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkTargetPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedTaskImagePropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkMultipleTargetGroupsFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScalingIntervalBuilder_applicationautoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createQueueProcessingFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCronOptionsBuilder_applicationautoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskDefinitionOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createQueueProcessingEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskDefinitionOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTopicBuilder_sns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEc2HealthCheckOptionsBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAutoScalingGroupBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOptionConfigurationBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOptionGroupBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPortBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createProcessorFeaturesBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOracleEeInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOracleSe1InstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOracleSe2InstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOracleSeInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPostgresInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSqlServerEeInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSqlServerExInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSqlServerSeInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSqlServerWebInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMySqlInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMariaDbInstanceEnginePropsBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createParameterGroupBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDatabaseInstanceBuilder_rds()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRestApiBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMethodBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__BLOCKRESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAddRulePropsBuilder_elasticloadbalancingv2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.BLOCK__SUBBLOCKS,
				AwsworkbenchFactory.eINSTANCE.createBlock()));
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
