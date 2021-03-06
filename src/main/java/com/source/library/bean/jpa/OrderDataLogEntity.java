/*
 * Created on 2021-09-27 ( Time 22:53:20 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.source.library.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "order_data_log"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="order_data_log", catalog="niceorder" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="OrderDataLogEntity.countAll", query="SELECT COUNT(x) FROM OrderDataLogEntity x" )
} )
public class OrderDataLogEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="order_data_log_id", nullable=false)
    private Integer    orderDataLogId ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="user_id")
    private Integer    userId       ;

    @Column(name="order_id")
    private Integer    orderId      ;

    @Column(name="tkind")
    private Integer    tkind        ;

    @Column(name="data_type", length=32)
    private String     dataType     ;

    @Column(name="data_tid", length=128)
    private String     dataTid      ;

    @Column(name="req_data", length=1024)
    private String     reqData      ;

    @Column(name="res_data", length=1024)
    private String     resData      ;

    @Column(name="res_result_code", length=32)
    private String     resResultCode ;

    @Column(name="res_result_msg", length=64)
    private String     resResultMsg ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="req_at")
    private Date       reqAt        ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="res_at")
    private Date       resAt        ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public OrderDataLogEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setOrderDataLogId( Integer orderDataLogId ) {
        this.orderDataLogId = orderDataLogId ;
    }
    public Integer getOrderDataLogId() {
        return this.orderDataLogId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : user_id ( INT ) 
    public void setUserId( Integer userId ) {
        this.userId = userId;
    }
    public Integer getUserId() {
        return this.userId;
    }

    //--- DATABASE MAPPING : order_id ( INT ) 
    public void setOrderId( Integer orderId ) {
        this.orderId = orderId;
    }
    public Integer getOrderId() {
        return this.orderId;
    }

    //--- DATABASE MAPPING : tkind ( INT ) 
    public void setTkind( Integer tkind ) {
        this.tkind = tkind;
    }
    public Integer getTkind() {
        return this.tkind;
    }

    //--- DATABASE MAPPING : data_type ( VARCHAR ) 
    public void setDataType( String dataType ) {
        this.dataType = dataType;
    }
    public String getDataType() {
        return this.dataType;
    }

    //--- DATABASE MAPPING : data_tid ( VARCHAR ) 
    public void setDataTid( String dataTid ) {
        this.dataTid = dataTid;
    }
    public String getDataTid() {
        return this.dataTid;
    }

    //--- DATABASE MAPPING : req_data ( VARCHAR ) 
    public void setReqData( String reqData ) {
        this.reqData = reqData;
    }
    public String getReqData() {
        return this.reqData;
    }

    //--- DATABASE MAPPING : res_data ( VARCHAR ) 
    public void setResData( String resData ) {
        this.resData = resData;
    }
    public String getResData() {
        return this.resData;
    }

    //--- DATABASE MAPPING : res_result_code ( VARCHAR ) 
    public void setResResultCode( String resResultCode ) {
        this.resResultCode = resResultCode;
    }
    public String getResResultCode() {
        return this.resResultCode;
    }

    //--- DATABASE MAPPING : res_result_msg ( VARCHAR ) 
    public void setResResultMsg( String resResultMsg ) {
        this.resResultMsg = resResultMsg;
    }
    public String getResResultMsg() {
        return this.resResultMsg;
    }

    //--- DATABASE MAPPING : req_at ( DATETIME ) 
    public void setReqAt( Date reqAt ) {
        this.reqAt = reqAt;
    }
    public Date getReqAt() {
        return this.reqAt;
    }

    //--- DATABASE MAPPING : res_at ( DATETIME ) 
    public void setResAt( Date resAt ) {
        this.resAt = resAt;
    }
    public Date getResAt() {
        return this.resAt;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(orderDataLogId);
        sb.append("]:"); 
        sb.append(userId);
        sb.append("|");
        sb.append(orderId);
        sb.append("|");
        sb.append(tkind);
        sb.append("|");
        sb.append(dataType);
        sb.append("|");
        sb.append(dataTid);
        sb.append("|");
        sb.append(reqData);
        sb.append("|");
        sb.append(resData);
        sb.append("|");
        sb.append(resResultCode);
        sb.append("|");
        sb.append(resResultMsg);
        sb.append("|");
        sb.append(reqAt);
        sb.append("|");
        sb.append(resAt);
        return sb.toString(); 
    } 

}
