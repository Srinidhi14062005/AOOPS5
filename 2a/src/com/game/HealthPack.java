package com.game;

	class HealthPack implements PowerUp {
	    @Override
	    public void activate() {
	        System.out.println("Health restored!");
	    }
	}

	class Shield implements PowerUp {
	    @Override
	    public void activate() {
	        System.out.println("Shield activated!");
	    }
	}


