/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.S3ToLambdaBuilder_s3lambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.S3ToLambdaBuilder_s3lambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class S3ToLambdaBuilder_s3lambdaItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S3ToLambdaBuilder_s3lambdaItemProvider(AdapterFactory adapterFactory) {
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

			addBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReferencePropertyDescriptor(
					object);
			addExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReferencePropertyDescriptor(
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
	 * This adds a property descriptor for the Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_S3ToLambdaBuilder_s3lambda_bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToLambdaBuilder_s3lambda_bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference_feature",
						"_UI_S3ToLambdaBuilder_s3lambda_type"),
				AwsworkbenchPackage.Literals.S3_TO_LAMBDA_BUILDER_S3LAMBDA__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_S3ToLambdaBuilder_s3lambda_existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToLambdaBuilder_s3lambda_existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference_feature",
						"_UI_S3ToLambdaBuilder_s3lambda_type"),
				AwsworkbenchPackage.Literals.S3_TO_LAMBDA_BUILDER_S3LAMBDA__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE,
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
						"_UI_S3ToLambdaBuilder_s3lambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToLambdaBuilder_s3lambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_S3ToLambdaBuilder_s3lambda_type"),
				AwsworkbenchPackage.Literals.S3_TO_LAMBDA_BUILDER_S3LAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
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
						"_UI_S3ToLambdaBuilder_s3lambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_S3ToLambdaBuilder_s3lambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_S3ToLambdaBuilder_s3lambda_type"),
				AwsworkbenchPackage.Literals.S3_TO_LAMBDA_BUILDER_S3LAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_S3ToLambdaBuilder_s3lambda_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_S3ToLambdaBuilder_s3lambda_generatedClassName_feature",
								"_UI_S3ToLambdaBuilder_s3lambda_type"),
						AwsworkbenchPackage.Literals.S3_TO_LAMBDA_BUILDER_S3LAMBDA__GENERATED_CLASS_NAME, false, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_S3ToLambdaBuilder_s3lambda_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_S3ToLambdaBuilder_s3lambda_varName_feature",
						"_UI_S3ToLambdaBuilder_s3lambda_type"),
				AwsworkbenchPackage.Literals.S3_TO_LAMBDA_BUILDER_S3LAMBDA__VAR_NAME, true, false, false,
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
				getString("_UI_S3ToLambdaBuilder_s3lambda_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_S3ToLambdaBuilder_s3lambda_identifier_feature",
						"_UI_S3ToLambdaBuilder_s3lambda_type"),
				AwsworkbenchPackage.Literals.S3_TO_LAMBDA_BUILDER_S3LAMBDA__IDENTIFIER, true, false, false,
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
				getString("_UI_S3ToLambdaBuilder_s3lambda_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_S3ToLambdaBuilder_s3lambda_additionalCode_feature",
						"_UI_S3ToLambdaBuilder_s3lambda_type"),
				AwsworkbenchPackage.Literals.S3_TO_LAMBDA_BUILDER_S3LAMBDA__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns S3ToLambdaBuilder_s3lambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/S3ToLambdaBuilder_s3lambda"));
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
		return  "S3ToLambda " + ((S3ToLambdaBuilder_s3lambda) object).getVarName();
		
				
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

		switch (notification.getFeatureID(S3ToLambdaBuilder_s3lambda.class)) {
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA__VAR_NAME:
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.S3_TO_LAMBDA_BUILDER_S3LAMBDA__ADDITIONAL_CODE:
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
