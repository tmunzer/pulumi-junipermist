// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package site

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of WAN Assurance Psks.The Psks are used in the `servicePolicies` from the Gateway configuration and Gateway templates
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/site"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := site.GetPsks(ctx, &site.GetPsksArgs{
//				SiteId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
//				Role:   pulumi.StringRef("vip"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetPsks(ctx *pulumi.Context, args *GetPsksArgs, opts ...pulumi.InvokeOption) (*GetPsksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPsksResult
	err := ctx.Invoke("junipermist:site/getPsks:getPsks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPsks.
type GetPsksArgs struct {
	Limit  *int    `pulumi:"limit"`
	Name   *string `pulumi:"name"`
	Page   *int    `pulumi:"page"`
	Role   *string `pulumi:"role"`
	SiteId string  `pulumi:"siteId"`
	Ssid   *string `pulumi:"ssid"`
}

// A collection of values returned by getPsks.
type GetPsksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string           `pulumi:"id"`
	Limit    *int             `pulumi:"limit"`
	Name     *string          `pulumi:"name"`
	Page     *int             `pulumi:"page"`
	Role     *string          `pulumi:"role"`
	SiteId   string           `pulumi:"siteId"`
	SitePsks []GetPsksSitePsk `pulumi:"sitePsks"`
	Ssid     *string          `pulumi:"ssid"`
}

func GetPsksOutput(ctx *pulumi.Context, args GetPsksOutputArgs, opts ...pulumi.InvokeOption) GetPsksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPsksResult, error) {
			args := v.(GetPsksArgs)
			r, err := GetPsks(ctx, &args, opts...)
			var s GetPsksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPsksResultOutput)
}

// A collection of arguments for invoking getPsks.
type GetPsksOutputArgs struct {
	Limit  pulumi.IntPtrInput    `pulumi:"limit"`
	Name   pulumi.StringPtrInput `pulumi:"name"`
	Page   pulumi.IntPtrInput    `pulumi:"page"`
	Role   pulumi.StringPtrInput `pulumi:"role"`
	SiteId pulumi.StringInput    `pulumi:"siteId"`
	Ssid   pulumi.StringPtrInput `pulumi:"ssid"`
}

func (GetPsksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPsksArgs)(nil)).Elem()
}

// A collection of values returned by getPsks.
type GetPsksResultOutput struct{ *pulumi.OutputState }

func (GetPsksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPsksResult)(nil)).Elem()
}

func (o GetPsksResultOutput) ToGetPsksResultOutput() GetPsksResultOutput {
	return o
}

func (o GetPsksResultOutput) ToGetPsksResultOutputWithContext(ctx context.Context) GetPsksResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPsksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPsksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPsksResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetPsksResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

func (o GetPsksResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPsksResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetPsksResultOutput) Page() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetPsksResult) *int { return v.Page }).(pulumi.IntPtrOutput)
}

func (o GetPsksResultOutput) Role() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPsksResult) *string { return v.Role }).(pulumi.StringPtrOutput)
}

func (o GetPsksResultOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPsksResult) string { return v.SiteId }).(pulumi.StringOutput)
}

func (o GetPsksResultOutput) SitePsks() GetPsksSitePskArrayOutput {
	return o.ApplyT(func(v GetPsksResult) []GetPsksSitePsk { return v.SitePsks }).(GetPsksSitePskArrayOutput)
}

func (o GetPsksResultOutput) Ssid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPsksResult) *string { return v.Ssid }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPsksResultOutput{})
}
