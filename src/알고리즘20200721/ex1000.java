package 알고리즘20200721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1000 {

	/*
	 * public static void main(String[] args) 
	 * { Scanner sc = new Scanner(System.in);
	 * int in1,in2; int cnt = sc.nextInt(); 
	 * int[] arr = new int[cnt];
	 * 
	 * 
	 * for(int i=0;i<cnt;i++) { in1=sc.nextInt(); in2=sc.nextInt();
	 *  arr[i]=in1+in2;
	 * 
	 * } sc.close();
	 * 
	 * for(int i=0;i<arr.length;i++) //for(int k:arr) Sysout.out.println(k); {
	 * System.out.println(arr[i]); }
	 */
		

	//버퍼리더는 문자열을 받아들이고 2개 공백기준을 문자열로 분리해줘야되서 StringTokenizer 사용
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++)
		{
			st = new StringTokenizer(br.readLine()," "); //공백기준으로 분리
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append("\n");
					
			
		}
		System.out.println(sb);
		
	}
}

