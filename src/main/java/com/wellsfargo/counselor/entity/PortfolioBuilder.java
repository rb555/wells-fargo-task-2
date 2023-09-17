package com.wellsfargo.counselor.entity;

import javax.xml.crypto.Data;

public class PortfolioBuilder {
    private long portfolioId;
    private long clientId;
    private Data creationDate;

    public PortfolioBuilder setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    public PortfolioBuilder setClientId(long clientId) {
        this.clientId = clientId;
        return this;
    }

    public PortfolioBuilder setCreationDate(Data creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public Portfolio createPortfolio() {
        return new Portfolio(portfolioId, clientId, creationDate);
    }
}