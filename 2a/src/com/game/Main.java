package com.game;

public class Main {
    public static void main(String[] args) {
        
        GameState gameState = GameState.getInstance();

        gameState.setLevel(1);
        gameState.addScore(0);

        EnemyFactory enemyFactory = EnemyFactory.getFactory(gameState.getLevel());
        Enemy enemy = enemyFactory.createEnemy();

        Weapon weapon = new Sword();
        PowerUp powerUp = new HealthPack();

        System.out.println("Game started at level " + gameState.getLevel());
        enemy.attack();
        weapon.use();
        powerUp.activate();

        gameState.addScore(100);
        System.out.println("Score: " + gameState.getScore());
    }
}
