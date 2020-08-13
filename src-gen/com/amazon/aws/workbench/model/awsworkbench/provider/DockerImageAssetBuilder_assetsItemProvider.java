/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerImageAssetBuilder_assetsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerImageAssetBuilder_assetsItemProvider(AdapterFactory adapterFactory) {
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
			addDirectory_java_lang_String_PropertyDescriptor(object);
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
				getString("_UI_DockerImageAssetBuilder_assets_exclude_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_exclude_java_lang_String_AsList_feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__EXCLUDE_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString(
						"_UI_DockerImageAssetBuilder_assets_follow_software_amazon_awscdk_assets_FollowMode__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_follow_software_amazon_awscdk_assets_FollowMode__feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_,
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
				getString("_UI_DockerImageAssetBuilder_assets_extraHash_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_extraHash_java_lang_String__feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__EXTRA_HASH_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString(
						"_UI_DockerImageAssetBuilder_assets_buildArgs_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_buildArgs_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
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
				getString("_UI_DockerImageAssetBuilder_assets_file_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_file_java_lang_String__feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__FILE_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_DockerImageAssetBuilder_assets_repositoryName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_repositoryName_java_lang_String__feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__REPOSITORY_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_DockerImageAssetBuilder_assets_target_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_target_java_lang_String__feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__TARGET_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Directory java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectory_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DockerImageAssetBuilder_assets_directory_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_directory_java_lang_String__feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__DIRECTORY_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_DockerImageAssetBuilder_assets_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerImageAssetBuilder_assets_generatedClassName_feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_DockerImageAssetBuilder_assets_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DockerImageAssetBuilder_assets_varName_feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__VAR_NAME, true, false, false,
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
				getString("_UI_DockerImageAssetBuilder_assets_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DockerImageAssetBuilder_assets_identifier_feature",
						"_UI_DockerImageAssetBuilder_assets_type"),
				AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_DockerImageAssetBuilder_assets_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DockerImageAssetBuilder_assets_additionalCode_feature",
								"_UI_DockerImageAssetBuilder_assets_type"),
						AwsworkbenchPackage.Literals.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DockerImageAssetBuilder_assets.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DockerImageAssetBuilder_assets"));
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
		String label = ((DockerImageAssetBuilder_assets) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_DockerImageAssetBuilder_assets_type")
				: getString("_UI_DockerImageAssetBuilder_assets_type") + " " + label;
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

		switch (notification.getFeatureID(DockerImageAssetBuilder_assets.class)) {
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__EXTRA_HASH_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__FILE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__REPOSITORY_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__TARGET_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__DIRECTORY_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__VAR_NAME:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__IDENTIFIER:
		case AwsworkbenchPackage.DOCKER_IMAGE_ASSET_BUILDER_ASSETS__ADDITIONAL_CODE:
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
