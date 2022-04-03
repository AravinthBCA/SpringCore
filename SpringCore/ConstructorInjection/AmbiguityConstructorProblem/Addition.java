package AmbiguityConstructorProblem;

public class Addition {
	
	Addition(int a , int b){
		System.out.println("Integer Constructor.....");
	}
	
	Addition(int a , double b){
		System.out.println("Integer Double Constructor.....");
	}
	
	Addition(Double a , Double b){
		System.out.println("Double Constructor.....");
	}
	
	Addition(String a ,String b){
		System.out.println("String Constructor.....");
	}
}
