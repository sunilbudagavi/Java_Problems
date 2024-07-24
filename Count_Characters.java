import java.util.Scanner;

public class Count_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String s = sc.nextLine();
        System.out.println("Given Input is: "+s);
        System.out.println("Number of the Charcters in the Stirng are : "+ s.length());
        sc.close();
        
    }

}