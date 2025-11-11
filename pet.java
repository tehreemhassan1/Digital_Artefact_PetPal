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
            if (currentHealth >= 20) {
                int currentHealth = 20;
            } else if (currentHealth <= 0) {
                boolean petAlive = false;
                System.out.println("You failed :( Your cat died");
                break;
            }

            if (currentHunger >= 20) {
                int currentHealth = 20;
            } else if (currentHunger <= 0) {
                boolean petAlive = false;
                System.out.println("You failed :( Your cat died");
                break;
            }

            if (currentHappy >= 20) {
                int currentHealth = 20;
            } else if (currentHappy <= 0) {
                boolean petAlive = false;
                System.out.println("You failed :( Your cat died");
                break;
            }

            //current stats


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
            if (optionAns2 == 1) {
                feed(scanner);
            } else if (optionAns2 == 2) {
                play(scanner);
            } else if (optionAns2 == 3) {
                rest(scanner);
            } else if (optionAns2 == 4) {
                System.out.println("Thank you for playing! Hope you enjoyed it!");
                System.out.println("Here are your final stats");
                displayStatus();

                break;
            }
        }

        scanner.nextLine();
    }
    public void feed(Scanner scanner) {
        // main if statement
        System.out.println("What would you like to feed your pet?");
        System.out.println("Salmon - 1 , Tuna - 2 or Dry Food - 3");
        int foodChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Who is hungry");
        int randomNumber1 = (int)(Math.random()* 5);
        if (foodChoice == 1) {
            currentHunger += randomNumber1;
        } else if (foodChoice == 2) {
            currentHunger += randomNumber1;
        } else if (foodChoice == 3) {
            currentHunger += randomNumber1;
        }
        displayStatus();
    }

    public void play(Scanner scanner) {
        System.out.println("What game would you like to play with your pet?");
        System.out.println("Lazor Light - 1 , Ball - 2 or Petting - 3");
        int gameChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Time to play");
        int randomNumber2 = (int)(Math.random()* 5);
        //create random number picker and random plus or minus
        if (gameChoice == 1) {
            currentHappy += randomNumber2;
        } else if (gameChoice == 2) {
            currentHappy += randomNumber2;
        } else if (gameChoice == 3) {
            currentHappy -= randomNumber2;
        }
        displayStatus();
    }

    public void rest(Scanner scanner) {
        System.out.println("Your cat is resting");
        //create random number picker and random plus or minus
        // generate random number 1-60 (simulate an hour max of sleep)
        //0-20 = -3 points, 21-40 = 2 points, 41-60=4 points
        int randomNumber3 = (int)(Math.random()* 60);
        System.out.println("Your cat slept for: "+randomNumber3+" minutes!");
        if (randomNumber3 <= 20) {
            currentHealth -= 3;
        }
        else if (randomNumber3 >= 21 && randomNumber3 <= 40) {
            currentHealth += 2;
        }
        else if (randomNumber3 >= 41 && randomNumber3 <= 60) {
            currentHealth += 4;
        }
        displayStatus();
    }

    public void displayStatus()
        {System.out.println("         __        __      ");
        System.out.println("   _____/ /_____ _/ /______");
        System.out.println("  / ___/ __/ __ `/ __/ ___/");
        System.out.println(" (__  ) /_/ /_/ / /_(__  ) ");
        System.out.println("/____/\\__/\\__,_/\\__/____/  ");
        System.out.println("                            ");
        System.out.println("❤️ Health: " + currentHealth);
        System.out.println("🍖 Hunger: " + currentHunger);
        System.out.println("😺 Happiness: " + currentHappy);
    }
}