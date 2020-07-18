/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.util.AwsworkbenchAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AwsworkbenchItemProviderAdapterFactory extends AwsworkbenchAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsworkbenchItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppBuilder_coreItemProvider appBuilder_coreItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAppBuilder_coreAdapter() {
		if (appBuilder_coreItemProvider == null) {
			appBuilder_coreItemProvider = new AppBuilder_coreItemProvider(this);
		}

		return appBuilder_coreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultStackSynthesizerBuilder_coreItemProvider defaultStackSynthesizerBuilder_coreItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultStackSynthesizerBuilder_coreAdapter() {
		if (defaultStackSynthesizerBuilder_coreItemProvider == null) {
			defaultStackSynthesizerBuilder_coreItemProvider = new DefaultStackSynthesizerBuilder_coreItemProvider(this);
		}

		return defaultStackSynthesizerBuilder_coreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentBuilder_coreItemProvider environmentBuilder_coreItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentBuilder_coreAdapter() {
		if (environmentBuilder_coreItemProvider == null) {
			environmentBuilder_coreItemProvider = new EnvironmentBuilder_coreItemProvider(this);
		}

		return environmentBuilder_coreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowLogOptionsBuilder_ec2ItemProvider flowLogOptionsBuilder_ec2ItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.FlowLogOptionsBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowLogOptionsBuilder_ec2Adapter() {
		if (flowLogOptionsBuilder_ec2ItemProvider == null) {
			flowLogOptionsBuilder_ec2ItemProvider = new FlowLogOptionsBuilder_ec2ItemProvider(this);
		}

		return flowLogOptionsBuilder_ec2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackBuilder_coreItemProvider stackBuilder_coreItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStackBuilder_coreAdapter() {
		if (stackBuilder_coreItemProvider == null) {
			stackBuilder_coreItemProvider = new StackBuilder_coreItemProvider(this);
		}

		return stackBuilder_coreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VpcBuilder_ec2ItemProvider vpcBuilder_ec2ItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVpcBuilder_ec2Adapter() {
		if (vpcBuilder_ec2ItemProvider == null) {
			vpcBuilder_ec2ItemProvider = new VpcBuilder_ec2ItemProvider(this);
		}

		return vpcBuilder_ec2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetBuilder_ec2ItemProvider subnetBuilder_ec2ItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.SubnetBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubnetBuilder_ec2Adapter() {
		if (subnetBuilder_ec2ItemProvider == null) {
			subnetBuilder_ec2ItemProvider = new SubnetBuilder_ec2ItemProvider(this);
		}

		return subnetBuilder_ec2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetSelectionBuilder_ec2ItemProvider subnetSelectionBuilder_ec2ItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.SubnetSelectionBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubnetSelectionBuilder_ec2Adapter() {
		if (subnetSelectionBuilder_ec2ItemProvider == null) {
			subnetSelectionBuilder_ec2ItemProvider = new SubnetSelectionBuilder_ec2ItemProvider(this);
		}

		return subnetSelectionBuilder_ec2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetConfigurationBuilder_ec2ItemProvider subnetConfigurationBuilder_ec2ItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.SubnetConfigurationBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubnetConfigurationBuilder_ec2Adapter() {
		if (subnetConfigurationBuilder_ec2ItemProvider == null) {
			subnetConfigurationBuilder_ec2ItemProvider = new SubnetConfigurationBuilder_ec2ItemProvider(this);
		}

		return subnetConfigurationBuilder_ec2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VpnConnectionOptionsBuilder_ec2ItemProvider vpnConnectionOptionsBuilder_ec2ItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVpnConnectionOptionsBuilder_ec2Adapter() {
		if (vpnConnectionOptionsBuilder_ec2ItemProvider == null) {
			vpnConnectionOptionsBuilder_ec2ItemProvider = new VpnConnectionOptionsBuilder_ec2ItemProvider(this);
		}

		return vpnConnectionOptionsBuilder_ec2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VpnTunnelOptionBuilder_ec2ItemProvider vpnTunnelOptionBuilder_ec2ItemProvider;

	/**
	 * This creates an adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.VpnTunnelOptionBuilder_ec2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVpnTunnelOptionBuilder_ec2Adapter() {
		if (vpnTunnelOptionBuilder_ec2ItemProvider == null) {
			vpnTunnelOptionBuilder_ec2ItemProvider = new VpnTunnelOptionBuilder_ec2ItemProvider(this);
		}

		return vpnTunnelOptionBuilder_ec2ItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (appBuilder_coreItemProvider != null)
			appBuilder_coreItemProvider.dispose();
		if (defaultStackSynthesizerBuilder_coreItemProvider != null)
			defaultStackSynthesizerBuilder_coreItemProvider.dispose();
		if (environmentBuilder_coreItemProvider != null)
			environmentBuilder_coreItemProvider.dispose();
		if (flowLogOptionsBuilder_ec2ItemProvider != null)
			flowLogOptionsBuilder_ec2ItemProvider.dispose();
		if (stackBuilder_coreItemProvider != null)
			stackBuilder_coreItemProvider.dispose();
		if (vpcBuilder_ec2ItemProvider != null)
			vpcBuilder_ec2ItemProvider.dispose();
		if (subnetBuilder_ec2ItemProvider != null)
			subnetBuilder_ec2ItemProvider.dispose();
		if (subnetSelectionBuilder_ec2ItemProvider != null)
			subnetSelectionBuilder_ec2ItemProvider.dispose();
		if (subnetConfigurationBuilder_ec2ItemProvider != null)
			subnetConfigurationBuilder_ec2ItemProvider.dispose();
		if (vpnConnectionOptionsBuilder_ec2ItemProvider != null)
			vpnConnectionOptionsBuilder_ec2ItemProvider.dispose();
		if (vpnTunnelOptionBuilder_ec2ItemProvider != null)
			vpnTunnelOptionBuilder_ec2ItemProvider.dispose();
	}

}
