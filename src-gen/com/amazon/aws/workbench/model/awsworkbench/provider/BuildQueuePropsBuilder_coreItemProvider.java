/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BuildQueuePropsBuilder_core;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.BuildQueuePropsBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildQueuePropsBuilder_coreItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildQueuePropsBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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

			addDeadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReferencePropertyDescriptor(
					object);
			addExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReferencePropertyDescriptor(
					object);
			addQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						"_UI_BuildQueuePropsBuilder_core_deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildQueuePropsBuilder_core_deadLetterQueueWithDeadLetterQueue_software_amazon_awscdk_services_sqs_DeadLetterQueue_AsReference_feature",
						"_UI_BuildQueuePropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BuildQueuePropsBuilder_core_existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildQueuePropsBuilder_core_existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference_feature",
						"_UI_BuildQueuePropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_QUEUE_PROPS_BUILDER_CORE__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BuildQueuePropsBuilder_core_queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BuildQueuePropsBuilder_core_queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature",
						"_UI_BuildQueuePropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_QUEUE_PROPS_BUILDER_CORE__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_BuildQueuePropsBuilder_core_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BuildQueuePropsBuilder_core_generatedClassName_feature",
								"_UI_BuildQueuePropsBuilder_core_type"),
						AwsworkbenchPackage.Literals.BUILD_QUEUE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_BuildQueuePropsBuilder_core_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BuildQueuePropsBuilder_core_varName_feature",
						"_UI_BuildQueuePropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_QUEUE_PROPS_BUILDER_CORE__VAR_NAME, true, false, false,
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
				getString("_UI_BuildQueuePropsBuilder_core_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BuildQueuePropsBuilder_core_identifier_feature",
						"_UI_BuildQueuePropsBuilder_core_type"),
				AwsworkbenchPackage.Literals.BUILD_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_BuildQueuePropsBuilder_core_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BuildQueuePropsBuilder_core_additionalCode_feature",
								"_UI_BuildQueuePropsBuilder_core_type"),
						AwsworkbenchPackage.Literals.BUILD_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BuildQueuePropsBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BuildQueuePropsBuilder_core"));
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
		String label = ((BuildQueuePropsBuilder_core) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_BuildQueuePropsBuilder_core_type")
				: getString("_UI_BuildQueuePropsBuilder_core_type") + " " + label;
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

		switch (notification.getFeatureID(BuildQueuePropsBuilder_core.class)) {
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE__DEAD_LETTER_QUEUE_WITH_DEAD_LETTER_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_DEAD_LETTER_QUEUE_AS_REFERENCE:
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE__VAR_NAME:
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE__IDENTIFIER:
		case AwsworkbenchPackage.BUILD_QUEUE_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
