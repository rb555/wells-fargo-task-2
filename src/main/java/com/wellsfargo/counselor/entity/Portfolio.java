package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    @Column(name="portfolioId")
    private long portfolioId;

    @ManyToOne
    @Column
    private  long clientId;

    @Column
    private Data creationDate;

    public void setCreationDate(Data creationDate) {
        this.creationDate = creationDate;
    }

    public Data getCreationDate() {
        return creationDate;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Portfolio(long portfolioId, long clientId, Data creationDate) {
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }
}
















