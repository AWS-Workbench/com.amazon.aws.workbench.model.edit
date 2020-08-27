/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DeadLetterQueueBuilder_sqs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeadLetterQueueBuilder_sqsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadLetterQueueBuilder_sqsItemProvider(AdapterFactory adapterFactory) {
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

			addMaxReceiveCount_java_lang_Number_PropertyDescriptor(object);
			addQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Receive Count java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxReceiveCount_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DeadLetterQueueBuilder_sqs_maxReceiveCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DeadLetterQueueBuilder_sqs_maxReceiveCount_java_lang_Number__feature",
						"_UI_DeadLetterQueueBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.DEAD_LETTER_QUEUE_BUILDER_SQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Queue With IQueue software amazon awscdk services sqs IQueue As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DeadLetterQueueBuilder_sqs_queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DeadLetterQueueBuilder_sqs_queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference_feature",
						"_UI_DeadLetterQueueBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.DEAD_LETTER_QUEUE_BUILDER_SQS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_DeadLetterQueueBuilder_sqs_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DeadLetterQueueBuilder_sqs_generatedClassName_feature",
								"_UI_DeadLetterQueueBuilder_sqs_type"),
						AwsworkbenchPackage.Literals.DEAD_LETTER_QUEUE_BUILDER_SQS__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_DeadLetterQueueBuilder_sqs_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DeadLetterQueueBuilder_sqs_varName_feature",
						"_UI_DeadLetterQueueBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.DEAD_LETTER_QUEUE_BUILDER_SQS__VAR_NAME, true, false, false,
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
				getString("_UI_DeadLetterQueueBuilder_sqs_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DeadLetterQueueBuilder_sqs_identifier_feature",
						"_UI_DeadLetterQueueBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.DEAD_LETTER_QUEUE_BUILDER_SQS__IDENTIFIER, true, false, false,
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
				getString("_UI_DeadLetterQueueBuilder_sqs_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DeadLetterQueueBuilder_sqs_additionalCode_feature",
						"_UI_DeadLetterQueueBuilder_sqs_type"),
				AwsworkbenchPackage.Literals.DEAD_LETTER_QUEUE_BUILDER_SQS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DeadLetterQueueBuilder_sqs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeadLetterQueueBuilder_sqs"));
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
		return  "DeadLetterQueue " + ((DeadLetterQueueBuilder_sqs) object).getVarName();
		
				
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

		switch (notification.getFeatureID(DeadLetterQueueBuilder_sqs.class)) {
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__VAR_NAME:
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__IDENTIFIER:
		case AwsworkbenchPackage.DEAD_LETTER_QUEUE_BUILDER_SQS__ADDITIONAL_CODE:
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
