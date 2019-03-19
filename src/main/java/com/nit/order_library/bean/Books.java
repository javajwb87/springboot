/*
 * Created on 2019-03-14 ( Time 16:44:07 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.nit.order_library.bean;

import java.io.Serializable; 






import javax.validation.constraints.*;

import java.util.Date;

public class Books implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    private Integer bookId;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @NotNull
    @Size( min = 1, max = 64 )
    private String name;

    @NotNull
    @Size( min = 1, max = 64 )
    private String author;


    private Date publishDate;

    @Size( max = 128 )
    private String description;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setBookId( Integer bookId ) {
        this.bookId = bookId ;
    }

    public Integer getBookId() {
        return this.bookId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAuthor( String author ) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setPublishDate( Date publishDate ) {
        this.publishDate = publishDate;
    }
    public Date getPublishDate() {
        return this.publishDate;
    }

    public void setDescription( String description ) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(bookId);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(author);
        sb.append("|");
        sb.append(publishDate);
        sb.append("|");
        sb.append(description);
        return sb.toString(); 
    } 


}
