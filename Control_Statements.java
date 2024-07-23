package DataTypes;

import java.util.Scanner;

public class Control_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
// If key Word is used to test the first statent is True or False 

        if(n<0){
            System.out.println("It's  a Negitive Number");
        }

//else if Key word is used to test the First Statmen is true, First Statemennt should be False if It's True the code will end at If Satement. 
        else if(n==0){
            System.out.println("Number is Zero");
        }

// else statement is used to if the both if and else if statements are False;
        else{
            System.out.println("It's a postive Number");
        }

// User input Scanner class should Close after using it.
        sc.close();
    }
}
