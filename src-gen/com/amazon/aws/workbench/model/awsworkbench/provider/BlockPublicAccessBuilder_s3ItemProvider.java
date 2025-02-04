/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BlockPublicAccessBuilder_s3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.BlockPublicAccessBuilder_s3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockPublicAccessBuilder_s3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockPublicAccessBuilder_s3ItemProvider(AdapterFactory adapterFactory) {
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

			addBlockPublicAcls_java_lang_Boolean_PropertyDescriptor(object);
			addBlockPublicPolicy_java_lang_Boolean_PropertyDescriptor(object);
			addIgnorePublicAcls_java_lang_Boolean_PropertyDescriptor(object);
			addRestrictPublicBuckets_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Block Public Acls java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockPublicAcls_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BlockPublicAccessBuilder_s3_blockPublicAcls_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BlockPublicAccessBuilder_s3_blockPublicAcls_java_lang_Boolean__feature",
						"_UI_BlockPublicAccessBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block Public Policy java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockPublicPolicy_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BlockPublicAccessBuilder_s3_blockPublicPolicy_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BlockPublicAccessBuilder_s3_blockPublicPolicy_java_lang_Boolean__feature",
						"_UI_BlockPublicAccessBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignore Public Acls java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnorePublicAcls_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BlockPublicAccessBuilder_s3_ignorePublicAcls_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BlockPublicAccessBuilder_s3_ignorePublicAcls_java_lang_Boolean__feature",
						"_UI_BlockPublicAccessBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Restrict Public Buckets java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestrictPublicBuckets_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BlockPublicAccessBuilder_s3_restrictPublicBuckets_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BlockPublicAccessBuilder_s3_restrictPublicBuckets_java_lang_Boolean__feature",
						"_UI_BlockPublicAccessBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3__RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN_,
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
						getResourceLocator(), getString("_UI_BlockPublicAccessBuilder_s3_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BlockPublicAccessBuilder_s3_generatedClassName_feature",
								"_UI_BlockPublicAccessBuilder_s3_type"),
						AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_BlockPublicAccessBuilder_s3_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BlockPublicAccessBuilder_s3_varName_feature",
						"_UI_BlockPublicAccessBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3__VAR_NAME, true, false, false,
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
				getString("_UI_BlockPublicAccessBuilder_s3_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BlockPublicAccessBuilder_s3_identifier_feature",
						"_UI_BlockPublicAccessBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_BlockPublicAccessBuilder_s3_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BlockPublicAccessBuilder_s3_additionalCode_feature",
								"_UI_BlockPublicAccessBuilder_s3_type"),
						AwsworkbenchPackage.Literals.BLOCK_PUBLIC_ACCESS_BUILDER_S3__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BlockPublicAccessBuilder_s3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BlockPublicAccessBuilder_s3"));
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
		return "BlockPublicAccess " + ((BlockPublicAccessBuilder_s3) object).getVarName();

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

		switch (notification.getFeatureID(BlockPublicAccessBuilder_s3.class)) {
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__BLOCK_PUBLIC_POLICY_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IGNORE_PUBLIC_ACLS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__RESTRICT_PUBLIC_BUCKETS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__VAR_NAME:
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__IDENTIFIER:
		case AwsworkbenchPackage.BLOCK_PUBLIC_ACCESS_BUILDER_S3__ADDITIONAL_CODE:
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
