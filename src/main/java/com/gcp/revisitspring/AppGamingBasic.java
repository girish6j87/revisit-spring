package com.gcp.revisitspring;

import com.gcp.revisitspring.game.GameRunner;
import com.gcp.revisitspring.game.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
