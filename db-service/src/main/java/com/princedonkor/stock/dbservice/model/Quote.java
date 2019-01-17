package com.princedonkor.stock.dbservice.model;

import javax.persistence.*;

@Entity // We say entity to add this as a table
@Table(name = "quotes", catalog = "test") // we give it a table name and give it a catalog os test
public class Quote {
    // We are only setting three things the id, userName and quotes

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // This is an annotation we say it is an id and we set it to be auto generated.
    @Column(name = "id")
    private  Integer id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "quotes")
    private String quotes;

    public Quote() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }
}
