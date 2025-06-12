package Day06;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
	ArrayList<Object> arr=new ArrayList<Object>();
	arr.add("Krithi");
	arr.add("S");
	arr.add("Computer Science");
	arr.add("3 Year");
	arr.add(0,"blessy");
	arr.get(2);
	arr.set(4,"kgcas");
	System.out.println(arr.get(1));
	for(Object data:arr) {
		System.out.println(data);
	}
	}

}
