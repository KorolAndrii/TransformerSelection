package com.korol.persistence.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;

/**
 * Created by Somebody on 10.09.2016.
 */
@Entity
@Table(name = "trans_params")
public class TransParams {
    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_trans_type")
    private TransType transType;
    @Column(name = "power")
    private Long power;
    @Column(name = "regular_range")
    private String regularRange;
    @Column(name = "hight_nom_volt")
    private Long hightNominalVoltage;
    @Column(name = "low_nom_volt")
    private Long lowNominalVoltage;
    @Column(name = "short_circuit_volt")
    private Long shortCircuitVoltage;
    @Column(name = "short_voltage_losses")
    private Long shortVoltageLosses;
    @Column(name = "no_load_losses")
    private Integer noLoadLosses;
    @Column(name = "no_load_current")
    private Integer noLoadCurrent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransType getTransType() {
        return transType;
    }

    public void setTransType(TransType transType) {
        this.transType = transType;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public String getRegularRange() {
        return regularRange;
    }

    public void setRegularRange(String regularRange) {
        this.regularRange = regularRange;
    }

    public Long getHightNominalVoltage() {
        return hightNominalVoltage;
    }

    public void setHightNominalVoltage(Long hightNominalVoltage) {
        this.hightNominalVoltage = hightNominalVoltage;
    }

    public Long getLowNominalVoltage() {
        return lowNominalVoltage;
    }

    public void setLowNominalVoltage(Long lowNominalVoltage) {
        this.lowNominalVoltage = lowNominalVoltage;
    }

    public Long getShortCircuitVoltage() {
        return shortCircuitVoltage;
    }

    public void setShortCircuitVoltage(Long shortCircuitVoltage) {
        this.shortCircuitVoltage = shortCircuitVoltage;
    }

    public Long getShortVoltageLosses() {
        return shortVoltageLosses;
    }

    public void setShortVoltageLosses(Long shortVoltageLosses) {
        this.shortVoltageLosses = shortVoltageLosses;
    }

    public Integer getNoLoadLosses() {
        return noLoadLosses;
    }

    public void setNoLoadLosses(Integer noLoadLosses) {
        this.noLoadLosses = noLoadLosses;
    }

    public Integer getNoLoadCurrent() {
        return noLoadCurrent;
    }

    public void setNoLoadCurrent(Integer noLoadCurrent) {
        this.noLoadCurrent = noLoadCurrent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TransParams that = (TransParams) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(transType, that.transType)
                .append(power, that.power)
                .append(regularRange, that.regularRange)
                .append(hightNominalVoltage, that.hightNominalVoltage)
                .append(lowNominalVoltage, that.lowNominalVoltage)
                .append(shortCircuitVoltage, that.shortCircuitVoltage)
                .append(shortVoltageLosses, that.shortVoltageLosses)
                .append(noLoadLosses, that.noLoadLosses)
                .append(noLoadCurrent, that.noLoadCurrent)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(transType)
                .append(power)
                .append(regularRange)
                .append(hightNominalVoltage)
                .append(lowNominalVoltage)
                .append(shortCircuitVoltage)
                .append(shortVoltageLosses)
                .append(noLoadLosses)
                .append(noLoadCurrent)
                .toHashCode();
    }
}
