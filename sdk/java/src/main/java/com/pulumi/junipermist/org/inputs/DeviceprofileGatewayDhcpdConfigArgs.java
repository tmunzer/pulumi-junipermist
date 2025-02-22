// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayDhcpdConfigConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayDhcpdConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayDhcpdConfigArgs Empty = new DeviceprofileGatewayDhcpdConfigArgs();

    @Import(name="config")
    private @Nullable Output<Map<String,DeviceprofileGatewayDhcpdConfigConfigArgs>> config;

    public Optional<Output<Map<String,DeviceprofileGatewayDhcpdConfigConfigArgs>>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * if set to `true`, enable the DHCP server
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return if set to `true`, enable the DHCP server
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private DeviceprofileGatewayDhcpdConfigArgs() {}

    private DeviceprofileGatewayDhcpdConfigArgs(DeviceprofileGatewayDhcpdConfigArgs $) {
        this.config = $.config;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayDhcpdConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayDhcpdConfigArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayDhcpdConfigArgs();
        }

        public Builder(DeviceprofileGatewayDhcpdConfigArgs defaults) {
            $ = new DeviceprofileGatewayDhcpdConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(@Nullable Output<Map<String,DeviceprofileGatewayDhcpdConfigConfigArgs>> config) {
            $.config = config;
            return this;
        }

        public Builder config(Map<String,DeviceprofileGatewayDhcpdConfigConfigArgs> config) {
            return config(Output.of(config));
        }

        /**
         * @param enabled if set to `true`, enable the DHCP server
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled if set to `true`, enable the DHCP server
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public DeviceprofileGatewayDhcpdConfigArgs build() {
            return $;
        }
    }

}
