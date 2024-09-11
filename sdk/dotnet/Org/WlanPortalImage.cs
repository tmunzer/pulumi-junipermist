// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource is used to upload a WLAN Captive Web Portal background image.The WLAN object contains all the required configuration to broadcast an SSID (Authentication, VLAN, ...)
    /// </summary>
    [JuniperMistResourceType("junipermist:org/wlanPortalImage:WlanPortalImage")]
    public partial class WlanPortalImage : global::Pulumi.CustomResource
    {
        /// <summary>
        /// binary file
        /// </summary>
        [Output("file")]
        public Output<string> File { get; private set; } = null!;

        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        [Output("wlanId")]
        public Output<string?> WlanId { get; private set; } = null!;


        /// <summary>
        /// Create a WlanPortalImage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WlanPortalImage(string name, WlanPortalImageArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/wlanPortalImage:WlanPortalImage", name, args ?? new WlanPortalImageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WlanPortalImage(string name, Input<string> id, WlanPortalImageState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/wlanPortalImage:WlanPortalImage", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WlanPortalImage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WlanPortalImage Get(string name, Input<string> id, WlanPortalImageState? state = null, CustomResourceOptions? options = null)
        {
            return new WlanPortalImage(name, id, state, options);
        }
    }

    public sealed class WlanPortalImageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// binary file
        /// </summary>
        [Input("file", required: true)]
        public Input<string> File { get; set; } = null!;

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("wlanId")]
        public Input<string>? WlanId { get; set; }

        public WlanPortalImageArgs()
        {
        }
        public static new WlanPortalImageArgs Empty => new WlanPortalImageArgs();
    }

    public sealed class WlanPortalImageState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// binary file
        /// </summary>
        [Input("file")]
        public Input<string>? File { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("wlanId")]
        public Input<string>? WlanId { get; set; }

        public WlanPortalImageState()
        {
        }
        public static new WlanPortalImageState Empty => new WlanPortalImageState();
    }
}
