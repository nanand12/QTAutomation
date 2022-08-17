package selenium.QTAutomation;

import selenium.QTAutomation.Parent1;
import selenium.QTAutomation.Parent2;

interface Parent1
{
	void method1();
	
}

interface Parent2
{
	void method2();
	
}

class Child3 implements Parent1, Parent2
{
	@Override
	public void method2() {

		System.out.println("child3 method2 inplementation");
		
	}

	@Override
	public void method1() {
		System.out.println("child3 method1 inplementation");

		
	}
	
}

public class InterfaceImplementation {

	public static void main(String[] args) {
		Parent1 p1= new Child3();
		p1.method1();
		
		Parent2 p2= new Child3();
		p2.method2();
		
		Child3 ch1= new Child3();
		ch1.method1();
		ch1.method2();

		
	}

}
