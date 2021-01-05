package basic;

public class VariablesAndDatatypes {
public static void main(String[] args) {
	System.out.println("Hello, Aravind");
	int firstNumber = 5;
	System.out.println(firstNumber);
	int secondNumber = 19 + 69;
	System.out.println(secondNumber);
	int thirdNumber = (10 + 5) + (2*10);
	System.out.println("thirdNumber");
	System.out.println(thirdNumber);
	int total = firstNumber + secondNumber + thirdNumber;
	System.out.println("Total: " + total);
	total = 0;
	System.out.println("Total: " + total);
	final int lastOne = 1000 - total;
	System.out.println("Total: " + lastOne);
	//	lastOne = 200; Cannot reassign
	
	// width 32 4bytes
	int minValue = -2147483648;
	int maxValue = 2147483647;
	System.out.println(minValue);
	System.out.println(maxValue);
	
	// width 8 1byte
	byte myByte = -128;
	
	// width 16 2bytes
	short myshort = 32767;
	
	// width 64
	long myLong = 100L;
	
	System.out.println(myLong);
	System.out.println(myByte);
	System.out.println(myshort);
	
	long result = 50000L + 10L * myByte + myshort;
	short shortResult = (short) (1000 + 10 * myByte);
	System.out.println(result);
	System.out.println(shortResult);
	
	// 4 bytes width 32
	int intVal = 5;
	// 4 bytes width 32
	float floatVal =  5f;
	// 8 bytes width 64
	double doubleVal = 5d;
	
	System.out.println(intVal);
	System.out.println(floatVal);
	System.out.println(doubleVal);
	
	System.out.println(intVal/3);
	System.out.println(floatVal/3f);
	System.out.println(doubleVal/3d);
	
	double numPounds = 200;
	double kgs = numPounds * 0.45359237;
	System.out.println("Kgs: " + kgs);
	
	// width 16 2bytes
	char myChar = 'a';
	System.out.println(myChar);
	
	char unicodeChar = '\u00A9';
	System.out.println(unicodeChar);
	
	boolean myBoolean = true;
	System.out.println(myBoolean);
	myBoolean = false;
	System.out.println(myBoolean);
	
	// primitive data types -- byte, short, int, long, float, double, char, boolean
	// commonly used -- String
	
	String myString = "Aravind";
	System.out.println(myString);
	myString = myString + " Rocker ";
	System.out.println(myString);
	myString += "\u00A9";
	System.out.println(myString);	
	
	String numberString = "34.33";
	numberString += "55.09";
	System.out.println(numberString);
	
	// treats int as string only when concatenated
	String lastString = "10";
	int data = 50;
	System.out.println(lastString + data);
	
	float f1 = 35E3f;
	double d1 = 12E5d;
	
	System.out.println(f1);
	System.out.println(d1);
	
	char a = 65;
	char b = 66;
	char z = 65+25;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(z);
	
	// Typecasting
	
	int myInt = 99;
	long integerValue = myInt;
	
	System.out.println("Typecasted Auto: " + integerValue);
	
	int anotherInt = (int) integerValue;
	
	System.out.println("Typecasted Manual: " + anotherInt);
}
}
