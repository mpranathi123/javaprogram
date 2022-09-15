//to store employee details
package pro1.pro;
import java.util.Scanner;
public class pro12 {

	public static void main(String[] args) {
				String sname;
				int sage;
				float stotalmarks;
				String add; 
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter name");
				sname=sc.nextLine();
				System.out.println("Enter age");
				sage=sc.nextInt();
				System.out.println("Enter total marks");
				stotalmarks=sc.nextFloat();
				System.out.println("enter address");
				add=sc.next();
				System.out.println("Student details");
				System.out.println("Name="+sname);
				System.out.println("Age="+sage);
				System.out.println("Total Marks="+stotalmarks);
		        System.out.println("address="+add);

	}

}
