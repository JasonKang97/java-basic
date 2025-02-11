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
		String s;
		
		while((s= br.readLine())!=null) {
			int N = Integer.parseInt(token.nextToken());
			int a[]=new int[N];
			
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			bw.write(A+B+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

