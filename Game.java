package com.company;

import java.util.Scanner;

public class Game {

    private Word word;
    private Player player;
    public Game () {
        player = new Player();
        word = new Word();
        scanner = new Scanner(System.in);
    }
    Scanner scanner;
    public void PLay() {
        System.out.println("Good luck!");
        System.out.println("Watch out, you have only: " +player.getLives() + " lives");
        draw();
        System.out.println("Your word is: ");
        word.show();
        while (this.player.stillAlive() && !word.isGuessed() ) {
            System.out.println("Guess the next character: ");
            String line = scanner.nextLine();
            char chr = line.charAt(0);
            if (word.checkCharacter(chr)) {
                word.show();
                System.out.println("You already guessed this letter...");
            }
            else {
                player.setLives(player.getLives() - 1);
                System.out.println("Lives left: " + player.getLives());
                draw();
            }
            if (word.isGuessed()) {
                System.out.println("Congratulations!");
                return;
            }
        }
        System.out.println("Game over!");
    }
    private void draw () {
        switch (player.getLives()) {
            case 6:
                System.out.println("  ____   ");
                System.out.println(" |    |  ");
                System.out.println(" |       ");
                System.out.println(" |       ");
                System.out.println(" |       ");
                System.out.println("_|___    ");
                System.out.println();
                break;
            case 5:
                System.out.println("  ____   ");
                System.out.println(" |    |  ");
                System.out.println(" |    O  ");
                System.out.println(" |       ");
                System.out.println(" |       ");
                System.out.println("_|___    ");
                System.out.println();
                break;
            case 4:
                System.out.println("  ____   ");
                System.out.println(" |    |  ");
                System.out.println(" |    O  ");
                System.out.println(" |   /  ");
                System.out.println(" |       ");
                System.out.println("_|___    ");
                System.out.println();
                break;
            case 3:
                System.out.println("  ____   ");
                System.out.println(" |    |  ");
                System.out.println(" |    O  ");
                System.out.println(" |   / \\  ");
                System.out.println(" |       ");
                System.out.println("_|___    ");
                System.out.println();
                break;
            case 2:
                System.out.println("  ____   ");
                System.out.println(" |    |  ");
                System.out.println(" |    O  ");
                System.out.println(" |   /|\\  ");
                System.out.println(" |       ");
                System.out.println("_|___    ");
                System.out.println();
                break;
            case 1:
                System.out.println("  ____   ");
                System.out.println(" |    |  ");
                System.out.println(" |    O ");
                System.out.println(" |   /|\\  ");
                System.out.println(" |   /   ");
                System.out.println("_|___    ");
                System.out.println();
                break;
            case 0:
                System.out.println("  ____   ");
                System.out.println(" |    |  ");
                System.out.println(" |    O ");
                System.out.println(" |   /|\\  ");
                System.out.println(" |   / \\ ");
                System.out.println("_|___    ");
                System.out.println();
                break;
        }
    }

}
