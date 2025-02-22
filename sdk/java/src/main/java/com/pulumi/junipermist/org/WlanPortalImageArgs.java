// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanPortalImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanPortalImageArgs Empty = new WlanPortalImageArgs();

    /**
     * binary file
     * 
     */
    @Import(name="file", required=true)
    private Output<String> file;

    /**
     * @return binary file
     * 
     */
    public Output<String> file() {
        return this.file;
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    @Import(name="wlanId")
    private @Nullable Output<String> wlanId;

    public Optional<Output<String>> wlanId() {
        return Optional.ofNullable(this.wlanId);
    }

    private WlanPortalImageArgs() {}

    private WlanPortalImageArgs(WlanPortalImageArgs $) {
        this.file = $.file;
        this.orgId = $.orgId;
        this.wlanId = $.wlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanPortalImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanPortalImageArgs $;

        public Builder() {
            $ = new WlanPortalImageArgs();
        }

        public Builder(WlanPortalImageArgs defaults) {
            $ = new WlanPortalImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param file binary file
         * 
         * @return builder
         * 
         */
        public Builder file(Output<String> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file binary file
         * 
         * @return builder
         * 
         */
        public Builder file(String file) {
            return file(Output.of(file));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder wlanId(@Nullable Output<String> wlanId) {
            $.wlanId = wlanId;
            return this;
        }

        public Builder wlanId(String wlanId) {
            return wlanId(Output.of(wlanId));
        }

        public WlanPortalImageArgs build() {
            if ($.file == null) {
                throw new MissingRequiredPropertyException("WlanPortalImageArgs", "file");
            }
            return $;
        }
    }

}
