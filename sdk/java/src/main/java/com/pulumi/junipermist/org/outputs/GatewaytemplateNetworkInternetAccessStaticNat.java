// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateNetworkInternetAccessStaticNat {
    private @Nullable String internalIp;
    private @Nullable String name;
    /**
     * @return If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    private @Nullable String wanName;

    private GatewaytemplateNetworkInternetAccessStaticNat() {}
    public Optional<String> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    public Optional<String> wanName() {
        return Optional.ofNullable(this.wanName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateNetworkInternetAccessStaticNat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String internalIp;
        private @Nullable String name;
        private @Nullable String wanName;
        public Builder() {}
        public Builder(GatewaytemplateNetworkInternetAccessStaticNat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIp = defaults.internalIp;
    	      this.name = defaults.name;
    	      this.wanName = defaults.wanName;
        }

        @CustomType.Setter
        public Builder internalIp(@Nullable String internalIp) {

            this.internalIp = internalIp;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder wanName(@Nullable String wanName) {

            this.wanName = wanName;
            return this;
        }
        public GatewaytemplateNetworkInternetAccessStaticNat build() {
            final var _resultValue = new GatewaytemplateNetworkInternetAccessStaticNat();
            _resultValue.internalIp = internalIp;
            _resultValue.name = name;
            _resultValue.wanName = wanName;
            return _resultValue;
        }
    }
}
