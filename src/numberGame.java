import java.util.Scanner;

public class numberGame {


    public static void main(String [] args){
        int randomNumber = (int)((Math.random() * 100) + 1);
        System.out.println("Guess number from 1 to 100 in 10 tries");
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        boolean winner = false;
        for(int i=10;i>0;i--){
            System.out.println(i+ " tries left. input :");
            guess = scanner.nextInt();
            if(guess>randomNumber){
                System.out.println("too much");
            } else if(guess<randomNumber){
                System.out.println("too less");
            } else {
                winner = true;
                break;
            }
        }
        if(winner)System.out.println("WIN");else System.out.println("LOSE");
    }
}
