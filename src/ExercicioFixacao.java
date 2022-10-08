import java.util.Locale;
import java.util.Scanner;

import exercicio.Pacote_ExercicioFicaxao;

public class ExercicioFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pacote_ExercicioFicaxao values;

		System.out.println("Enter with your account number ");
		int number_of_account = sc.nextInt();

		System.out.println("Enter with your account holder");
		String account_holder = sc.next();
						
		System.out.println("Would you like to do an inital deposit (yes/no)?"); //Use if n = 0
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("yes")) {
			
			System.out.println("How much do you would like to deposit?");
			
			double initial_deposit = sc.nextDouble();
			values = new Pacote_ExercicioFicaxao(account_holder, initial_deposit, number_of_account, answer);   
			 
		} 
		else {
			
			double initial_deposit = 0.0;
			values = new Pacote_ExercicioFicaxao(account_holder, initial_deposit, number_of_account, answer);
			
		}

		
		System.out.println("Account data: ");
		System.out.print("Account: ");
		System.out.println(values.toString());

		System.out.println("Enter a deposit value:");
		double depositValue = sc.nextDouble(); 
		values.deposit(depositValue);
		System.out.println("Update:");
		System.out.print(values.toString());
	
		System.out.println("Enter a deposit value:");
		double withdrawValue = sc.nextDouble(); 
		values.deposit(withdrawValue);
		System.out.println("Update:");
		System.out.print(values.toString());
		
		sc.close();
	}

}
