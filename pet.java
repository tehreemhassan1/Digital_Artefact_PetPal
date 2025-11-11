import java.util.Scanner; //imports scanner

class pet {
    // variables for point system
    int currentHealth = 3;

    int currentHunger = 3;

    int currentHappy = 3;
    boolean petAlive = true;


    public void startPetCare() { // starts playable part of game
        Scanner scanner = new Scanner(System.in);
        String continueProgram1 = "yes";

        // While loop to keep the programme running

        while (continueProgram1.equalsIgnoreCase("yes")) {
            // 3 if statements control max and min value of point system
            // max 20 points won't exceed 20
            // min 0 game will end once any variable hits 0
            if (currentHealth >=20) {
                int currentHealth = 20;
            }
            else if (currentHealth <= 0){
                boolean petAlive = false;
                System.out.println("You failed :( Your cat died");
                break;
            }

            if (currentHunger >=20) {
                int currentHealth = 20;
            }
            else if (currentHunger <= 0){
                boolean petAlive = false;
                System.out.println("You failed :( Your cat died");
                break;
            }

            if (currentHappy >=20) {
                int currentHealth = 20;
            }
            else if (currentHappy <= 0){
                boolean petAlive = false;
                System.out.println("You failed :( Your cat died");
                break;
            }

            //current stats
            System.out.println("Stats");
            System.out.println("Health: "+currentHealth);
            System.out.println("Hunger: "+currentHunger);
            System.out.println("Happiness: "+currentHappy);

            //third menu page which allow user to start playing for points
            System.out.println("\nWhat would you like to do?");
            System.out.println("Option 1: Feed your pet");
            System.out.println("Option 2: Play with pet");
            System.out.println("Option 3: Let your cat rest");
            System.out.println("Option 4: End Game");
            int optionAns2;

            while (true) {
                System.out.print("Please select your option (1 or 4): ");
                optionAns2 = scanner.nextInt();

                if (optionAns2 >= 1 && optionAns2 <= 4) {
                    break; // valid input
                } else {
                    System.out.println("Invalid option. Please enter a number between 1 and 4.");

                }
            }

            scanner.nextLine();

            // add custom response to each one, boring right now
            System.out.println("\nThank you,you selected option " + optionAns2 + "\n");
            // main if statement
            // option 1 - food, random points
            if (optionAns2 == 1) {
                System.out.println("What would you like to feed your pet?");
                System.out.println("Salmon - 1 , Tuna - 2 or Dry Food - 3");
                int foodChoice = scanner.nextInt();
                scanner.nextLine();
                System.out.println("You entered: " + foodChoice);
                int randomNumber1 = (int)(Math.random()* 5);
                if (foodChoice == 1) {
                    System.out.println("BEFORE: " + currentHunger);
                    currentHunger += randomNumber1;
                    System.out.println("AFTER: " + currentHunger + "\n");
                } else if (foodChoice == 2) {
                    System.out.println("BEFORE: " + currentHunger);
                    currentHunger += randomNumber1;
                    System.out.println("AFTER: " + currentHunger + "\n");
                } else if (foodChoice == 3) {
                    System.out.println("BEFORE: " + currentHunger);
                    currentHunger += randomNumber1;
                    System.out.println("AFTER: " + currentHunger + "\n");
                }
            }
            // option 2 - games, random points
            else if (optionAns2 == 2) {
                System.out.println("What game would you like to play with your pet?");
                System.out.println("Lazor Light - 1 , Ball - 2 or Petting - 3");
                int gameChoice = scanner.nextInt();
                scanner.nextLine();
                System.out.println("You entered: " + gameChoice);
                int randomNumber2 = (int)(Math.random()* 5);
                //create random number picker and random plus or minus
                if (gameChoice == 1) {
                    System.out.println("BEFORE: " + currentHappy);
                    currentHappy += randomNumber2;
                    System.out.println("AFTER: " + currentHappy + "\n");
                } else if (gameChoice == 2) {
                    System.out.println("BEFORE: " + currentHappy);
                    currentHappy += randomNumber2;
                    System.out.println("AFTER: " + currentHappy + "\n");
                } else if (gameChoice == 3) {
                    System.out.println("BEFORE: " + currentHappy);
                    currentHappy -= randomNumber2;
                    System.out.println("AFTER: " + currentHappy + "\n");
                }
            }
            // option 3 - sleep, random number is connected to specific points
            else if (optionAns2 == 3) {
                System.out.println("Your cat is resting");
                //create random number picker and random plus or minus
                // generate random number 1-60 (simulate an hour max of sleep)
                //0-20 = -3 points, 21-40 = 2 points, 41-60=4 points
                int randomNumber3 = (int)(Math.random()* 60);
                System.out.println(randomNumber3);
                if (randomNumber3 <= 20) {
                    System.out.println("BEFORE: " + currentHealth);
                    currentHealth -= 3;
                    System.out.println("AFTER: " + currentHealth + "\n");
                }
                else if (randomNumber3 >= 21 && randomNumber3 <= 40) {
                    System.out.println("BEFORE: " + currentHealth);
                    currentHealth += 2;
                    System.out.println("AFTER: " + currentHealth + "\n");
                }
                else if (randomNumber3 >= 41 && randomNumber3 <= 60) {
                    System.out.println("BEFORE: " + currentHealth);
                    currentHealth += 4;
                    System.out.println("AFTER: " + currentHealth + "\n");
                }
            }
            // ends game and shows user final stats of pet
            if (optionAns2 == 4) {
                System.out.println("Thank you for playing! Hope you enjoyed it!");
                System.out.println("Here are your final stats");
                System.out.println("Health: "+currentHealth);
                System.out.println("Hunger: "+currentHunger);
                System.out.println("Happiness: "+currentHappy);

                break;
            }
        }
    }
}