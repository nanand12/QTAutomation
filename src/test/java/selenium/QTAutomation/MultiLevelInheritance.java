package selenium.QTAutomation;


class MultiLevel {

        void Animal()
        {
            System.out.println("This is the parent method Animal");
        }
}

        class Child1 extends MultiLevel
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
		
        public class MultiLevelInheritance{
	public static void main(String[] args) {
		

		MultiLevel p1 = new MultiLevel();
	            p1.Animal();
	            Child2 ch2= new Child2();
	            ch2.Animal();;
	          
	        }
        }
	
	
