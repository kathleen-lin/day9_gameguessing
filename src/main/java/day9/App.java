package day9;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Integer guessNum = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        Integer myGuess = 0;

        Integer count = 1;

        while (myGuess != guessNum){
            myGuess = input.nextInt();

            if (myGuess > guessNum){
                System.out.println("Guess lower");
                count ++;
            } else if (myGuess < guessNum){
                System.out.println("Guess higher");
                count ++;
            } else if (myGuess == guessNum){
                System.out.printf("You are right! You guessed in %d tries", count);
                input.close();
                System.exit(0);
            } 
        }


    }
}
