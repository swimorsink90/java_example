package sort.bubble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bubbleExample {
	static Person1 [] members = new Person1 [100];
	static int n = 0;
	
	public static void main(String [] args) {
		
		Scanner in;
		try {
			in = new Scanner(new File("D:\\20. dev\\reference\\testdir\\data.txt")); 
			while (in.hasNext()) { 
				 String str1 = in.next(); 
				 String str2 = in.next(); 
				 
				 members[n] = new Person1();
				 
				 members[n].name = str1; 
				 members[n].number = str2; 
				 
				 n++; 
			}
			in.close();
		}catch(FileNotFoundException e) {
			System.out.println("No data file exists");
		}
		
		bubbleSort();
		for(int i=0; i<n; i++) {
			System.out.println(members[i].name+" "+members[i].number);
		}
	}
	
	
	public static void bubbleSort() {
		
		System.out.println("## n : "+n);
		
		for(int i=n-1; i>0; i--) {
			System.out.println();
			System.out.println("#### i : "+i);
			for(int j=0; j<i; j++) {
				System.out.println("###### j : "+j);
				if(members[j].name.compareTo(members[j+1].name) > 0){
					Person1 tmpPerson = members[j];
					members[j] = members[j+1];
					members[j+1] = tmpPerson;
				}
			}
		}
	}

}
