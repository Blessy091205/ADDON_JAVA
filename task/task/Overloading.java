package task;
  class task{
	 public void sum(int a ,int b) {
    	  System.out.println("Enter int a:"+a);
    	  System.out.println("Enter int b:"+b);
    	  System.out.println("The sum is:"+(a+b));
      }
	 public void sum(double a,double b) {
		 System.out.println("Enter double a:"+a);
		 System.out.println("Enter double b:"+b);
		 System.out.println("The sum is:"+(a+b));
	 }

	
  }
public class Overloading {
    	
	public static void main(String[] args) {
	   task in=new task();
	   in.sum(5, 6);
	   in.sum(65.9, 76.8);
	}

}
