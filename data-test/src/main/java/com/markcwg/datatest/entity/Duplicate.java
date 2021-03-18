package com.markcwg.datatest.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 联单实体类
 * </p>
 *
 * @author cwg
 * @since 2020-12-17
 */
@Data
public class Duplicate implements Serializable {

    private static final long serialVersionUID=1L;

    private String duplicateCode;

    private String duplicateDriver;

    private String productionEnterprisePhone;

    private String disposalEnterprisePhone;

    private String transportEnterprisePhone;

    private String productionEnterpriseName;

    private String disposalEnterpriseName;

    private String transportEnterpriseName;

    private String transportRoutes;

    private Double transportGrossWeight;

    private Double transportTareWeight;

    private Double transportNetWeight;

    private String transportMoistureContent;

    private String transportLicensePlate;

    private Date transportTime;

    private String productionAgent;

    private String transportAgent;

    private String receiveAgent;

    private String receiveMoistureContent;

    private Double receiveGrossWeight;

    private Double receiveTareWeight;

    private Double receiveNetWeight;

    private Date receiveTime;

    private String comeLicensePlate;

    private String comeDriverAgent;
}
