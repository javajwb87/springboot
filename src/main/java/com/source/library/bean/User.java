/*
 * Created on 2021-09-27 ( Time 22:18:43 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.nit.order_library.bean;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.*;

import java.util.Date;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
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

    @Size( max = 1 )
    private String sex;

    @Size( max = 8 )
    private String birth;

    @Size( max = 256 )
    private String email;

    @Size( max = 45 )
    private String snsType;

    @Size( max = 256 )
    private String kakaotalkToken;

    @Size( max = 128 )
    private String referrer;

    @Size( max = 256 )
    private String telNumber;

    @Size( max = 4 )
    private String phoneBackward;

    @Size( max = 256 )
    private String phoneSha;


    private Integer dgplusToken;

    @Size( max = 128 )
    private String reasonWithdrawn;

    @Size( max = 1 )
    private String deleteYn;

    @Size( max = 1 )
    private String sleepYn;

    @Size( max = 1 )
    private String marketingAgreeYn;


    private Date updatedAt;


    private Date createdAt;


    private Date marketingAt;

    @Size( max = 256 )
    private String paymentPin;

    @Size( max = 64 )
    private String updater;

    @Size( max = 256 )
    private String dropNumber;


    private Date dropdatedAt;


    private Integer accessChannelId;

    @Size( max = 8 )
    private String adultIdentityDate;

    @Size( max = 256 )
    private String realName;

    @Size( max = 8 )
    private String realBirth;





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

    public void setSex( String sex ) {
        this.sex = sex;
    }
    public String getSex() {
        return this.sex;
    }

    public void setBirth( String birth ) {
        this.birth = birth;
    }
    public String getBirth() {
        return this.birth;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setSnsType( String snsType ) {
        this.snsType = snsType;
    }
    public String getSnsType() {
        return this.snsType;
    }

    public void setKakaotalkToken( String kakaotalkToken ) {
        this.kakaotalkToken = kakaotalkToken;
    }
    public String getKakaotalkToken() {
        return this.kakaotalkToken;
    }

    public void setReferrer( String referrer ) {
        this.referrer = referrer;
    }
    public String getReferrer() {
        return this.referrer;
    }

    public void setTelNumber( String telNumber ) {
        this.telNumber = telNumber;
    }
    public String getTelNumber() {
        return this.telNumber;
    }

    public void setPhoneBackward( String phoneBackward ) {
        this.phoneBackward = phoneBackward;
    }
    public String getPhoneBackward() {
        return this.phoneBackward;
    }

    public void setPhoneSha( String phoneSha ) {
        this.phoneSha = phoneSha;
    }
    public String getPhoneSha() {
        return this.phoneSha;
    }

    public void setDgplusToken( Integer dgplusToken ) {
        this.dgplusToken = dgplusToken;
    }
    public Integer getDgplusToken() {
        return this.dgplusToken;
    }

    public void setReasonWithdrawn( String reasonWithdrawn ) {
        this.reasonWithdrawn = reasonWithdrawn;
    }
    public String getReasonWithdrawn() {
        return this.reasonWithdrawn;
    }

    public void setDeleteYn( String deleteYn ) {
        this.deleteYn = deleteYn;
    }
    public String getDeleteYn() {
        return this.deleteYn;
    }

    public void setSleepYn( String sleepYn ) {
        this.sleepYn = sleepYn;
    }
    public String getSleepYn() {
        return this.sleepYn;
    }

    public void setMarketingAgreeYn( String marketingAgreeYn ) {
        this.marketingAgreeYn = marketingAgreeYn;
    }
    public String getMarketingAgreeYn() {
        return this.marketingAgreeYn;
    }

    public void setUpdatedAt( Date updatedAt ) {
        this.updatedAt = updatedAt;
    }
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setCreatedAt( Date createdAt ) {
        this.createdAt = createdAt;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setMarketingAt( Date marketingAt ) {
        this.marketingAt = marketingAt;
    }
    public Date getMarketingAt() {
        return this.marketingAt;
    }

    public void setPaymentPin( String paymentPin ) {
        this.paymentPin = paymentPin;
    }
    public String getPaymentPin() {
        return this.paymentPin;
    }

    public void setUpdater( String updater ) {
        this.updater = updater;
    }
    public String getUpdater() {
        return this.updater;
    }

    public void setDropNumber( String dropNumber ) {
        this.dropNumber = dropNumber;
    }
    public String getDropNumber() {
        return this.dropNumber;
    }

    public void setDropdatedAt( Date dropdatedAt ) {
        this.dropdatedAt = dropdatedAt;
    }
    public Date getDropdatedAt() {
        return this.dropdatedAt;
    }

    public void setAccessChannelId( Integer accessChannelId ) {
        this.accessChannelId = accessChannelId;
    }
    public Integer getAccessChannelId() {
        return this.accessChannelId;
    }

    public void setAdultIdentityDate( String adultIdentityDate ) {
        this.adultIdentityDate = adultIdentityDate;
    }
    public String getAdultIdentityDate() {
        return this.adultIdentityDate;
    }

    public void setRealName( String realName ) {
        this.realName = realName;
    }
    public String getRealName() {
        return this.realName;
    }

    public void setRealBirth( String realBirth ) {
        this.realBirth = realBirth;
    }
    public String getRealBirth() {
        return this.realBirth;
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
        sb.append(sex);
        sb.append("|");
        sb.append(birth);
        sb.append("|");
        sb.append(email);
        sb.append("|");
        sb.append(snsType);
        sb.append("|");
        sb.append(kakaotalkToken);
        sb.append("|");
        sb.append(referrer);
        sb.append("|");
        sb.append(telNumber);
        sb.append("|");
        sb.append(phoneBackward);
        sb.append("|");
        sb.append(phoneSha);
        sb.append("|");
        sb.append(dgplusToken);
        sb.append("|");
        sb.append(reasonWithdrawn);
        sb.append("|");
        sb.append(deleteYn);
        sb.append("|");
        sb.append(sleepYn);
        sb.append("|");
        sb.append(marketingAgreeYn);
        sb.append("|");
        sb.append(updatedAt);
        sb.append("|");
        sb.append(createdAt);
        sb.append("|");
        sb.append(marketingAt);
        sb.append("|");
        sb.append(paymentPin);
        sb.append("|");
        sb.append(updater);
        sb.append("|");
        sb.append(dropNumber);
        sb.append("|");
        sb.append(dropdatedAt);
        sb.append("|");
        sb.append(accessChannelId);
        sb.append("|");
        sb.append(adultIdentityDate);
        sb.append("|");
        sb.append(realName);
        sb.append("|");
        sb.append(realBirth);
        return sb.toString(); 
    } 


}