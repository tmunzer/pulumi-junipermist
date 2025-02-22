// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingGatewayMgmtAppProbingCustomAppGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// if `protocol`==`icmp`
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("appType")]
        public Input<string>? AppType { get; set; }

        [Input("hostnames")]
        private InputList<string>? _hostnames;

        /// <summary>
        /// if `protocol`==`http`
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// enum: `http`, `icmp`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// if `protocol`==`http`
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("vrf")]
        public Input<string>? Vrf { get; set; }

        public SettingGatewayMgmtAppProbingCustomAppGetArgs()
        {
        }
        public static new SettingGatewayMgmtAppProbingCustomAppGetArgs Empty => new SettingGatewayMgmtAppProbingCustomAppGetArgs();
    }
}
