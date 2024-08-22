package com.game;

public class Enemy {
	// Base class for Enemies

	    public void attack() {
		}
	}

	// Concrete classes for different types of Enemies
	class EasyEnemy extends Enemy {
	    @Override
	    public void attack() {
	        System.out.println("Easy Enemy attacks weakly!");
	    }
	}

	class MediumEnemy extends Enemy {
	    @Override
	    public void attack() {
	        System.out.println("Medium Enemy attacks moderately!");
	    }
	}

	class HardEnemy extends Enemy {
	    @Override
	    public void attack() {
	        System.out.println("Hard Enemy attacks fiercely!");
	    }
	}

	// Factory class for creating Enemies
	abstract class EnemyFactory {
	    public abstract Enemy createEnemy();

	    public static EnemyFactory getFactory(int difficulty) {
	        switch (difficulty) {
	            case 1: return new EasyEnemyFactory();
	            case 2: return new MediumEnemyFactory();
	            case 3: return new HardEnemyFactory();
	            default: throw new IllegalArgumentException("Invalid difficulty level");
	        }
	    }
	}

	// Concrete factories for each difficulty level
	class EasyEnemyFactory extends EnemyFactory {
	    @Override
	    public Enemy createEnemy() {
	        return new EasyEnemy();
	    }
	}

	class MediumEnemyFactory extends EnemyFactory {
	    @Override
	    public Enemy createEnemy() {
	        return new MediumEnemy();
	    }
	}

	class HardEnemyFactory extends EnemyFactory {
	    @Override
	    public Enemy createEnemy() {
	        return new HardEnemy();
	    }
	}

