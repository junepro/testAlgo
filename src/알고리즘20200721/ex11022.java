package 알고리즘20200721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex11022 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
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

			sb.append("Case #"+cnt+" "+a+" + "+b+" = ").append(a+b).append("\n");
		
	}
		System.out.println(sb);
	}
	}


