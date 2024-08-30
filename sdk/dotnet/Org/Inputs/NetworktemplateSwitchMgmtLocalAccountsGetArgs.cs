// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateSwitchMgmtLocalAccountsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("password")]
        private Input<string>? _password;
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// enum: `admin`, `helpdesk`, `none`, `read`
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public NetworktemplateSwitchMgmtLocalAccountsGetArgs()
        {
        }
        public static new NetworktemplateSwitchMgmtLocalAccountsGetArgs Empty => new NetworktemplateSwitchMgmtLocalAccountsGetArgs();
    }
}
