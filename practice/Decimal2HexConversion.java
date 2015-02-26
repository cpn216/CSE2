
 
import java.util.Scanner;
 
public class Decimal2HexConversion {
 
  public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter decimal number you like: ");
    int deci = input.nextInt();
 
    System.out.println("The hexadecimal number for decimal " + 
  deci + " is " + convert(deci));
  }
 
  public static String convert(int decimal) {
    String hex = "";
 
    while (decimal != 0) {
       int hexValue = decimal % 16; 
       hex = toHexChar(hexValue) + hex;
       decimal = decimal / 16;
    }
 
    return hex;
  }
 
  public static char toHexChar(int hexValue) {
    if (hexValue <= 9 && hexValue >= 0)
       return (char)(hexValue + '0');
    else 
       return (char)(hexValue - 10 + 'A');
  }
}