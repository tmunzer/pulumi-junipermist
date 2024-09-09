// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site
{
    /// <summary>
    /// This resource manages the Site Settings.The Site Settings can used to customize the Site configuration and assign Site Variables (Sites Variables can be reused in configuration templates)
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_site_setting` with:
    /// 
    /// Site Setting can be imported by specifying the site_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:site/setting:Setting site_setting_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:site/setting:Setting")]
    public partial class Setting : global::Pulumi.CustomResource
    {
        [Output("analytic")]
        public Output<Outputs.SettingAnalytic?> Analytic { get; private set; } = null!;

        /// <summary>
        /// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `device_updown_threshold` is ignored.
        /// </summary>
        [Output("apUpdownThreshold")]
        public Output<int> ApUpdownThreshold { get; private set; } = null!;

        /// <summary>
        /// Auto Upgrade Settings
        /// </summary>
        [Output("autoUpgrade")]
        public Output<Outputs.SettingAutoUpgrade?> AutoUpgrade { get; private set; } = null!;

        [Output("blacklistUrl")]
        public Output<string> BlacklistUrl { get; private set; } = null!;

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Output("bleConfig")]
        public Output<Outputs.SettingBleConfig?> BleConfig { get; private set; } = null!;

        /// <summary>
        /// whether to enable ap auto config revert
        /// </summary>
        [Output("configAutoRevert")]
        public Output<bool> ConfigAutoRevert { get; private set; } = null!;

        /// <summary>
        /// mist also uses some heuristic rules to prevent destructive configs from being pushed
        /// </summary>
        [Output("configPushPolicy")]
        public Output<Outputs.SettingConfigPushPolicy?> ConfigPushPolicy { get; private set; } = null!;

        /// <summary>
        /// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
        /// </summary>
        [Output("criticalUrlMonitoring")]
        public Output<Outputs.SettingCriticalUrlMonitoring?> CriticalUrlMonitoring { get; private set; } = null!;

        /// <summary>
        /// by default, device*updown*thresold, if set, will apply to all devices types if different values for specific device type is desired, use the following
        /// </summary>
        [Output("deviceUpdownThreshold")]
        public Output<int> DeviceUpdownThreshold { get; private set; } = null!;

        /// <summary>
        /// if some system-default port usages are not desired - namely, ap / iot / uplink
        /// </summary>
        [Output("disabledSystemDefinedPortUsages")]
        public Output<ImmutableArray<string>> DisabledSystemDefinedPortUsages { get; private set; } = null!;

        /// <summary>
        /// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
        /// </summary>
        [Output("engagement")]
        public Output<Outputs.SettingEngagement?> Engagement { get; private set; } = null!;

        /// <summary>
        /// Gateway Site settings
        /// </summary>
        [Output("gatewayMgmt")]
        public Output<Outputs.SettingGatewayMgmt?> GatewayMgmt { get; private set; } = null!;

        /// <summary>
        /// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Output("gatewayUpdownThreshold")]
        public Output<int> GatewayUpdownThreshold { get; private set; } = null!;

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Output("led")]
        public Output<Outputs.SettingLed?> Led { get; private set; } = null!;

        /// <summary>
        /// Occupancy Analytics settings
        /// </summary>
        [Output("occupancy")]
        public Output<Outputs.SettingOccupancy?> Occupancy { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// whether to store the config on AP
        /// </summary>
        [Output("persistConfigOnDevice")]
        public Output<bool> PersistConfigOnDevice { get; private set; } = null!;

        /// <summary>
        /// Proxy Configuration to talk to Mist
        /// </summary>
        [Output("proxy")]
        public Output<Outputs.SettingProxy?> Proxy { get; private set; } = null!;

        /// <summary>
        /// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
        /// </summary>
        [Output("removeExistingConfigs")]
        public Output<bool> RemoveExistingConfigs { get; private set; } = null!;

        /// <summary>
        /// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
        /// serial number, battery %, temperature, humidity)
        /// </summary>
        [Output("reportGatt")]
        public Output<bool> ReportGatt { get; private set; } = null!;

        /// <summary>
        /// Rogue site settings
        /// </summary>
        [Output("rogue")]
        public Output<Outputs.SettingRogue?> Rogue { get; private set; } = null!;

        /// <summary>
        /// managed mobility
        /// </summary>
        [Output("rtsa")]
        public Output<Outputs.SettingRtsa?> Rtsa { get; private set; } = null!;

        /// <summary>
        /// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
        /// window, there are more than Y distinct client encountring over X failures
        /// </summary>
        [Output("simpleAlert")]
        public Output<Outputs.SettingSimpleAlert?> SimpleAlert { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;

        [Output("skyatp")]
        public Output<Outputs.SettingSkyatp?> Skyatp { get; private set; } = null!;

        [Output("srxApp")]
        public Output<Outputs.SettingSrxApp?> SrxApp { get; private set; } = null!;

        /// <summary>
        /// when limit_ssh_access = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
        /// Org:Setting)
        /// </summary>
        [Output("sshKeys")]
        public Output<ImmutableArray<string>> SshKeys { get; private set; } = null!;

        [Output("ssr")]
        public Output<Outputs.SettingSsr?> Ssr { get; private set; } = null!;

        /// <summary>
        /// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Output("switchUpdownThreshold")]
        public Output<int> SwitchUpdownThreshold { get; private set; } = null!;

        [Output("syntheticTest")]
        public Output<Outputs.SettingSyntheticTest?> SyntheticTest { get; private set; } = null!;

        /// <summary>
        /// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
        /// </summary>
        [Output("trackAnonymousDevices")]
        public Output<bool> TrackAnonymousDevices { get; private set; } = null!;

        [Output("uplinkPortConfig")]
        public Output<Outputs.SettingUplinkPortConfig?> UplinkPortConfig { get; private set; } = null!;

        /// <summary>
        /// a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        [Output("vars")]
        public Output<ImmutableDictionary<string, string>?> Vars { get; private set; } = null!;

        [Output("vna")]
        public Output<Outputs.SettingVna?> Vna { get; private set; } = null!;

        /// <summary>
        /// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
        /// </summary>
        [Output("vsInstance")]
        public Output<ImmutableDictionary<string, Outputs.SettingVsInstance>?> VsInstance { get; private set; } = null!;

        [Output("wanVna")]
        public Output<Outputs.SettingWanVna?> WanVna { get; private set; } = null!;

        [Output("watchedStationUrl")]
        public Output<string> WatchedStationUrl { get; private set; } = null!;

        [Output("whitelistUrl")]
        public Output<string> WhitelistUrl { get; private set; } = null!;

        /// <summary>
        /// WIDS site settings
        /// </summary>
        [Output("wids")]
        public Output<Outputs.SettingWids?> Wids { get; private set; } = null!;

        /// <summary>
        /// Wi-Fi site settings
        /// </summary>
        [Output("wifi")]
        public Output<Outputs.SettingWifi?> Wifi { get; private set; } = null!;

        [Output("wiredVna")]
        public Output<Outputs.SettingWiredVna?> WiredVna { get; private set; } = null!;

        /// <summary>
        /// Zone Occupancy alert site settings
        /// </summary>
        [Output("zoneOccupancyAlert")]
        public Output<Outputs.SettingZoneOccupancyAlert?> ZoneOccupancyAlert { get; private set; } = null!;


        /// <summary>
        /// Create a Setting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Setting(string name, SettingArgs args, CustomResourceOptions? options = null)
            : base("junipermist:site/setting:Setting", name, args ?? new SettingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Setting(string name, Input<string> id, SettingState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:site/setting:Setting", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Setting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Setting Get(string name, Input<string> id, SettingState? state = null, CustomResourceOptions? options = null)
        {
            return new Setting(name, id, state, options);
        }
    }

    public sealed class SettingArgs : global::Pulumi.ResourceArgs
    {
        [Input("analytic")]
        public Input<Inputs.SettingAnalyticArgs>? Analytic { get; set; }

        /// <summary>
        /// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `device_updown_threshold` is ignored.
        /// </summary>
        [Input("apUpdownThreshold")]
        public Input<int>? ApUpdownThreshold { get; set; }

        /// <summary>
        /// Auto Upgrade Settings
        /// </summary>
        [Input("autoUpgrade")]
        public Input<Inputs.SettingAutoUpgradeArgs>? AutoUpgrade { get; set; }

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Input("bleConfig")]
        public Input<Inputs.SettingBleConfigArgs>? BleConfig { get; set; }

        /// <summary>
        /// whether to enable ap auto config revert
        /// </summary>
        [Input("configAutoRevert")]
        public Input<bool>? ConfigAutoRevert { get; set; }

        /// <summary>
        /// mist also uses some heuristic rules to prevent destructive configs from being pushed
        /// </summary>
        [Input("configPushPolicy")]
        public Input<Inputs.SettingConfigPushPolicyArgs>? ConfigPushPolicy { get; set; }

        /// <summary>
        /// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
        /// </summary>
        [Input("criticalUrlMonitoring")]
        public Input<Inputs.SettingCriticalUrlMonitoringArgs>? CriticalUrlMonitoring { get; set; }

        /// <summary>
        /// by default, device*updown*thresold, if set, will apply to all devices types if different values for specific device type is desired, use the following
        /// </summary>
        [Input("deviceUpdownThreshold")]
        public Input<int>? DeviceUpdownThreshold { get; set; }

        [Input("disabledSystemDefinedPortUsages")]
        private InputList<string>? _disabledSystemDefinedPortUsages;

        /// <summary>
        /// if some system-default port usages are not desired - namely, ap / iot / uplink
        /// </summary>
        public InputList<string> DisabledSystemDefinedPortUsages
        {
            get => _disabledSystemDefinedPortUsages ?? (_disabledSystemDefinedPortUsages = new InputList<string>());
            set => _disabledSystemDefinedPortUsages = value;
        }

        /// <summary>
        /// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
        /// </summary>
        [Input("engagement")]
        public Input<Inputs.SettingEngagementArgs>? Engagement { get; set; }

        /// <summary>
        /// Gateway Site settings
        /// </summary>
        [Input("gatewayMgmt")]
        public Input<Inputs.SettingGatewayMgmtArgs>? GatewayMgmt { get; set; }

        /// <summary>
        /// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("gatewayUpdownThreshold")]
        public Input<int>? GatewayUpdownThreshold { get; set; }

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Input("led")]
        public Input<Inputs.SettingLedArgs>? Led { get; set; }

        /// <summary>
        /// Occupancy Analytics settings
        /// </summary>
        [Input("occupancy")]
        public Input<Inputs.SettingOccupancyArgs>? Occupancy { get; set; }

        /// <summary>
        /// whether to store the config on AP
        /// </summary>
        [Input("persistConfigOnDevice")]
        public Input<bool>? PersistConfigOnDevice { get; set; }

        /// <summary>
        /// Proxy Configuration to talk to Mist
        /// </summary>
        [Input("proxy")]
        public Input<Inputs.SettingProxyArgs>? Proxy { get; set; }

        /// <summary>
        /// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
        /// </summary>
        [Input("removeExistingConfigs")]
        public Input<bool>? RemoveExistingConfigs { get; set; }

        /// <summary>
        /// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
        /// serial number, battery %, temperature, humidity)
        /// </summary>
        [Input("reportGatt")]
        public Input<bool>? ReportGatt { get; set; }

        /// <summary>
        /// Rogue site settings
        /// </summary>
        [Input("rogue")]
        public Input<Inputs.SettingRogueArgs>? Rogue { get; set; }

        /// <summary>
        /// managed mobility
        /// </summary>
        [Input("rtsa")]
        public Input<Inputs.SettingRtsaArgs>? Rtsa { get; set; }

        /// <summary>
        /// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
        /// window, there are more than Y distinct client encountring over X failures
        /// </summary>
        [Input("simpleAlert")]
        public Input<Inputs.SettingSimpleAlertArgs>? SimpleAlert { get; set; }

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        [Input("skyatp")]
        public Input<Inputs.SettingSkyatpArgs>? Skyatp { get; set; }

        [Input("srxApp")]
        public Input<Inputs.SettingSrxAppArgs>? SrxApp { get; set; }

        [Input("sshKeys")]
        private InputList<string>? _sshKeys;

        /// <summary>
        /// when limit_ssh_access = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
        /// Org:Setting)
        /// </summary>
        public InputList<string> SshKeys
        {
            get => _sshKeys ?? (_sshKeys = new InputList<string>());
            set => _sshKeys = value;
        }

        [Input("ssr")]
        public Input<Inputs.SettingSsrArgs>? Ssr { get; set; }

        /// <summary>
        /// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("switchUpdownThreshold")]
        public Input<int>? SwitchUpdownThreshold { get; set; }

        [Input("syntheticTest")]
        public Input<Inputs.SettingSyntheticTestArgs>? SyntheticTest { get; set; }

        /// <summary>
        /// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
        /// </summary>
        [Input("trackAnonymousDevices")]
        public Input<bool>? TrackAnonymousDevices { get; set; }

        [Input("uplinkPortConfig")]
        public Input<Inputs.SettingUplinkPortConfigArgs>? UplinkPortConfig { get; set; }

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

        [Input("vna")]
        public Input<Inputs.SettingVnaArgs>? Vna { get; set; }

        [Input("vsInstance")]
        private InputMap<Inputs.SettingVsInstanceArgs>? _vsInstance;

        /// <summary>
        /// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
        /// </summary>
        public InputMap<Inputs.SettingVsInstanceArgs> VsInstance
        {
            get => _vsInstance ?? (_vsInstance = new InputMap<Inputs.SettingVsInstanceArgs>());
            set => _vsInstance = value;
        }

        [Input("wanVna")]
        public Input<Inputs.SettingWanVnaArgs>? WanVna { get; set; }

        /// <summary>
        /// WIDS site settings
        /// </summary>
        [Input("wids")]
        public Input<Inputs.SettingWidsArgs>? Wids { get; set; }

        /// <summary>
        /// Wi-Fi site settings
        /// </summary>
        [Input("wifi")]
        public Input<Inputs.SettingWifiArgs>? Wifi { get; set; }

        [Input("wiredVna")]
        public Input<Inputs.SettingWiredVnaArgs>? WiredVna { get; set; }

        /// <summary>
        /// Zone Occupancy alert site settings
        /// </summary>
        [Input("zoneOccupancyAlert")]
        public Input<Inputs.SettingZoneOccupancyAlertArgs>? ZoneOccupancyAlert { get; set; }

        public SettingArgs()
        {
        }
        public static new SettingArgs Empty => new SettingArgs();
    }

    public sealed class SettingState : global::Pulumi.ResourceArgs
    {
        [Input("analytic")]
        public Input<Inputs.SettingAnalyticGetArgs>? Analytic { get; set; }

        /// <summary>
        /// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `device_updown_threshold` is ignored.
        /// </summary>
        [Input("apUpdownThreshold")]
        public Input<int>? ApUpdownThreshold { get; set; }

        /// <summary>
        /// Auto Upgrade Settings
        /// </summary>
        [Input("autoUpgrade")]
        public Input<Inputs.SettingAutoUpgradeGetArgs>? AutoUpgrade { get; set; }

        [Input("blacklistUrl")]
        public Input<string>? BlacklistUrl { get; set; }

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Input("bleConfig")]
        public Input<Inputs.SettingBleConfigGetArgs>? BleConfig { get; set; }

        /// <summary>
        /// whether to enable ap auto config revert
        /// </summary>
        [Input("configAutoRevert")]
        public Input<bool>? ConfigAutoRevert { get; set; }

        /// <summary>
        /// mist also uses some heuristic rules to prevent destructive configs from being pushed
        /// </summary>
        [Input("configPushPolicy")]
        public Input<Inputs.SettingConfigPushPolicyGetArgs>? ConfigPushPolicy { get; set; }

        /// <summary>
        /// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
        /// </summary>
        [Input("criticalUrlMonitoring")]
        public Input<Inputs.SettingCriticalUrlMonitoringGetArgs>? CriticalUrlMonitoring { get; set; }

        /// <summary>
        /// by default, device*updown*thresold, if set, will apply to all devices types if different values for specific device type is desired, use the following
        /// </summary>
        [Input("deviceUpdownThreshold")]
        public Input<int>? DeviceUpdownThreshold { get; set; }

        [Input("disabledSystemDefinedPortUsages")]
        private InputList<string>? _disabledSystemDefinedPortUsages;

        /// <summary>
        /// if some system-default port usages are not desired - namely, ap / iot / uplink
        /// </summary>
        public InputList<string> DisabledSystemDefinedPortUsages
        {
            get => _disabledSystemDefinedPortUsages ?? (_disabledSystemDefinedPortUsages = new InputList<string>());
            set => _disabledSystemDefinedPortUsages = value;
        }

        /// <summary>
        /// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
        /// </summary>
        [Input("engagement")]
        public Input<Inputs.SettingEngagementGetArgs>? Engagement { get; set; }

        /// <summary>
        /// Gateway Site settings
        /// </summary>
        [Input("gatewayMgmt")]
        public Input<Inputs.SettingGatewayMgmtGetArgs>? GatewayMgmt { get; set; }

        /// <summary>
        /// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("gatewayUpdownThreshold")]
        public Input<int>? GatewayUpdownThreshold { get; set; }

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Input("led")]
        public Input<Inputs.SettingLedGetArgs>? Led { get; set; }

        /// <summary>
        /// Occupancy Analytics settings
        /// </summary>
        [Input("occupancy")]
        public Input<Inputs.SettingOccupancyGetArgs>? Occupancy { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// whether to store the config on AP
        /// </summary>
        [Input("persistConfigOnDevice")]
        public Input<bool>? PersistConfigOnDevice { get; set; }

        /// <summary>
        /// Proxy Configuration to talk to Mist
        /// </summary>
        [Input("proxy")]
        public Input<Inputs.SettingProxyGetArgs>? Proxy { get; set; }

        /// <summary>
        /// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
        /// </summary>
        [Input("removeExistingConfigs")]
        public Input<bool>? RemoveExistingConfigs { get; set; }

        /// <summary>
        /// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
        /// serial number, battery %, temperature, humidity)
        /// </summary>
        [Input("reportGatt")]
        public Input<bool>? ReportGatt { get; set; }

        /// <summary>
        /// Rogue site settings
        /// </summary>
        [Input("rogue")]
        public Input<Inputs.SettingRogueGetArgs>? Rogue { get; set; }

        /// <summary>
        /// managed mobility
        /// </summary>
        [Input("rtsa")]
        public Input<Inputs.SettingRtsaGetArgs>? Rtsa { get; set; }

        /// <summary>
        /// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
        /// window, there are more than Y distinct client encountring over X failures
        /// </summary>
        [Input("simpleAlert")]
        public Input<Inputs.SettingSimpleAlertGetArgs>? SimpleAlert { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("skyatp")]
        public Input<Inputs.SettingSkyatpGetArgs>? Skyatp { get; set; }

        [Input("srxApp")]
        public Input<Inputs.SettingSrxAppGetArgs>? SrxApp { get; set; }

        [Input("sshKeys")]
        private InputList<string>? _sshKeys;

        /// <summary>
        /// when limit_ssh_access = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
        /// Org:Setting)
        /// </summary>
        public InputList<string> SshKeys
        {
            get => _sshKeys ?? (_sshKeys = new InputList<string>());
            set => _sshKeys = value;
        }

        [Input("ssr")]
        public Input<Inputs.SettingSsrGetArgs>? Ssr { get; set; }

        /// <summary>
        /// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("switchUpdownThreshold")]
        public Input<int>? SwitchUpdownThreshold { get; set; }

        [Input("syntheticTest")]
        public Input<Inputs.SettingSyntheticTestGetArgs>? SyntheticTest { get; set; }

        /// <summary>
        /// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
        /// </summary>
        [Input("trackAnonymousDevices")]
        public Input<bool>? TrackAnonymousDevices { get; set; }

        [Input("uplinkPortConfig")]
        public Input<Inputs.SettingUplinkPortConfigGetArgs>? UplinkPortConfig { get; set; }

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

        [Input("vna")]
        public Input<Inputs.SettingVnaGetArgs>? Vna { get; set; }

        [Input("vsInstance")]
        private InputMap<Inputs.SettingVsInstanceGetArgs>? _vsInstance;

        /// <summary>
        /// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
        /// </summary>
        public InputMap<Inputs.SettingVsInstanceGetArgs> VsInstance
        {
            get => _vsInstance ?? (_vsInstance = new InputMap<Inputs.SettingVsInstanceGetArgs>());
            set => _vsInstance = value;
        }

        [Input("wanVna")]
        public Input<Inputs.SettingWanVnaGetArgs>? WanVna { get; set; }

        [Input("watchedStationUrl")]
        public Input<string>? WatchedStationUrl { get; set; }

        [Input("whitelistUrl")]
        public Input<string>? WhitelistUrl { get; set; }

        /// <summary>
        /// WIDS site settings
        /// </summary>
        [Input("wids")]
        public Input<Inputs.SettingWidsGetArgs>? Wids { get; set; }

        /// <summary>
        /// Wi-Fi site settings
        /// </summary>
        [Input("wifi")]
        public Input<Inputs.SettingWifiGetArgs>? Wifi { get; set; }

        [Input("wiredVna")]
        public Input<Inputs.SettingWiredVnaGetArgs>? WiredVna { get; set; }

        /// <summary>
        /// Zone Occupancy alert site settings
        /// </summary>
        [Input("zoneOccupancyAlert")]
        public Input<Inputs.SettingZoneOccupancyAlertGetArgs>? ZoneOccupancyAlert { get; set; }

        public SettingState()
        {
        }
        public static new SettingState Empty => new SettingState();
    }
}
