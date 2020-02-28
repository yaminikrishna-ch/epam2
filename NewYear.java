package task2;
import java.util.*;
public class NewYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sweets");
		int s = sc.nextInt();
		System.out.println("Enter the weights of sweets");
		int i;
		int [] a = new int[s];
		for(i=0;i<s;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number of chocolates");
		int c = sc.nextInt();
		System.out.println("Enter the weights of sweets");
		int [] b = new int [c];
		for(i=0;i<c;i++) {
			b[i]=sc.nextInt();
		}
		int s1=0;
		for(i=0;i<s;i++) {
			s1+=a[i];
		}
		System.out.println("The sweets weight is:"+s1);
		int c1=0;
		for(i=0;i<c;i++) {
			c1+=b[i];
		}
		System.out.println("The weight of chocolates is:"+c1);
		System.out.println("Enter the range in which the chocolates and sweets should reside:");
		int start=sc.nextInt();
		int last= sc.nextInt();
		System.out.println("The chocolates present in the given range are:");
		for(i=0;i<c;i++) {
			if(b[i]>=start && b[i]<=last) {
				System.out.print(b[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Sweets present in the given range are:");
		for(i=0;i<s;i++) {
			if(a[i]>=start && a[i]<=last) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
