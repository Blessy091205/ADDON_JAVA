package Day06;

public class Main extends Thread {
  public void run() {
	  for(int i=1;i<=10;i++)
		  System.out.println("hi thread..!"+" "+i);
	//  System.out.println("hii threads..!");
  }
class Execute{
	public static void main(String[] args) {
		Main m =new Main();
		m.run();
	//	m.start();

	}


}}