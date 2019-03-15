/*
 * Created on 2019-03-14 ( Time 20:29:57 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.nit.order_library.bean;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.*;

import java.util.Date;

public class Members implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    private Integer userId;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @NotNull
    @Size( min = 1, max = 256 )
    private String loginName;

    @NotNull
    @Size( min = 1, max = 256 )
    private String password;

    @NotNull
    @Size( min = 1, max = 256 )
    private String name;

    private Date createdAt;

    private Integer deleteFlag;


    private List<Roles> listOfRoles;


    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setUserId( Integer userId ) {
        this.userId = userId ;
    }

    public Integer getUserId() {
        return this.userId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setLoginName( String loginName ) {
        this.loginName = loginName;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public void setPassword( String password ) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setCreatedAt( Date createdAt ) {
        this.createdAt = createdAt;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }
    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setListOfRoles( List<Roles> listOfRoles ) {
        this.listOfRoles = listOfRoles;
    }
    public List<Roles> getListOfRoles() {
        return this.listOfRoles;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(userId);
        sb.append("|");
        sb.append(loginName);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(createdAt);
        sb.append("|");
        sb.append(deleteFlag);
        return sb.toString(); 
    } 


}
