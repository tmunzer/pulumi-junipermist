// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages WAN Assurance Services (Applications).The Services are used in the `servicePolicies` from the Gateway configuration and Gateway templates, or can be used in the Org Service Policies (`orgServicepolicy` resource).
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import junipermist:org/service:Service Using terraform import, import `mist_org_service` using the `import` command:
 * ```
 *
 * Gateway cluster can be imported by specifying the org_id and the service_id
 *
 * ```sh
 * $ pulumi import junipermist:org/service:Service service_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState, opts?: pulumi.CustomResourceOptions): Service {
        return new Service(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/service:Service';

    /**
     * Returns true if the given object is an instance of Service.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Service {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Service.__pulumiType;
    }

    /**
     * if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
     */
    public readonly addresses!: pulumi.Output<string[]>;
    /**
     * when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
     */
    public readonly appCategories!: pulumi.Output<string[]>;
    /**
     * when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
     */
    public readonly appSubcategories!: pulumi.Output<string[]>;
    /**
     * when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
     * /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
     */
    public readonly apps!: pulumi.Output<string[]>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly dscp!: pulumi.Output<string | undefined>;
    /**
     * enum: `nonRevertable`, `none`, `revertable`
     */
    public readonly failoverPolicy!: pulumi.Output<string>;
    /**
     * if `type`==`custom`, web filtering
     */
    public readonly hostnames!: pulumi.Output<string[]>;
    public readonly maxJitter!: pulumi.Output<string | undefined>;
    public readonly maxLatency!: pulumi.Output<string | undefined>;
    public readonly maxLoss!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;
    /**
     * whether to enable measure SLE
     */
    public readonly sleEnabled!: pulumi.Output<boolean>;
    /**
     * when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
     */
    public readonly specs!: pulumi.Output<outputs.org.ServiceSpec[] | undefined>;
    public readonly ssrRelaxedTcpStateEnforcement!: pulumi.Output<boolean>;
    /**
     * when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
     */
    public readonly trafficClass!: pulumi.Output<string>;
    /**
     * values from `/api/v1/consts/traffic_types`
     */
    public readonly trafficType!: pulumi.Output<string>;
    /**
     * enum: `appCategories`, `apps`, `custom`, `urls`
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * when `type`==`urls`, no need for spec as URL can encode the ports being used
     */
    public readonly urls!: pulumi.Output<string[]>;

    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceArgs | ServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceState | undefined;
            resourceInputs["addresses"] = state ? state.addresses : undefined;
            resourceInputs["appCategories"] = state ? state.appCategories : undefined;
            resourceInputs["appSubcategories"] = state ? state.appSubcategories : undefined;
            resourceInputs["apps"] = state ? state.apps : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dscp"] = state ? state.dscp : undefined;
            resourceInputs["failoverPolicy"] = state ? state.failoverPolicy : undefined;
            resourceInputs["hostnames"] = state ? state.hostnames : undefined;
            resourceInputs["maxJitter"] = state ? state.maxJitter : undefined;
            resourceInputs["maxLatency"] = state ? state.maxLatency : undefined;
            resourceInputs["maxLoss"] = state ? state.maxLoss : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["sleEnabled"] = state ? state.sleEnabled : undefined;
            resourceInputs["specs"] = state ? state.specs : undefined;
            resourceInputs["ssrRelaxedTcpStateEnforcement"] = state ? state.ssrRelaxedTcpStateEnforcement : undefined;
            resourceInputs["trafficClass"] = state ? state.trafficClass : undefined;
            resourceInputs["trafficType"] = state ? state.trafficType : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["urls"] = state ? state.urls : undefined;
        } else {
            const args = argsOrState as ServiceArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["addresses"] = args ? args.addresses : undefined;
            resourceInputs["appCategories"] = args ? args.appCategories : undefined;
            resourceInputs["appSubcategories"] = args ? args.appSubcategories : undefined;
            resourceInputs["apps"] = args ? args.apps : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dscp"] = args ? args.dscp : undefined;
            resourceInputs["failoverPolicy"] = args ? args.failoverPolicy : undefined;
            resourceInputs["hostnames"] = args ? args.hostnames : undefined;
            resourceInputs["maxJitter"] = args ? args.maxJitter : undefined;
            resourceInputs["maxLatency"] = args ? args.maxLatency : undefined;
            resourceInputs["maxLoss"] = args ? args.maxLoss : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["sleEnabled"] = args ? args.sleEnabled : undefined;
            resourceInputs["specs"] = args ? args.specs : undefined;
            resourceInputs["ssrRelaxedTcpStateEnforcement"] = args ? args.ssrRelaxedTcpStateEnforcement : undefined;
            resourceInputs["trafficClass"] = args ? args.trafficClass : undefined;
            resourceInputs["trafficType"] = args ? args.trafficType : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["urls"] = args ? args.urls : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Service.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Service resources.
 */
export interface ServiceState {
    /**
     * if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
     */
    addresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
     */
    appCategories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
     */
    appSubcategories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
     * /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
     */
    apps?: pulumi.Input<pulumi.Input<string>[]>;
    description?: pulumi.Input<string>;
    dscp?: pulumi.Input<string>;
    /**
     * enum: `nonRevertable`, `none`, `revertable`
     */
    failoverPolicy?: pulumi.Input<string>;
    /**
     * if `type`==`custom`, web filtering
     */
    hostnames?: pulumi.Input<pulumi.Input<string>[]>;
    maxJitter?: pulumi.Input<string>;
    maxLatency?: pulumi.Input<string>;
    maxLoss?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * whether to enable measure SLE
     */
    sleEnabled?: pulumi.Input<boolean>;
    /**
     * when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
     */
    specs?: pulumi.Input<pulumi.Input<inputs.org.ServiceSpec>[]>;
    ssrRelaxedTcpStateEnforcement?: pulumi.Input<boolean>;
    /**
     * when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
     */
    trafficClass?: pulumi.Input<string>;
    /**
     * values from `/api/v1/consts/traffic_types`
     */
    trafficType?: pulumi.Input<string>;
    /**
     * enum: `appCategories`, `apps`, `custom`, `urls`
     */
    type?: pulumi.Input<string>;
    /**
     * when `type`==`urls`, no need for spec as URL can encode the ports being used
     */
    urls?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    /**
     * if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
     */
    addresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
     */
    appCategories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
     */
    appSubcategories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
     * /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
     */
    apps?: pulumi.Input<pulumi.Input<string>[]>;
    description?: pulumi.Input<string>;
    dscp?: pulumi.Input<string>;
    /**
     * enum: `nonRevertable`, `none`, `revertable`
     */
    failoverPolicy?: pulumi.Input<string>;
    /**
     * if `type`==`custom`, web filtering
     */
    hostnames?: pulumi.Input<pulumi.Input<string>[]>;
    maxJitter?: pulumi.Input<string>;
    maxLatency?: pulumi.Input<string>;
    maxLoss?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    /**
     * whether to enable measure SLE
     */
    sleEnabled?: pulumi.Input<boolean>;
    /**
     * when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
     */
    specs?: pulumi.Input<pulumi.Input<inputs.org.ServiceSpec>[]>;
    ssrRelaxedTcpStateEnforcement?: pulumi.Input<boolean>;
    /**
     * when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
     */
    trafficClass?: pulumi.Input<string>;
    /**
     * values from `/api/v1/consts/traffic_types`
     */
    trafficType?: pulumi.Input<string>;
    /**
     * enum: `appCategories`, `apps`, `custom`, `urls`
     */
    type?: pulumi.Input<string>;
    /**
     * when `type`==`urls`, no need for spec as URL can encode the ports being used
     */
    urls?: pulumi.Input<pulumi.Input<string>[]>;
}
