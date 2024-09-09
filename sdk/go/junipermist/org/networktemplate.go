// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource managed the Org Network Templates (Switch templates).A network template is a predefined configuration that provides a consistent and reusable set of network settings for devices within an organization. It includes various parameters such as ip addressing, vlan configurations, routing protocols, security policies, and other network-specific settings. Network templates simplify the deployment and management of switches by ensuring consistent configurations across multiple devices and sites. They help enforce standardization, reduce human error, and streamline troubleshooting and maintenance tasks.
//
// ## Import
//
// Using `pulumi import`, import `mist_org_networktemplate` with:
//
// Org Network Template can be imported by specifying the org_id and the networktemplate_id
//
// ```sh
// $ pulumi import junipermist:org/networktemplate:Networktemplate networktemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Networktemplate struct {
	pulumi.CustomResourceState

	AclPolicies NetworktemplateAclPolicyArrayOutput `pulumi:"aclPolicies"`
	// ACL Tags to identify traffic source or destination. Key name is the tag name
	AclTags NetworktemplateAclTagsMapOutput `pulumi:"aclTags"`
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayOutput             `pulumi:"additionalConfigCmds"`
	DhcpSnooping         NetworktemplateDhcpSnoopingPtrOutput `pulumi:"dhcpSnooping"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayOutput `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayOutput            `pulumi:"dnsSuffixes"`
	ExtraRoutes NetworktemplateExtraRoutesMapOutput `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 NetworktemplateExtraRoutes6MapOutput `pulumi:"extraRoutes6"`
	// enable mistNac to use radsec
	MistNac NetworktemplateMistNacPtrOutput `pulumi:"mistNac"`
	Name    pulumi.StringOutput             `pulumi:"name"`
	// Property key is network name
	Networks NetworktemplateNetworksMapOutput `pulumi:"networks"`
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayOutput `pulumi:"ntpServers"`
	OrgId      pulumi.StringOutput      `pulumi:"orgId"`
	// Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
	// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
	PortMirroring NetworktemplatePortMirroringMapOutput `pulumi:"portMirroring"`
	PortUsages    NetworktemplatePortUsagesMapOutput    `pulumi:"portUsages"`
	// Junos Radius config
	RadiusConfig NetworktemplateRadiusConfigPtrOutput `pulumi:"radiusConfig"`
	RemoteSyslog NetworktemplateRemoteSyslogPtrOutput `pulumi:"remoteSyslog"`
	// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
	RemoveExistingConfigs pulumi.BoolOutput                  `pulumi:"removeExistingConfigs"`
	SnmpConfig            NetworktemplateSnmpConfigPtrOutput `pulumi:"snmpConfig"`
	// Switch template
	SwitchMatching NetworktemplateSwitchMatchingPtrOutput `pulumi:"switchMatching"`
	// Switch settings
	SwitchMgmt NetworktemplateSwitchMgmtPtrOutput `pulumi:"switchMgmt"`
	VrfConfig  NetworktemplateVrfConfigPtrOutput  `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances NetworktemplateVrfInstancesMapOutput `pulumi:"vrfInstances"`
}

// NewNetworktemplate registers a new resource with the given unique name, arguments, and options.
func NewNetworktemplate(ctx *pulumi.Context,
	name string, args *NetworktemplateArgs, opts ...pulumi.ResourceOption) (*Networktemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Networktemplate
	err := ctx.RegisterResource("junipermist:org/networktemplate:Networktemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworktemplate gets an existing Networktemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworktemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworktemplateState, opts ...pulumi.ResourceOption) (*Networktemplate, error) {
	var resource Networktemplate
	err := ctx.ReadResource("junipermist:org/networktemplate:Networktemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Networktemplate resources.
type networktemplateState struct {
	AclPolicies []NetworktemplateAclPolicy `pulumi:"aclPolicies"`
	// ACL Tags to identify traffic source or destination. Key name is the tag name
	AclTags map[string]NetworktemplateAclTags `pulumi:"aclTags"`
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds []string                     `pulumi:"additionalConfigCmds"`
	DhcpSnooping         *NetworktemplateDhcpSnooping `pulumi:"dhcpSnooping"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers []string `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes []string                              `pulumi:"dnsSuffixes"`
	ExtraRoutes map[string]NetworktemplateExtraRoutes `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 map[string]NetworktemplateExtraRoutes6 `pulumi:"extraRoutes6"`
	// enable mistNac to use radsec
	MistNac *NetworktemplateMistNac `pulumi:"mistNac"`
	Name    *string                 `pulumi:"name"`
	// Property key is network name
	Networks map[string]NetworktemplateNetworks `pulumi:"networks"`
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers []string `pulumi:"ntpServers"`
	OrgId      *string  `pulumi:"orgId"`
	// Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
	// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
	PortMirroring map[string]NetworktemplatePortMirroring `pulumi:"portMirroring"`
	PortUsages    map[string]NetworktemplatePortUsages    `pulumi:"portUsages"`
	// Junos Radius config
	RadiusConfig *NetworktemplateRadiusConfig `pulumi:"radiusConfig"`
	RemoteSyslog *NetworktemplateRemoteSyslog `pulumi:"remoteSyslog"`
	// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
	RemoveExistingConfigs *bool                      `pulumi:"removeExistingConfigs"`
	SnmpConfig            *NetworktemplateSnmpConfig `pulumi:"snmpConfig"`
	// Switch template
	SwitchMatching *NetworktemplateSwitchMatching `pulumi:"switchMatching"`
	// Switch settings
	SwitchMgmt *NetworktemplateSwitchMgmt `pulumi:"switchMgmt"`
	VrfConfig  *NetworktemplateVrfConfig  `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances map[string]NetworktemplateVrfInstances `pulumi:"vrfInstances"`
}

type NetworktemplateState struct {
	AclPolicies NetworktemplateAclPolicyArrayInput
	// ACL Tags to identify traffic source or destination. Key name is the tag name
	AclTags NetworktemplateAclTagsMapInput
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayInput
	DhcpSnooping         NetworktemplateDhcpSnoopingPtrInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayInput
	ExtraRoutes NetworktemplateExtraRoutesMapInput
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 NetworktemplateExtraRoutes6MapInput
	// enable mistNac to use radsec
	MistNac NetworktemplateMistNacPtrInput
	Name    pulumi.StringPtrInput
	// Property key is network name
	Networks NetworktemplateNetworksMapInput
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayInput
	OrgId      pulumi.StringPtrInput
	// Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
	// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
	PortMirroring NetworktemplatePortMirroringMapInput
	PortUsages    NetworktemplatePortUsagesMapInput
	// Junos Radius config
	RadiusConfig NetworktemplateRadiusConfigPtrInput
	RemoteSyslog NetworktemplateRemoteSyslogPtrInput
	// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
	RemoveExistingConfigs pulumi.BoolPtrInput
	SnmpConfig            NetworktemplateSnmpConfigPtrInput
	// Switch template
	SwitchMatching NetworktemplateSwitchMatchingPtrInput
	// Switch settings
	SwitchMgmt NetworktemplateSwitchMgmtPtrInput
	VrfConfig  NetworktemplateVrfConfigPtrInput
	// Property key is the network name
	VrfInstances NetworktemplateVrfInstancesMapInput
}

func (NetworktemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*networktemplateState)(nil)).Elem()
}

type networktemplateArgs struct {
	AclPolicies []NetworktemplateAclPolicy `pulumi:"aclPolicies"`
	// ACL Tags to identify traffic source or destination. Key name is the tag name
	AclTags map[string]NetworktemplateAclTags `pulumi:"aclTags"`
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds []string                     `pulumi:"additionalConfigCmds"`
	DhcpSnooping         *NetworktemplateDhcpSnooping `pulumi:"dhcpSnooping"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers []string `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes []string                              `pulumi:"dnsSuffixes"`
	ExtraRoutes map[string]NetworktemplateExtraRoutes `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 map[string]NetworktemplateExtraRoutes6 `pulumi:"extraRoutes6"`
	// enable mistNac to use radsec
	MistNac *NetworktemplateMistNac `pulumi:"mistNac"`
	Name    *string                 `pulumi:"name"`
	// Property key is network name
	Networks map[string]NetworktemplateNetworks `pulumi:"networks"`
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers []string `pulumi:"ntpServers"`
	OrgId      string   `pulumi:"orgId"`
	// Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
	// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
	PortMirroring map[string]NetworktemplatePortMirroring `pulumi:"portMirroring"`
	PortUsages    map[string]NetworktemplatePortUsages    `pulumi:"portUsages"`
	// Junos Radius config
	RadiusConfig *NetworktemplateRadiusConfig `pulumi:"radiusConfig"`
	RemoteSyslog *NetworktemplateRemoteSyslog `pulumi:"remoteSyslog"`
	// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
	RemoveExistingConfigs *bool                      `pulumi:"removeExistingConfigs"`
	SnmpConfig            *NetworktemplateSnmpConfig `pulumi:"snmpConfig"`
	// Switch template
	SwitchMatching *NetworktemplateSwitchMatching `pulumi:"switchMatching"`
	// Switch settings
	SwitchMgmt *NetworktemplateSwitchMgmt `pulumi:"switchMgmt"`
	VrfConfig  *NetworktemplateVrfConfig  `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances map[string]NetworktemplateVrfInstances `pulumi:"vrfInstances"`
}

// The set of arguments for constructing a Networktemplate resource.
type NetworktemplateArgs struct {
	AclPolicies NetworktemplateAclPolicyArrayInput
	// ACL Tags to identify traffic source or destination. Key name is the tag name
	AclTags NetworktemplateAclTagsMapInput
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayInput
	DhcpSnooping         NetworktemplateDhcpSnoopingPtrInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayInput
	ExtraRoutes NetworktemplateExtraRoutesMapInput
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 NetworktemplateExtraRoutes6MapInput
	// enable mistNac to use radsec
	MistNac NetworktemplateMistNacPtrInput
	Name    pulumi.StringPtrInput
	// Property key is network name
	Networks NetworktemplateNetworksMapInput
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayInput
	OrgId      pulumi.StringInput
	// Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
	// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
	PortMirroring NetworktemplatePortMirroringMapInput
	PortUsages    NetworktemplatePortUsagesMapInput
	// Junos Radius config
	RadiusConfig NetworktemplateRadiusConfigPtrInput
	RemoteSyslog NetworktemplateRemoteSyslogPtrInput
	// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
	RemoveExistingConfigs pulumi.BoolPtrInput
	SnmpConfig            NetworktemplateSnmpConfigPtrInput
	// Switch template
	SwitchMatching NetworktemplateSwitchMatchingPtrInput
	// Switch settings
	SwitchMgmt NetworktemplateSwitchMgmtPtrInput
	VrfConfig  NetworktemplateVrfConfigPtrInput
	// Property key is the network name
	VrfInstances NetworktemplateVrfInstancesMapInput
}

func (NetworktemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networktemplateArgs)(nil)).Elem()
}

type NetworktemplateInput interface {
	pulumi.Input

	ToNetworktemplateOutput() NetworktemplateOutput
	ToNetworktemplateOutputWithContext(ctx context.Context) NetworktemplateOutput
}

func (*Networktemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**Networktemplate)(nil)).Elem()
}

func (i *Networktemplate) ToNetworktemplateOutput() NetworktemplateOutput {
	return i.ToNetworktemplateOutputWithContext(context.Background())
}

func (i *Networktemplate) ToNetworktemplateOutputWithContext(ctx context.Context) NetworktemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworktemplateOutput)
}

// NetworktemplateArrayInput is an input type that accepts NetworktemplateArray and NetworktemplateArrayOutput values.
// You can construct a concrete instance of `NetworktemplateArrayInput` via:
//
//	NetworktemplateArray{ NetworktemplateArgs{...} }
type NetworktemplateArrayInput interface {
	pulumi.Input

	ToNetworktemplateArrayOutput() NetworktemplateArrayOutput
	ToNetworktemplateArrayOutputWithContext(context.Context) NetworktemplateArrayOutput
}

type NetworktemplateArray []NetworktemplateInput

func (NetworktemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Networktemplate)(nil)).Elem()
}

func (i NetworktemplateArray) ToNetworktemplateArrayOutput() NetworktemplateArrayOutput {
	return i.ToNetworktemplateArrayOutputWithContext(context.Background())
}

func (i NetworktemplateArray) ToNetworktemplateArrayOutputWithContext(ctx context.Context) NetworktemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworktemplateArrayOutput)
}

// NetworktemplateMapInput is an input type that accepts NetworktemplateMap and NetworktemplateMapOutput values.
// You can construct a concrete instance of `NetworktemplateMapInput` via:
//
//	NetworktemplateMap{ "key": NetworktemplateArgs{...} }
type NetworktemplateMapInput interface {
	pulumi.Input

	ToNetworktemplateMapOutput() NetworktemplateMapOutput
	ToNetworktemplateMapOutputWithContext(context.Context) NetworktemplateMapOutput
}

type NetworktemplateMap map[string]NetworktemplateInput

func (NetworktemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Networktemplate)(nil)).Elem()
}

func (i NetworktemplateMap) ToNetworktemplateMapOutput() NetworktemplateMapOutput {
	return i.ToNetworktemplateMapOutputWithContext(context.Background())
}

func (i NetworktemplateMap) ToNetworktemplateMapOutputWithContext(ctx context.Context) NetworktemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworktemplateMapOutput)
}

type NetworktemplateOutput struct{ *pulumi.OutputState }

func (NetworktemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Networktemplate)(nil)).Elem()
}

func (o NetworktemplateOutput) ToNetworktemplateOutput() NetworktemplateOutput {
	return o
}

func (o NetworktemplateOutput) ToNetworktemplateOutputWithContext(ctx context.Context) NetworktemplateOutput {
	return o
}

func (o NetworktemplateOutput) AclPolicies() NetworktemplateAclPolicyArrayOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateAclPolicyArrayOutput { return v.AclPolicies }).(NetworktemplateAclPolicyArrayOutput)
}

// ACL Tags to identify traffic source or destination. Key name is the tag name
func (o NetworktemplateOutput) AclTags() NetworktemplateAclTagsMapOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateAclTagsMapOutput { return v.AclTags }).(NetworktemplateAclTagsMapOutput)
}

// additional CLI commands to append to the generated Junos config **Note**: no check is done
func (o NetworktemplateOutput) AdditionalConfigCmds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Networktemplate) pulumi.StringArrayOutput { return v.AdditionalConfigCmds }).(pulumi.StringArrayOutput)
}

func (o NetworktemplateOutput) DhcpSnooping() NetworktemplateDhcpSnoopingPtrOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateDhcpSnoopingPtrOutput { return v.DhcpSnooping }).(NetworktemplateDhcpSnoopingPtrOutput)
}

// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
func (o NetworktemplateOutput) DnsServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Networktemplate) pulumi.StringArrayOutput { return v.DnsServers }).(pulumi.StringArrayOutput)
}

// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
func (o NetworktemplateOutput) DnsSuffixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Networktemplate) pulumi.StringArrayOutput { return v.DnsSuffixes }).(pulumi.StringArrayOutput)
}

func (o NetworktemplateOutput) ExtraRoutes() NetworktemplateExtraRoutesMapOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateExtraRoutesMapOutput { return v.ExtraRoutes }).(NetworktemplateExtraRoutesMapOutput)
}

// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
func (o NetworktemplateOutput) ExtraRoutes6() NetworktemplateExtraRoutes6MapOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateExtraRoutes6MapOutput { return v.ExtraRoutes6 }).(NetworktemplateExtraRoutes6MapOutput)
}

// enable mistNac to use radsec
func (o NetworktemplateOutput) MistNac() NetworktemplateMistNacPtrOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateMistNacPtrOutput { return v.MistNac }).(NetworktemplateMistNacPtrOutput)
}

func (o NetworktemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Networktemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Property key is network name
func (o NetworktemplateOutput) Networks() NetworktemplateNetworksMapOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateNetworksMapOutput { return v.Networks }).(NetworktemplateNetworksMapOutput)
}

// list of NTP servers specific to this device. By default, those in Site Settings will be used
func (o NetworktemplateOutput) NtpServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Networktemplate) pulumi.StringArrayOutput { return v.NtpServers }).(pulumi.StringArrayOutput)
}

func (o NetworktemplateOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Networktemplate) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Property key is the port mirroring instance name portMirroring can be added under device/site settings. It takes
// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
func (o NetworktemplateOutput) PortMirroring() NetworktemplatePortMirroringMapOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplatePortMirroringMapOutput { return v.PortMirroring }).(NetworktemplatePortMirroringMapOutput)
}

func (o NetworktemplateOutput) PortUsages() NetworktemplatePortUsagesMapOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplatePortUsagesMapOutput { return v.PortUsages }).(NetworktemplatePortUsagesMapOutput)
}

// Junos Radius config
func (o NetworktemplateOutput) RadiusConfig() NetworktemplateRadiusConfigPtrOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateRadiusConfigPtrOutput { return v.RadiusConfig }).(NetworktemplateRadiusConfigPtrOutput)
}

func (o NetworktemplateOutput) RemoteSyslog() NetworktemplateRemoteSyslogPtrOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateRemoteSyslogPtrOutput { return v.RemoteSyslog }).(NetworktemplateRemoteSyslogPtrOutput)
}

// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
func (o NetworktemplateOutput) RemoveExistingConfigs() pulumi.BoolOutput {
	return o.ApplyT(func(v *Networktemplate) pulumi.BoolOutput { return v.RemoveExistingConfigs }).(pulumi.BoolOutput)
}

func (o NetworktemplateOutput) SnmpConfig() NetworktemplateSnmpConfigPtrOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateSnmpConfigPtrOutput { return v.SnmpConfig }).(NetworktemplateSnmpConfigPtrOutput)
}

// Switch template
func (o NetworktemplateOutput) SwitchMatching() NetworktemplateSwitchMatchingPtrOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateSwitchMatchingPtrOutput { return v.SwitchMatching }).(NetworktemplateSwitchMatchingPtrOutput)
}

// Switch settings
func (o NetworktemplateOutput) SwitchMgmt() NetworktemplateSwitchMgmtPtrOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateSwitchMgmtPtrOutput { return v.SwitchMgmt }).(NetworktemplateSwitchMgmtPtrOutput)
}

func (o NetworktemplateOutput) VrfConfig() NetworktemplateVrfConfigPtrOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateVrfConfigPtrOutput { return v.VrfConfig }).(NetworktemplateVrfConfigPtrOutput)
}

// Property key is the network name
func (o NetworktemplateOutput) VrfInstances() NetworktemplateVrfInstancesMapOutput {
	return o.ApplyT(func(v *Networktemplate) NetworktemplateVrfInstancesMapOutput { return v.VrfInstances }).(NetworktemplateVrfInstancesMapOutput)
}

type NetworktemplateArrayOutput struct{ *pulumi.OutputState }

func (NetworktemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Networktemplate)(nil)).Elem()
}

func (o NetworktemplateArrayOutput) ToNetworktemplateArrayOutput() NetworktemplateArrayOutput {
	return o
}

func (o NetworktemplateArrayOutput) ToNetworktemplateArrayOutputWithContext(ctx context.Context) NetworktemplateArrayOutput {
	return o
}

func (o NetworktemplateArrayOutput) Index(i pulumi.IntInput) NetworktemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Networktemplate {
		return vs[0].([]*Networktemplate)[vs[1].(int)]
	}).(NetworktemplateOutput)
}

type NetworktemplateMapOutput struct{ *pulumi.OutputState }

func (NetworktemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Networktemplate)(nil)).Elem()
}

func (o NetworktemplateMapOutput) ToNetworktemplateMapOutput() NetworktemplateMapOutput {
	return o
}

func (o NetworktemplateMapOutput) ToNetworktemplateMapOutputWithContext(ctx context.Context) NetworktemplateMapOutput {
	return o
}

func (o NetworktemplateMapOutput) MapIndex(k pulumi.StringInput) NetworktemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Networktemplate {
		return vs[0].(map[string]*Networktemplate)[vs[1].(string)]
	}).(NetworktemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworktemplateInput)(nil)).Elem(), &Networktemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworktemplateArrayInput)(nil)).Elem(), NetworktemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworktemplateMapInput)(nil)).Elem(), NetworktemplateMap{})
	pulumi.RegisterOutputType(NetworktemplateOutput{})
	pulumi.RegisterOutputType(NetworktemplateArrayOutput{})
	pulumi.RegisterOutputType(NetworktemplateMapOutput{})
}
