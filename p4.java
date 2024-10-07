package TenInter;

import org.json.JSONArray;
import org.json.JSONObject;

public class p4 {
	public static void main(String[] args) {
		String json="{ \"withdrawal_operations\": [" +
				"{ \"account_number\": \"ATM001\", \"account_holder\": \"John Doe\", \"balance\": 5000, \"withdrawal_amount\": 1500, \"timestamp\": \"2024-10-06T10:15:30\" }," +
				"{ \"account_number\": \"ATM002\", \"account_holder\": \"Jane Smith\", \"balance\": 12000, \"withdrawal_amount\": 5000, \"timestamp\": \"2024-10-06T11:20:00\" }," +
				"{ \"account_number\": \"ATM003\", \"account_holder\": \"Michael Johnson\", \"balance\": 2500, \"withdrawal_amount\": 3000, \"timestamp\": \"2024-10-06T12:30:45\" }," +
				"{ \"account_number\": \"ATM004\", \"account_holder\": \"Emily Davis\", \"balance\": 8000, \"withdrawal_amount\": 2000, \"timestamp\": \"2024-10-06T13:45:10\" }," +
				"{ \"account_number\": \"ATM005\", \"account_holder\": \"Chris Brown\", \"balance\": 1000, \"withdrawal_amount\": 500, \"timestamp\": \"2024-10-06T14:05:20\" }," +
				"{ \"account_number\": \"ATM006\", \"account_holder\": \"Alice Green\", \"balance\": 15000, \"withdrawal_amount\": 8000, \"timestamp\": \"2024-10-06T15:10:30\" }," +
				"{ \"account_number\": \"ATM007\", \"account_holder\": \"Bob White\", \"balance\": 6000, \"withdrawal_amount\": 1000, \"timestamp\": \"2024-10-06T16:25:00\" }," +
				"{ \"account_number\": \"ATM008\", \"account_holder\": \"Sarah Wilson\", \"balance\": 4000, \"withdrawal_amount\": 4500, \"timestamp\": \"2024-10-06T17:35:15\" }," +
				"{ \"account_number\": \"ATM009\", \"account_holder\": \"David Clark\", \"balance\": 7000, \"withdrawal_amount\": 2500, \"timestamp\": \"2024-10-06T18:50:50\" }," +
				"{ \"account_number\": \"ATM010\", \"account_holder\": \"Rachel Adams\", \"balance\": 9000, \"withdrawal_amount\": 7000, \"timestamp\": \"2024-10-06T19:00:25\" } ] }";
		
		JSONObject jsonobject = new JSONObject(json);
		
		JSONArray jsonarray = jsonobject.getJSONArray("withdrawal_operations");
		
		for(int i=0;i<jsonarray.length();i++) {
			JSONObject AccObject = jsonarray.getJSONObject(i);
			
//			String accountnumber = 
		}
		
		
	}
	
	
}
