import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int x1 = getNumber("Enter coordinate x for circle A center point");
		int y1 = getNumber("Enter coordinate y for circle A center point");
		int radius1 = getNumber("Enter circle A's radius");
		Point centerA = new Point(x1, y1);
		centerA.setX(x1);
		centerA.setY(y1);
		Circle A = new Circle(radius1, x1, y1);
		
		int x2 = getNumber("Enter coordinate x for tested circle's center point");
		int y2 = getNumber("Enter coordinate y for tested circle's  center point");
		int radius2 = getNumber("Enter tested circle's radius");
		Point centerTested = new Point(x2, y2);
		centerTested.setX(x2);
		centerTested.setY(y2);
		Circle tested = new Circle(radius2, x2, y2);
		
		runCircleMethods(A, tested);
	}
	
	public static void runCircleMethods(Circle A, Circle tested) {
		
	System.out.println("The distance between the center of circle A and circle tested is " + A.distanceBetweenCenters(tested));
	if (A.isEqual(tested) == true) {
		System.out.println("Circle A and circle tested are equal");
	} else { System.out.println("Circle A and circle tested are NOT equal");
	}
	
	if (A.isConcentric(tested) == true) {
		System.out.println("Circle A and circle tested are concentric");
	} else { System.out.println("Circle A and circle tested are NOT concentric");
	}
	
	if (A.isRadiusEqual(tested) == true) {
		System.out.println("Circle A and circle tested radius' are equals");
	} else { System.out.println("Circle A and circle tested radius' are NOT equal");
	}
	
	if (A.isTangent(tested) == true) {
		System.out.println("Circle A and circle tested are tangent");
	} else { System.out.println("Circle A and circle tested radius' are NOT tangent");
	}
	
	if (A.isSecant(tested) == true) {
		System.out.println("Circle A and circle tested are secant");
	} else { System.out.println("Circle A and circle tested radius' are NOT secant");
	}
	
	if (A.notTouch(tested) == true) {
		System.out.println("Circle A and circle tested do NOT touch each other");
	} else { System.out.println("Circle A and circle tested touch each other");
	}
	
	}	

	
	static int getNumber(String message){
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		int numberEntered = input.nextInt();
		return numberEntered;
	}
}
