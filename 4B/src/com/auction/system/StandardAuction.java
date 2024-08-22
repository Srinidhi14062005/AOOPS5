package com.auction.system;

public class StandardAuction extends AuctionTemplate {
    @Override
    protected void prepareAuction() {
        System.out.println("Preparing standard auction with item details.");
    }

    @Override
    protected void startBidding() {
        System.out.println("Starting standard auction bidding.");
    }

    @Override
    protected void endBidding() {
        System.out.println("Ending standard auction bidding.");
    }

    @Override
    protected void concludeAuction() {
        System.out.println("Concluding standard auction.");
    }
}

