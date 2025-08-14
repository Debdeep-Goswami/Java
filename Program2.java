import java.util.Arrays;
import java.util.Locale;
import java.util.List;

import javax.print.DocFlavor.STRING;

/****************************************************************

  String Operations Basics

  https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
	  
*****************************************************************/


class Main
{
  public static void main(String args[])
  {
    //  Declaration

    String str1 = "Debdeep";  //  String literal
    System.out.println("Str1 = "+str1);

    String str2 = new String("Ram");   //  Using New Keyword
    System.out.println("Str2 = "+str2);

    char[] chars = {'H','E','L','L','O'};   //  Using Char Arrays
    String str3 = new String(chars);
    System.out.println("Str3 = "+str3);

    byte[] bytes = {72,101,108,108,111};   //  Using Byte array of ASCII values
    String str4 = new String(bytes);
    System.out.println("Str4 = "+str4);

    String str5 = new String(new StringBuffer("Abc"));  //  Using StringBuffer  - ThreadSafe But faster than String
    System.out.println("Str5 = "+str5);

    String str6 = new StringBuffer("ABC").toString();   //  Alternative way
    System.out.println("Str6 = "+str6);

    String str7 = String.valueOf(new StringBuffer("Xyz"));  //  Alternative way
    System.out.println("Str7 = "+str7);

    String str8 = new String(new StringBuffer("Buf"));  //  Using StringBuilder   - Not Threadsafe but fastest among all
    System.out.println("Str8 = "+str8);


    //  Static Functions

    char[] chars2 = {'H','E','L','L','O',' ','J','A','V','A','!'};
    String result =null;


    //  _______________________________  copyValueOf() __________________________

    result = String.copyValueOf(chars2);       //  Char Array to String
    System.out.println("Result = "+result );

    result = String.copyValueOf(chars2, 6, 4);  //  Char Array with Range to String
    System.out.println("Result = " +result );


    //  _________________________________ valueOf() ______________________________

    //  Implicit data types to String
    char myChar = 'a';                    
    result = String.valueOf(myChar);              // char to String
    System.out.println("Result = "+result);

    int myInt = 1;                    
    result = String.valueOf(myInt);              // int to String
    System.out.println("Result = "+result);

    long myLong = 1l;                    
    result = String.valueOf(myLong);              // long to String
    System.out.println("Result = "+result);

    float myFloat = 1.7f;                    
    result = String.valueOf(myFloat);              // float to String
    System.out.println("Result = "+result);

    double myDouble = 1.7;                    
    result = String.valueOf(myDouble);              // double to String
    System.out.println("Result = "+result);

    boolean myBoolean = true;
    result = String.valueOf(myBoolean);          //  boolean to String
    System.out.println("Result = "+result);


    //  Collections to String
    result = String.valueOf(chars2);          //  Char array to string
    System.out.println("Result = "+result);

    result = String.valueOf(chars2,0,5);      //  char array with range to String 
    System.out.println("Result = "+result);


    //  ______________________________ format() ________________________________

    result = String.format("Name = %s, Age = %d", "Debdeep",35);
    System.out.println("Result = "+result);


    result = String.format(Locale.FRENCH, "Total: %.2f", 1234.56);
    System.out.println("Result = "+result);


    //  _____________________________ join() ___________________________________

    result = String.join("-","2025","08","15");
    System.out.println("Result = "+result);

    List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
    result = String.join(",",list);
    System.out.println("Result = "+result);

    String[] array = {"Tom" , "Jerry"};
    result = String.join(" & ", array);
    System.out.println("Result = "+result);
  }
}
