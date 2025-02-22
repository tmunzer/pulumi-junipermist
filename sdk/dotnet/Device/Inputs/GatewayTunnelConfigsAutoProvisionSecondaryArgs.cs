// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayTunnelConfigsAutoProvisionSecondaryArgs : global::Pulumi.ResourceArgs
    {
        [Input("numHosts")]
        public Input<string>? NumHosts { get; set; }

        [Input("wanNames")]
        private InputList<string>? _wanNames;

        /// <summary>
        /// optional, only needed if `vars_only`==`false`
        /// </summary>
        public InputList<string> WanNames
        {
            get => _wanNames ?? (_wanNames = new InputList<string>());
            set => _wanNames = value;
        }

        public GatewayTunnelConfigsAutoProvisionSecondaryArgs()
        {
        }
        public static new GatewayTunnelConfigsAutoProvisionSecondaryArgs Empty => new GatewayTunnelConfigsAutoProvisionSecondaryArgs();
    }
}
