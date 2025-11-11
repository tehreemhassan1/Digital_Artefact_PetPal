import java.util.Scanner; //imports scanner

public class Main { //creates main class
    public static void main(String[] args) {
        // logo for game ASCII
        System.out.println("                    ___                            ___  ");
        System.out.println("                   (   )                          (   ) ");
        System.out.println("   .─..     .──.    │ │_          .─..     .───.   │ │  ");
        System.out.println("  ╱    ╲   ╱    ╲  (   __)       ╱    ╲   ╱ .─, ╲  │ │  ");
        System.out.println(" ' .─,  ; │  .─. ;  │ │         ' .─,  ; (__) ; │  │ │  ");
        System.out.println(" │ │  . │ │  │ │ │  │ │ ___     │ │  . │   .'`  │  │ │  ");
        System.out.println(" │ │  │ │ │  │╱  │  │ │(   )    │ │  │ │  ╱ .'│ │  │ │  ");
        System.out.println(" │ │  │ │ │  ' _.'  │ │ │ │     │ │  │ │ │ ╱  │ │  │ │  ");
        System.out.println(" │ │  ' │ │  .'.─.  │ ' │ │     │ │  ' │ ; │  ; │  │ │  ");
        System.out.println(" │ `─'  ' '  `─' ╱  ' `─' ;     │ `─'  ' ' `─'  │  │ │  ");
        System.out.println(" │ ╲__.'   `.__.'    `.__.      │ ╲__.'  `.__.'_. (___) ");
        System.out.println(" │ │                            │ │                     ");
        System.out.println("(___)                          (___)                    ");
        System.out.println("Welcome to PawPal!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String username = scanner.nextLine(); // stores username


        // While loop to keep the programme running until user chooses to quit
        while (true) {

            //first menu page to start the game ASCII
            System.out.println("                                               ");
            System.out.println("                                               ");
            System.out.println(" ___ .─. .─.     .──.    ___ .─.    ___  ___  ");
            System.out.println("(   )   '   ╲   ╱    ╲  (   )   ╲  (   )(   ) ");
            System.out.println(" │  .─.  .─. ; │  .─. ;  │  .─. .   │ │  │ │  ");
            System.out.println(" │ │  │ │  │ │ │  │ │ │  │ │  │ │   │ │  │ │  ");
            System.out.println(" │ │  │ │  │ │ │  │╱  │  │ │  │ │   │ │  │ │  ");
            System.out.println(" │ │  │ │  │ │ │  ' _.'  │ │  │ │   │ │  │ │  ");
            System.out.println(" │ │  │ │  │ │ │  .'.─.  │ │  │ │   │ │  ; '  ");
            System.out.println(" │ │  │ │  │ │ '  `─' ╱  │ │  │ │   ' `─'  ╱  ");
            System.out.println("(___)(___)(___) `.__.'  (___)(___)   '.__.'   ");
            System.out.println("                                               ");
            System.out.println("                                               ");
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
            System.out.println("\nThank you, " + username + ", you selected option " + optionAns1 + "\n");
            //arrays with other animals
            //second menu page to create pet RECREATE TAKE INSPO FROM WEEK 7
            if (optionAns1 == 1) {
                System.out.println("CHOOSE AN ANIMAL");
                System.out.println(" /\\_/\\       /\\_./\\       ,~.  ");
                System.out.println("( >w< )     ( @.@ )      (o,o) ");
                System.out.println(" (   )       (  -  )~     { \" } ");
                System.out.println("  ^^ ^^       ^^ ^^        -\"-  ");
                System.out.println("  Cat         Dog          Bird ");
                System.out.println("Choose a name: ");
                String catname = scanner.nextLine();
                System.out.println("\nYou adopted a cat named " + catname + "!");
                pet myPet = new pet();
                myPet.startPetCare();

            }
            // breaks loop
            else {
                System.out.println("Thank you for playing!");
                break;
            }
        }

        // final message, user quits before class pet starts
        System.out.println("Goodbye, " + username + "! Thank you for using the programme.");
        scanner.close();
    }
}




