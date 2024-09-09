// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.NetworktemplateArgs;
import com.pulumi.junipermist.org.inputs.NetworktemplateState;
import com.pulumi.junipermist.org.outputs.NetworktemplateAclPolicy;
import com.pulumi.junipermist.org.outputs.NetworktemplateAclTags;
import com.pulumi.junipermist.org.outputs.NetworktemplateDhcpSnooping;
import com.pulumi.junipermist.org.outputs.NetworktemplateExtraRoutes6;
import com.pulumi.junipermist.org.outputs.NetworktemplateExtraRoutes;
import com.pulumi.junipermist.org.outputs.NetworktemplateMistNac;
import com.pulumi.junipermist.org.outputs.NetworktemplateNetworks;
import com.pulumi.junipermist.org.outputs.NetworktemplatePortMirroring;
import com.pulumi.junipermist.org.outputs.NetworktemplatePortUsages;
import com.pulumi.junipermist.org.outputs.NetworktemplateRadiusConfig;
import com.pulumi.junipermist.org.outputs.NetworktemplateRemoteSyslog;
import com.pulumi.junipermist.org.outputs.NetworktemplateSnmpConfig;
import com.pulumi.junipermist.org.outputs.NetworktemplateSwitchMatching;
import com.pulumi.junipermist.org.outputs.NetworktemplateSwitchMgmt;
import com.pulumi.junipermist.org.outputs.NetworktemplateVrfConfig;
import com.pulumi.junipermist.org.outputs.NetworktemplateVrfInstances;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource managed the Org Network Templates (Switch templates).A network template is a predefined configuration that provides a consistent and reusable set of network settings for devices within an organization. It includes various parameters such as ip addressing, vlan configurations, routing protocols, security policies, and other network-specific settings. Network templates simplify the deployment and management of switches by ensuring consistent configurations across multiple devices and sites. They help enforce standardization, reduce human error, and streamline troubleshooting and maintenance tasks.
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
 * import com.pulumi.junipermist.org.Networktemplate;
 * import com.pulumi.junipermist.org.NetworktemplateArgs;
 * import com.pulumi.junipermist.org.inputs.NetworktemplateRadiusConfigArgs;
 * import com.pulumi.junipermist.org.inputs.NetworktemplateSwitchMatchingArgs;
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
 *         var networktemplateOne = new Networktemplate("networktemplateOne", NetworktemplateArgs.builder()
 *             .name("networktemplate_one")
 *             .orgId(terraformTest.id())
 *             .dnsServers(            
 *                 "8.8.8.8",
 *                 "1.1.1.1")
 *             .dnsSuffixes("mycorp.com")
 *             .ntpServers("pool.ntp.org")
 *             .additionalConfigCmds(            
 *                 "set system hostnam test",
 *                 "set system services ssh root-login allow")
 *             .networks(Map.ofEntries(
 *                 Map.entry("network_one", Map.of("vlanId", 10)),
 *                 Map.entry("network_two", Map.of("vlanId", 11))
 *             ))
 *             .portUsages(Map.of("trunk", Map.ofEntries(
 *                 Map.entry("allNetworks", true),
 *                 Map.entry("enableQos", true),
 *                 Map.entry("mode", "port_usage_one"),
 *                 Map.entry("portNetwork", "network_one")
 *             )))
 *             .radiusConfig(NetworktemplateRadiusConfigArgs.builder()
 *                 .acct_interim_interval(60)
 *                 .coa_enabled(true)
 *                 .network("network_one")
 *                 .acct_servers(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .auth_servers(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .switchMatching(NetworktemplateSwitchMatchingArgs.builder()
 *                 .enable(true)
 *                 .rules(NetworktemplateSwitchMatchingRuleArgs.builder()
 *                     .name("switch_rule_one")
 *                     .matchType("match_name[0:3]")
 *                     .matchValue("abc")
 *                     .portConfig(Map.of("ge-0/0/0-10", Map.of("usage", "port_usage_one")))
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_org_networktemplate` with:
 * 
 * Org Network Template can be imported by specifying the org_id and the networktemplate_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/networktemplate:Networktemplate networktemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/networktemplate:Networktemplate")
public class Networktemplate extends com.pulumi.resources.CustomResource {
    @Export(name="aclPolicies", refs={List.class,NetworktemplateAclPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NetworktemplateAclPolicy>> aclPolicies;

    public Output<Optional<List<NetworktemplateAclPolicy>>> aclPolicies() {
        return Codegen.optional(this.aclPolicies);
    }
    /**
     * ACL Tags to identify traffic source or destination. Key name is the tag name
     * 
     */
    @Export(name="aclTags", refs={Map.class,String.class,NetworktemplateAclTags.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateAclTags>> aclTags;

    /**
     * @return ACL Tags to identify traffic source or destination. Key name is the tag name
     * 
     */
    public Output<Optional<Map<String,NetworktemplateAclTags>>> aclTags() {
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
    @Export(name="dhcpSnooping", refs={NetworktemplateDhcpSnooping.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateDhcpSnooping> dhcpSnooping;

    public Output<Optional<NetworktemplateDhcpSnooping>> dhcpSnooping() {
        return Codegen.optional(this.dhcpSnooping);
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
    @Export(name="extraRoutes", refs={Map.class,String.class,NetworktemplateExtraRoutes.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateExtraRoutes>> extraRoutes;

    public Output<Optional<Map<String,NetworktemplateExtraRoutes>>> extraRoutes() {
        return Codegen.optional(this.extraRoutes);
    }
    /**
     * Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    @Export(name="extraRoutes6", refs={Map.class,String.class,NetworktemplateExtraRoutes6.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateExtraRoutes6>> extraRoutes6;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;2a02:1234:420a:10c9::/64&#34;)
     * 
     */
    public Output<Optional<Map<String,NetworktemplateExtraRoutes6>>> extraRoutes6() {
        return Codegen.optional(this.extraRoutes6);
    }
    /**
     * enable mist_nac to use radsec
     * 
     */
    @Export(name="mistNac", refs={NetworktemplateMistNac.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateMistNac> mistNac;

    /**
     * @return enable mist_nac to use radsec
     * 
     */
    public Output<Optional<NetworktemplateMistNac>> mistNac() {
        return Codegen.optional(this.mistNac);
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
    @Export(name="networks", refs={Map.class,String.class,NetworktemplateNetworks.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateNetworks>> networks;

    /**
     * @return Property key is network name
     * 
     */
    public Output<Optional<Map<String,NetworktemplateNetworks>>> networks() {
        return Codegen.optional(this.networks);
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
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Property key is the port mirroring instance name port_mirroring can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     * 
     */
    @Export(name="portMirroring", refs={Map.class,String.class,NetworktemplatePortMirroring.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplatePortMirroring>> portMirroring;

    /**
     * @return Property key is the port mirroring instance name port_mirroring can be added under device/site settings. It takes
     * interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
     * 
     */
    public Output<Optional<Map<String,NetworktemplatePortMirroring>>> portMirroring() {
        return Codegen.optional(this.portMirroring);
    }
    @Export(name="portUsages", refs={Map.class,String.class,NetworktemplatePortUsages.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplatePortUsages>> portUsages;

    public Output<Optional<Map<String,NetworktemplatePortUsages>>> portUsages() {
        return Codegen.optional(this.portUsages);
    }
    /**
     * Junos Radius config
     * 
     */
    @Export(name="radiusConfig", refs={NetworktemplateRadiusConfig.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateRadiusConfig> radiusConfig;

    /**
     * @return Junos Radius config
     * 
     */
    public Output<Optional<NetworktemplateRadiusConfig>> radiusConfig() {
        return Codegen.optional(this.radiusConfig);
    }
    @Export(name="remoteSyslog", refs={NetworktemplateRemoteSyslog.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateRemoteSyslog> remoteSyslog;

    public Output<Optional<NetworktemplateRemoteSyslog>> remoteSyslog() {
        return Codegen.optional(this.remoteSyslog);
    }
    /**
     * by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
     * 
     */
    @Export(name="removeExistingConfigs", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> removeExistingConfigs;

    /**
     * @return by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
     * 
     */
    public Output<Boolean> removeExistingConfigs() {
        return this.removeExistingConfigs;
    }
    @Export(name="snmpConfig", refs={NetworktemplateSnmpConfig.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateSnmpConfig> snmpConfig;

    public Output<Optional<NetworktemplateSnmpConfig>> snmpConfig() {
        return Codegen.optional(this.snmpConfig);
    }
    /**
     * Switch template
     * 
     */
    @Export(name="switchMatching", refs={NetworktemplateSwitchMatching.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateSwitchMatching> switchMatching;

    /**
     * @return Switch template
     * 
     */
    public Output<Optional<NetworktemplateSwitchMatching>> switchMatching() {
        return Codegen.optional(this.switchMatching);
    }
    /**
     * Switch settings
     * 
     */
    @Export(name="switchMgmt", refs={NetworktemplateSwitchMgmt.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateSwitchMgmt> switchMgmt;

    /**
     * @return Switch settings
     * 
     */
    public Output<Optional<NetworktemplateSwitchMgmt>> switchMgmt() {
        return Codegen.optional(this.switchMgmt);
    }
    @Export(name="vrfConfig", refs={NetworktemplateVrfConfig.class}, tree="[0]")
    private Output</* @Nullable */ NetworktemplateVrfConfig> vrfConfig;

    public Output<Optional<NetworktemplateVrfConfig>> vrfConfig() {
        return Codegen.optional(this.vrfConfig);
    }
    /**
     * Property key is the network name
     * 
     */
    @Export(name="vrfInstances", refs={Map.class,String.class,NetworktemplateVrfInstances.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,NetworktemplateVrfInstances>> vrfInstances;

    /**
     * @return Property key is the network name
     * 
     */
    public Output<Optional<Map<String,NetworktemplateVrfInstances>>> vrfInstances() {
        return Codegen.optional(this.vrfInstances);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Networktemplate(java.lang.String name) {
        this(name, NetworktemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Networktemplate(java.lang.String name, NetworktemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Networktemplate(java.lang.String name, NetworktemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/networktemplate:Networktemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Networktemplate(java.lang.String name, Output<java.lang.String> id, @Nullable NetworktemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/networktemplate:Networktemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworktemplateArgs makeArgs(NetworktemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworktemplateArgs.Empty : args;
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
    public static Networktemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworktemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Networktemplate(name, id, state, options);
    }
}
