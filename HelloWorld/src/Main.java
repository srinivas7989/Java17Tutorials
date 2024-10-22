//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien == true) System.out.println("It is an alien");
        System.out.println("It is not an alien");

        int topScore = 0;
        if(topScore == 100){
            System.out.println("you got high score!");
        }
        if(topScore != 100){
            System.out.println("you got high score!");
        }
        if(topScore < 100){
            System.out.println("you got less score!");
        }
        if(topScore > 100){
            System.out.println("you got highest score!");
        }
        int secoundTopScore = 60;
        if(topScore < 100 && topScore == 0){
            System.out.println("you got "+topScore);
        }
        if((topScore > 100) || (topScore == 0)){
            System.out.println("you got "+topScore);
        }

    }
}