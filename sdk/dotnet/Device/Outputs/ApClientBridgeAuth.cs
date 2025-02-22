// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class ApClientBridgeAuth
    {
        public readonly string? Psk;
        /// <summary>
        /// wpa2-AES/CCMPp is assumed when `type`==`psk`. enum: `open`, `psk`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ApClientBridgeAuth(
            string? psk,

            string? type)
        {
            Psk = psk;
            Type = type;
        }
    }
}
