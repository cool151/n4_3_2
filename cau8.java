package n43l;

import java.util.Scanner;

public class cau8 {
//giai thua
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p=1;
		for(int i=1;i<=n;i++) {
			p*=i;
		}
		System.out.print(p);
	}

}
