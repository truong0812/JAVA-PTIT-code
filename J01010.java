

import java.util.Scanner;

public class J01010  {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		while(t-- > 0) {
			String s = scanner.nextLine();
			String kq = "";
			boolean check = true;
			int cnt = 0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
					kq += '0';
					cnt++;
				}
				else if(s.charAt(i) == '1') {
					kq += s.charAt(i);
				}
				else {
					kq = "INVALID";
					check = false;
					break;
				}
			}
			if(check) {
				if(cnt == s.length()) {
					kq = "INVALID";
				}
				else {
					kq = kq.replaceFirst("^0+", "");
				}
			}
			System.out.println(kq);
			
		}
	}

}
