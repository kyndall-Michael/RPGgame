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
//
            System.out.println("===================");

            System.out.println("Your challeneger is Codeup");

            int enemyHealth = 100;
            int enemyDamage = 15;

            System.out.println("there health " + enemyHealth);
            System.out.println("there damage " + enemyDamage);

            System.out.println("====================");
//
            System.out.println(getName);
//
            int yourHelth = 100;
            int yourdamage = 20;

            System.out.println("Your health " + yourHelth);
            System.out.println( " your damage " + yourdamage);

        if(enemyHealth > 0) {
            int remaningHealth = enemyHealth - yourdamage;


            System.out.println("Quick pick a number!\n1. Attack\n2. run?");

            int userTurn = Integer.parseInt(input.nextLine());

            do {
                if (userTurn == 1) {

                    System.out.println(remaningHealth);

                } else if (userTurn == 2) {
                    System.out.println("You can't run from me!!");
                }
            } while (enemyHealth < 0);
        }
//
//            do {
//
//                heroTurns(input);
//
//            if (health() == 0){
//                System.out.println("Victorious!!!");
//            }
//
//            }while (isAlive());
//
//        }else {
//            System.out.println("You are weaker than I thought you were ");
//        }




    }

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome to WestRoast");
//        System.out.println("What is your name Champion?");
//
//        String getName = input.nextLine().toUpperCase();
//
//        System.out.println("Welcome peasant " + getName);
//
//
//
//

//    public static boolean enemy(){
//
//        String enemyName = "Codeup";
//
//        int enemyHealth = 100;
//
//        int enemyDamage = 15;
//
//        System.out.println("Your challenger is " + enemyName + "\n");
//
//        System.out.println("enemyHealth " + enemyHealth);
//
//        System.out.println("enemyDamage " + enemyDamage);
//
//        return true;
//    }
//
//    public static void heroStats(){
//
//        System.out.println("Your health is " + health());
//
//        System.out.println("Your damage is " + damage());
//    }
//
//    public static void heroTurns(Scanner input){
//        System.out.println("Quick pick a number!\n1. Attack\n2. run?");
//
//        int userTurn  = Integer.parseInt(input.nextLine());
//
//
//        if (userTurn == 1){
//
//            System.out.println(hit(20, 100));
//
//        }else if (userTurn == 2){
//            System.out.println("You can't run from me!!");
//        }
//
//    }
//
//    public static int damage(){
//        int Damage = 100;
//        return Damage;
//    }
//
//    public static int health(){
//
//       int Health = 100;
//
//       return Health;
//    }
//
//    public static boolean isAlive(){
//        return health() > 0;
//    }
//
//    public static int hit(int damange, int health){
//       return health -= damange;
//    }

}}

