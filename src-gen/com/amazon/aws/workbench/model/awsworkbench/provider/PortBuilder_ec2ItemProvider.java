/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.PortBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortBuilder_ec2ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addProtocol_software_amazon_awscdk_services_ec2_Protocol_PropertyDescriptor(object);
			addStringRepresentation_java_lang_String_PropertyDescriptor(object);
			addFromPort_java_lang_Number_PropertyDescriptor(object);
			addToPort_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Protocol software amazon awscdk services ec2 Protocol  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocol_software_amazon_awscdk_services_ec2_Protocol_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PortBuilder_ec2_protocol_software_amazon_awscdk_services_ec2_Protocol__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PortBuilder_ec2_protocol_software_amazon_awscdk_services_ec2_Protocol__feature",
						"_UI_PortBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the String Representation java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringRepresentation_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PortBuilder_ec2_stringRepresentation_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PortBuilder_ec2_stringRepresentation_java_lang_String__feature",
						"_UI_PortBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the From Port java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromPort_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PortBuilder_ec2_fromPort_java_lang_Number__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PortBuilder_ec2_fromPort_java_lang_Number__feature", "_UI_PortBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the To Port java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToPort_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PortBuilder_ec2_toPort_java_lang_Number__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PortBuilder_ec2_toPort_java_lang_Number__feature", "_UI_PortBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_PortBuilder_ec2_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PortBuilder_ec2_generatedClassName_feature", "_UI_PortBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.PORT_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_PortBuilder_ec2_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PortBuilder_ec2_varName_feature",
								"_UI_PortBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.PORT_BUILDER_EC2__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_PortBuilder_ec2_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PortBuilder_ec2_identifier_feature",
								"_UI_PortBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.PORT_BUILDER_EC2__IDENTIFIER, true, false, false,
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
				getString("_UI_PortBuilder_ec2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PortBuilder_ec2_additionalCode_feature",
						"_UI_PortBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.PORT_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PortBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PortBuilder_ec2"));
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
		return "Port " + ((PortBuilder_ec2) object).getVarName();

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

		switch (notification.getFeatureID(PortBuilder_ec2.class)) {
		case AwsworkbenchPackage.PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_:
		case AwsworkbenchPackage.PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.PORT_BUILDER_EC2__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.PORT_BUILDER_EC2__VAR_NAME:
		case AwsworkbenchPackage.PORT_BUILDER_EC2__IDENTIFIER:
		case AwsworkbenchPackage.PORT_BUILDER_EC2__ADDITIONAL_CODE:
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
