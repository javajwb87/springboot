/*
 * Created on 2021-09-27 ( Time 22:17:26 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.bean;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.*;

import java.util.Date;

public class AdidInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    private Integer adidInfoId;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @NotNull
    private Integer userId;

    @NotNull
    @Size( min = 1, max = 256 )
    private String adid;

    @Size( max = 32 )
    private String deviceKind;

    @Size( max = 1 )
    private String validYn;


    private Date createdAt;


    private Date updatedAt;





    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setAdidInfoId( Integer adidInfoId ) {
        this.adidInfoId = adidInfoId ;
    }

    public Integer getAdidInfoId() {
        return this.adidInfoId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setUserId( Integer userId ) {
        this.userId = userId;
    }
    public Integer getUserId() {
        return this.userId;
    }

    public void setAdid( String adid ) {
        this.adid = adid;
    }
    public String getAdid() {
        return this.adid;
    }

    public void setDeviceKind( String deviceKind ) {
        this.deviceKind = deviceKind;
    }
    public String getDeviceKind() {
        return this.deviceKind;
    }

    public void setValidYn( String validYn ) {
        this.validYn = validYn;
    }
    public String getValidYn() {
        return this.validYn;
    }

    public void setCreatedAt( Date createdAt ) {
        this.createdAt = createdAt;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setUpdatedAt( Date updatedAt ) {
        this.updatedAt = updatedAt;
    }
    public Date getUpdatedAt() {
        return this.updatedAt;
    }




    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(adidInfoId);
        sb.append("|");
        sb.append(userId);
        sb.append("|");
        sb.append(adid);
        sb.append("|");
        sb.append(deviceKind);
        sb.append("|");
        sb.append(validYn);
        sb.append("|");
        sb.append(createdAt);
        sb.append("|");
        sb.append(updatedAt);
        return sb.toString(); 
    } 


}
