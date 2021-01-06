import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String question = "What is the current president-elect of the United States?";
        String choiceOne = "Trump";
        String choiceTwo = "Biden";
        String choiceThree = "Pence";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println("Question: " + question);
        System.out.print("Is it " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + "?");

        // Have the user input an answer
        // Retrieve the user's input
        System.out.println(" Answer below:");
        String userChoice = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (userChoice.equals(correctAnswer)) {
            System.out.println("You are correct! Congrats!");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println("You are incorrect. The correct answer was " + correctAnswer + ".");
        }

    }

}
