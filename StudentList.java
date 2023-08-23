import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {
//
//		System.out.println(args.length);
		if(args.length!=1){
			System.out.println("Invalid Input");
		}
//		Check arguments
		else if(args[0].equals("a")) {
			System.out.println("Loading data ...");			
			try {
			BufferedReader s = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String r = s.readLine();
			String i[] = r.split(",");			
			for(String j : i) {
				System.out.println(j);
			}
			s.close();
			}
			catch (Exception e){
			}
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader s = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String r = s.readLine();
			//System.out.println(r);
			String i[] = r.split(",");	
			Random x = new Random();
				int y = x.nextInt(i.length);
					System.out.println(i[y]);
			s.close();
			}
			catch (Exception e){
			}
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+")){
			System.out.println("Loading data ...");			
			try {
			BufferedWriter s = new BufferedWriter(
					new FileWriter("students.txt", true));
			String t = args[0].substring(1);
	        Date d = new Date();
	        String df = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String fd= dateFormat.format(d);
			s.write(", "+t+"\nList last updated on "+fd);
			s.close();
			}
			catch (Exception e){
			}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader s = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String r = s.readLine();
			String i[] = r.split(", ");
			String t = args[0].substring(1);
			int k=0;
			for(int j=0;j<i.length;j++){
				if(t.equals(i[j])){
					System.out.println("We found it!");
					k=1;
					break;
				}
			}
			if(k!=1){
				System.out.println("We not found");
			}
			/*boolean done = false;
			String t = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++) {
				if(i[idx].equals(t)) {
					System.out.println("We found it!");
						done=true;
				}
			}*/
			s.close();
			}
			catch (Exception e){
			}
			System.out.println("Data Loaded.");				
		}
		else if(args[0].equals("c"))
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader s = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String D = s.readLine();
			String i[] = D.split(",");
			/*char a[] = D.toCharArray();
			boolean in_word = false;
			int count=0;
			for(char c:a) {
				if(c ==' ') 
				{
					if (!in_word) {	count++; in_word =true;	}
					else { in_word=false;}			
				}
			}*/
			System.out.println(i.length +" word(s) found ");
			s.close();
			}
			catch (Exception e){
			}
			System.out.println("Data Loaded.");				
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}