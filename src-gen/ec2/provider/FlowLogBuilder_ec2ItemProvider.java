/**
 */
package ec2.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import ec2.Ec2Package;
import ec2.FlowLogBuilder_ec2;

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
 * This is the item provider adapter for a {@link ec2.FlowLogBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowLogBuilder_ec2ItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLogBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReferencePropertyDescriptor(
					object);
			addTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_PropertyDescriptor(object);
			addResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReferencePropertyDescriptor(
					object);
			addFlowLogName_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FlowLogBuilder_ec2_destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FlowLogBuilder_ec2_destinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference_feature",
						"_UI_FlowLogBuilder_ec2_type"),
				Ec2Package.Literals.FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FlowLogBuilder_ec2_trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FlowLogBuilder_ec2_trafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType__feature",
						"_UI_FlowLogBuilder_ec2_type"),
				Ec2Package.Literals.FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FlowLogBuilder_ec2_resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FlowLogBuilder_ec2_resourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference_feature",
						"_UI_FlowLogBuilder_ec2_type"),
				Ec2Package.Literals.FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Flow Log Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowLogName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FlowLogBuilder_ec2_flowLogName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FlowLogBuilder_ec2_flowLogName_java_lang_String__feature", "_UI_FlowLogBuilder_ec2_type"),
				Ec2Package.Literals.FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_, true, false, false,
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
				getString("_UI_FlowLogBuilder_ec2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FlowLogBuilder_ec2_generatedClassName_feature",
						"_UI_FlowLogBuilder_ec2_type"),
				Ec2Package.Literals.FLOW_LOG_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_FlowLogBuilder_ec2_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FlowLogBuilder_ec2_varName_feature",
								"_UI_FlowLogBuilder_ec2_type"),
						Ec2Package.Literals.FLOW_LOG_BUILDER_EC2__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_FlowLogBuilder_ec2_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FlowLogBuilder_ec2_identifier_feature",
								"_UI_FlowLogBuilder_ec2_type"),
						Ec2Package.Literals.FLOW_LOG_BUILDER_EC2__IDENTIFIER, true, false, false,
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
				getString("_UI_FlowLogBuilder_ec2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FlowLogBuilder_ec2_additionalCode_feature",
						"_UI_FlowLogBuilder_ec2_type"),
				Ec2Package.Literals.FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns FlowLogBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FlowLogBuilder_ec2"));
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
		String label = ((FlowLogBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_FlowLogBuilder_ec2_type")
				: getString("_UI_FlowLogBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(FlowLogBuilder_ec2.class)) {
		case Ec2Package.FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE:
		case Ec2Package.FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_:
		case Ec2Package.FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE:
		case Ec2Package.FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_:
		case Ec2Package.FLOW_LOG_BUILDER_EC2__GENERATED_CLASS_NAME:
		case Ec2Package.FLOW_LOG_BUILDER_EC2__VAR_NAME:
		case Ec2Package.FLOW_LOG_BUILDER_EC2__IDENTIFIER:
		case Ec2Package.FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE:
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
