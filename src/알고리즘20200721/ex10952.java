package 알고리즘20200721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex10952 {
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
		
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 &&b==0)
				break;

			sb.append(a+b).append("\n");
		
	}
		System.out.println(sb);
	}
}

