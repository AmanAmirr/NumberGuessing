import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        // Calling the numberGuessingGame method
        numberGuessingGame();
    }
    // Creating the numberGuessingGame method
    public static void numberGuessingGame() {
        // Creating the Scanner called "input"
        Scanner input = new Scanner(System.in);

        // Creating an int called "guess" and int called "numberOfGuesses"
        int guess = 0;
        int numberOfGuesses = 0;

        // Asking the user if they want to play a game.
        // And storing their input in the variable called question.
        System.out.print("Do you want to play a game yes or no?: ");
        String question = input.nextLine().toLowerCase();

        // If they answer yes or Yes the game will begin.
        if (question.equals("yes")) {

            // Asking the user to pick a random number.
            // And storing that value in the variable called "number1"
            System.out.print("Pick a random number: ");
            int number1 = input.nextInt();

            // Asking the user to pick another random number bigger than the last.
            // And storing that value in the variable called "number2"
            System.out.print("Pick another number bigger than the last: ");
            int number2 = input.nextInt();

            // If "number2" is less than "number1"
            if (number2 < number1){
                // Creating a while loop
                // That will keep asking them to pick a number that is bigger than "number1"
                while (number2 < number1){
                    System.out.print("Pick a number bigger than your first number: ");
                    number2 = input.nextInt();
                }
            }

            // Creating a random number between "number1"  and "number2".
            // And storing that value in the variable called "randomNumber"
            int randomNumber = (int) (Math.random() * (number2 - number1 + 1)) + number1;

            // Telling the user that a random number has been chosen.
            System.out.println("\nA random number has been chosen between "
                    + number1 + " and " + number2);

            // While "guess" is not equal to "randomNumber".
            while (guess != randomNumber) {

                // As the loop continues "numberOfGuesses" will increase by one.
                numberOfGuesses++;

                // Asking the user to guess what the "randomNumber" is
                // And storing that value in the variable "guess"
                System.out.print("\nGuess what the number is: ");
                guess = input.nextInt();

                // If the number is within the range
                if (guess >= number1 && guess <=number2) {

                    // If the number they input is less than "randomNumber"
                    // then it will display the number is greater.
                    if (guess < randomNumber) {
                        System.out.println("\nThe number is greater than that");
                    }

                    // If the number is they input is greater than "randomNumber"
                    // then it will display the number is less.
                    else if (guess > randomNumber) {
                        System.out.println("\nThe number is less than that");
                    }
                }
                // If the number is outside the range.
                else if(guess < number1){
                    System.out.println("\nNumber is not in Range. Pick a number between " + number1 + " and " + number2);
                }
                else {
                    System.out.println("\nNumber is not in Range. Pick a number between " + number1 + " and " + number2);
                }
            }

            // If they choose the correct number it will break from the while loop.
            if (numberOfGuesses <=2){
                System.out.println("\nYOUR THE GOAT.\nThe number was " + randomNumber + " it took you " + numberOfGuesses + " Guesses");
            }
            // And display this message. Revealing the new number.
            else if (numberOfGuesses >= 10) {
                System.out.println("\nYOUR TRASH.\nThe number was " + randomNumber + " it took you " + numberOfGuesses + " Guesses");
            }
            else {
                System.out.println("\nCorrect the number was " + randomNumber + " it took you " + numberOfGuesses + " guesses.");
            }
        }
        // Else if they don't type "yes" or "Yes" the game will not begin and the program will end.
        else if(question.equals("no")){
            System.out.println("Looks like you don't want to play a game. Goodbye!");
            System.exit(0);
        }
        else{
            System.out.println("INVALID INPUT TRY AGAIN");
            System.exit(0);
        }
    }
}