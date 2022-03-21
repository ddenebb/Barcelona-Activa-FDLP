/* Create a program where the user enters a temperature in ºC and the conversion to ºFahrenheit is displayed 
 on the screen. Formula (32 ° C × 9/5) + 32 = 89.6 ° F
 */
import java.util.Scanner;
public class M7_1EX8 {
	public static void main (String[] args) {
		//variables returning from methods can go in the print command together
		//float celsiusDegrees = getNumber("Enter temperature in ºC"); 
		//float convertCelsiusToFahrenheit(celsiusDegrees);
		
		System.out.println(convertCelsiusToFahrenheit(getNumber("Enter temperature in ºC")));
		
	}
		
	static float getNumber(String message){
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		float numberEntered = sc.nextFloat();
		return numberEntered;
	}
	
	static float convertCelsiusToFahrenheit(float n1) {
		float fahrenheitDegrees = (n1 * 9) / 5 + 32;
		return fahrenheitDegrees;
		
	
	}
}
