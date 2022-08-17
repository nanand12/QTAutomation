package selenium.QTAutomation;

public class MultiLevelInheritance {

        void Animal()
        {
            System.out.println("This is the parent method Animal");
        }

        class Child1 extends MultiLevelInheritance
        {
            void Dog()
            {
                System.out.println("This is the child method for Parent Class");
            }


        }
        class Child2 extends Child1 
        {
            void eat()
            {
                System.out.println("This is the child method for Child Class");
            }
        }
		

	public static void main(String[] args) {
		{

			MultiLevelInheritance p1 = new MultiLevelInheritance();
	            p1.Animal();
	            Child1 ch= new Child1();
	            ch.Animal();
	          
	           


	        }
	}
	
}