/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LambdaFunctionAssociationBuilder_cloudfrontItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaFunctionAssociationBuilder_cloudfrontItemProvider(AdapterFactory adapterFactory) {
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

			addEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_PropertyDescriptor(object);
			addLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Event Type software amazon awscdk services cloudfront Lambda Edge Event Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType__feature",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference_feature",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE,
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
				getString("_UI_LambdaFunctionAssociationBuilder_cloudfront_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_generatedClassName_feature",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME,
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
				getString("_UI_LambdaFunctionAssociationBuilder_cloudfront_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_varName_feature",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__VAR_NAME, true, false,
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
				getString("_UI_LambdaFunctionAssociationBuilder_cloudfront_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_identifier_feature",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__IDENTIFIER, true, false,
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
				getString("_UI_LambdaFunctionAssociationBuilder_cloudfront_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_additionalCode_feature",
						"_UI_LambdaFunctionAssociationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LambdaFunctionAssociationBuilder_cloudfront.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/LambdaFunctionAssociationBuilder_cloudfront"));
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
		String label = ((LambdaFunctionAssociationBuilder_cloudfront) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_LambdaFunctionAssociationBuilder_cloudfront_type")
				: getString("_UI_LambdaFunctionAssociationBuilder_cloudfront_type") + " " + label;
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

		switch (notification.getFeatureID(LambdaFunctionAssociationBuilder_cloudfront.class)) {
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE_:
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE:
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__VAR_NAME:
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__IDENTIFIER:
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
