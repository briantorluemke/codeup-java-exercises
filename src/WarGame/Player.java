package WarGame;
import util.Input;

public class Player {
    public static Card[] cards = CardsArray.getAllCards();
    public Card[] playerDeck = new Card[25];
    public Card[] aiDeck = new Card[25];
    public boolean gameActive = true;
    Input input = new Input();
    public int playerScore = 0;
    public int aiScore = 0;

    public void shuffle(Card[] chosen) {
        Card temp;
        System.out.println("Shuffling the deck...");
        for (int i = 0; i < chosen.length; i++) {
            int index = (int)(Math.random() * chosen.length);
            temp = chosen[i];
            cards[i] = chosen[index];
            chosen[index] = temp;
        }
        System.out.println("Deck shuffled.");
    }

    public void readDeck(Card[] chosenDeck) {
        for (Card card : chosenDeck) {
            System.out.println("|--"+card.value+" of "+card.suit+"--|");
        }
    }

    public void runGame(Card[] player, Card[] ai) {
        for (int i = 0; i < player.length; i++) {
            if (player[i].points > ai[i].points) {
                playerScore++;
                System.out.println("Player gets a point!");
            } else if (player[i].points < ai[i].points){
                aiScore++;
                System.out.println("AI gets a point!");
            } else {
                System.out.println("Tie round. Neither of you gets a point and the cards are tossed.");
            }
        }
    }

    public void distributeCards() {
        System.arraycopy(cards, 0, playerDeck, 0, 25);
        System.arraycopy(cards, 25, aiDeck, 0, 25);
    }

    public void startGame() {
        do {
            System.out.println("Time to start playing.");
            System.out.print("The deck has not been shuffled yet. Shuffle deck?\n");
            boolean user = input.yesNo();
            if (user) {
                shuffle(cards);
            } else {
                System.out.println("Fine. You're not playing then.");
                gameActive = false;
                break;
            }
            System.out.println("Okay, ready to distribute cards?");
            boolean user2 = input.yesNo();
            if (user2) {
                distributeCards();

            } else {
                gameActive = false;
                break;
            }
            System.out.println("Would you like to see your deck?");
            boolean user3 = input.yesNo();
            if (user3) {
                readDeck(playerDeck);
                System.out.println("^^^^View your deck above^^^^^");
                System.out.println("Would you like to shuffle your deck?");
                boolean user8 = input.yesNo();
                if (user8) {
                    shuffle(playerDeck);
                    readDeck(playerDeck);
                }
            }
            System.out.println("Ready to run through the rounds?");
            boolean user4 = input.yesNo();
            if (user4) {
                runGame(playerDeck, aiDeck);
            } else {
                gameActive = false;
                break;
            }
            System.out.println("Ready to find out who won?");
            boolean user5 = input.yesNo();
            if (user5) {
                System.out.println("Player score: "+playerScore+" \nAI score: "+aiScore);
            } else {
                System.out.println("I dunno why you'd quit once you've gotten this far.. but whatever.");
                gameActive = false;
                break;
            }
            if (playerScore > aiScore) {
                System.out.println("Congrats, you won!!\n" +
                        "|+-+-+-+-+-+-HOORAY-+-+-+-+-+-+|");
            } else if (playerScore == aiScore) {
                System.out.println("Wow, you guys tied.. play again?");
                boolean user6 = input.yesNo();
                if (user6) {
                    startGame();
                } else {
                    gameActive = false;
                    break;
                }
            } else {
                System.out.println("The computer wins!\n" +
                        "|-----A I  A R E  S U P E R I O R!-----|");
            }
            System.out.println("Would you like to play again?");
            boolean user7 = input.yesNo();
            if (user7) {
                startGame();
            } else {
                gameActive = false;
                break;
            }
        } while (gameActive);
    }
}