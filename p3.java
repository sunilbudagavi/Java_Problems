package TenInter;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class p3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String json = "{ \"loan_accounts\": [" +
				"{ \"account_number\": \"LOAN001\", \"account_holder\": \"John Doe\", \"loan_amount\": 500000, \"interest_rate\": 7.5, \"loan_term_years\": 15 }," +
				"{ \"account_number\": \"LOAN002\", \"account_holder\": \"Jane Smith\", \"loan_amount\": 300000, \"interest_rate\": 6.8, \"loan_term_years\": 10 }," +
				"{ \"account_number\": \"LOAN003\", \"account_holder\": \"Michael Johnson\", \"loan_amount\": 250000, \"interest_rate\": 8.0, \"loan_term_years\": 12 }," +
				"{ \"account_number\": \"LOAN004\", \"account_holder\": \"Emily Davis\", \"loan_amount\": 600000, \"interest_rate\": 7.2, \"loan_term_years\": 20 }," +
				"{ \"account_number\": \"LOAN005\", \"account_holder\": \"Chris Brown\", \"loan_amount\": 450000, \"interest_rate\": 7.0, \"loan_term_years\": 18 } ] }";



		JSONObject Accounts = new JSONObject(json);

		JSONArray arr = Accounts.getJSONArray("loan_accounts");
		
		for(int i=0;i<arr.length();i++) {
			JSONObject account = arr.getJSONObject(i);

			String acc_num = account.getString("account_number");
			String acc_holder = account.getString("account_holder");
			int loan_amount = account.getInt("loan_amount");
			double interest_rate = account.getDouble("interest_rate");
			int loan_term_years = account.getInt("loan_term_years");


			System.out.println("Account Number: "+acc_num);
			System.out.println("Account Holder: "+acc_holder);
			System.out.println("Loan Amount: "+loan_amount);
			System.out.println("Intrest Rate: "+interest_rate);
			System.out.println("Loan Term: "+loan_term_years);
			System.out.println("___________________________");



		}


		for(int i=0; i<arr.length(); i++) {
            System.out.println("Enter the details for Account " + (i+1) + ":");
            
            System.out.print("Enter the Principal Amount: ");
            int princeAmount = sc.nextInt();
            
            System.out.print("Enter the Interest Rate: ");
            double rate = sc.nextDouble();
            
            System.out.print("Enter the Loan Term in Years: ");
            int term = sc.nextInt();
            
            System.err.println("_____________");

            // Calculate EMI
            double monthlyInterestRate = rate / (12 * 100);  // Monthly interest rate
            int loanTermMonths = term * 12;  // Loan term in months

            // Corrected EMI formula
            double EMI = (princeAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTermMonths)) 
                        / (Math.pow(1 + monthlyInterestRate, loanTermMonths) - 1);

            System.out.printf("The Monthly Installment (EMI) for Account %d is: %.2f\n", i+1, EMI);
            System.out.println("*****************************************************************");
        }



		


	}

}
