// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatEnvStat {
    private Double accelX;
    private Double accelY;
    private Double accelZ;
    private Integer ambientTemp;
    private Integer attitude;
    private Integer cpuTemp;
    private Integer humidity;
    private Double magneX;
    private Double magneY;
    private Double magneZ;
    private Double pressure;
    private Integer vcoreVoltage;

    private GetApStatsDeviceApStatEnvStat() {}
    public Double accelX() {
        return this.accelX;
    }
    public Double accelY() {
        return this.accelY;
    }
    public Double accelZ() {
        return this.accelZ;
    }
    public Integer ambientTemp() {
        return this.ambientTemp;
    }
    public Integer attitude() {
        return this.attitude;
    }
    public Integer cpuTemp() {
        return this.cpuTemp;
    }
    public Integer humidity() {
        return this.humidity;
    }
    public Double magneX() {
        return this.magneX;
    }
    public Double magneY() {
        return this.magneY;
    }
    public Double magneZ() {
        return this.magneZ;
    }
    public Double pressure() {
        return this.pressure;
    }
    public Integer vcoreVoltage() {
        return this.vcoreVoltage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatEnvStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double accelX;
        private Double accelY;
        private Double accelZ;
        private Integer ambientTemp;
        private Integer attitude;
        private Integer cpuTemp;
        private Integer humidity;
        private Double magneX;
        private Double magneY;
        private Double magneZ;
        private Double pressure;
        private Integer vcoreVoltage;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatEnvStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelX = defaults.accelX;
    	      this.accelY = defaults.accelY;
    	      this.accelZ = defaults.accelZ;
    	      this.ambientTemp = defaults.ambientTemp;
    	      this.attitude = defaults.attitude;
    	      this.cpuTemp = defaults.cpuTemp;
    	      this.humidity = defaults.humidity;
    	      this.magneX = defaults.magneX;
    	      this.magneY = defaults.magneY;
    	      this.magneZ = defaults.magneZ;
    	      this.pressure = defaults.pressure;
    	      this.vcoreVoltage = defaults.vcoreVoltage;
        }

        @CustomType.Setter
        public Builder accelX(Double accelX) {
            if (accelX == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "accelX");
            }
            this.accelX = accelX;
            return this;
        }
        @CustomType.Setter
        public Builder accelY(Double accelY) {
            if (accelY == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "accelY");
            }
            this.accelY = accelY;
            return this;
        }
        @CustomType.Setter
        public Builder accelZ(Double accelZ) {
            if (accelZ == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "accelZ");
            }
            this.accelZ = accelZ;
            return this;
        }
        @CustomType.Setter
        public Builder ambientTemp(Integer ambientTemp) {
            if (ambientTemp == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "ambientTemp");
            }
            this.ambientTemp = ambientTemp;
            return this;
        }
        @CustomType.Setter
        public Builder attitude(Integer attitude) {
            if (attitude == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "attitude");
            }
            this.attitude = attitude;
            return this;
        }
        @CustomType.Setter
        public Builder cpuTemp(Integer cpuTemp) {
            if (cpuTemp == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "cpuTemp");
            }
            this.cpuTemp = cpuTemp;
            return this;
        }
        @CustomType.Setter
        public Builder humidity(Integer humidity) {
            if (humidity == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "humidity");
            }
            this.humidity = humidity;
            return this;
        }
        @CustomType.Setter
        public Builder magneX(Double magneX) {
            if (magneX == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "magneX");
            }
            this.magneX = magneX;
            return this;
        }
        @CustomType.Setter
        public Builder magneY(Double magneY) {
            if (magneY == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "magneY");
            }
            this.magneY = magneY;
            return this;
        }
        @CustomType.Setter
        public Builder magneZ(Double magneZ) {
            if (magneZ == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "magneZ");
            }
            this.magneZ = magneZ;
            return this;
        }
        @CustomType.Setter
        public Builder pressure(Double pressure) {
            if (pressure == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "pressure");
            }
            this.pressure = pressure;
            return this;
        }
        @CustomType.Setter
        public Builder vcoreVoltage(Integer vcoreVoltage) {
            if (vcoreVoltage == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEnvStat", "vcoreVoltage");
            }
            this.vcoreVoltage = vcoreVoltage;
            return this;
        }
        public GetApStatsDeviceApStatEnvStat build() {
            final var _resultValue = new GetApStatsDeviceApStatEnvStat();
            _resultValue.accelX = accelX;
            _resultValue.accelY = accelY;
            _resultValue.accelZ = accelZ;
            _resultValue.ambientTemp = ambientTemp;
            _resultValue.attitude = attitude;
            _resultValue.cpuTemp = cpuTemp;
            _resultValue.humidity = humidity;
            _resultValue.magneX = magneX;
            _resultValue.magneY = magneY;
            _resultValue.magneZ = magneZ;
            _resultValue.pressure = pressure;
            _resultValue.vcoreVoltage = vcoreVoltage;
            return _resultValue;
        }
    }
}
