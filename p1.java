package TenInter;

import org.json.JSONObject;




public class p1 {
	public static void main(String[] args) {

		String jsonstrings = "{ \"transaction\": { \"transaction_id\": \"TXN12345\", \"date\": \"2024-10-02\", \"amount\": 2500, \"transaction_type\": \"debit\" } }";
		JSONObject jsonparse = new JSONObject(jsonstrings);
		JSONObject object1 = jsonparse.getJSONObject("transaction");
		String ID = object1.getString("transaction_id");
		String date = object1.getString("date");
		int amount = object1.getInt("amount");
		String type = object1.getString("transaction_type");
		
		System.out.println("ID: "+ID);
		System.out.println("Date: "+date);
		System.out.println("Amount: "+amount);
		System.out.println("Type:  "+type);


	}

}
//"{\"hi"\, \"helo"\, \"name"\, \"cool"\ }"