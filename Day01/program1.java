package Day01;

import java.util.*;

public class program1 {



	public static void main(String[] args) {

		Scanner ref=new Scanner(System.in);

		System.out.println("enter your age");

		int a=ref.nextInt();

		if(a>=18) {

			System.out.println("you are eligible for voting...");

		}else {

			System.out.println("you are not eligible for voting..");

		}

	}



}