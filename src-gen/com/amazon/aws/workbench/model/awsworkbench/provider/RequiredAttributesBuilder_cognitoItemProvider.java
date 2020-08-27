/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RequiredAttributesBuilder_cognito;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.RequiredAttributesBuilder_cognito} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredAttributesBuilder_cognitoItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredAttributesBuilder_cognitoItemProvider(AdapterFactory adapterFactory) {
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

			addAddress_java_lang_Boolean_PropertyDescriptor(object);
			addBirthdate_java_lang_Boolean_PropertyDescriptor(object);
			addEmail_java_lang_Boolean_PropertyDescriptor(object);
			addFamilyName_java_lang_Boolean_PropertyDescriptor(object);
			addFullname_java_lang_Boolean_PropertyDescriptor(object);
			addGender_java_lang_Boolean_PropertyDescriptor(object);
			addGivenName_java_lang_Boolean_PropertyDescriptor(object);
			addLastUpdateTime_java_lang_Boolean_PropertyDescriptor(object);
			addLocale_java_lang_Boolean_PropertyDescriptor(object);
			addMiddleName_java_lang_Boolean_PropertyDescriptor(object);
			addNickname_java_lang_Boolean_PropertyDescriptor(object);
			addPhoneNumber_java_lang_Boolean_PropertyDescriptor(object);
			addPreferredUsername_java_lang_Boolean_PropertyDescriptor(object);
			addProfilePage_java_lang_Boolean_PropertyDescriptor(object);
			addProfilePicture_java_lang_Boolean_PropertyDescriptor(object);
			addTimezone_java_lang_Boolean_PropertyDescriptor(object);
			addWebsite_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Address java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddress_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_address_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_address_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__ADDRESS_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Birthdate java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBirthdate_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_birthdate_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_birthdate_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__BIRTHDATE_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Email java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmail_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_email_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_email_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__EMAIL_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Family Name java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFamilyName_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_familyName_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_familyName_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__FAMILY_NAME_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fullname java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullname_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_fullname_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_fullname_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__FULLNAME_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gender java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGender_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_gender_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_gender_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__GENDER_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Given Name java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGivenName_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_givenName_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_givenName_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__GIVEN_NAME_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Last Update Time java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastUpdateTime_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_lastUpdateTime_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_lastUpdateTime_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__LAST_UPDATE_TIME_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Locale java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocale_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_locale_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_locale_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__LOCALE_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Middle Name java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMiddleName_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_middleName_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_middleName_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__MIDDLE_NAME_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nickname java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNickname_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_nickname_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_nickname_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__NICKNAME_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phone Number java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhoneNumber_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_phoneNumber_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_phoneNumber_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__PHONE_NUMBER_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Preferred Username java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreferredUsername_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_preferredUsername_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_preferredUsername_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__PREFERRED_USERNAME_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Profile Page java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProfilePage_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_profilePage_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_profilePage_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__PROFILE_PAGE_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Profile Picture java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProfilePicture_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_profilePicture_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_profilePicture_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__PROFILE_PICTURE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Timezone java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimezone_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_timezone_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_timezone_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__TIMEZONE_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Website java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebsite_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequiredAttributesBuilder_cognito_website_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_website_java_lang_Boolean__feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__WEBSITE_JAVA_LANG_BOOLEAN_, true,
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
				getString("_UI_RequiredAttributesBuilder_cognito_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequiredAttributesBuilder_cognito_generatedClassName_feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_RequiredAttributesBuilder_cognito_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RequiredAttributesBuilder_cognito_varName_feature",
						"_UI_RequiredAttributesBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_RequiredAttributesBuilder_cognito_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RequiredAttributesBuilder_cognito_identifier_feature",
								"_UI_RequiredAttributesBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__IDENTIFIER, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_RequiredAttributesBuilder_cognito_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RequiredAttributesBuilder_cognito_additionalCode_feature",
								"_UI_RequiredAttributesBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RequiredAttributesBuilder_cognito.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RequiredAttributesBuilder_cognito"));
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
		return  "RequiredAttributes " + ((RequiredAttributesBuilder_cognito) object).getVarName();
		
				
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

		switch (notification.getFeatureID(RequiredAttributesBuilder_cognito.class)) {
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__ADDRESS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__BIRTHDATE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__EMAIL_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__FAMILY_NAME_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__FULLNAME_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__GENDER_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__GIVEN_NAME_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__LAST_UPDATE_TIME_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__LOCALE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__MIDDLE_NAME_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__NICKNAME_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__PHONE_NUMBER_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__PREFERRED_USERNAME_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__PROFILE_PAGE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__PROFILE_PICTURE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__TIMEZONE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__WEBSITE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__VAR_NAME:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__IDENTIFIER:
		case AwsworkbenchPackage.REQUIRED_ATTRIBUTES_BUILDER_COGNITO__ADDITIONAL_CODE:
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
