package com.korol.persistence.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Somebody on 10.09.2016.
 */
@Entity
@Table(name = "trans_type")
public class TransType {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "voltage")
    private Long voltage;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "transType")
    private List<TransParams> transParams;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Long getVoltage() {
        return voltage;
    }

    public void setVoltage(Long voltage) {
        this.voltage = voltage;
    }

    public List<TransParams> getTransParams() {
        return transParams;
    }

    public void setTransParams(List<TransParams> transParams) {
        this.transParams = transParams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TransType transType = (TransType) o;

        return new EqualsBuilder()
                .append(id, transType.id)
                .append(typeName, transType.typeName)
                .append(voltage, transType.voltage)
                .append(transParams, transType.transParams)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(typeName)
                .append(voltage)
                .append(transParams)
                .toHashCode();
    }
}
