/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StackBuilder_coreItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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

			addDescription_java_lang_String_PropertyDescriptor(object);
			addEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReferencePropertyDescriptor(object);
			addStackName_java_lang_String_PropertyDescriptor(object);
			addSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReferencePropertyDescriptor(
					object);
			addTags_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addTerminationProtection_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescription_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StackBuilder_core_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_description_java_lang_String__feature", "_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Env With Environment software amazon awscdk core Environment As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StackBuilder_core_envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stack Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStackName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StackBuilder_core_stackName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_stackName_java_lang_String__feature", "_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StackBuilder_core_synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tags java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTags_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StackBuilder_core_tags_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_tags_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Termination Protection java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminationProtection_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StackBuilder_core_terminationProtection_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_terminationProtection_java_lang_Boolean__feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_StackBuilder_core_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_StackBuilder_core_generatedClassName_feature", "_UI_StackBuilder_core_type"),
						AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__GENERATED_CLASS_NAME, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_StackBuilder_core_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StackBuilder_core_varName_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__VAR_NAME, true, false, false,
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
				getString("_UI_StackBuilder_core_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StackBuilder_core_identifier_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__IDENTIFIER, true, false, false,
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
				getString("_UI_StackBuilder_core_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StackBuilder_core_additionalCode_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__ADDITIONAL_CODE, true, false, false,
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
			childrenFeatures.add(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES);
			childrenFeatures.add(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__STACKBLOCKS);
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
	 * This returns StackBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StackBuilder_core"));
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
		String label = ((StackBuilder_core) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_StackBuilder_core_type")
				: getString("_UI_StackBuilder_core_type") + " " + label;
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

		switch (notification.getFeatureID(StackBuilder_core.class)) {
		case AwsworkbenchPackage.STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__VAR_NAME:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__IDENTIFIER:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ADDITIONAL_CODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SERVICERESOURCES:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__STACKBLOCKS:
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

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createFlowLogOptionsBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVpcBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSubnetBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSubnetSelectionBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createGatewayVpcEndpointBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMethodDeploymentOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEndpointConfigurationBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createStageOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createHostedZoneBuilder_route53()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDnsValidatedCertificateBuilder_certificatemanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIntegrationResponseBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCertificateBuilder_certificatemanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDomainNameOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancerBuilder_elasticloadbalancingv2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVpcLinkBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIntegrationOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIntegrationBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCorsOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createKeyBuilder_kms()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDeadLetterQueueBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createQueueBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVersionOptionsBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLayerVersionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSecurityGroupBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createFunctionPropsBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createFunctionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRequestAuthorizerBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTokenAuthorizerBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createJsonSchemaBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createModelBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRequestValidatorOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRequestValidatorBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMethodResponseBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMethodOptionsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRestApiPropsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToDynamoDBBuilder_apigatewaydynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaRestApiPropsBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaRestApiBuilder_apigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToLambdaBuilder_apigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createQueuePropsBuilder_sqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApiGatewayToSqsBuilder_apigatewaysqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVersionBuilder_lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaFunctionAssociationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBehaviorBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCustomOriginConfigBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBlockPublicAccessBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCorsRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNoncurrentVersionTransitionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTransitionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLifecycleRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBucketMetricsBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRedirectTargetBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRoutingRuleConditionBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRoutingRuleBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBucketBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBucketPropsBuilder_s3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOriginAccessIdentityBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createS3OriginConfigBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSourceConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAliasConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLoggingConfigurationBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontWebDistributionPropsBuilder_cloudfront()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontToApiGatewayBuilder_cloudfrontapigateway()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE
						.createCloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudFrontToS3Builder_cloudfronts3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAutoVerifiedAttrsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserPoolTriggersBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEmailSettingsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPasswordPolicyBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createMfaSecondFactorBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRequiredAttributesBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSignInAliasesBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserInvitationConfigBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserVerificationConfigBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserPoolPropsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserPoolBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAuthFlowBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOAuthFlowsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createOAuthSettingsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserPoolClientPropsBuilder_cognito()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildDeadLetterQueuePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildQueuePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildS3BucketPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildEncryptionKeyPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCognitoOptionsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildKinesisStreamPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildKinesisAnalyticsAppPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildLambdaFunctionPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildDynamoDBTablePropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBuildTopicPropsBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDynamoDBStreamToLambdaBuilder_dynamodbstreamlambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE
						.createDynamoDBStreamToLambdaToElasticSearchAndKibanaBuilder_dynamodbstreamlambdaelasticsearchkibana()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEventBusBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEventPatternBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRulePropsBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCronOptionsBuilder_events()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEventsRuleToLambdaBuilder_eventsrulelambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createStateMachinePropsBuilder_stepfunctions()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEventsRuleToStepFunctionBuilder_eventsrulestepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIotToKinesisFirehoseToS3Builder_iotkinesisfirehoses3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIotToLambdaBuilder_iotlambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createIotToLambdaToDynamoDBBuilder_iotlambdadynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createKinesisFirehoseToS3Builder_kinesisfirehoses3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE
						.createKinesisFirehoseToAnalyticsAndS3Builder_kinesisfirehoses3kinesisanalytics()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createKinesisStreamsToLambdaBuilder_kinesisstreamslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTableBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToDynamoDBBuilder_lambdadynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToElasticSearchAndKibanaBuilder_lambdaelasticsearchkibana()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToS3Builder_lambdas3()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTopicPropsBuilder_sns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToSnsBuilder_lambdasns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToSqsBuilder_lambdasqs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLambdaToStepFunctionBuilder_lambdastepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createS3ToLambdaBuilder_s3lambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createS3ToStepFunctionBuilder_s3stepfunction()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSnsToLambdaBuilder_snslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createManagedPolicyBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createUserBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createGroupBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRoleBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPolicyStatementBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPolicyDocumentBuilder_iam()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSqsToLambdaBuilder_sqslambda()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAttributeBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createTablePropsBuilder_dynamodb()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPrivateDnsNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createPublicDnsNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createHttpNamespaceBuilder_servicediscovery()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudMapOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createBlockDeviceBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createHealthCheckBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAmazonLinuxImageBuilder_ec2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createRollingUpdateConfigurationBuilder_autoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAddCapacityOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCloudMapNamespaceOptionsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createClusterBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancerBuilder_elasticloadbalancingv2()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDockerImageAssetBuilder_assets()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAssetImageBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSecretStringGeneratorBuilder_secretsmanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createSecretBuilder_secretsmanager()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAwsLogDriverBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createLogGroupBuilder_logs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAwsLogDriverPropsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAppMeshProxyConfigurationPropsBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createAppMeshProxyConfigurationBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createHostBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createDockerVolumeConfigurationBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createVolumeBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createEc2TaskDefinitionBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createFargateTaskDefinitionBuilder_ecs()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationMultipleTargetGroupsFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationListenerPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancerPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationTargetPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationLoadBalancedTaskImagePropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createApplicationMultipleTargetGroupsEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkMultipleTargetGroupsEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkTargetPropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkLoadBalancedTaskImagePropsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createNetworkMultipleTargetGroupsFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScalingIntervalBuilder_applicationautoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createQueueProcessingFargateServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createCronOptionsBuilder_applicationautoscaling()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskDefinitionOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledEc2TaskBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createQueueProcessingEc2ServiceBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskDefinitionOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskImageOptionsBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SERVICERESOURCES,
				AwsworkbenchFactory.eINSTANCE.createScheduledFargateTaskBuilder_patterns()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__STACKBLOCKS,
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
