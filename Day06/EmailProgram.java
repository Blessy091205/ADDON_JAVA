package Day06;
import java.util.HashMap;
import java.util.Map;
public class EmailProgram {

	public static void main(String[] args) {
		HashMap<String,Integer> studentMarks=new HashMap();
		 studentMarks.put("John", 43);
		 studentMarks.put("krithi", 80);
		 studentMarks.put("mick", 76);
		int totalMarks=0;
		for(int marks:studentMarks.values()) {
			totalMarks +=marks;
		
			
		}
		System.out.println("Student Total Maks:"+totalMarks);
		double average=totalMarks /studentMarks.size();
		System.out.println("Student Average: "+average);
		for(Map.Entry<String,Integer> entry : studentMarks.entrySet()){
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
	}

}
