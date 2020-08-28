/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.QueuePropsBuilder_sqs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QueuePropsBuilder_sqsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuePropsBuilder_sqsItemProvider(AdapterFactory adapterFactory) {
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

			addContentBasedDeduplication_java_lang_Boolean_PropertyDescriptor(object);
			addDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReferencePropertyDescriptor(
					object);
			addDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_PropertyDescriptor(object);
			addEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
					object);
			addFifo_java_lang_Boolean_PropertyDescriptor(object);
			addMaxMessageSizeBytes_java_lang_Number_PropertyDescriptor(object);
			addQueueName_java_lang_String_PropertyDescriptor(object);
			addReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Content Based Deduplication java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentBasedDeduplication_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueuePropsBuilder_sqs_contentBasedDeduplication_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_contentBasedDeduplication_java_lang_Boolean__feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data Key Reuse With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueuePropsBuilder_sqs_dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_dataKeyReuseWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dead Letter Queue With Dead Letter Queue software amazon awscdk services sqs Dead Letter Queue As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueuePropsBuilder_sqs_deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference_feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Delivery Delay With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueuePropsBuilder_sqs_deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_deliveryDelayWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encryption software amazon awscdk services sqs Queue Encryption  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryption_software_amazon_awscdk_services_sqs_QueueEncryption_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueuePropsBuilder_sqs_encryption_software_amazon_awscdk_services_sqs_QueueEncryption__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_encryption_software_amazon_awscdk_services_sqs_QueueEncryption__feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encryption Master Key With IKey software amazon awscdk services kms IKey As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueuePropsBuilder_sqs_encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_encryptionMasterKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fifo java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFifo_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueuePropsBuilder_sqs_fifo_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_fifo_java_lang_Boolean__feature", "_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__FIFO_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Message Size Bytes java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxMessageSizeBytes_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueuePropsBuilder_sqs_maxMessageSizeBytes_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_maxMessageSizeBytes_java_lang_Number__feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Queue Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueueName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueuePropsBuilder_sqs_queueName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_queueName_java_lang_String__feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__QUEUE_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Receive Message Wait Time With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueuePropsBuilder_sqs_receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_receiveMessageWaitTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Retention Period With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueuePropsBuilder_sqs_retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Visibility Timeout With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueuePropsBuilder_sqs_visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueuePropsBuilder_sqs_visibilityTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_QueuePropsBuilder_sqs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_QueuePropsBuilder_sqs_generatedClassName_feature",
						"_UI_QueuePropsBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_QueuePropsBuilder_sqs_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_QueuePropsBuilder_sqs_varName_feature",
								"_UI_QueuePropsBuilder_sqs_type"),
						AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_QueuePropsBuilder_sqs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_QueuePropsBuilder_sqs_identifier_feature",
								"_UI_QueuePropsBuilder_sqs_type"),
						AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_QueuePropsBuilder_sqs_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_QueuePropsBuilder_sqs_additionalCode_feature", "_UI_QueuePropsBuilder_sqs_type"),
						AwsworkbenchPackage.Literals.QUEUE_PROPS_BUILDER_SQS__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns QueuePropsBuilder_sqs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QueuePropsBuilder_sqs"));
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
		return "QueueProps " + ((QueuePropsBuilder_sqs) object).getVarName();

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

		switch (notification.getFeatureID(QueuePropsBuilder_sqs.class)) {
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__CONTENT_BASED_DEDUPLICATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__DATA_KEY_REUSE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__DELIVERY_DELAY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_ENCRYPTION_:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__ENCRYPTION_MASTER_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__FIFO_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__MAX_MESSAGE_SIZE_BYTES_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__QUEUE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__RECEIVE_MESSAGE_WAIT_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__VISIBILITY_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__VAR_NAME:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__IDENTIFIER:
		case AwsworkbenchPackage.QUEUE_PROPS_BUILDER_SQS__ADDITIONAL_CODE:
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
