import java.util.Scanner;
public class Calculator {
public static void main(String[] args){
	
	Scanner ab = new Scanner(System.in);
	double fn,sn;
	int option =0 ;
	System.out.println("Enter your first number");
	fn = ab.nextDouble();
	System.out.println("Enter your Second number");
	sn = ab.nextDouble();
	
	System.out.println("Enter your option ");
	System.out.println("1.Addition	2.Subtraction	3.Multiply	4.Division" +option  );
	option = ab.nextInt();	
	
	switch(option ){
	case 1:System.out.println(+(fn+sn));break;
	case 2:System.out.println(+(fn-sn));break;
	case 3:System.out.println(+(fn*sn));break;
	case 4:System.out.println(+(fn/sn));break;
	default:System.out.println("Wrong option");
	
	}
}
}
