

import java.util.Scanner;

public class J01013 {
	static int N = 2000000;
	static int prime[] = new int[N+1];
	public static void nto() {
		for(int i = 1;i<=N;i++) {
			prime[i]=0;
		}
		for(int i=2;i<=Math.sqrt(N);i++) {
			if(prime[i]==0) {
				for(int j=i*i;j<=N;j+=i) {
					if(prime[j]==0) {
						prime[j]=i;
					}
				}
			}
		}
		for(int i=1;i<=N;i++) {
			if(prime[i]==0) {
				prime[i]=i;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n+1];
		nto();
		for(int i=1;i<=n;i++) {
			a[i]=scanner.nextInt();
		}
		long sum=0;
		for(int i=1;i<=n;i++) {
			int x=a[i];
			while(x!=1 && prime[x]!=0) {
				sum+=prime[x];
				x/=prime[x];
			}
		}
		System.out.println(sum);

	}

}
