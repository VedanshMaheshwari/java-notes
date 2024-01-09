import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main (String[] args) {

        boolean b = false;

        game g = new game();

        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}

class game{
    public int number;

    public int inputNumber;
    public int numberOfGuesses = 0;

    public game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.print("Guess the numbers: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();


    }
    public boolean isCorrectNumber(){
        numberOfGuesses++;
        if (inputNumber== number){
            System.out.println("Correct Number");
            System.out.printf("The number of guesses u took was %d",numberOfGuesses);
            return true;
        }
        else if (inputNumber<number) {
            System.out.println("Too Less.");
        } else if (inputNumber>number) {
            System.out.println("Too High");
        }
        return false;

    }
}