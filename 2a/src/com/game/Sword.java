package com.game;


	class Sword implements Weapon {
	    @Override
	    public void use() {
	        System.out.println("Swinging a sword!");
	    }
	}

	class Gun implements Weapon {
	    @Override
	    public void use() {
	        System.out.println("Shooting with a gun!");
	    }
	}
