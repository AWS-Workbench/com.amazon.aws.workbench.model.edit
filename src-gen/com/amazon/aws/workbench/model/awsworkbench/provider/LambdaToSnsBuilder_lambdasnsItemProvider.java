/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSnsBuilder_lambdasns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LambdaToSnsBuilder_lambdasnsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaToSnsBuilder_lambdasnsItemProvider(AdapterFactory adapterFactory) {
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

			addEnableEncryption_java_lang_Boolean_PropertyDescriptor(object);
			addEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReferencePropertyDescriptor(object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addLambdaFunctionProps_java_lang_Object_PropertyDescriptor(object);
			addTopicProps_java_lang_Object_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enable Encryption java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableEncryption_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LambdaToSnsBuilder_lambdasns_enableEncryption_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSnsBuilder_lambdasns_enableEncryption_java_lang_Boolean__feature",
						"_UI_LambdaToSnsBuilder_lambdasns_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encryption Key With Key software amazon awscdk services kms Key As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LambdaToSnsBuilder_lambdasns_encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSnsBuilder_lambdasns_encryptionKeyWithKey_software_amazon_awscdk_services_kms_Key_AsReference_feature",
						"_UI_LambdaToSnsBuilder_lambdasns_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE,
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
						"_UI_LambdaToSnsBuilder_lambdasns_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSnsBuilder_lambdasns_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_LambdaToSnsBuilder_lambdasns_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda Function Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaFunctionProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LambdaToSnsBuilder_lambdasns_lambdaFunctionProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSnsBuilder_lambdasns_lambdaFunctionProps_java_lang_Object__feature",
						"_UI_LambdaToSnsBuilder_lambdasns_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Topic Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopicProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LambdaToSnsBuilder_lambdasns_topicProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSnsBuilder_lambdasns_topicProps_java_lang_Object__feature",
						"_UI_LambdaToSnsBuilder_lambdasns_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__TOPIC_PROPS_JAVA_LANG_OBJECT_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_LambdaToSnsBuilder_lambdasns_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LambdaToSnsBuilder_lambdasns_generatedClassName_feature",
								"_UI_LambdaToSnsBuilder_lambdasns_type"),
						AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__GENERATED_CLASS_NAME, false,
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
				getString("_UI_LambdaToSnsBuilder_lambdasns_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LambdaToSnsBuilder_lambdasns_varName_feature",
						"_UI_LambdaToSnsBuilder_lambdasns_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__VAR_NAME, true, false, false,
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
				getString("_UI_LambdaToSnsBuilder_lambdasns_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LambdaToSnsBuilder_lambdasns_identifier_feature",
						"_UI_LambdaToSnsBuilder_lambdasns_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_LambdaToSnsBuilder_lambdasns_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LambdaToSnsBuilder_lambdasns_additionalCode_feature",
								"_UI_LambdaToSnsBuilder_lambdasns_type"),
						AwsworkbenchPackage.Literals.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LambdaToSnsBuilder_lambdasns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LambdaToSnsBuilder_lambdasns"));
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
		String label = ((LambdaToSnsBuilder_lambdasns) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_LambdaToSnsBuilder_lambdasns_type")
				: getString("_UI_LambdaToSnsBuilder_lambdasns_type") + " " + label;
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

		switch (notification.getFeatureID(LambdaToSnsBuilder_lambdasns.class)) {
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENABLE_ENCRYPTION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ENCRYPTION_KEY_WITH_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_KEY_AS_REFERENCE:
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__LAMBDA_FUNCTION_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__TOPIC_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__VAR_NAME:
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__IDENTIFIER:
		case AwsworkbenchPackage.LAMBDA_TO_SNS_BUILDER_LAMBDASNS__ADDITIONAL_CODE:
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
