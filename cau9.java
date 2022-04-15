package n43l;

import java.util.Scanner;

public class cau9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dao=0,i,k=0;
		while(n>0) {	
			i=n%10;
			dao=dao*10+i;
			n/=10;
		}
		System.out.println(dao);
	}

}
