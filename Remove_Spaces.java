import java.util.Scanner;

public class Remove_Spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Senteces: ");
        String Line = sc.nextLine();

        String GivenString = new String();

        for(int i=0;i<Line.length()-1;i++){
            GivenString = Line.trim();
            // System.out.println(GivenString);
        }
        System.out.println(GivenString);
        sc.close();
    }   
}
