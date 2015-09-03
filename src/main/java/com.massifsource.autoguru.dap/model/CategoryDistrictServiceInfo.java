/**
 * Copyright 2015 MAssifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "district_service_info")
@SecondaryTables({
        @SecondaryTable(name = "service", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
})
/*@SecondaryTables({
        @SecondaryTable(name = "service", pkJoinColumns=@ForeignKeyJoinPrimaryKeyJoinColumn(name="id", referencedColumnName="service_id"))
})*/
public class CategoryDistrictServiceInfo implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Integer districtId;
    private Integer serviceId;
    private String phone;
    private String email;
    private String integrationPoint;
    @OneToOne(Serv)
    @JoinColumn(name="ADDRESS_ID", table = )
    @Column(table="service")
    private String name;
    @Column(table="service")
    private Integer categoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntegrationPoint() {
        return integrationPoint;
    }

    public void setIntegrationPoint(String integrationPoint) {
        this.integrationPoint = integrationPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
