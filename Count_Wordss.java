import java.util.Scanner;

public class Count_Wordss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        System.out.println("Number of words Used: "+ words.length);
        sc.close();
    }
    
}
