import java.util.Scanner;
public class CelToFah{
	public static void main(String [] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number what you add del or fah ");
		System.out.println("1.cel");
		System.out.println("2.fah");
		int celorfah=input.nextInt();

		if(celorfah == 1){
			System.out.print("Enter the value :- ");
			double value=input.nextInt();
			double answer=cel(value);
			System.out.println("");
			System.out.println("The fahrenhite value of "+value+" celcious is "+answer);
		}
		if(celorfah == 2){
			System.out.print("Enter the value :- ");
			double value=input.nextInt();
			double answer=fah(value);
			System.out.println("");
			System.out.println("The celcious value of "+value+" celcious is "+answer);
		}
	}
	public static double fah(double fah){
		double cel=((fah-32)*5)/9;
		return cel;
	}
	public static double cel(double cel){
		double fah=((9*cel)/5)+ 32;
		return fah;
	}
}