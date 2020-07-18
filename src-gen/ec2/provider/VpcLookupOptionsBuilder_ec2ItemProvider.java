/**
 */
package ec2.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import ec2.Ec2Package;
import ec2.VpcLookupOptionsBuilder_ec2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ec2.VpcLookupOptionsBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VpcLookupOptionsBuilder_ec2ItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpcLookupOptionsBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addIsDefault_java_lang_Boolean_PropertyDescriptor(object);
			addSubnetGroupNameTag_java_lang_String_PropertyDescriptor(object);
			addTags_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addVpcId_java_lang_String_PropertyDescriptor(object);
			addVpcName_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Default java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDefault_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcLookupOptionsBuilder_ec2_isDefault_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcLookupOptionsBuilder_ec2_isDefault_java_lang_Boolean__feature",
						"_UI_VpcLookupOptionsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subnet Group Name Tag java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetGroupNameTag_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcLookupOptionsBuilder_ec2_subnetGroupNameTag_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcLookupOptionsBuilder_ec2_subnetGroupNameTag_java_lang_String__feature",
						"_UI_VpcLookupOptionsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tags java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTags_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcLookupOptionsBuilder_ec2_tags_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcLookupOptionsBuilder_ec2_tags_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_VpcLookupOptionsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcLookupOptionsBuilder_ec2_vpcId_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcLookupOptionsBuilder_ec2_vpcId_java_lang_String__feature",
						"_UI_VpcLookupOptionsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcLookupOptionsBuilder_ec2_vpcName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcLookupOptionsBuilder_ec2_vpcName_java_lang_String__feature",
						"_UI_VpcLookupOptionsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_VpcLookupOptionsBuilder_ec2_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcLookupOptionsBuilder_ec2_generatedClassName_feature",
								"_UI_VpcLookupOptionsBuilder_ec2_type"),
						Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_VpcLookupOptionsBuilder_ec2_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcLookupOptionsBuilder_ec2_varName_feature",
						"_UI_VpcLookupOptionsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME, true, false, false,
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
				getString("_UI_VpcLookupOptionsBuilder_ec2_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcLookupOptionsBuilder_ec2_identifier_feature",
						"_UI_VpcLookupOptionsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcLookupOptionsBuilder_ec2_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcLookupOptionsBuilder_ec2_additionalCode_feature",
								"_UI_VpcLookupOptionsBuilder_ec2_type"),
						Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns VpcLookupOptionsBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VpcLookupOptionsBuilder_ec2"));
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
		String label = ((VpcLookupOptionsBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_VpcLookupOptionsBuilder_ec2_type")
				: getString("_UI_VpcLookupOptionsBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(VpcLookupOptionsBuilder_ec2.class)) {
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_:
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_:
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_:
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME:
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER:
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AwsworkbenchEditPlugin.INSTANCE;
	}

}
