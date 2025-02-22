// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.device.SwitchArgs;
import com.pulumi.junipermist.device.inputs.SwitchState;
import com.pulumi.junipermist.device.outputs.SwitchAclPolicy;
import com.pulumi.junipermist.device.outputs.SwitchAclTags;
import com.pulumi.junipermist.device.outputs.SwitchDhcpSnooping;
import com.pulumi.junipermist.device.outputs.SwitchDhcpdConfig;
import com.pulumi.junipermist.device.outputs.SwitchEvpnConfig;
import com.pulumi.junipermist.device.outputs.SwitchExtraRoutes6;
import com.pulumi.junipermist.device.outputs.SwitchExtraRoutes;
import com.pulumi.junipermist.device.outputs.SwitchIpConfig;
import com.pulumi.junipermist.device.outputs.SwitchMistNac;
import com.pulumi.junipermist.device.outputs.SwitchNetworks;
import com.pulumi.junipermist.device.outputs.SwitchOobIpConfig;
import com.pulumi.junipermist.device.outputs.SwitchOspfConfig;
import com.pulumi.junipermist.device.outputs.SwitchOtherIpConfigs;
import com.pulumi.junipermist.device.outputs.SwitchPortConfig;
import com.pulumi.junipermist.device.outputs.SwitchPortMirroring;
import com.pulumi.junipermist.device.outputs.SwitchPortUsages;
import com.pulumi.junipermist.device.outputs.SwitchRadiusConfig;
import com.pulumi.junipermist.device.outputs.SwitchRemoteSyslog;
import com.pulumi.junipermist.device.outputs.SwitchSnmpConfig;
import com.pulumi.junipermist.device.outputs.SwitchStpConfig;
import com.pulumi.junipermist.device.outputs.SwitchSwitchMgmt;
import com.pulumi.junipermist.device.outputs.SwitchVirtualChassis;
import com.pulumi.junipermist.device.outputs.SwitchVrfConfig;
import com.pulumi.junipermist.device.outputs.SwitchVrfInstances;
import com.pulumi.junipermist.device.outputs.SwitchVrrpConfig;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Switch configuration.It can be used to define specific configuration at the device level or to override Org/Site Network template settings.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.junipermist.device.Switch;
 * import com.pulumi.junipermist.device.SwitchArgs;
 * import com.pulumi.junipermist.device.inputs.SwitchIpConfigArgs;
 * import com.pulumi.junipermist.device.inputs.SwitchMistNacArgs;
 * import com.pulumi.junipermist.device.inputs.SwitchDhcpdConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var switchOne = new Switch("switchOne", SwitchArgs.builder()
 *             .name("switch_one")
 *             .deviceId(inventory.devices()[1].id())
 *             .siteId(inventory.devices()[1].siteId())
 *             .managed(true)
 *             .role("test")
 *             .networks(Map.of("prx", Map.of("vlanId", "18")))
 *             .portUsages(Map.of("prx", Map.ofEntries(
 *                 Map.entry("mode", "trunk"),
 *                 Map.entry("disabled", false),
 *                 Map.entry("portNetwork", "default"),
 *                 Map.entry("stpEdge", false),
 *                 Map.entry("allNetworks", false),
 *                 Map.entry("networks",                 
 *                     "default",
 *                     "prx"),
 *                 Map.entry("speed", "auto"),
 *                 Map.entry("duplex", "auto"),
 *                 Map.entry("macLimit", 0),
 *                 Map.entry("persistMac", false),
 *                 Map.entry("poeDisabled", false),
 *                 Map.entry("enableQos", false),
 *                 Map.entry("stormControl", ),
 *                 Map.entry("description", "")
 *             )))
 *             .ipConfig(SwitchIpConfigArgs.builder()
 *                 .type("static")
 *                 .ip("10.3.18.99")
 *                 .netmask("255.255.255.0")
 *                 .network("prx")
 *                 .gateway("10.3.18.11")
 *                 .build())
 *             .portConfig(Map.ofEntries(
 *                 Map.entry("ge-0/0/0", Map.ofEntries(
 *                     Map.entry("usage", "prx"),
 *                     Map.entry("critical", false),
 *                     Map.entry("noLocalOverwrite", true)
 *                 )),
 *                 Map.entry("ge-0/0/11", Map.ofEntries(
 *                     Map.entry("usage", "default"),
 *                     Map.entry("portNetwork", "prx"),
 *                     Map.entry("critical", false)
 *                 ))
 *             ))
 *             .portMirroring(Map.of("test", Map.ofEntries(
 *                 Map.entry("outputPortId", "ge-0/0/10"),
 *                 Map.entry("inputPortIdsIngress", "ge-0/0/2"),
 *                 Map.entry("inputPortIdsEgress", "ge-0/0/2"),
 *                 Map.entry("inputNetworksIngress", "default")
 *             )))
 *             .mistNac(SwitchMistNacArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .dhcpdConfig(SwitchDhcpdConfigArgs.builder()
 *                 .enabled(true)
 * %!v(PANIC=Format method: interface conversion: model.Expression is *model.TemplateExpression, not *model.LiteralValueExpression))
 *                 .build());
 * 
 *         }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_device_switch` with:
 * 
 * Switch Configuration can be imported by specifying the site_id and the device_id
 * 
 * ```sh
 * $ pulumi import junipermist:device/switch:Switch switch_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:device/switch:Switch")
public class Switch extends com.pulumi.resources.CustomResource {
    @Export(name="aclPolicies", refs={List.class,SwitchAclPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SwitchAclPolicy>> aclPolicies;

    public Output<Optional<List<SwitchAclPolicy>>> aclPolicies() {
        return Codegen.optional(this.aclPolicies);
    }
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     * 
     */
    @Export(name="aclTags", refs={Map.class,String.class,SwitchAclTags.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchAclTags>> aclTags;

    /**
     * @return ACL Tags to identify traffic source or destination. Key name is the tag name
     * 
     */
    public Output<Optional<Map<String,SwitchAclTags>>> aclTags() {
        return Codegen.optional(this.aclTags);
    }
    /**
     * additional CLI commands to append to the generated Junos config **Note**: no check is done
     * 
     */
    @Export(name="additionalConfigCmds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> additionalConfigCmds;

    /**
     * @return additional CLI commands to append to the generated Junos config **Note**: no check is done
     * 
     */
    public Output<Optional<List<String>>> additionalConfigCmds() {
        return Codegen.optional(this.additionalConfigCmds);
    }
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId;
    }
    @Export(name="deviceprofileId", refs={String.class}, tree="[0]")
    private Output<String> deviceprofileId;

    public Output<String> deviceprofileId() {
        return this.deviceprofileId;
    }
    @Export(name="dhcpSnooping", refs={SwitchDhcpSnooping.class}, tree="[0]")
    private Output</* @Nullable */ SwitchDhcpSnooping> dhcpSnooping;

    public Output<Optional<SwitchDhcpSnooping>> dhcpSnooping() {
        return Codegen.optional(this.dhcpSnooping);
    }
    @Export(name="dhcpdConfig", refs={SwitchDhcpdConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchDhcpdConfig> dhcpdConfig;

    public Output<Optional<SwitchDhcpdConfig>> dhcpdConfig() {
        return Codegen.optional(this.dhcpdConfig);
    }
    /**
     * for a claimed switch, we control the configs by default. This option (disables the behavior)
     * 
     */
    @Export(name="disableAutoConfig", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disableAutoConfig;

    /**
     * @return for a claimed switch, we control the configs by default. This option (disables the behavior)
     * 
     */
    public Output<Boolean> disableAutoConfig() {
        return this.disableAutoConfig;
    }
    /**
     * Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    @Export(name="dnsServers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dnsServers;

    /**
     * @return Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    public Output<Optional<List<String>>> dnsServers() {
        return Codegen.optional(this.dnsServers);
    }
    /**
     * Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    @Export(name="dnsSuffixes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dnsSuffixes;

    /**
     * @return Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
     * 
     */
    public Output<Optional<List<String>>> dnsSuffixes() {
        return Codegen.optional(this.dnsSuffixes);
    }
    /**
     * EVPN Junos settings
     * 
     */
    @Export(name="evpnConfig", refs={SwitchEvpnConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchEvpnConfig> evpnConfig;

    /**
     * @return EVPN Junos settings
     * 
     */
    public Output<Optional<SwitchEvpnConfig>> evpnConfig() {
        return Codegen.optional(this.evpnConfig);
    }
    @Export(name="extraRoutes", refs={Map.class,String.class,SwitchExtraRoutes.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchExtraRoutes>> extraRoutes;

    public Output<Optional<Map<String,SwitchExtraRoutes>>> extraRoutes() {
        return Codegen.optional(this.extraRoutes);
    }
    /**
     * Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    @Export(name="extraRoutes6", refs={Map.class,String.class,SwitchExtraRoutes6.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchExtraRoutes6>> extraRoutes6;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    public Output<Optional<Map<String,SwitchExtraRoutes6>>> extraRoutes6() {
        return Codegen.optional(this.extraRoutes6);
    }
    @Export(name="image1Url", refs={String.class}, tree="[0]")
    private Output<String> image1Url;

    public Output<String> image1Url() {
        return this.image1Url;
    }
    @Export(name="image2Url", refs={String.class}, tree="[0]")
    private Output<String> image2Url;

    public Output<String> image2Url() {
        return this.image2Url;
    }
    @Export(name="image3Url", refs={String.class}, tree="[0]")
    private Output<String> image3Url;

    public Output<String> image3Url() {
        return this.image3Url;
    }
    /**
     * Junos IP Config
     * 
     */
    @Export(name="ipConfig", refs={SwitchIpConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchIpConfig> ipConfig;

    /**
     * @return Junos IP Config
     * 
     */
    public Output<Optional<SwitchIpConfig>> ipConfig() {
        return Codegen.optional(this.ipConfig);
    }
    /**
     * device MAC address
     * 
     */
    @Export(name="mac", refs={String.class}, tree="[0]")
    private Output<String> mac;

    /**
     * @return device MAC address
     * 
     */
    public Output<String> mac() {
        return this.mac;
    }
    /**
     * for an adopted switch, we don’t overwrite their existing configs automatically
     * 
     */
    @Export(name="managed", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> managed;

    /**
     * @return for an adopted switch, we don’t overwrite their existing configs automatically
     * 
     */
    public Output<Boolean> managed() {
        return this.managed;
    }
    /**
     * map where the device belongs to
     * 
     */
    @Export(name="mapId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mapId;

    /**
     * @return map where the device belongs to
     * 
     */
    public Output<Optional<String>> mapId() {
        return Codegen.optional(this.mapId);
    }
    /**
     * enable mist_nac to use radsec
     * 
     */
    @Export(name="mistNac", refs={SwitchMistNac.class}, tree="[0]")
    private Output</* @Nullable */ SwitchMistNac> mistNac;

    /**
     * @return enable mist_nac to use radsec
     * 
     */
    public Output<Optional<SwitchMistNac>> mistNac() {
        return Codegen.optional(this.mistNac);
    }
    /**
     * device Model
     * 
     */
    @Export(name="model", refs={String.class}, tree="[0]")
    private Output<String> model;

    /**
     * @return device Model
     * 
     */
    public Output<String> model() {
        return this.model;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Property key is network name
     * 
     */
    @Export(name="networks", refs={Map.class,String.class,SwitchNetworks.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchNetworks>> networks;

    /**
     * @return Property key is network name
     * 
     */
    public Output<Optional<Map<String,SwitchNetworks>>> networks() {
        return Codegen.optional(this.networks);
    }
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notes;

    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    /**
     * list of NTP servers specific to this device. By default, those in Site Settings will be used
     * 
     */
    @Export(name="ntpServers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ntpServers;

    /**
     * @return list of NTP servers specific to this device. By default, those in Site Settings will be used
     * 
     */
    public Output<Optional<List<String>>> ntpServers() {
        return Codegen.optional(this.ntpServers);
    }
    /**
     * - If HA configuration: key parameter will be nodeX (eg: node1) - If there are 2 routing engines, re1 mgmt IP has to be
     *   set separately (if desired): key parameter = `re1`
     * 
     */
    @Export(name="oobIpConfig", refs={SwitchOobIpConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchOobIpConfig> oobIpConfig;

    /**
     * @return - If HA configuration: key parameter will be nodeX (eg: node1) - If there are 2 routing engines, re1 mgmt IP has to be
     * set separately (if desired): key parameter = `re1`
     * 
     */
    public Output<Optional<SwitchOobIpConfig>> oobIpConfig() {
        return Codegen.optional(this.oobIpConfig);
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Junos OSPF config
     * 
     */
    @Export(name="ospfConfig", refs={SwitchOspfConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchOspfConfig> ospfConfig;

    /**
     * @return Junos OSPF config
     * 
     */
    public Output<Optional<SwitchOspfConfig>> ospfConfig() {
        return Codegen.optional(this.ospfConfig);
    }
    /**
     * Property key is the network name
     * 
     */
    @Export(name="otherIpConfigs", refs={Map.class,String.class,SwitchOtherIpConfigs.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchOtherIpConfigs>> otherIpConfigs;

    /**
     * @return Property key is the network name
     * 
     */
    public Output<Optional<Map<String,SwitchOtherIpConfigs>>> otherIpConfigs() {
        return Codegen.optional(this.otherIpConfigs);
    }
    /**
     * Property key is the port name or range (e.g. &#34;ge-0/0/0-10&#34;)
     * 
     */
    @Export(name="portConfig", refs={Map.class,String.class,SwitchPortConfig.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchPortConfig>> portConfig;

    /**
     * @return Property key is the port name or range (e.g. &#34;ge-0/0/0-10&#34;)
     * 
     */
    public Output<Optional<Map<String,SwitchPortConfig>>> portConfig() {
        return Codegen.optional(this.portConfig);
    }
    /**
     * Property key is the port mirroring instance name port_mirroring can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     * 
     */
    @Export(name="portMirroring", refs={Map.class,String.class,SwitchPortMirroring.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchPortMirroring>> portMirroring;

    /**
     * @return Property key is the port mirroring instance name port_mirroring can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     * 
     */
    public Output<Optional<Map<String,SwitchPortMirroring>>> portMirroring() {
        return Codegen.optional(this.portMirroring);
    }
    @Export(name="portUsages", refs={Map.class,String.class,SwitchPortUsages.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchPortUsages>> portUsages;

    public Output<Optional<Map<String,SwitchPortUsages>>> portUsages() {
        return Codegen.optional(this.portUsages);
    }
    /**
     * Junos Radius config
     * 
     */
    @Export(name="radiusConfig", refs={SwitchRadiusConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchRadiusConfig> radiusConfig;

    /**
     * @return Junos Radius config
     * 
     */
    public Output<Optional<SwitchRadiusConfig>> radiusConfig() {
        return Codegen.optional(this.radiusConfig);
    }
    @Export(name="remoteSyslog", refs={SwitchRemoteSyslog.class}, tree="[0]")
    private Output</* @Nullable */ SwitchRemoteSyslog> remoteSyslog;

    public Output<Optional<SwitchRemoteSyslog>> remoteSyslog() {
        return Codegen.optional(this.remoteSyslog);
    }
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> role;

    public Output<Optional<String>> role() {
        return Codegen.optional(this.role);
    }
    /**
     * used for OSPF / BGP / EVPN
     * 
     */
    @Export(name="routerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> routerId;

    /**
     * @return used for OSPF / BGP / EVPN
     * 
     */
    public Output<Optional<String>> routerId() {
        return Codegen.optional(this.routerId);
    }
    /**
     * device Serial
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return device Serial
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }
    @Export(name="snmpConfig", refs={SwitchSnmpConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchSnmpConfig> snmpConfig;

    public Output<Optional<SwitchSnmpConfig>> snmpConfig() {
        return Codegen.optional(this.snmpConfig);
    }
    @Export(name="stpConfig", refs={SwitchStpConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchStpConfig> stpConfig;

    public Output<Optional<SwitchStpConfig>> stpConfig() {
        return Codegen.optional(this.stpConfig);
    }
    /**
     * Switch settings
     * 
     */
    @Export(name="switchMgmt", refs={SwitchSwitchMgmt.class}, tree="[0]")
    private Output</* @Nullable */ SwitchSwitchMgmt> switchMgmt;

    /**
     * @return Switch settings
     * 
     */
    public Output<Optional<SwitchSwitchMgmt>> switchMgmt() {
        return Codegen.optional(this.switchMgmt);
    }
    /**
     * Device Type. enum: `switch`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Device Type. enum: `switch`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * whether to use it for snmp / syslog / tacplus / radius
     * 
     */
    @Export(name="useRouterIdAsSourceIp", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> useRouterIdAsSourceIp;

    /**
     * @return whether to use it for snmp / syslog / tacplus / radius
     * 
     */
    public Output<Boolean> useRouterIdAsSourceIp() {
        return this.useRouterIdAsSourceIp;
    }
    /**
     * a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    @Export(name="vars", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> vars;

    /**
     * @return a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    public Output<Optional<Map<String,String>>> vars() {
        return Codegen.optional(this.vars);
    }
    /**
     * required for preprovisioned Virtual Chassis
     * 
     */
    @Export(name="virtualChassis", refs={SwitchVirtualChassis.class}, tree="[0]")
    private Output</* @Nullable */ SwitchVirtualChassis> virtualChassis;

    /**
     * @return required for preprovisioned Virtual Chassis
     * 
     */
    public Output<Optional<SwitchVirtualChassis>> virtualChassis() {
        return Codegen.optional(this.virtualChassis);
    }
    @Export(name="vrfConfig", refs={SwitchVrfConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchVrfConfig> vrfConfig;

    public Output<Optional<SwitchVrfConfig>> vrfConfig() {
        return Codegen.optional(this.vrfConfig);
    }
    /**
     * Property key is the network name
     * 
     */
    @Export(name="vrfInstances", refs={Map.class,String.class,SwitchVrfInstances.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SwitchVrfInstances>> vrfInstances;

    /**
     * @return Property key is the network name
     * 
     */
    public Output<Optional<Map<String,SwitchVrfInstances>>> vrfInstances() {
        return Codegen.optional(this.vrfInstances);
    }
    /**
     * Junos VRRP config
     * 
     */
    @Export(name="vrrpConfig", refs={SwitchVrrpConfig.class}, tree="[0]")
    private Output</* @Nullable */ SwitchVrrpConfig> vrrpConfig;

    /**
     * @return Junos VRRP config
     * 
     */
    public Output<Optional<SwitchVrrpConfig>> vrrpConfig() {
        return Codegen.optional(this.vrrpConfig);
    }
    /**
     * x in pixel
     * 
     */
    @Export(name="x", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> x;

    /**
     * @return x in pixel
     * 
     */
    public Output<Optional<Double>> x() {
        return Codegen.optional(this.x);
    }
    /**
     * y in pixel
     * 
     */
    @Export(name="y", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> y;

    /**
     * @return y in pixel
     * 
     */
    public Output<Optional<Double>> y() {
        return Codegen.optional(this.y);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Switch(java.lang.String name) {
        this(name, SwitchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Switch(java.lang.String name, SwitchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Switch(java.lang.String name, SwitchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/switch:Switch", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Switch(java.lang.String name, Output<java.lang.String> id, @Nullable SwitchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/switch:Switch", name, state, makeResourceOptions(options, id), false);
    }

    private static SwitchArgs makeArgs(SwitchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SwitchArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Switch get(java.lang.String name, Output<java.lang.String> id, @Nullable SwitchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Switch(name, id, state, options);
    }
}
