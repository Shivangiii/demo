import java.util.*;

public class Array6 {
	public static void main(String args[]) {
		int i;
		int a[] = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0 };
		System.out.println("enter the position and element to be inserted");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		int ele = sc.nextInt();
		for (i =a.length-1 ; i > pos-1 ; i--) {
			a[i]=a[i-1];
		}
		a[pos] = ele;

		for(i=0;i<a.length-1;i++){
			System.out.println(a[i]);

	}

}
}
