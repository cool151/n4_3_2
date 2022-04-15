package n43l;

public class cau7 {
//fibo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,fn=f1+f2;
		System.out.print(f1+" "+f2+" ");
		for(int i=3; i<=10; i++) {
			f1=f2;
			f2=fn;
			fn=f1+f2;
			System.out.print(fn+" ");
		}
	}

}
