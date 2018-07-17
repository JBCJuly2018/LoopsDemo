public class ForLoop {

    public static void main(String[] args) {

        // Q: Why do we use a for loop?
        // A:

        // Given this scenario: I want to print odd and even for numbers 1-10, how do I do that?
        // The inefficient way:

        System.out.println("1 is odd");
        System.out.println("2 is even");
        System.out.println("3 is odd");
        System.out.println("4 is even");
        System.out.println("5 is odd");
        System.out.println("6 is even");
        System.out.println("7 is odd");
        System.out.println("8 is even");
        System.out.println("9 is odd");
        System.out.println("10 is even");

        // This works fine but what if I said to print from 1-100? Will you do the same? NO!

        // The efficient way: Using a for-loop
        // Set the starting index, go until you meet the maximum, and set the incremental value
        for (int i = 1; i <= 100; i++) {

            // How do i find out if something is even or odd? Use modulus!
            // if I divide this current value by 2 and the remainder is 0 this means it is even!
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            }
            else if (i % 2 == 1) {
                System.out.println(i + " is odd.");
            }
            // Should not have any other possibilities because modulus will return 0 or 1, but why not?
            else {
                System.out.println(i);
            }
        }

        // What just happened?

    }

}
