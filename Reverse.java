import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String GivenString = sc.nextLine();


        String ReverseString = new String();
        for (int i=GivenString.length()-1;i>=0;i--){
            ReverseString = ReverseString + GivenString.charAt(i);
            // System.out.println("Reversed: " + ReverseString);
        }
        System.out.println(ReverseString);
        sc.close();
    }
}
