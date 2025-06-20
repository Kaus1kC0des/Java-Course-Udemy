import java.util.*;

public class StringTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();


//        Finding an element at index
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        System.out.println("Element at position " + pos + " is " + str.charAt(pos));

    }
}
