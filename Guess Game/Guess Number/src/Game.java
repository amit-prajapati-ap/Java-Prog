import java.util.Random;
import java.util.Scanner;
class GuessNumber {
    private int score;
    private int avgscore;
    private int avgup;
    private int avgdown;
    private int up;
    private int down;
    private int random;
    private int data;
    public GuessNumber() {
        score = 1;
        up = 0;
        down = 0;
        avgscore = 0;
        avgdown = 0;
        avgup = 0;
    }
    private void Greet() {
        System.out.println("GUESS_NUMBER DEVELOPED BY AMIT PRAJAPATI.....\n");
        System.out.println("GUESS_NUMBER AP_Pvt.Ltd.");
        System.out.print("Enter Your Name : ");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.printf("\nWelcome %s To GUESS_NUMBER Game.....\n",name);
        System.out.println("Enjoy The Game....");
        System.out.println();
    }
    private void input() {
        System.out.print("Guess The Number : ");
        Scanner s = new Scanner(System.in);
        data = s.nextInt();
        System.out.println();
    }
    public void matching() {
        Greet();
        for(int i = 0 ; i < 3 ; i++) {
            Random rand = new Random();
            random = rand.nextInt(100);
            System.out.format("Round %d : \n",i+1);
            System.out.format("Guess 1st Number of %d Round...\n",i+1);
            input();
            rounds();
            avgscore += score;
            avgdown += down;
            avgup += up;
            Result(i+1);
        }
        float avgs = avgscore / 3f * 10f;
        System.out.println();
        System.out.println("Your Overall Result...");
        System.out.printf("Your Score is : %.0f Accuracy \n",avgs);
        System.out.printf("Your Average UP Guesses is : %d \n",avgup);
        System.out.printf("Your Average DOWN Guesses is : %d \n",avgdown);
        System.out.println();
        System.out.println("Thanks For Playing...");
    }
    public void rounds() {
        while(data != random) {
            if(data < random) {
                up++;
                score++;
                System.out.printf("Guess The Greater Number from %d... \n",data);
                input();
            }
            else {
                down++;
                score++;
                System.out.printf("Guess The Smaller Number from %d... \n",data);
                input();
            }
        }
    }
    private void Result(int i) {
        System.out.println("Hurray!!! You Won The Game...");
        System.out.format("%d Round Result...\n",i);
        System.out.printf("Total Score is : %d \n",score);
        System.out.printf("Total UP Guesses is : %d \n",up);
        System.out.printf("Total DOWN Guesses is : %d \n",down);
        System.out.println();
        score = 1;
        up = 0;
        down = 0;
    }
}
public class Game {
    public static void main(String[] args) {
        GuessNumber gn = new GuessNumber();
        gn.matching();
    }
}