import java.util.Scanner; //imports scanner

public class Main { //creates main class
    public static void main(String[] args) {
        System.out.println("Welcome to PawPal!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstname = scanner.nextLine();

        String continueProgram = "yes";

        // While loop to keep the programme running until user chooses to quit
        while (continueProgram.equalsIgnoreCase("yes")) {

            //first menu page to start the game
            System.out.println("Let's start the game!\nMenu:");
            System.out.println("Option 1: Adopt pet!");
            System.out.println("Option 2: Quit Game");
            System.out.println("Please select your option:");
            int optionAns1;

            // input validation for menu selection
            while (true) {
                System.out.print("Please select your option (1 or 2): ");
                optionAns1 = scanner.nextInt();

                if (optionAns1 >= 1 && optionAns1 <= 2) {
                    break; // valid input
                } else {
                    System.out.println("Invalid option. Please enter a number between 1 and 2.");

                }
            }
            scanner.nextLine();
            // game starts here
            System.out.println("\nThank you, " + firstname + ", you selected option " + optionAns1 + "\n");
            //arrays with other animals
            //second menu page to create pet RECREATE TAKE INSPO FROM WEEK 7
            if (optionAns1 == 1) {
                System.out.println("Cat Profile");
                System.out.println("Choose a name: ");
                String catname = scanner.nextLine();
                System.out.println("Would you like to adopt a black, white or ginger cat: ");
                String cattype = scanner.nextLine();
                System.out.println("\nYou adopted a " + cattype + " cat named " + catname + "!");
                pet myPet = new pet();
                myPet.startPetCare();

            }
            // breaks loop
            else if (optionAns1 == 2) {
                System.out.println("Thank you for playing!");
                break;
            }
        }

        // final message if user quits before class pet starts
        System.out.println("Goodbye, " + firstname + "! Thank you for using the programme.");
        scanner.close();

        // starting pet class
        class pet {
            public void startPetCare() {
                System.out.println("Pet care started!");
            }
        }
    }
}


