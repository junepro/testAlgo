package 알고리즘20200721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex10951  {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str;
		for(int i =0;i<5;i++)
		{
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			
			
		}
		
		System.out.println(sb);
		
		/*
		 * while((str=br.readLine())!=null)
		 *  { st = new
		 * StringTokenizer(br.readLine()," ");
		 *  int a = Integer.parseInt(st.nextToken());
		 * int b = Integer.parseInt(st.nextToken()); 
		 * sb.append(a+b).append("\n"); }
		 * System.out.println(sb);
		 */
	
/*	Scanner sc = new Scanner(System.in);
	
	while(sc.hasNextInt())
	{
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	}
		sc.close();*/
	
	

}
}
