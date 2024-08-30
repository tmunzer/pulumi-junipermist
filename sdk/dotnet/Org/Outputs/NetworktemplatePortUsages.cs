// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class NetworktemplatePortUsages
    {
        /// <summary>
        /// Only if `mode`==`trunk` whether to trunk all network/vlans
        /// </summary>
        public readonly bool? AllNetworks;
        /// <summary>
        /// Only if `mode`!=`dynamic` if DHCP snooping is enabled, whether DHCP server is allowed on the interfaces with. All the interfaces from port configs using this port usage are effected. Please notice that allow_dhcpd is a tri_state.
        /// 
        /// When it is not defined, it means using the system’s default setting which depends on whether the port is a access or trunk port.
        /// </summary>
        public readonly bool? AllowDhcpd;
        /// <summary>
        /// Only if `mode`!=`dynamic`
        /// </summary>
        public readonly bool? AllowMultipleSupplicants;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` bypass auth for known clients if set to true when RADIUS server is down
        /// </summary>
        public readonly bool? BypassAuthWhenServerDown;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`=`dot1x` bypass auth for all (including unknown clients) if set to true when RADIUS server is down
        /// </summary>
        public readonly bool? BypassAuthWhenServerDownForUnkonwnClient;
        /// <summary>
        /// Only if `mode`!=`dynamic`
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Only if `mode`!=`dynamic` if speed and duplex are specified, whether to disable autonegotiation
        /// </summary>
        public readonly bool? DisableAutoneg;
        /// <summary>
        /// Only if `mode`!=`dynamic` whether the port is disabled
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// Only if `mode`!=`dynamic` link connection mode. enum: `auto`, `full`, `half`
        /// </summary>
        public readonly string? Duplex;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x`, if dynamic vlan is used, specify the possible networks/vlans RADIUS can return
        /// </summary>
        public readonly ImmutableArray<string> DynamicVlanNetworks;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` whether to enable MAC Auth
        /// </summary>
        public readonly bool? EnableMacAuth;
        /// <summary>
        /// Only if `mode`!=`dynamic`
        /// </summary>
        public readonly bool? EnableQos;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` which network to put the device into if the device cannot do dot1x. default is null (i.e. not allowed)
        /// </summary>
        public readonly string? GuestNetwork;
        /// <summary>
        /// Only if `mode`!=`dynamic` inter_switch_link is used together with "isolation" under networks
        /// NOTE: inter_switch_link works only between Juniper device. This has to be applied to both ports connected together
        /// </summary>
        public readonly bool? InterSwitchLink;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `enable_mac_auth`==`true`
        /// </summary>
        public readonly bool? MacAuthOnly;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `enable_mac_auth` ==`true`. This type is ignored if mist_nac is enabled. enum: `eap-md5`, `eap-peap`, `pap`
        /// </summary>
        public readonly string? MacAuthProtocol;
        /// <summary>
        /// Only if `mode`!=`dynamic` max number of mac addresses, default is 0 for unlimited, otherwise range is 1 or higher, with upper bound constrained by platform
        /// </summary>
        public readonly int? MacLimit;
        /// <summary>
        /// `mode`==`dynamic` must only be used with the port usage with the name `dynamic`. enum: `access`, `dynamic`, `inet`, `trunk`
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// Only if `mode`!=`dynamic` media maximum transmission unit (MTU) is the largest data unit that can be forwarded without fragmentation. The default value is 1514.
        /// </summary>
        public readonly int? Mtu;
        /// <summary>
        /// Only if `mode`==`trunk`, the list of network/vlans
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// Only if `mode`==`access` and `port_auth`!=`dot1x` whether the port should retain dynamically learned MAC addresses
        /// </summary>
        public readonly bool? PersistMac;
        /// <summary>
        /// Only if `mode`!=`dynamic` whether PoE capabilities are disabled for a port
        /// </summary>
        public readonly bool? PoeDisabled;
        /// <summary>
        /// Only if `mode`!=`dynamic` if dot1x is desired, set to dot1x. enum: `dot1x`
        /// </summary>
        public readonly string? PortAuth;
        /// <summary>
        /// Only if `mode`!=`dynamic` native network/vlan for untagged traffic
        /// </summary>
        public readonly string? PortNetwork;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`=`dot1x` reauthentication interval range
        /// </summary>
        public readonly int? ReauthInterval;
        /// <summary>
        /// Only if `mode`!=`dynamic` and `port_auth`==`dot1x` when radius server reject / fails
        /// </summary>
        public readonly string? RejectedNetwork;
        /// <summary>
        /// Only if `mode`==`dynamic` Control when the DPC port should be changed to the default port usage. enum: `link_down`, `none` (let the DPC port keep at the current port usage)
        /// </summary>
        public readonly string? ResetDefaultWhen;
        /// <summary>
        /// Only if `mode`==`dynamic`
        /// </summary>
        public readonly ImmutableArray<Outputs.NetworktemplatePortUsagesRule> Rules;
        /// <summary>
        /// Only if `mode`!=`dynamic` speed, default is auto to automatically negotiate speed
        /// </summary>
        public readonly string? Speed;
        /// <summary>
        /// Switch storm control
        /// Only if `mode`!=`dynamic`
        /// </summary>
        public readonly Outputs.NetworktemplatePortUsagesStormControl? StormControl;
        /// <summary>
        /// Only if `mode`!=`dynamic` when enabled, the port is not expected to receive BPDU frames
        /// </summary>
        public readonly bool? StpEdge;
        public readonly bool? StpNoRootPort;
        public readonly bool? StpP2p;
        /// <summary>
        /// Only if `mode`!=`dynamic` network/vlan for voip traffic, must also set port_network. to authenticate device, set port_auth
        /// </summary>
        public readonly string? VoipNetwork;

        [OutputConstructor]
        private NetworktemplatePortUsages(
            bool? allNetworks,

            bool? allowDhcpd,

            bool? allowMultipleSupplicants,

            bool? bypassAuthWhenServerDown,

            bool? bypassAuthWhenServerDownForUnkonwnClient,

            string? description,

            bool? disableAutoneg,

            bool? disabled,

            string? duplex,

            ImmutableArray<string> dynamicVlanNetworks,

            bool? enableMacAuth,

            bool? enableQos,

            string? guestNetwork,

            bool? interSwitchLink,

            bool? macAuthOnly,

            string? macAuthProtocol,

            int? macLimit,

            string? mode,

            int? mtu,

            ImmutableArray<string> networks,

            bool? persistMac,

            bool? poeDisabled,

            string? portAuth,

            string? portNetwork,

            int? reauthInterval,

            string? rejectedNetwork,

            string? resetDefaultWhen,

            ImmutableArray<Outputs.NetworktemplatePortUsagesRule> rules,

            string? speed,

            Outputs.NetworktemplatePortUsagesStormControl? stormControl,

            bool? stpEdge,

            bool? stpNoRootPort,

            bool? stpP2p,

            string? voipNetwork)
        {
            AllNetworks = allNetworks;
            AllowDhcpd = allowDhcpd;
            AllowMultipleSupplicants = allowMultipleSupplicants;
            BypassAuthWhenServerDown = bypassAuthWhenServerDown;
            BypassAuthWhenServerDownForUnkonwnClient = bypassAuthWhenServerDownForUnkonwnClient;
            Description = description;
            DisableAutoneg = disableAutoneg;
            Disabled = disabled;
            Duplex = duplex;
            DynamicVlanNetworks = dynamicVlanNetworks;
            EnableMacAuth = enableMacAuth;
            EnableQos = enableQos;
            GuestNetwork = guestNetwork;
            InterSwitchLink = interSwitchLink;
            MacAuthOnly = macAuthOnly;
            MacAuthProtocol = macAuthProtocol;
            MacLimit = macLimit;
            Mode = mode;
            Mtu = mtu;
            Networks = networks;
            PersistMac = persistMac;
            PoeDisabled = poeDisabled;
            PortAuth = portAuth;
            PortNetwork = portNetwork;
            ReauthInterval = reauthInterval;
            RejectedNetwork = rejectedNetwork;
            ResetDefaultWhen = resetDefaultWhen;
            Rules = rules;
            Speed = speed;
            StormControl = stormControl;
            StpEdge = stpEdge;
            StpNoRootPort = stpNoRootPort;
            StpP2p = stpP2p;
            VoipNetwork = voipNetwork;
        }
    }
}
