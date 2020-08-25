package pavan;
import java.util.HashMap;

public class Exhorbit {

	static HashMap<String , Float> exhorbitrate = new HashMap<String, Float>();
	static 
	{
		exhorbitrate.put("USD" , (float) 1.0);
		exhorbitrate.put("INR" , (float) 66.0);
		exhorbitrate.put("GBP" , (float) 0.67);
		exhorbitrate.put("SGD" , (float) 1.5);
		exhorbitrate.put("HKD" , (float) 8.0);
	}
	public static float convert(String currency, float amount) {
	
		float conversionFactor = Exhorbit.getCurrentFactor(currency);	
		return (float) amount / conversionFactor;
	}
	public static float getCurrentFactor(String currency) {
		return Exhorbit.get(currency);
	}
	private static float get(String currency) {
		// TODO Auto-generated method stub
		return 0;
	}

}