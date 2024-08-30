// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device
{
    /// <summary>
    /// This resource manages the Gateway configuration.It can be used to define specific configuration at the device level or to override Org Gateway template settings.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using JuniperMist = Pulumi.JuniperMist;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var gatewayOne = new JuniperMist.Device.Gateway("gateway_one", new()
    ///     {
    ///         Name = "gateway_one",
    ///         DeviceId = clusterOne.DeviceId,
    ///         SiteId = clusterOne.SiteId,
    ///         OobIpConfig = new JuniperMist.Device.Inputs.GatewayOobIpConfigArgs
    ///         {
    ///             Type = "dhcp",
    ///         },
    ///         DnsServers = new[]
    ///         {
    ///             "8.8.8.8",
    ///         },
    ///         AdditionalConfigCmds = new[]
    ///         {
    ///             "annotate system \" -- custom-main -- Template level --\"",
    ///             "delete apply-groups custom-main",
    ///             "delete groups custom-main",
    ///             "set groups custom-main",
    ///             "set groups custom-main system services ssh root-login allow",
    ///             "set apply-groups custom-main",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_device_gateway` with:
    /// 
    /// Gateway Configuration can be imported by specifying the site_id and the device_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:device/gateway:Gateway gateway_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:device/gateway:Gateway")]
    public partial class Gateway : global::Pulumi.CustomResource
    {
        /// <summary>
        /// additional CLI commands to append to the generated Junos config **Note**: no check is done
        /// </summary>
        [Output("additionalConfigCmds")]
        public Output<ImmutableArray<string>> AdditionalConfigCmds { get; private set; } = null!;

        [Output("bgpConfig")]
        public Output<ImmutableDictionary<string, Outputs.GatewayBgpConfig>?> BgpConfig { get; private set; } = null!;

        [Output("deviceId")]
        public Output<string> DeviceId { get; private set; } = null!;

        [Output("deviceprofileId")]
        public Output<string> DeviceprofileId { get; private set; } = null!;

        [Output("dhcpdConfig")]
        public Output<Outputs.GatewayDhcpdConfig?> DhcpdConfig { get; private set; } = null!;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        [Output("dnsServers")]
        public Output<ImmutableArray<string>> DnsServers { get; private set; } = null!;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        [Output("dnsSuffixes")]
        public Output<ImmutableArray<string>> DnsSuffixes { get; private set; } = null!;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        [Output("extraRoutes")]
        public Output<ImmutableDictionary<string, Outputs.GatewayExtraRoutes>?> ExtraRoutes { get; private set; } = null!;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        [Output("extraRoutes6")]
        public Output<ImmutableDictionary<string, Outputs.GatewayExtraRoutes6>?> ExtraRoutes6 { get; private set; } = null!;

        /// <summary>
        /// Property key is the profile name
        /// </summary>
        [Output("idpProfiles")]
        public Output<ImmutableDictionary<string, Outputs.GatewayIdpProfiles>?> IdpProfiles { get; private set; } = null!;

        [Output("image1Url")]
        public Output<string> Image1Url { get; private set; } = null!;

        [Output("image2Url")]
        public Output<string> Image2Url { get; private set; } = null!;

        [Output("image3Url")]
        public Output<string> Image3Url { get; private set; } = null!;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        [Output("ipConfigs")]
        public Output<ImmutableDictionary<string, Outputs.GatewayIpConfigs>?> IpConfigs { get; private set; } = null!;

        /// <summary>
        /// device MAC address
        /// </summary>
        [Output("mac")]
        public Output<string> Mac { get; private set; } = null!;

        [Output("managed")]
        public Output<bool?> Managed { get; private set; } = null!;

        /// <summary>
        /// map where the device belongs to
        /// </summary>
        [Output("mapId")]
        public Output<string?> MapId { get; private set; } = null!;

        /// <summary>
        /// device Model
        /// </summary>
        [Output("model")]
        public Output<string> Model { get; private set; } = null!;

        [Output("mspId")]
        public Output<string?> MspId { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("networks")]
        public Output<ImmutableArray<Outputs.GatewayNetwork>> Networks { get; private set; } = null!;

        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        [Output("ntpServers")]
        public Output<ImmutableArray<string>> NtpServers { get; private set; } = null!;

        /// <summary>
        /// out-of-band (vme/em0/fxp0) IP config
        /// </summary>
        [Output("oobIpConfig")]
        public Output<Outputs.GatewayOobIpConfig?> OobIpConfig { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Property key is the path name
        /// </summary>
        [Output("pathPreferences")]
        public Output<ImmutableDictionary<string, Outputs.GatewayPathPreferences>?> PathPreferences { get; private set; } = null!;

        /// <summary>
        /// Property key is the port name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        [Output("portConfig")]
        public Output<ImmutableDictionary<string, Outputs.GatewayPortConfig>?> PortConfig { get; private set; } = null!;

        [Output("portMirroring")]
        public Output<Outputs.GatewayPortMirroring?> PortMirroring { get; private set; } = null!;

        /// <summary>
        /// auto assigned if not set
        /// </summary>
        [Output("routerId")]
        public Output<string?> RouterId { get; private set; } = null!;

        /// <summary>
        /// Property key is the routing policy name
        /// </summary>
        [Output("routingPolicies")]
        public Output<ImmutableDictionary<string, Outputs.GatewayRoutingPolicies>?> RoutingPolicies { get; private set; } = null!;

        /// <summary>
        /// device Serial
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;

        [Output("servicePolicies")]
        public Output<ImmutableArray<Outputs.GatewayServicePolicy>> ServicePolicies { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;

        /// <summary>
        /// Property key is the tunnel name
        /// </summary>
        [Output("tunnelConfigs")]
        public Output<ImmutableDictionary<string, Outputs.GatewayTunnelConfigs>?> TunnelConfigs { get; private set; } = null!;

        [Output("tunnelProviderOptions")]
        public Output<Outputs.GatewayTunnelProviderOptions?> TunnelProviderOptions { get; private set; } = null!;

        /// <summary>
        /// Device Type. enum: `gateway`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        [Output("vars")]
        public Output<ImmutableDictionary<string, string>?> Vars { get; private set; } = null!;

        [Output("vrfConfig")]
        public Output<Outputs.GatewayVrfConfig?> VrfConfig { get; private set; } = null!;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        [Output("vrfInstances")]
        public Output<ImmutableDictionary<string, Outputs.GatewayVrfInstances>?> VrfInstances { get; private set; } = null!;

        /// <summary>
        /// x in pixel
        /// </summary>
        [Output("x")]
        public Output<double?> X { get; private set; } = null!;

        /// <summary>
        /// y in pixel
        /// </summary>
        [Output("y")]
        public Output<double?> Y { get; private set; } = null!;


        /// <summary>
        /// Create a Gateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Gateway(string name, GatewayArgs args, CustomResourceOptions? options = null)
            : base("junipermist:device/gateway:Gateway", name, args ?? new GatewayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Gateway(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:device/gateway:Gateway", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Gateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Gateway Get(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new Gateway(name, id, state, options);
        }
    }

    public sealed class GatewayArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalConfigCmds")]
        private InputList<string>? _additionalConfigCmds;

        /// <summary>
        /// additional CLI commands to append to the generated Junos config **Note**: no check is done
        /// </summary>
        public InputList<string> AdditionalConfigCmds
        {
            get => _additionalConfigCmds ?? (_additionalConfigCmds = new InputList<string>());
            set => _additionalConfigCmds = value;
        }

        [Input("bgpConfig")]
        private InputMap<Inputs.GatewayBgpConfigArgs>? _bgpConfig;
        public InputMap<Inputs.GatewayBgpConfigArgs> BgpConfig
        {
            get => _bgpConfig ?? (_bgpConfig = new InputMap<Inputs.GatewayBgpConfigArgs>());
            set => _bgpConfig = value;
        }

        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        [Input("dhcpdConfig")]
        public Input<Inputs.GatewayDhcpdConfigArgs>? DhcpdConfig { get; set; }

        [Input("dnsServers")]
        private InputList<string>? _dnsServers;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        [Input("extraRoutes")]
        private InputMap<Inputs.GatewayExtraRoutesArgs>? _extraRoutes;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public InputMap<Inputs.GatewayExtraRoutesArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.GatewayExtraRoutesArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.GatewayExtraRoutes6Args>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.GatewayExtraRoutes6Args> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.GatewayExtraRoutes6Args>());
            set => _extraRoutes6 = value;
        }

        [Input("idpProfiles")]
        private InputMap<Inputs.GatewayIdpProfilesArgs>? _idpProfiles;

        /// <summary>
        /// Property key is the profile name
        /// </summary>
        public InputMap<Inputs.GatewayIdpProfilesArgs> IdpProfiles
        {
            get => _idpProfiles ?? (_idpProfiles = new InputMap<Inputs.GatewayIdpProfilesArgs>());
            set => _idpProfiles = value;
        }

        [Input("ipConfigs")]
        private InputMap<Inputs.GatewayIpConfigsArgs>? _ipConfigs;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.GatewayIpConfigsArgs> IpConfigs
        {
            get => _ipConfigs ?? (_ipConfigs = new InputMap<Inputs.GatewayIpConfigsArgs>());
            set => _ipConfigs = value;
        }

        [Input("managed")]
        public Input<bool>? Managed { get; set; }

        /// <summary>
        /// map where the device belongs to
        /// </summary>
        [Input("mapId")]
        public Input<string>? MapId { get; set; }

        [Input("mspId")]
        public Input<string>? MspId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.GatewayNetworkArgs>? _networks;
        public InputList<Inputs.GatewayNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.GatewayNetworkArgs>());
            set => _networks = value;
        }

        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        /// <summary>
        /// out-of-band (vme/em0/fxp0) IP config
        /// </summary>
        [Input("oobIpConfig")]
        public Input<Inputs.GatewayOobIpConfigArgs>? OobIpConfig { get; set; }

        [Input("pathPreferences")]
        private InputMap<Inputs.GatewayPathPreferencesArgs>? _pathPreferences;

        /// <summary>
        /// Property key is the path name
        /// </summary>
        public InputMap<Inputs.GatewayPathPreferencesArgs> PathPreferences
        {
            get => _pathPreferences ?? (_pathPreferences = new InputMap<Inputs.GatewayPathPreferencesArgs>());
            set => _pathPreferences = value;
        }

        [Input("portConfig")]
        private InputMap<Inputs.GatewayPortConfigArgs>? _portConfig;

        /// <summary>
        /// Property key is the port name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        public InputMap<Inputs.GatewayPortConfigArgs> PortConfig
        {
            get => _portConfig ?? (_portConfig = new InputMap<Inputs.GatewayPortConfigArgs>());
            set => _portConfig = value;
        }

        [Input("portMirroring")]
        public Input<Inputs.GatewayPortMirroringArgs>? PortMirroring { get; set; }

        /// <summary>
        /// auto assigned if not set
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        [Input("routingPolicies")]
        private InputMap<Inputs.GatewayRoutingPoliciesArgs>? _routingPolicies;

        /// <summary>
        /// Property key is the routing policy name
        /// </summary>
        public InputMap<Inputs.GatewayRoutingPoliciesArgs> RoutingPolicies
        {
            get => _routingPolicies ?? (_routingPolicies = new InputMap<Inputs.GatewayRoutingPoliciesArgs>());
            set => _routingPolicies = value;
        }

        [Input("servicePolicies")]
        private InputList<Inputs.GatewayServicePolicyArgs>? _servicePolicies;
        public InputList<Inputs.GatewayServicePolicyArgs> ServicePolicies
        {
            get => _servicePolicies ?? (_servicePolicies = new InputList<Inputs.GatewayServicePolicyArgs>());
            set => _servicePolicies = value;
        }

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        [Input("tunnelConfigs")]
        private InputMap<Inputs.GatewayTunnelConfigsArgs>? _tunnelConfigs;

        /// <summary>
        /// Property key is the tunnel name
        /// </summary>
        public InputMap<Inputs.GatewayTunnelConfigsArgs> TunnelConfigs
        {
            get => _tunnelConfigs ?? (_tunnelConfigs = new InputMap<Inputs.GatewayTunnelConfigsArgs>());
            set => _tunnelConfigs = value;
        }

        [Input("tunnelProviderOptions")]
        public Input<Inputs.GatewayTunnelProviderOptionsArgs>? TunnelProviderOptions { get; set; }

        [Input("vars")]
        private InputMap<string>? _vars;

        /// <summary>
        /// a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        public InputMap<string> Vars
        {
            get => _vars ?? (_vars = new InputMap<string>());
            set => _vars = value;
        }

        [Input("vrfConfig")]
        public Input<Inputs.GatewayVrfConfigArgs>? VrfConfig { get; set; }

        [Input("vrfInstances")]
        private InputMap<Inputs.GatewayVrfInstancesArgs>? _vrfInstances;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.GatewayVrfInstancesArgs> VrfInstances
        {
            get => _vrfInstances ?? (_vrfInstances = new InputMap<Inputs.GatewayVrfInstancesArgs>());
            set => _vrfInstances = value;
        }

        /// <summary>
        /// x in pixel
        /// </summary>
        [Input("x")]
        public Input<double>? X { get; set; }

        /// <summary>
        /// y in pixel
        /// </summary>
        [Input("y")]
        public Input<double>? Y { get; set; }

        public GatewayArgs()
        {
        }
        public static new GatewayArgs Empty => new GatewayArgs();
    }

    public sealed class GatewayState : global::Pulumi.ResourceArgs
    {
        [Input("additionalConfigCmds")]
        private InputList<string>? _additionalConfigCmds;

        /// <summary>
        /// additional CLI commands to append to the generated Junos config **Note**: no check is done
        /// </summary>
        public InputList<string> AdditionalConfigCmds
        {
            get => _additionalConfigCmds ?? (_additionalConfigCmds = new InputList<string>());
            set => _additionalConfigCmds = value;
        }

        [Input("bgpConfig")]
        private InputMap<Inputs.GatewayBgpConfigGetArgs>? _bgpConfig;
        public InputMap<Inputs.GatewayBgpConfigGetArgs> BgpConfig
        {
            get => _bgpConfig ?? (_bgpConfig = new InputMap<Inputs.GatewayBgpConfigGetArgs>());
            set => _bgpConfig = value;
        }

        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        [Input("deviceprofileId")]
        public Input<string>? DeviceprofileId { get; set; }

        [Input("dhcpdConfig")]
        public Input<Inputs.GatewayDhcpdConfigGetArgs>? DhcpdConfig { get; set; }

        [Input("dnsServers")]
        private InputList<string>? _dnsServers;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        [Input("extraRoutes")]
        private InputMap<Inputs.GatewayExtraRoutesGetArgs>? _extraRoutes;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public InputMap<Inputs.GatewayExtraRoutesGetArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.GatewayExtraRoutesGetArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.GatewayExtraRoutes6GetArgs>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.GatewayExtraRoutes6GetArgs> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.GatewayExtraRoutes6GetArgs>());
            set => _extraRoutes6 = value;
        }

        [Input("idpProfiles")]
        private InputMap<Inputs.GatewayIdpProfilesGetArgs>? _idpProfiles;

        /// <summary>
        /// Property key is the profile name
        /// </summary>
        public InputMap<Inputs.GatewayIdpProfilesGetArgs> IdpProfiles
        {
            get => _idpProfiles ?? (_idpProfiles = new InputMap<Inputs.GatewayIdpProfilesGetArgs>());
            set => _idpProfiles = value;
        }

        [Input("image1Url")]
        public Input<string>? Image1Url { get; set; }

        [Input("image2Url")]
        public Input<string>? Image2Url { get; set; }

        [Input("image3Url")]
        public Input<string>? Image3Url { get; set; }

        [Input("ipConfigs")]
        private InputMap<Inputs.GatewayIpConfigsGetArgs>? _ipConfigs;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.GatewayIpConfigsGetArgs> IpConfigs
        {
            get => _ipConfigs ?? (_ipConfigs = new InputMap<Inputs.GatewayIpConfigsGetArgs>());
            set => _ipConfigs = value;
        }

        /// <summary>
        /// device MAC address
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("managed")]
        public Input<bool>? Managed { get; set; }

        /// <summary>
        /// map where the device belongs to
        /// </summary>
        [Input("mapId")]
        public Input<string>? MapId { get; set; }

        /// <summary>
        /// device Model
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        [Input("mspId")]
        public Input<string>? MspId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.GatewayNetworkGetArgs>? _networks;
        public InputList<Inputs.GatewayNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.GatewayNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        /// <summary>
        /// out-of-band (vme/em0/fxp0) IP config
        /// </summary>
        [Input("oobIpConfig")]
        public Input<Inputs.GatewayOobIpConfigGetArgs>? OobIpConfig { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("pathPreferences")]
        private InputMap<Inputs.GatewayPathPreferencesGetArgs>? _pathPreferences;

        /// <summary>
        /// Property key is the path name
        /// </summary>
        public InputMap<Inputs.GatewayPathPreferencesGetArgs> PathPreferences
        {
            get => _pathPreferences ?? (_pathPreferences = new InputMap<Inputs.GatewayPathPreferencesGetArgs>());
            set => _pathPreferences = value;
        }

        [Input("portConfig")]
        private InputMap<Inputs.GatewayPortConfigGetArgs>? _portConfig;

        /// <summary>
        /// Property key is the port name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        public InputMap<Inputs.GatewayPortConfigGetArgs> PortConfig
        {
            get => _portConfig ?? (_portConfig = new InputMap<Inputs.GatewayPortConfigGetArgs>());
            set => _portConfig = value;
        }

        [Input("portMirroring")]
        public Input<Inputs.GatewayPortMirroringGetArgs>? PortMirroring { get; set; }

        /// <summary>
        /// auto assigned if not set
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        [Input("routingPolicies")]
        private InputMap<Inputs.GatewayRoutingPoliciesGetArgs>? _routingPolicies;

        /// <summary>
        /// Property key is the routing policy name
        /// </summary>
        public InputMap<Inputs.GatewayRoutingPoliciesGetArgs> RoutingPolicies
        {
            get => _routingPolicies ?? (_routingPolicies = new InputMap<Inputs.GatewayRoutingPoliciesGetArgs>());
            set => _routingPolicies = value;
        }

        /// <summary>
        /// device Serial
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        [Input("servicePolicies")]
        private InputList<Inputs.GatewayServicePolicyGetArgs>? _servicePolicies;
        public InputList<Inputs.GatewayServicePolicyGetArgs> ServicePolicies
        {
            get => _servicePolicies ?? (_servicePolicies = new InputList<Inputs.GatewayServicePolicyGetArgs>());
            set => _servicePolicies = value;
        }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("tunnelConfigs")]
        private InputMap<Inputs.GatewayTunnelConfigsGetArgs>? _tunnelConfigs;

        /// <summary>
        /// Property key is the tunnel name
        /// </summary>
        public InputMap<Inputs.GatewayTunnelConfigsGetArgs> TunnelConfigs
        {
            get => _tunnelConfigs ?? (_tunnelConfigs = new InputMap<Inputs.GatewayTunnelConfigsGetArgs>());
            set => _tunnelConfigs = value;
        }

        [Input("tunnelProviderOptions")]
        public Input<Inputs.GatewayTunnelProviderOptionsGetArgs>? TunnelProviderOptions { get; set; }

        /// <summary>
        /// Device Type. enum: `gateway`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("vars")]
        private InputMap<string>? _vars;

        /// <summary>
        /// a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        public InputMap<string> Vars
        {
            get => _vars ?? (_vars = new InputMap<string>());
            set => _vars = value;
        }

        [Input("vrfConfig")]
        public Input<Inputs.GatewayVrfConfigGetArgs>? VrfConfig { get; set; }

        [Input("vrfInstances")]
        private InputMap<Inputs.GatewayVrfInstancesGetArgs>? _vrfInstances;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.GatewayVrfInstancesGetArgs> VrfInstances
        {
            get => _vrfInstances ?? (_vrfInstances = new InputMap<Inputs.GatewayVrfInstancesGetArgs>());
            set => _vrfInstances = value;
        }

        /// <summary>
        /// x in pixel
        /// </summary>
        [Input("x")]
        public Input<double>? X { get; set; }

        /// <summary>
        /// y in pixel
        /// </summary>
        [Input("y")]
        public Input<double>? Y { get; set; }

        public GatewayState()
        {
        }
        public static new GatewayState Empty => new GatewayState();
    }
}
