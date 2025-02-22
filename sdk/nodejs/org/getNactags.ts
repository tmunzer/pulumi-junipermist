// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of NAC Tags (Auth Policy Labels).The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const nactags = junipermist.org.getNactags({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getNactags(args: GetNactagsArgs, opts?: pulumi.InvokeOptions): Promise<GetNactagsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getNactags:getNactags", {
        "limit": args.limit,
        "match": args.match,
        "name": args.name,
        "orgId": args.orgId,
        "page": args.page,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getNactags.
 */
export interface GetNactagsArgs {
    limit?: number;
    match?: string;
    name?: string;
    orgId: string;
    page?: number;
    type?: string;
}

/**
 * A collection of values returned by getNactags.
 */
export interface GetNactagsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly limit?: number;
    readonly match?: string;
    readonly name?: string;
    readonly orgId: string;
    readonly orgNactags: outputs.org.GetNactagsOrgNactag[];
    readonly page?: number;
    readonly type?: string;
}
/**
 * This data source provides the list of NAC Tags (Auth Policy Labels).The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const nactags = junipermist.org.getNactags({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getNactagsOutput(args: GetNactagsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNactagsResult> {
    return pulumi.output(args).apply((a: any) => getNactags(a, opts))
}

/**
 * A collection of arguments for invoking getNactags.
 */
export interface GetNactagsOutputArgs {
    limit?: pulumi.Input<number>;
    match?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    page?: pulumi.Input<number>;
    type?: pulumi.Input<string>;
}
