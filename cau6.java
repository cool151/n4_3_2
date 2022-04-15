package n43l;

import java.util.Scanner;

public class cau6 {
//ngto
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a; i<=b; i++) {
			int kt=0;
			for(int m=2; m<=Math.sqrt(i); m++) if(i%m==0) kt=1;
			if(kt==0&&i!=1) 
			System.out.print(i +" ");
		}
	}

}
