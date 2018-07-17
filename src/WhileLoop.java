import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q: Why do we use a while loop?
        // A:

        // Given this scenario: Enter in the name of all your family members...
        // Does everyone always have 1, 2, or 3?

        // Inefficient way:
        System.out.println("Enter the name of your first family member: ");
        String firstMember = sc.next();

        System.out.println("Enter the name of your second family member: ");
        String secondMember = sc.next();

        System.out.println("Enter the name of your third family member: ");
        String thirdMember = sc.next();

        System.out.println("Enter the name of your fourth family member: ");
        String fourthMember = sc.next();

        System.out.println("Enter the name of your fifth family member: ");
        String fifthMember = sc.next();

        System.out.println("My family has: " + firstMember + ", " + secondMember
                + ", " + thirdMember + ", " + fourthMember + ", " + fifthMember);

        // This program only accommodates for five family members, but what if you have more or less than this?

        // Efficient way: Using a while loop!
        // Set a starting condition to run the loop:
        boolean stop = false;
        String family = "";

        while (stop==false) {
            System.out.println("Enter the name of a family member (or type q to exit): ");
            String userInput = sc.next();

            if (userInput.equalsIgnoreCase("q")) {
                stop = true;
            }
            else {
                family += userInput + ", ";
            }
        }
        System.out.println("My family has: " + family);
        // What just happened?
    }


}
