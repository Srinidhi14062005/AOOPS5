package com.auction.system;

public class Main {
    public static void main(String[] args) {
        // Creating auction and bidders
        Auction auction = new Auction("Antique Vase");
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        // Subscribing bidders to auction events
        auction.subscribe(bidder1);
        auction.subscribe(bidder2);

        // Notify bidders about item availability
        auction.itemAvailable();

        // Start and end the auction
        auction.startAuction();
        auction.endAuction();

        // Demonstrate Template Pattern with different auction types
        System.out.println("\nConducting Standard Auction:");
        AuctionTemplate standardAuction = new StandardAuction();
        standardAuction.conductAuction();

        System.out.println("\nConducting Reserve Auction:");
        AuctionTemplate reserveAuction = new ReserveAuction();
        reserveAuction.conductAuction();
    }
}

