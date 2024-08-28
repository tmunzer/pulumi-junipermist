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

// This resource manages NAC Tags (Auth Policy Labels).The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/org"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := org.NewNactag(ctx, "tag_one", &org.NactagArgs{
//				Name:  pulumi.String("tag_one"),
//				Type:  pulumi.String("match"),
//				Match: pulumi.String("client_mac"),
//				OrgId: pulumi.Any(terraformTest.Id),
//				Values: pulumi.StringArray{
//					pulumi.String("5c5b35*"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import junipermist:org/nactag:Nactag Using terraform import, import `mist_org_nactag` using the `import` command:
// ```
//
// Gateway cluster can be imported by specifying the org_id and the nactag_id
//
// ```sh
// $ pulumi import junipermist:org/nactag:Nactag nactag_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Nactag struct {
	pulumi.CustomResourceState

	// can be set to true to allow the override by usermac result
	AllowUsermacOverride pulumi.BoolOutput `pulumi:"allowUsermacOverride"`
	// if `type`==`egressVlanNames`, list of egress vlans to return
	EgressVlanNames pulumi.StringArrayOutput `pulumi:"egressVlanNames"`
	// if `type`==`gbpTag`
	GbpTag pulumi.IntPtrOutput `pulumi:"gbpTag"`
	// if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
	// `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
	Match pulumi.StringPtrOutput `pulumi:"match"`
	// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
	// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
	// set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
	MatchAll pulumi.BoolOutput   `pulumi:"matchAll"`
	Name     pulumi.StringOutput `pulumi:"name"`
	OrgId    pulumi.StringOutput `pulumi:"orgId"`
	// if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
	// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
	// that it is allowed to have more than one radiusAttrs in the result of a given rule.
	RadiusAttrs pulumi.StringArrayOutput `pulumi:"radiusAttrs"`
	// if `type`==`radiusGroup`
	RadiusGroup pulumi.StringPtrOutput `pulumi:"radiusGroup"`
	// if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
	// "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
	// not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
	RadiusVendorAttrs pulumi.StringArrayOutput `pulumi:"radiusVendorAttrs"`
	// if `type`==`session_timeout, in seconds
	SessionTimeout pulumi.IntPtrOutput `pulumi:"sessionTimeout"`
	// enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
	Type pulumi.StringOutput `pulumi:"type"`
	// if `type`==`match`
	Values pulumi.StringArrayOutput `pulumi:"values"`
	// if `type`==`vlan`
	Vlan pulumi.StringPtrOutput `pulumi:"vlan"`
}

// NewNactag registers a new resource with the given unique name, arguments, and options.
func NewNactag(ctx *pulumi.Context,
	name string, args *NactagArgs, opts ...pulumi.ResourceOption) (*Nactag, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Nactag
	err := ctx.RegisterResource("junipermist:org/nactag:Nactag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNactag gets an existing Nactag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNactag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NactagState, opts ...pulumi.ResourceOption) (*Nactag, error) {
	var resource Nactag
	err := ctx.ReadResource("junipermist:org/nactag:Nactag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Nactag resources.
type nactagState struct {
	// can be set to true to allow the override by usermac result
	AllowUsermacOverride *bool `pulumi:"allowUsermacOverride"`
	// if `type`==`egressVlanNames`, list of egress vlans to return
	EgressVlanNames []string `pulumi:"egressVlanNames"`
	// if `type`==`gbpTag`
	GbpTag *int `pulumi:"gbpTag"`
	// if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
	// `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
	Match *string `pulumi:"match"`
	// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
	// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
	// set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
	MatchAll *bool   `pulumi:"matchAll"`
	Name     *string `pulumi:"name"`
	OrgId    *string `pulumi:"orgId"`
	// if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
	// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
	// that it is allowed to have more than one radiusAttrs in the result of a given rule.
	RadiusAttrs []string `pulumi:"radiusAttrs"`
	// if `type`==`radiusGroup`
	RadiusGroup *string `pulumi:"radiusGroup"`
	// if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
	// "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
	// not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
	RadiusVendorAttrs []string `pulumi:"radiusVendorAttrs"`
	// if `type`==`session_timeout, in seconds
	SessionTimeout *int `pulumi:"sessionTimeout"`
	// enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
	Type *string `pulumi:"type"`
	// if `type`==`match`
	Values []string `pulumi:"values"`
	// if `type`==`vlan`
	Vlan *string `pulumi:"vlan"`
}

type NactagState struct {
	// can be set to true to allow the override by usermac result
	AllowUsermacOverride pulumi.BoolPtrInput
	// if `type`==`egressVlanNames`, list of egress vlans to return
	EgressVlanNames pulumi.StringArrayInput
	// if `type`==`gbpTag`
	GbpTag pulumi.IntPtrInput
	// if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
	// `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
	Match pulumi.StringPtrInput
	// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
	// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
	// set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
	MatchAll pulumi.BoolPtrInput
	Name     pulumi.StringPtrInput
	OrgId    pulumi.StringPtrInput
	// if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
	// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
	// that it is allowed to have more than one radiusAttrs in the result of a given rule.
	RadiusAttrs pulumi.StringArrayInput
	// if `type`==`radiusGroup`
	RadiusGroup pulumi.StringPtrInput
	// if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
	// "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
	// not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
	RadiusVendorAttrs pulumi.StringArrayInput
	// if `type`==`session_timeout, in seconds
	SessionTimeout pulumi.IntPtrInput
	// enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
	Type pulumi.StringPtrInput
	// if `type`==`match`
	Values pulumi.StringArrayInput
	// if `type`==`vlan`
	Vlan pulumi.StringPtrInput
}

func (NactagState) ElementType() reflect.Type {
	return reflect.TypeOf((*nactagState)(nil)).Elem()
}

type nactagArgs struct {
	// can be set to true to allow the override by usermac result
	AllowUsermacOverride *bool `pulumi:"allowUsermacOverride"`
	// if `type`==`egressVlanNames`, list of egress vlans to return
	EgressVlanNames []string `pulumi:"egressVlanNames"`
	// if `type`==`gbpTag`
	GbpTag *int `pulumi:"gbpTag"`
	// if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
	// `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
	Match *string `pulumi:"match"`
	// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
	// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
	// set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
	MatchAll *bool   `pulumi:"matchAll"`
	Name     *string `pulumi:"name"`
	OrgId    string  `pulumi:"orgId"`
	// if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
	// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
	// that it is allowed to have more than one radiusAttrs in the result of a given rule.
	RadiusAttrs []string `pulumi:"radiusAttrs"`
	// if `type`==`radiusGroup`
	RadiusGroup *string `pulumi:"radiusGroup"`
	// if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
	// "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
	// not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
	RadiusVendorAttrs []string `pulumi:"radiusVendorAttrs"`
	// if `type`==`session_timeout, in seconds
	SessionTimeout *int `pulumi:"sessionTimeout"`
	// enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
	Type string `pulumi:"type"`
	// if `type`==`match`
	Values []string `pulumi:"values"`
	// if `type`==`vlan`
	Vlan *string `pulumi:"vlan"`
}

// The set of arguments for constructing a Nactag resource.
type NactagArgs struct {
	// can be set to true to allow the override by usermac result
	AllowUsermacOverride pulumi.BoolPtrInput
	// if `type`==`egressVlanNames`, list of egress vlans to return
	EgressVlanNames pulumi.StringArrayInput
	// if `type`==`gbpTag`
	GbpTag pulumi.IntPtrInput
	// if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
	// `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
	Match pulumi.StringPtrInput
	// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
	// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
	// set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
	MatchAll pulumi.BoolPtrInput
	Name     pulumi.StringPtrInput
	OrgId    pulumi.StringInput
	// if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
	// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
	// that it is allowed to have more than one radiusAttrs in the result of a given rule.
	RadiusAttrs pulumi.StringArrayInput
	// if `type`==`radiusGroup`
	RadiusGroup pulumi.StringPtrInput
	// if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
	// "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
	// not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
	RadiusVendorAttrs pulumi.StringArrayInput
	// if `type`==`session_timeout, in seconds
	SessionTimeout pulumi.IntPtrInput
	// enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
	Type pulumi.StringInput
	// if `type`==`match`
	Values pulumi.StringArrayInput
	// if `type`==`vlan`
	Vlan pulumi.StringPtrInput
}

func (NactagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nactagArgs)(nil)).Elem()
}

type NactagInput interface {
	pulumi.Input

	ToNactagOutput() NactagOutput
	ToNactagOutputWithContext(ctx context.Context) NactagOutput
}

func (*Nactag) ElementType() reflect.Type {
	return reflect.TypeOf((**Nactag)(nil)).Elem()
}

func (i *Nactag) ToNactagOutput() NactagOutput {
	return i.ToNactagOutputWithContext(context.Background())
}

func (i *Nactag) ToNactagOutputWithContext(ctx context.Context) NactagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NactagOutput)
}

// NactagArrayInput is an input type that accepts NactagArray and NactagArrayOutput values.
// You can construct a concrete instance of `NactagArrayInput` via:
//
//	NactagArray{ NactagArgs{...} }
type NactagArrayInput interface {
	pulumi.Input

	ToNactagArrayOutput() NactagArrayOutput
	ToNactagArrayOutputWithContext(context.Context) NactagArrayOutput
}

type NactagArray []NactagInput

func (NactagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Nactag)(nil)).Elem()
}

func (i NactagArray) ToNactagArrayOutput() NactagArrayOutput {
	return i.ToNactagArrayOutputWithContext(context.Background())
}

func (i NactagArray) ToNactagArrayOutputWithContext(ctx context.Context) NactagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NactagArrayOutput)
}

// NactagMapInput is an input type that accepts NactagMap and NactagMapOutput values.
// You can construct a concrete instance of `NactagMapInput` via:
//
//	NactagMap{ "key": NactagArgs{...} }
type NactagMapInput interface {
	pulumi.Input

	ToNactagMapOutput() NactagMapOutput
	ToNactagMapOutputWithContext(context.Context) NactagMapOutput
}

type NactagMap map[string]NactagInput

func (NactagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Nactag)(nil)).Elem()
}

func (i NactagMap) ToNactagMapOutput() NactagMapOutput {
	return i.ToNactagMapOutputWithContext(context.Background())
}

func (i NactagMap) ToNactagMapOutputWithContext(ctx context.Context) NactagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NactagMapOutput)
}

type NactagOutput struct{ *pulumi.OutputState }

func (NactagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Nactag)(nil)).Elem()
}

func (o NactagOutput) ToNactagOutput() NactagOutput {
	return o
}

func (o NactagOutput) ToNactagOutputWithContext(ctx context.Context) NactagOutput {
	return o
}

// can be set to true to allow the override by usermac result
func (o NactagOutput) AllowUsermacOverride() pulumi.BoolOutput {
	return o.ApplyT(func(v *Nactag) pulumi.BoolOutput { return v.AllowUsermacOverride }).(pulumi.BoolOutput)
}

// if `type`==`egressVlanNames`, list of egress vlans to return
func (o NactagOutput) EgressVlanNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringArrayOutput { return v.EgressVlanNames }).(pulumi.StringArrayOutput)
}

// if `type`==`gbpTag`
func (o NactagOutput) GbpTag() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Nactag) pulumi.IntPtrOutput { return v.GbpTag }).(pulumi.IntPtrOutput)
}

// if `type`==`match`. enum: `certCn`, `certIssuer`, `certSan`, `certSerial`, `certSub`, `clientMac`, `idpRole`,
// `mdmStatus`, `radiusGroup`, `realm`, `ssid`, `userName`, `usermacLabel`
func (o NactagOutput) Match() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringPtrOutput { return v.Match }).(pulumi.StringPtrOutput)
}

// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
// set this field to `true` only if the `match`==`idpRole` or `match`==`usermacLabel`'
func (o NactagOutput) MatchAll() pulumi.BoolOutput {
	return o.ApplyT(func(v *Nactag) pulumi.BoolOutput { return v.MatchAll }).(pulumi.BoolOutput)
}

func (o NactagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o NactagOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// if `type`==`radiusAttrs`, user can specify a list of one or more standard attributes in the field "radiusAttrs". It is
// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
// that it is allowed to have more than one radiusAttrs in the result of a given rule.
func (o NactagOutput) RadiusAttrs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringArrayOutput { return v.RadiusAttrs }).(pulumi.StringArrayOutput)
}

// if `type`==`radiusGroup`
func (o NactagOutput) RadiusGroup() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringPtrOutput { return v.RadiusGroup }).(pulumi.StringPtrOutput)
}

// if `type`==`radiusVendorAttrs`, user can specify a list of one or more vendor-specific attributes in the field
// "radiusVendorAttrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
// not work as expected. Note that it is allowed to have more than one radiusVendorAttrs in the result of a given rule.
func (o NactagOutput) RadiusVendorAttrs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringArrayOutput { return v.RadiusVendorAttrs }).(pulumi.StringArrayOutput)
}

// if `type`==`session_timeout, in seconds
func (o NactagOutput) SessionTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Nactag) pulumi.IntPtrOutput { return v.SessionTimeout }).(pulumi.IntPtrOutput)
}

// enum: `egressVlanNames`, `gbpTag`, `match`, `radiusAttrs`, `radiusGroup`, `radiusVendorAttrs`, `sessionTimeout`, `vlan`
func (o NactagOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// if `type`==`match`
func (o NactagOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringArrayOutput { return v.Values }).(pulumi.StringArrayOutput)
}

// if `type`==`vlan`
func (o NactagOutput) Vlan() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Nactag) pulumi.StringPtrOutput { return v.Vlan }).(pulumi.StringPtrOutput)
}

type NactagArrayOutput struct{ *pulumi.OutputState }

func (NactagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Nactag)(nil)).Elem()
}

func (o NactagArrayOutput) ToNactagArrayOutput() NactagArrayOutput {
	return o
}

func (o NactagArrayOutput) ToNactagArrayOutputWithContext(ctx context.Context) NactagArrayOutput {
	return o
}

func (o NactagArrayOutput) Index(i pulumi.IntInput) NactagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Nactag {
		return vs[0].([]*Nactag)[vs[1].(int)]
	}).(NactagOutput)
}

type NactagMapOutput struct{ *pulumi.OutputState }

func (NactagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Nactag)(nil)).Elem()
}

func (o NactagMapOutput) ToNactagMapOutput() NactagMapOutput {
	return o
}

func (o NactagMapOutput) ToNactagMapOutputWithContext(ctx context.Context) NactagMapOutput {
	return o
}

func (o NactagMapOutput) MapIndex(k pulumi.StringInput) NactagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Nactag {
		return vs[0].(map[string]*Nactag)[vs[1].(string)]
	}).(NactagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NactagInput)(nil)).Elem(), &Nactag{})
	pulumi.RegisterInputType(reflect.TypeOf((*NactagArrayInput)(nil)).Elem(), NactagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NactagMapInput)(nil)).Elem(), NactagMap{})
	pulumi.RegisterOutputType(NactagOutput{})
	pulumi.RegisterOutputType(NactagArrayOutput{})
	pulumi.RegisterOutputType(NactagMapOutput{})
}
