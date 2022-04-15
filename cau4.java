package n43l;

import java.util.Scanner;

public class cau4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,i;
		if(n<0) n*=-1;
		while(n>0) {	
			i=n%10;
			sum+=i;
			n/=10;
		}
		System.out.println(sum);
	}

}
