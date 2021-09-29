/*
 * Created on 2019-03-14 ( Time 16:44:08 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.source.library.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "chapters"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="chapters", catalog="niceorder" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ChaptersEntity.countAll", query="SELECT COUNT(x) FROM ChaptersEntity x" )
} )
public class ChaptersEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="chapter_id", nullable=false)
    private Integer    chapterId    ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="title", length=128)
    private String     title        ;

    @Column(name="page")
    private Integer    page         ;

	// "bookId" (column "book_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="book_id", referencedColumnName="book_id")
    private BooksEntity books       ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ChaptersEntity() {
		super();
    }
    
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
    //--- DATABASE MAPPING : title ( VARCHAR ) 
    public void setTitle( String title ) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    //--- DATABASE MAPPING : page ( INT ) 
    public void setPage( Integer page ) {
        this.page = page;
    }
    public Integer getPage() {
        return this.page;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setBooks( BooksEntity books ) {
        this.books = books;
    }
    public BooksEntity getBooks() {
        return this.books;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(chapterId);
        sb.append("]:"); 
        sb.append(title);
        sb.append("|");
        sb.append(page);
        return sb.toString(); 
    } 

}
