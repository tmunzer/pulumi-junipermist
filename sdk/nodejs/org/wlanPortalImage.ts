// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource is used to upload a WLAN Captive Web Portal background image.The WLAN object contains all the required configuration to broadcast an SSID (Authentication, VLAN, ...)
 */
export class WlanPortalImage extends pulumi.CustomResource {
    /**
     * Get an existing WlanPortalImage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WlanPortalImageState, opts?: pulumi.CustomResourceOptions): WlanPortalImage {
        return new WlanPortalImage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/wlanPortalImage:WlanPortalImage';

    /**
     * Returns true if the given object is an instance of WlanPortalImage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WlanPortalImage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WlanPortalImage.__pulumiType;
    }

    /**
     * binary file
     */
    public readonly file!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string | undefined>;
    public readonly wlanId!: pulumi.Output<string | undefined>;

    /**
     * Create a WlanPortalImage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WlanPortalImageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WlanPortalImageArgs | WlanPortalImageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WlanPortalImageState | undefined;
            resourceInputs["file"] = state ? state.file : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["wlanId"] = state ? state.wlanId : undefined;
        } else {
            const args = argsOrState as WlanPortalImageArgs | undefined;
            if ((!args || args.file === undefined) && !opts.urn) {
                throw new Error("Missing required property 'file'");
            }
            resourceInputs["file"] = args ? args.file : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["wlanId"] = args ? args.wlanId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WlanPortalImage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WlanPortalImage resources.
 */
export interface WlanPortalImageState {
    /**
     * binary file
     */
    file?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    wlanId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WlanPortalImage resource.
 */
export interface WlanPortalImageArgs {
    /**
     * binary file
     */
    file: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    wlanId?: pulumi.Input<string>;
}
