/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.HttpNamespaceBuilder_servicediscovery;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.HttpNamespaceBuilder_servicediscovery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HttpNamespaceBuilder_servicediscoveryItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpNamespaceBuilder_servicediscoveryItemProvider(AdapterFactory adapterFactory) {
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

			addName_java_lang_String_PropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HttpNamespaceBuilder_servicediscovery_name_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HttpNamespaceBuilder_servicediscovery_name_java_lang_String__feature",
						"_UI_HttpNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_HttpNamespaceBuilder_servicediscovery_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HttpNamespaceBuilder_servicediscovery_description_java_lang_String__feature",
						"_UI_HttpNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__DESCRIPTION_JAVA_LANG_STRING_,
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
				getString("_UI_HttpNamespaceBuilder_servicediscovery_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HttpNamespaceBuilder_servicediscovery_generatedClassName_feature",
						"_UI_HttpNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__GENERATED_CLASS_NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_HttpNamespaceBuilder_servicediscovery_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HttpNamespaceBuilder_servicediscovery_varName_feature",
								"_UI_HttpNamespaceBuilder_servicediscovery_type"),
						AwsworkbenchPackage.Literals.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__VAR_NAME, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_HttpNamespaceBuilder_servicediscovery_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HttpNamespaceBuilder_servicediscovery_identifier_feature",
								"_UI_HttpNamespaceBuilder_servicediscovery_type"),
						AwsworkbenchPackage.Literals.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__IDENTIFIER, true, false,
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
				getString("_UI_HttpNamespaceBuilder_servicediscovery_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HttpNamespaceBuilder_servicediscovery_additionalCode_feature",
						"_UI_HttpNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns HttpNamespaceBuilder_servicediscovery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HttpNamespaceBuilder_servicediscovery"));
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
		String label = ((HttpNamespaceBuilder_servicediscovery) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_HttpNamespaceBuilder_servicediscovery_type")
				: getString("_UI_HttpNamespaceBuilder_servicediscovery_type") + " " + label;
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

		switch (notification.getFeatureID(HttpNamespaceBuilder_servicediscovery.class)) {
		case AwsworkbenchPackage.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__VAR_NAME:
		case AwsworkbenchPackage.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__IDENTIFIER:
		case AwsworkbenchPackage.HTTP_NAMESPACE_BUILDER_SERVICEDISCOVERY__ADDITIONAL_CODE:
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
