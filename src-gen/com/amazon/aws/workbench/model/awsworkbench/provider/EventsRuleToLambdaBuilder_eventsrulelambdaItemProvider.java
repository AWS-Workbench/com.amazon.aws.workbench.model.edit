/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.EventsRuleToLambdaBuilder_eventsrulelambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.EventsRuleToLambdaBuilder_eventsrulelambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventsRuleToLambdaBuilder_eventsrulelambdaItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsRuleToLambdaBuilder_eventsrulelambdaItemProvider(AdapterFactory adapterFactory) {
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

			addEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReferencePropertyDescriptor(
					object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_eventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference_feature",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_type"),
				AwsworkbenchPackage.Literals.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_type"),
				AwsworkbenchPackage.Literals.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_type"),
				AwsworkbenchPackage.Literals.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
				getString("_UI_EventsRuleToLambdaBuilder_eventsrulelambda_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_generatedClassName_feature",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_type"),
				AwsworkbenchPackage.Literals.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__GENERATED_CLASS_NAME,
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
				getString("_UI_EventsRuleToLambdaBuilder_eventsrulelambda_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_varName_feature",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_type"),
				AwsworkbenchPackage.Literals.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__VAR_NAME, true, false,
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
				getString("_UI_EventsRuleToLambdaBuilder_eventsrulelambda_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_identifier_feature",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_type"),
				AwsworkbenchPackage.Literals.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__IDENTIFIER, true, false,
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
				getString("_UI_EventsRuleToLambdaBuilder_eventsrulelambda_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_additionalCode_feature",
						"_UI_EventsRuleToLambdaBuilder_eventsrulelambda_type"),
				AwsworkbenchPackage.Literals.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EventsRuleToLambdaBuilder_eventsrulelambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/EventsRuleToLambdaBuilder_eventsrulelambda"));
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
		return  "EventsRuleToLambda " + ((EventsRuleToLambdaBuilder_eventsrulelambda) object).getVarName();
		
				
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

		switch (notification.getFeatureID(EventsRuleToLambdaBuilder_eventsrulelambda.class)) {
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EVENT_RULE_PROPS_WITH_RULE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_RULE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__VAR_NAME:
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.EVENTS_RULE_TO_LAMBDA_BUILDER_EVENTSRULELAMBDA__ADDITIONAL_CODE:
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
