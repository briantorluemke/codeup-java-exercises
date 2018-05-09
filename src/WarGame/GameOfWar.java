package WarGame;

import util.Input;

public class GameOfWar {
    public static void main(String[] args) {
        Input input = new Input();
        boolean choice;
        Player player = new Player();

        System.out.println("Welcome to my game of War!\n" +
                "Are you ready to play?");
        choice = input.yesNo();
        if (choice) {
            player.startGame();
        } else {
            System.out.println("Okay, well why are you here then?");
        }
    }
}
