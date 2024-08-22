package com.auction.system;

public abstract class AuctionTemplate {
    public final void conductAuction() {
        prepareAuction();
        startBidding();
        endBidding();
        concludeAuction();
    }

    protected abstract void prepareAuction();
    protected abstract void startBidding();
    protected abstract void endBidding();
    protected abstract void concludeAuction();
}

