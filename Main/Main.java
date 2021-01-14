package Main;


import java.util.Scanner;


import BankAccount.Bank;
import BurgerBills.Hamburger;
import Calculate.CarpetCostCalculate;

import Calculate.SimpleCalculate;
import Car.Car;
import Car.Ford;
import Contructor.Contructor;
import Inhirect.Cat;

import Person.Person;
;

public class Main {

	public static void main(String[] args) {
		
		Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

		
	}
	
//	private static TwoParam TwoParam(int i, int j) {
//		// TODO Auto-generated method stub
//		return null;
//	}


	
	public static void calculate() {
		
		SimpleCalculate calculate = new SimpleCalculate();
		
		calculate.setFirstNumber(5.0);
		calculate.setSecondNumber(4);
System.out.println("add" + calculate.getAdditionalResult());
System.out.println("min" + calculate.getSubtractionResult());
calculate.setFirstNumber(5.25);
calculate.setSecondNumber(0);
System.out.println("multy" + calculate.getMultiplicationResult());
System.out.println("divide" + calculate.getDivisionResult());
		
	}
	
	public static void person() {
		Person person = new Person();
		person.setFirstName("amir");
//		person.setLastName("gusion");
		person.lentg();

		System.out.println(person.getFullName());
		
	}
	
	public static void bank() {
		Bank bank = new Bank();
//		bank.setAccNo(1234567);
		bank.setBalance(10000);
		bank.setCustNm("gusion");
		bank.setEmail("gs@lol.com");
		bank.setPhNo(1234567890);
		bank.addBalance(9000);

		
		
	}
	
	public static void constructor() {
	Contructor c = new Contructor("aaaaaaa",123,123);
	System.out.println("name : " + c.getName() +" num : " + c.getNum()+ " no : "+ c.getNo());
	;
	
	
	}
	
	public static void carpet() {
		CarpetCostCalculate crp = new CarpetCostCalculate(2, -5);
		crp.show();
		
	}
	
	public static void inhiret() {
		Cat cat = new Cat("orange", true);
		Cat cat2 = new Cat("merah", false);
//		Cat cat3 = cat;
		Cat cat4 = new Cat();
		cat.print();
		cat2.print();
		cat4.show();
		


		
		
	}
}


