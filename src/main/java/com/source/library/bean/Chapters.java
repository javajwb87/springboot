/*
 * Created on 2019-03-14 ( Time 16:44:08 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.bean;

import java.io.Serializable;

import javax.validation.constraints.*;


public class Chapters implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    private Integer chapterId;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @NotNull
    private Integer bookId;

    @Size( max = 128 )
    private String title;


    private Integer page;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setChapterId( Integer chapterId ) {
        this.chapterId = chapterId ;
    }

    public Integer getChapterId() {
        return this.chapterId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setBookId( Integer bookId ) {
        this.bookId = bookId;
    }
    public Integer getBookId() {
        return this.bookId;
    }

    public void setTitle( String title ) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public void setPage( Integer page ) {
        this.page = page;
    }
    public Integer getPage() {
        return this.page;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(chapterId);
        sb.append("|");
        sb.append(bookId);
        sb.append("|");
        sb.append(title);
        sb.append("|");
        sb.append(page);
        return sb.toString(); 
    } 


}
