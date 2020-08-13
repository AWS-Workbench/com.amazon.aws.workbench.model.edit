/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AssetImageBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AssetImageBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssetImageBuilder_ecsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetImageBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addExclude_java_lang_String_AsListPropertyDescriptor(object);
			addFollow_software_amazon_awscdk_assets_FollowMode_PropertyDescriptor(object);
			addExtraHash_java_lang_String_PropertyDescriptor(object);
			addBuildArgs_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addFile_java_lang_String_PropertyDescriptor(object);
			addRepositoryName_java_lang_String_PropertyDescriptor(object);
			addTarget_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Exclude java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclude_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssetImageBuilder_ecs_exclude_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AssetImageBuilder_ecs_exclude_java_lang_String_AsList_feature",
						"_UI_AssetImageBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__EXCLUDE_JAVA_LANG_STRING_AS_LIST, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Follow software amazon awscdk assets Follow Mode  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFollow_software_amazon_awscdk_assets_FollowMode_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssetImageBuilder_ecs_follow_software_amazon_awscdk_assets_FollowMode__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AssetImageBuilder_ecs_follow_software_amazon_awscdk_assets_FollowMode__feature",
						"_UI_AssetImageBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Extra Hash java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtraHash_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssetImageBuilder_ecs_extraHash_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AssetImageBuilder_ecs_extraHash_java_lang_String__feature",
						"_UI_AssetImageBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__EXTRA_HASH_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Build Args java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildArgs_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssetImageBuilder_ecs_buildArgs_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AssetImageBuilder_ecs_buildArgs_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_AssetImageBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the File java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFile_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssetImageBuilder_ecs_file_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AssetImageBuilder_ecs_file_java_lang_String__feature", "_UI_AssetImageBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__FILE_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Repository Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoryName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssetImageBuilder_ecs_repositoryName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AssetImageBuilder_ecs_repositoryName_java_lang_String__feature",
						"_UI_AssetImageBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__REPOSITORY_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTarget_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssetImageBuilder_ecs_target_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AssetImageBuilder_ecs_target_java_lang_String__feature", "_UI_AssetImageBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__TARGET_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_AssetImageBuilder_ecs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AssetImageBuilder_ecs_generatedClassName_feature",
						"_UI_AssetImageBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_AssetImageBuilder_ecs_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AssetImageBuilder_ecs_varName_feature",
								"_UI_AssetImageBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_AssetImageBuilder_ecs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AssetImageBuilder_ecs_identifier_feature",
								"_UI_AssetImageBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_AssetImageBuilder_ecs_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AssetImageBuilder_ecs_additionalCode_feature", "_UI_AssetImageBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AssetImageBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssetImageBuilder_ecs"));
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
		String label = ((AssetImageBuilder_ecs) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_AssetImageBuilder_ecs_type")
				: getString("_UI_AssetImageBuilder_ecs_type") + " " + label;
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

		switch (notification.getFeatureID(AssetImageBuilder_ecs.class)) {
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXTRA_HASH_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FILE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__REPOSITORY_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__TARGET_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__ADDITIONAL_CODE:
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
