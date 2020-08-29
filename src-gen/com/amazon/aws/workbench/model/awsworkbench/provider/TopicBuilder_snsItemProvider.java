/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.TopicBuilder_sns;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.TopicBuilder_sns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TopicBuilder_snsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicBuilder_snsItemProvider(AdapterFactory adapterFactory) {
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

			addDisplayName_java_lang_String_PropertyDescriptor(object);
			addMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(object);
			addTopicName_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Display Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TopicBuilder_sns_displayName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TopicBuilder_sns_displayName_java_lang_String__feature", "_UI_TopicBuilder_sns_type"),
				AwsworkbenchPackage.Literals.TOPIC_BUILDER_SNS__DISPLAY_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Master Key With IKey software amazon awscdk services kms IKey As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TopicBuilder_sns_masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TopicBuilder_sns_masterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_TopicBuilder_sns_type"),
				AwsworkbenchPackage.Literals.TOPIC_BUILDER_SNS__MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Topic Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopicName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TopicBuilder_sns_topicName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TopicBuilder_sns_topicName_java_lang_String__feature", "_UI_TopicBuilder_sns_type"),
				AwsworkbenchPackage.Literals.TOPIC_BUILDER_SNS__TOPIC_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_TopicBuilder_sns_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TopicBuilder_sns_generatedClassName_feature", "_UI_TopicBuilder_sns_type"),
						AwsworkbenchPackage.Literals.TOPIC_BUILDER_SNS__GENERATED_CLASS_NAME, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_TopicBuilder_sns_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TopicBuilder_sns_varName_feature",
								"_UI_TopicBuilder_sns_type"),
						AwsworkbenchPackage.Literals.TOPIC_BUILDER_SNS__VAR_NAME, true, false, false,
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
				getString("_UI_TopicBuilder_sns_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TopicBuilder_sns_identifier_feature",
						"_UI_TopicBuilder_sns_type"),
				AwsworkbenchPackage.Literals.TOPIC_BUILDER_SNS__IDENTIFIER, true, false, false,
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
				getString("_UI_TopicBuilder_sns_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TopicBuilder_sns_additionalCode_feature",
						"_UI_TopicBuilder_sns_type"),
				AwsworkbenchPackage.Literals.TOPIC_BUILDER_SNS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns TopicBuilder_sns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TopicBuilder_sns"));
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
		return "Topic " + ((TopicBuilder_sns) object).getVarName();

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

		switch (notification.getFeatureID(TopicBuilder_sns.class)) {
		case AwsworkbenchPackage.TOPIC_BUILDER_SNS__DISPLAY_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.TOPIC_BUILDER_SNS__MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case AwsworkbenchPackage.TOPIC_BUILDER_SNS__TOPIC_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.TOPIC_BUILDER_SNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.TOPIC_BUILDER_SNS__VAR_NAME:
		case AwsworkbenchPackage.TOPIC_BUILDER_SNS__IDENTIFIER:
		case AwsworkbenchPackage.TOPIC_BUILDER_SNS__ADDITIONAL_CODE:
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
