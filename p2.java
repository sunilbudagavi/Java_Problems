package TenInter;

import org.json.JSONArray;
import org.json.JSONObject;

//class example{
//	 String account_type= "Savings";
//	
//	public void CalculateTotal(int balance) {
//		if(account_type.equalsIgnoreCase("Savnigs")) {
//			balance+=account_type;
//		}
//	}
//}

public class p2 {

	public static void main(String[] args) {
		String json = "{ \"accounts\": [ { \"account_number\": \"1234567890\", \"account_holder\": \"Alice\", \"balance\": 1000, \"account_type\": \"Savings\" }, { \"account_number\": \"9876543210\", \"account_holder\": \"Bob\", \"balance\": 2500, \"account_type\": \"Checking\" } ] }";
        
		JSONObject Accountss = new JSONObject(json);
		
		JSONArray arr = Accountss.getJSONArray("accounts");
		
		int total_balance = 0;
		for(int i=0;i<arr.length();i++) {
			JSONObject ind = arr.getJSONObject(i);
			
			
			long no = ind.getLong("account_number");
			String name = ind.getString("account_holder");
//			balance itn 
			int Balance = ind.getInt("balance");
			String type = ind.getString("account_type");
			
			System.out.println("Account Number: "+no);
			System.out.println("Account Holder Name: "+name);
			System.out.println("Account Balance: "+Balance);
			System.out.println("Account Type: "+type);
			System.out.println("------------------------");
			
			total_balance+=Balance;
			
		}
		System.out.println("The Total balance After Savnigs: "+total_balance);
	}

}
