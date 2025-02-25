	package pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(token.nextToken());
		
		int[] A = new int[N]; 
		
		token = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(token.nextToken());
			A[i] = a;
		}
		System.out.print(A[1] + Integer.MAX_VALUE);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
