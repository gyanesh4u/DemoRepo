package FreeCRMTesting;

import java.util.HashMap;

public class Data {

	public static HashMap<String,String> getuserLoginInfo()
	{
		HashMap<String,String> userMap=new HashMap<String,String>();
		userMap.put("customer","neveenk_test@123");
		userMap.put("admin","adminuser_test@123");
		return userMap;
	}
	
	public static HashMap<Integer,String> monthMap()
	{
		HashMap<Integer,String> monthMap=new HashMap<Integer,String>();
		monthMap.put(1,"January");
		monthMap.put(2,"February");
		monthMap.put(3,"March");
		monthMap.put(4,"April");
		monthMap.put(5,"May");
		monthMap.put(6,"June");
		monthMap.put(7,"July");
		monthMap.put(8,"August");
		monthMap.put(9,"September");
		monthMap.put(10,"October");
		monthMap.put(1,"November");
		monthMap.put(1,"December");
		
		return monthMap;
	}
	
	
	
}
