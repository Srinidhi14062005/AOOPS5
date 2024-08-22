package com.auction.system;

public class ReserveAuction extends AuctionTemplate {
    @Override
    protected void prepareAuction() {
        System.out.println("Preparing reserve auction with reserve price.");
    }

    @Override
    protected void startBidding() {
        System.out.println("Starting reserve auction bidding.");
    }

    @Override
    protected void endBidding() {
        System.out.println("Ending reserve auction bidding.");
    }

    @Override
    protected void concludeAuction() {
        System.out.println("Concluding reserve auction.");
    }
}