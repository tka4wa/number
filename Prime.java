package topic2000;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args){
			Scanner stdin=new Scanner(System.in);
			int n;
			do {
				System.out.print("整数(2以上)を入力してください:");
				 n = stdin.nextInt();
			}while(n<2);

			int a = n/2;
			int b = 0;
			int []c = new int [n];
			int d = 0;
			int []f = new int [n];
			int g = 0;
			int h=1;
			int j=0;
			int p=0;
			int w=0;
			int []q = new int [n];
			while(a>1) {
				if(n%a==0) {
					b++;
					c[d]=a;
				}
				else {
					c[d]=0;
				}
				a--;
				d++;
			}
			int []e = new int [b];

			if(b==0) {
				System.out.println(n+"は素数。");
			}
			else {
				System.out.println(n+"は合成数。");
				System.out.print("約数は、1 ");
				for(int i=c.length-1;i>=0;i--){
					if(c[i]!=0) {
						e[j]=c[i];
						System.out.print(c[i]+" ");
						j++;
						h++;
						if(h<60) {
							if(h%20==0) {
								System.out.println("");
								System.out.println("");
							}
						}
						else if(h%10==0) {
							System.out.println("");
							System.out.println("");
						}
					}
				}
				j=j+2;
				System.out.println(n+" で、\n\n"+j+"個ある");
				System.out.println("");
				System.out.print("素因数分解すると、");
				j=0;
				for(int i=0;i<b;i++) {
					while(n%e[i]==0) {
						n=n/e[i];
						f[j]=e[i];
						j++;
					}
				}
				h=0;
				for(int i=0;i<f.length;i++) {
					if(f[i]!=0) {
						if(w==0) {
							System.out.print(f[i]);
							g++;
							h++;
							w++;
							if(h%20==0)
								System.out.println("");
						}
						else{
							System.out.print("*"+f[i]);
							g++;
							h++;
							if(h%20==0)
								System.out.println("");
						}
					}
				}
				j=0;
				for(int i=0;i<g;i--) {
					while(f[j]==f[j+1]) {
						p++;
						j++;
						if(g<=j)
							break;
					}
					q[j]=p+1;
					p=0;
					if(g<=j)
						break;
					j++;
				}
				System.out.println("");
				System.out.println("");
				System.out.print("累乗で表すと、");
				for(int i=0;i<g;i++) {
//					System.out.print(f[i+1]+"@"+q[i]+"/");
					if(f[i]==f[i+1])
						System.out.print("");
					else if(w==1) {
						if(q[i]==1)
							System.out.print(f[i]);
						else
							System.out.print(f[i]+"^"+q[i]);
						w++;
					}
					else {
						if(q[i]==1)
							System.out.print("*"+f[i]);
						else
							System.out.print("*"+f[i]+"^"+q[i]);
					}
				}
				System.out.print(" となる");
			}
	}
}

