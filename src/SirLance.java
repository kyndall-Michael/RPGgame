import java.util.Scanner;

public class SirLance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to WestRoast!!");

        System.out.println("What is your name champion??");

        String getName = input.nextLine().toUpperCase();

        System.out.println("Welcome peasant " + getName);

        System.out.println("Are you willing to except the challenge? [Y | N]");

        if (input.nextLine().equalsIgnoreCase("y")){

            System.out.println("Battle start");

            System.out.println("===================");

            System.out.println("Your challeneger is Codeup");

            int enemyHealth = 100;

            int enemyDamage = 15;

            System.out.println("there health " + enemyHealth);

            System.out.println("there damage " + enemyDamage);

            System.out.println("====================");

            System.out.println(getName);

            int yourHealth = 100;

            int yourDamage = 20;

            int potions = 3;

            System.out.println("Your health " + yourHealth);

            System.out.println( "your damage " + yourDamage);

            System.out.println("You have 3 potions " + potions);

            do {

                System.out.println("Quick pick a number!\n1. Attack\n2. potions\n3. run?");

                int userTurn = Integer.parseInt(input.nextLine());

                if(userTurn == 1){

                enemyHealth-=yourDamage;

                System.out.println(enemyHealth);

                }else if (userTurn == 2){

                    if (potions == 0){

                        System.out.println("You are out of potions!");

                    }else{

                    potions -= 1;

                    System.out.println("You add +30 health");

                    }
                }else if (userTurn == 3){

                    System.out.println("You cant run from me!!!");

                }

            }while (enemyHealth > 0);

            System.out.println("Victorious!!!");
        }
    }
}
