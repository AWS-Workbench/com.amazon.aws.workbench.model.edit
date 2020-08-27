/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SecretStringGeneratorBuilder_secretsmanager;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.SecretStringGeneratorBuilder_secretsmanager} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecretStringGeneratorBuilder_secretsmanagerItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretStringGeneratorBuilder_secretsmanagerItemProvider(AdapterFactory adapterFactory) {
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

			addExcludeCharacters_java_lang_String_PropertyDescriptor(object);
			addExcludeLowercase_java_lang_Boolean_PropertyDescriptor(object);
			addExcludeNumbers_java_lang_Boolean_PropertyDescriptor(object);
			addExcludePunctuation_java_lang_Boolean_PropertyDescriptor(object);
			addExcludeUppercase_java_lang_Boolean_PropertyDescriptor(object);
			addGenerateStringKey_java_lang_String_PropertyDescriptor(object);
			addIncludeSpace_java_lang_Boolean_PropertyDescriptor(object);
			addPasswordLength_java_lang_Number_PropertyDescriptor(object);
			addRequireEachIncludedType_java_lang_Boolean_PropertyDescriptor(object);
			addSecretStringTemplate_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Exclude Characters java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludeCharacters_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludeCharacters_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludeCharacters_java_lang_String__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_CHARACTERS_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exclude Lowercase java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludeLowercase_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludeLowercase_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludeLowercase_java_lang_Boolean__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exclude Numbers java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludeNumbers_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SecretStringGeneratorBuilder_secretsmanager_excludeNumbers_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludeNumbers_java_lang_Boolean__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exclude Punctuation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludePunctuation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludePunctuation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludePunctuation_java_lang_Boolean__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exclude Uppercase java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludeUppercase_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludeUppercase_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_excludeUppercase_java_lang_Boolean__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generate String Key java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateStringKey_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretStringGeneratorBuilder_secretsmanager_generateStringKey_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_generateStringKey_java_lang_String__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATE_STRING_KEY_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Include Space java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeSpace_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SecretStringGeneratorBuilder_secretsmanager_includeSpace_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_includeSpace_java_lang_Boolean__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__INCLUDE_SPACE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Password Length java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordLength_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SecretStringGeneratorBuilder_secretsmanager_passwordLength_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_passwordLength_java_lang_Number__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__PASSWORD_LENGTH_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Require Each Included Type java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequireEachIncludedType_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretStringGeneratorBuilder_secretsmanager_requireEachIncludedType_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_requireEachIncludedType_java_lang_Boolean__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Secret String Template java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecretStringTemplate_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretStringGeneratorBuilder_secretsmanager_secretStringTemplate_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_secretStringTemplate_java_lang_String__feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__SECRET_STRING_TEMPLATE_JAVA_LANG_STRING_,
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
				getString("_UI_SecretStringGeneratorBuilder_secretsmanager_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_generatedClassName_feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATED_CLASS_NAME,
				false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_SecretStringGeneratorBuilder_secretsmanager_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_varName_feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__VAR_NAME, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_SecretStringGeneratorBuilder_secretsmanager_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_identifier_feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__IDENTIFIER, true, false,
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
				getString("_UI_SecretStringGeneratorBuilder_secretsmanager_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_additionalCode_feature",
						"_UI_SecretStringGeneratorBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SecretStringGeneratorBuilder_secretsmanager.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/SecretStringGeneratorBuilder_secretsmanager"));
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
		return  "SecretStringGenerator " + ((SecretStringGeneratorBuilder_secretsmanager) object).getVarName();
		
				
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

		switch (notification.getFeatureID(SecretStringGeneratorBuilder_secretsmanager.class)) {
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_CHARACTERS_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATE_STRING_KEY_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__INCLUDE_SPACE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__PASSWORD_LENGTH_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__SECRET_STRING_TEMPLATE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__VAR_NAME:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__IDENTIFIER:
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
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
