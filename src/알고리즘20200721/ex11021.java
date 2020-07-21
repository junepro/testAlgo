package 알고리즘20200721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex11021 {
	public static void main(String[] args) throws IOException
	{
		
		/* 기초적방법
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * while(true) { int a = sc.nextInt(); int b = sc.nextInt();
		 * 
		 * if(a==0 &&b==0) break; System.out.println(a+b); }
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int cnt=0;
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			cnt++;
			
			if(a==0 &&b==0)
				break;

			sb.append("Case #"+cnt+"  ").append(a+b).append("\n");
		
	}
		System.out.println(sb);
	}
}
