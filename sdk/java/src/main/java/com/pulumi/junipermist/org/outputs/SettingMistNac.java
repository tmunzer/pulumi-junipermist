// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.SettingMistNacIdp;
import com.pulumi.junipermist.org.outputs.SettingMistNacServerCert;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingMistNac {
    /**
     * @return list of PEM-encoded ca certs
     * 
     */
    private @Nullable List<String> cacerts;
    /**
     * @return use this IDP when no explicit realm present in the incoming username/CN OR when no IDP is explicitly mapped to the incoming realm.
     * 
     */
    private @Nullable String defaultIdpId;
    /**
     * @return eap ssl security level
     * see https://www.openssl.org/docs/man1.1.1/man3/SSL_CTX_set_security_level.html#DEFAULT-CALLBACK-BEHAVIOUR
     * 
     */
    private @Nullable Integer eapSslSecurityLevel;
    /**
     * @return By default NAC POD failover considers all NAC pods available around the globe, i.e. EU, US, or APAC based, failover happens based on geo IP of the originating site.
     * For strict GDPR compliancy NAC POD failover would only happen between the PODs located within the EU environment, and no authentication would take place outside of EU. This is an org setting that is applicable to WLANs, switch templates, mxedge clusters that have mist_nac enabled
     * 
     */
    private @Nullable Boolean euOnly;
    private @Nullable List<SettingMistNacIdp> idps;
    /**
     * @return radius server cert to be presented in EAP TLS
     * 
     */
    private @Nullable SettingMistNacServerCert serverCert;
    /**
     * @return by default NAS devices(switches/aps) and proxies(mxedge) are configured to reach mist-nac via IPv4. enum: `v4`, `v6`
     * 
     */
    private @Nullable String useIpVersion;
    /**
     * @return By default NAS devices (switches/aps) and proxies(mxedge) are configured to use port TCP2083(radsec) to reach mist-nac.
     * Set `use_ssl_port`==`true` to override that port with TCP43 (ssl),
     * This is a org level setting that is applicable to wlans, switch_templates, and mxedge_clusters that have mist-nac enabled
     * 
     */
    private @Nullable Boolean useSslPort;

    private SettingMistNac() {}
    /**
     * @return list of PEM-encoded ca certs
     * 
     */
    public List<String> cacerts() {
        return this.cacerts == null ? List.of() : this.cacerts;
    }
    /**
     * @return use this IDP when no explicit realm present in the incoming username/CN OR when no IDP is explicitly mapped to the incoming realm.
     * 
     */
    public Optional<String> defaultIdpId() {
        return Optional.ofNullable(this.defaultIdpId);
    }
    /**
     * @return eap ssl security level
     * see https://www.openssl.org/docs/man1.1.1/man3/SSL_CTX_set_security_level.html#DEFAULT-CALLBACK-BEHAVIOUR
     * 
     */
    public Optional<Integer> eapSslSecurityLevel() {
        return Optional.ofNullable(this.eapSslSecurityLevel);
    }
    /**
     * @return By default NAC POD failover considers all NAC pods available around the globe, i.e. EU, US, or APAC based, failover happens based on geo IP of the originating site.
     * For strict GDPR compliancy NAC POD failover would only happen between the PODs located within the EU environment, and no authentication would take place outside of EU. This is an org setting that is applicable to WLANs, switch templates, mxedge clusters that have mist_nac enabled
     * 
     */
    public Optional<Boolean> euOnly() {
        return Optional.ofNullable(this.euOnly);
    }
    public List<SettingMistNacIdp> idps() {
        return this.idps == null ? List.of() : this.idps;
    }
    /**
     * @return radius server cert to be presented in EAP TLS
     * 
     */
    public Optional<SettingMistNacServerCert> serverCert() {
        return Optional.ofNullable(this.serverCert);
    }
    /**
     * @return by default NAS devices(switches/aps) and proxies(mxedge) are configured to reach mist-nac via IPv4. enum: `v4`, `v6`
     * 
     */
    public Optional<String> useIpVersion() {
        return Optional.ofNullable(this.useIpVersion);
    }
    /**
     * @return By default NAS devices (switches/aps) and proxies(mxedge) are configured to use port TCP2083(radsec) to reach mist-nac.
     * Set `use_ssl_port`==`true` to override that port with TCP43 (ssl),
     * This is a org level setting that is applicable to wlans, switch_templates, and mxedge_clusters that have mist-nac enabled
     * 
     */
    public Optional<Boolean> useSslPort() {
        return Optional.ofNullable(this.useSslPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingMistNac defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cacerts;
        private @Nullable String defaultIdpId;
        private @Nullable Integer eapSslSecurityLevel;
        private @Nullable Boolean euOnly;
        private @Nullable List<SettingMistNacIdp> idps;
        private @Nullable SettingMistNacServerCert serverCert;
        private @Nullable String useIpVersion;
        private @Nullable Boolean useSslPort;
        public Builder() {}
        public Builder(SettingMistNac defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacerts = defaults.cacerts;
    	      this.defaultIdpId = defaults.defaultIdpId;
    	      this.eapSslSecurityLevel = defaults.eapSslSecurityLevel;
    	      this.euOnly = defaults.euOnly;
    	      this.idps = defaults.idps;
    	      this.serverCert = defaults.serverCert;
    	      this.useIpVersion = defaults.useIpVersion;
    	      this.useSslPort = defaults.useSslPort;
        }

        @CustomType.Setter
        public Builder cacerts(@Nullable List<String> cacerts) {

            this.cacerts = cacerts;
            return this;
        }
        public Builder cacerts(String... cacerts) {
            return cacerts(List.of(cacerts));
        }
        @CustomType.Setter
        public Builder defaultIdpId(@Nullable String defaultIdpId) {

            this.defaultIdpId = defaultIdpId;
            return this;
        }
        @CustomType.Setter
        public Builder eapSslSecurityLevel(@Nullable Integer eapSslSecurityLevel) {

            this.eapSslSecurityLevel = eapSslSecurityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder euOnly(@Nullable Boolean euOnly) {

            this.euOnly = euOnly;
            return this;
        }
        @CustomType.Setter
        public Builder idps(@Nullable List<SettingMistNacIdp> idps) {

            this.idps = idps;
            return this;
        }
        public Builder idps(SettingMistNacIdp... idps) {
            return idps(List.of(idps));
        }
        @CustomType.Setter
        public Builder serverCert(@Nullable SettingMistNacServerCert serverCert) {

            this.serverCert = serverCert;
            return this;
        }
        @CustomType.Setter
        public Builder useIpVersion(@Nullable String useIpVersion) {

            this.useIpVersion = useIpVersion;
            return this;
        }
        @CustomType.Setter
        public Builder useSslPort(@Nullable Boolean useSslPort) {

            this.useSslPort = useSslPort;
            return this;
        }
        public SettingMistNac build() {
            final var _resultValue = new SettingMistNac();
            _resultValue.cacerts = cacerts;
            _resultValue.defaultIdpId = defaultIdpId;
            _resultValue.eapSslSecurityLevel = eapSslSecurityLevel;
            _resultValue.euOnly = euOnly;
            _resultValue.idps = idps;
            _resultValue.serverCert = serverCert;
            _resultValue.useIpVersion = useIpVersion;
            _resultValue.useSslPort = useSslPort;
            return _resultValue;
        }
    }
}
