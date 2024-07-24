import java.util.*;

public class MultipleOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence: ");
        String Inputstring = sc.nextLine();

        System.out.println("Please enter the Target Character: ");
        char TargetChar = sc.next().charAt(0);

        System.out.println("Target char :"+ TargetChar);
        System.out.println("Given Input is: " + Inputstring);

        int Count = 0;
        for(int i=0;i<Inputstring.length()-1;i++){
            if(Inputstring.charAt(i)==TargetChar){
                Count++;
             }
            //  else{
            //     System.out.println("Its a Invalid character");
            //  }
        }
            System.out.println("Most Occured: " + Count);
            sc.close();
    }
}