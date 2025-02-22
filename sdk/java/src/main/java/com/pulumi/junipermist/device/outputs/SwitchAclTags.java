// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.SwitchAclTagsSpec;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchAclTags {
    /**
     * @return required if
     * - `type`==`dynamic_gbp` (gbp_tag received from RADIUS)
     * - `type`==`static_gbp` (applying gbp tag against matching conditions)
     * 
     */
    private @Nullable Integer gbpTag;
    /**
     * @return required if
     * - `type`==`mac`
     * - `type`==`static_gbp` if from matching mac
     * 
     */
    private @Nullable List<String> macs;
    /**
     * @return if:
     *   * `type`==`mac` (optional. default is `any`)
     *   * `type`==`subnet` (optional. default is `any`)
     *   * `type`==`network`
     *   * `type`==`resource` (optional. default is `any`)
     *   * `type`==`static_gbp` if from matching network (vlan)&#39;
     * 
     */
    private @Nullable String network;
    /**
     * @return required if:
     *   * `type`==`radius_group`
     *   * `type`==`static_gbp`
     *     if from matching radius_group
     * 
     */
    private @Nullable String radiusGroup;
    /**
     * @return if `type`==`resource`
     * empty means unrestricted, i.e. any
     * 
     */
    private @Nullable List<SwitchAclTagsSpec> specs;
    /**
     * @return if
     * - `type`==`subnet`
     * - `type`==`resource` (optional. default is `any`)
     * - `type`==`static_gbp` if from matching subnet
     * 
     */
    private @Nullable List<String> subnets;
    /**
     * @return enum: `any`, `dynamic_gbp`, `mac`, `network`, `radius_group`, `resource`, `static_gbp`, `subnet`
     * 
     */
    private String type;

    private SwitchAclTags() {}
    /**
     * @return required if
     * - `type`==`dynamic_gbp` (gbp_tag received from RADIUS)
     * - `type`==`static_gbp` (applying gbp tag against matching conditions)
     * 
     */
    public Optional<Integer> gbpTag() {
        return Optional.ofNullable(this.gbpTag);
    }
    /**
     * @return required if
     * - `type`==`mac`
     * - `type`==`static_gbp` if from matching mac
     * 
     */
    public List<String> macs() {
        return this.macs == null ? List.of() : this.macs;
    }
    /**
     * @return if:
     *   * `type`==`mac` (optional. default is `any`)
     *   * `type`==`subnet` (optional. default is `any`)
     *   * `type`==`network`
     *   * `type`==`resource` (optional. default is `any`)
     *   * `type`==`static_gbp` if from matching network (vlan)&#39;
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return required if:
     *   * `type`==`radius_group`
     *   * `type`==`static_gbp`
     *     if from matching radius_group
     * 
     */
    public Optional<String> radiusGroup() {
        return Optional.ofNullable(this.radiusGroup);
    }
    /**
     * @return if `type`==`resource`
     * empty means unrestricted, i.e. any
     * 
     */
    public List<SwitchAclTagsSpec> specs() {
        return this.specs == null ? List.of() : this.specs;
    }
    /**
     * @return if
     * - `type`==`subnet`
     * - `type`==`resource` (optional. default is `any`)
     * - `type`==`static_gbp` if from matching subnet
     * 
     */
    public List<String> subnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    /**
     * @return enum: `any`, `dynamic_gbp`, `mac`, `network`, `radius_group`, `resource`, `static_gbp`, `subnet`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchAclTags defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer gbpTag;
        private @Nullable List<String> macs;
        private @Nullable String network;
        private @Nullable String radiusGroup;
        private @Nullable List<SwitchAclTagsSpec> specs;
        private @Nullable List<String> subnets;
        private String type;
        public Builder() {}
        public Builder(SwitchAclTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gbpTag = defaults.gbpTag;
    	      this.macs = defaults.macs;
    	      this.network = defaults.network;
    	      this.radiusGroup = defaults.radiusGroup;
    	      this.specs = defaults.specs;
    	      this.subnets = defaults.subnets;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder gbpTag(@Nullable Integer gbpTag) {

            this.gbpTag = gbpTag;
            return this;
        }
        @CustomType.Setter
        public Builder macs(@Nullable List<String> macs) {

            this.macs = macs;
            return this;
        }
        public Builder macs(String... macs) {
            return macs(List.of(macs));
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {

            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder radiusGroup(@Nullable String radiusGroup) {

            this.radiusGroup = radiusGroup;
            return this;
        }
        @CustomType.Setter
        public Builder specs(@Nullable List<SwitchAclTagsSpec> specs) {

            this.specs = specs;
            return this;
        }
        public Builder specs(SwitchAclTagsSpec... specs) {
            return specs(List.of(specs));
        }
        @CustomType.Setter
        public Builder subnets(@Nullable List<String> subnets) {

            this.subnets = subnets;
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("SwitchAclTags", "type");
            }
            this.type = type;
            return this;
        }
        public SwitchAclTags build() {
            final var _resultValue = new SwitchAclTags();
            _resultValue.gbpTag = gbpTag;
            _resultValue.macs = macs;
            _resultValue.network = network;
            _resultValue.radiusGroup = radiusGroup;
            _resultValue.specs = specs;
            _resultValue.subnets = subnets;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
