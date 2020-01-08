import java.util.Scanner;

public class SirLance {

    public static void main(String[] args) {


        //To take in the users input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to WestRoast!!");

        System.out.println("What is your name champion??");

        //saves the first users input as there name
        String getName = input.nextLine().toUpperCase();

        System.out.println("Welcome peasant " + getName);

        System.out.println("Are you willing to except the challenge? [Y | N]");

        //determine if they will fight the monster if "Y" than do this
        if (input.nextLine().equalsIgnoreCase("y")){

            System.out.println("Battle start");

            System.out.println("===================");

            System.out.println("Your challeneger is Codeup");

            //enemys inital health and damage
            int enemyHealth = 100;

            int enemyDamage = 15;

            System.out.println("there health " + enemyHealth);

            System.out.println("there damage " + enemyDamage);

            System.out.println("====================");

            System.out.println(getName);

            //your health and damage
            int yourHealth = 100;

            int yourDamage = 20;

            int potions = 3;

            System.out.println("Your health " + yourHealth);

            System.out.println( "your damage " + yourDamage);

            System.out.println("You have 3 potions\n ");

            //determain what input is to make you character do something
            do {

                System.out.println("Quick pick a number!\n1. Attack\n2. potions\n3. run?");

                int userTurn = Integer.parseInt(input.nextLine());

                // if turn  = one than attack
                if(userTurn == 1){

                //enemy health - your damage
                enemyHealth-=yourDamage;

                yourHealth-=enemyDamage;

                System.out.println(yourHealth);

                //new eneamy health
                System.out.println(enemyHealth);

                //use potions if input equals 2
                }else if (userTurn == 2){

                    // if potions equal zero
                    if (potions == 0){

                        System.out.println("You are out of potions!");

                        // -1 from potions and add 30 to your health
                    }else{

                    potions -= 1;

                    yourHealth+=30;

                    yourDamage+=10;

                    System.out.println("You added +30 health");

                    System.out.println("You added +10 damage");

                    }

                    // if you select 3
                }else if (userTurn == 3){

                    System.out.println("You cant run from me!!!");

                }

            }while (enemyHealth > 0);

            System.out.println("Victorious!!!");

            //determine if they will fight the monster if "N" than do this
        }else{
            System.out.println("You are weaker than I thought!");
        }
    }
}
