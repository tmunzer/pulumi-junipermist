// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigV3ConfigTargetAddress {
    private @Nullable String address;
    private @Nullable String addressMask;
    private @Nullable Integer port;
    /**
     * @return &lt;refer to notify tag, can be multiple with blank
     * 
     */
    private @Nullable String tagList;
    private @Nullable String targetAddressName;
    /**
     * @return refer to notify target parameters name
     * 
     */
    private @Nullable String targetParameters;

    private NetworktemplateSnmpConfigV3ConfigTargetAddress() {}
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    public Optional<String> addressMask() {
        return Optional.ofNullable(this.addressMask);
    }
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return &lt;refer to notify tag, can be multiple with blank
     * 
     */
    public Optional<String> tagList() {
        return Optional.ofNullable(this.tagList);
    }
    public Optional<String> targetAddressName() {
        return Optional.ofNullable(this.targetAddressName);
    }
    /**
     * @return refer to notify target parameters name
     * 
     */
    public Optional<String> targetParameters() {
        return Optional.ofNullable(this.targetParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigV3ConfigTargetAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String addressMask;
        private @Nullable Integer port;
        private @Nullable String tagList;
        private @Nullable String targetAddressName;
        private @Nullable String targetParameters;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigV3ConfigTargetAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressMask = defaults.addressMask;
    	      this.port = defaults.port;
    	      this.tagList = defaults.tagList;
    	      this.targetAddressName = defaults.targetAddressName;
    	      this.targetParameters = defaults.targetParameters;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressMask(@Nullable String addressMask) {

            this.addressMask = addressMask;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder tagList(@Nullable String tagList) {

            this.tagList = tagList;
            return this;
        }
        @CustomType.Setter
        public Builder targetAddressName(@Nullable String targetAddressName) {

            this.targetAddressName = targetAddressName;
            return this;
        }
        @CustomType.Setter
        public Builder targetParameters(@Nullable String targetParameters) {

            this.targetParameters = targetParameters;
            return this;
        }
        public NetworktemplateSnmpConfigV3ConfigTargetAddress build() {
            final var _resultValue = new NetworktemplateSnmpConfigV3ConfigTargetAddress();
            _resultValue.address = address;
            _resultValue.addressMask = addressMask;
            _resultValue.port = port;
            _resultValue.tagList = tagList;
            _resultValue.targetAddressName = targetAddressName;
            _resultValue.targetParameters = targetParameters;
            return _resultValue;
        }
    }
}
