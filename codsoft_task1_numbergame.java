import java.util.Random;
import java.util.Scanner;

class codsoft_task1_numbergame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
        int totalscore=0;
        int points=0;
        boolean play=true;

        System.out.println("Welcome to the number guessing game!");
        
        while (play)
        {
          int Number = rand.nextInt(100) + 1;
          int attempts=0;
          int maxattempts=5;
          boolean guessedcorrectly=false;
          System.out.println("I have generated a random number between 1 and 100. Try to guess it correctly!");
          while (attempts < maxattempts)
          {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess == Number) {
                System.out.println("Congratulations! You won by guessing the correct number.");
                points=10-(attempts-1)*2;
                if(points<2)
                points=2;
                totalscore=totalscore+points;
                guessedcorrectly=true;
            } else if (guess > Number) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Your guess is too low. Try again.");
            }
            System.out.println("Attempts left:"+(maxattempts - attempts));
          }
          if(!guessedcorrectly)
          {
            System.out.println("You lost!. The correct number was "+Number);
          }
          System.out.println("Your totalscore is: "+totalscore);

          System.out.println("Do you wish to play again?");
          String answer=sc.next().toLowerCase();
          if(!answer.equals("yes"))
          {
            play=false;
            System.out.println("Thanks for playing");
          }
        }

        sc.close();
    }
}