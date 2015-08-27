
public class Application {

	public static void main(String[] args) {

		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 266623;
		
		float floatValue = 8892.8f;
		float floatValue2 = (float)8892.3; // I can create a float value also by casting it directly.
		double doubleValue = 32.1;
		
		// To know what a primitive value can contain:
		System.out.println("Max-value in a Byte: " + Byte.MAX_VALUE);
		System.out.println("Min-value in a Byte: " + Byte.MIN_VALUE);
		
		// If you have one kind of numerical value and you want to store it in a variable of a different type you can use a cast.
		// You have to put the type (int) you want to cast to intValue in round brackets before the type that you are casting from.
		intValue = (int)longValue; // This is fine because the value of longValue is quite small and can fit in an int.
		
		System.out.println(intValue); 
		
		// If you are changing to double value you don't have to cast it because you are not actually changing the value, you are not chopping anything off.
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		// In this case we are going to loose what is after the . in the floatValue. In this case you need the cast because Java wants to know that you actually want to chop off the last bit of the value.
		// It will not round off the value, it will just chop it off.
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		// If we try to cast a value into something that is not big enough, it's going to output the minimum value of it (-128):
		// Always check if you have enough memory to cast.
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}

}
