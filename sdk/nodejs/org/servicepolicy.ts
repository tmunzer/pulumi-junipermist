// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages WAN Assurance Service Policies (Application Policiess).The Service Policies are used in the `servicepolicyPolicies` from the Gateway configuration and Gateway templates.They can be used to manage common policies betweeen multiples configurations
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_org_servicepolicy` with:
 *
 * Org Service Policy can be imported by specifying the org_id and the servicepolicy_id
 *
 * ```sh
 * $ pulumi import junipermist:org/servicepolicy:Servicepolicy servicepolicy_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Servicepolicy extends pulumi.CustomResource {
    /**
     * Get an existing Servicepolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicepolicyState, opts?: pulumi.CustomResourceOptions): Servicepolicy {
        return new Servicepolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/servicepolicy:Servicepolicy';

    /**
     * Returns true if the given object is an instance of Servicepolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Servicepolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Servicepolicy.__pulumiType;
    }

    /**
     * enum: `allow`, `deny`
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * For SRX Only
     */
    public readonly appqoe!: pulumi.Output<outputs.org.ServicepolicyAppqoe | undefined>;
    public readonly ewfs!: pulumi.Output<outputs.org.ServicepolicyEwf[] | undefined>;
    public readonly idp!: pulumi.Output<outputs.org.ServicepolicyIdp | undefined>;
    /**
     * access within the same VRF
     */
    public readonly localRouting!: pulumi.Output<boolean>;
    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * by default, we derive all paths available and use them
     * optionally, you can customize by using `pathPreference`
     */
    public readonly pathPreference!: pulumi.Output<string | undefined>;
    public readonly services!: pulumi.Output<string[] | undefined>;
    public readonly tenants!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Servicepolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServicepolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServicepolicyArgs | ServicepolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServicepolicyState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["appqoe"] = state ? state.appqoe : undefined;
            resourceInputs["ewfs"] = state ? state.ewfs : undefined;
            resourceInputs["idp"] = state ? state.idp : undefined;
            resourceInputs["localRouting"] = state ? state.localRouting : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["pathPreference"] = state ? state.pathPreference : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["tenants"] = state ? state.tenants : undefined;
        } else {
            const args = argsOrState as ServicepolicyArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["appqoe"] = args ? args.appqoe : undefined;
            resourceInputs["ewfs"] = args ? args.ewfs : undefined;
            resourceInputs["idp"] = args ? args.idp : undefined;
            resourceInputs["localRouting"] = args ? args.localRouting : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["pathPreference"] = args ? args.pathPreference : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["tenants"] = args ? args.tenants : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Servicepolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Servicepolicy resources.
 */
export interface ServicepolicyState {
    /**
     * enum: `allow`, `deny`
     */
    action?: pulumi.Input<string>;
    /**
     * For SRX Only
     */
    appqoe?: pulumi.Input<inputs.org.ServicepolicyAppqoe>;
    ewfs?: pulumi.Input<pulumi.Input<inputs.org.ServicepolicyEwf>[]>;
    idp?: pulumi.Input<inputs.org.ServicepolicyIdp>;
    /**
     * access within the same VRF
     */
    localRouting?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * by default, we derive all paths available and use them
     * optionally, you can customize by using `pathPreference`
     */
    pathPreference?: pulumi.Input<string>;
    services?: pulumi.Input<pulumi.Input<string>[]>;
    tenants?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Servicepolicy resource.
 */
export interface ServicepolicyArgs {
    /**
     * enum: `allow`, `deny`
     */
    action?: pulumi.Input<string>;
    /**
     * For SRX Only
     */
    appqoe?: pulumi.Input<inputs.org.ServicepolicyAppqoe>;
    ewfs?: pulumi.Input<pulumi.Input<inputs.org.ServicepolicyEwf>[]>;
    idp?: pulumi.Input<inputs.org.ServicepolicyIdp>;
    /**
     * access within the same VRF
     */
    localRouting?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * by default, we derive all paths available and use them
     * optionally, you can customize by using `pathPreference`
     */
    pathPreference?: pulumi.Input<string>;
    services?: pulumi.Input<pulumi.Input<string>[]>;
    tenants?: pulumi.Input<pulumi.Input<string>[]>;
}
