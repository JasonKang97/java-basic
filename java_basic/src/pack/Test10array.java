package pack;

import java.util.Scanner;

public class Test10array {		//index(색인 or 첨자)

	public static void main(String[] args) {	//String[]는 배열로 선언한 것임.
		//배열(array): 타입(성격과 크기)이 일치하는 여러개의 기억장소(변수)를 대표명 하나만 주고 첨자(색인)로 각기억장소를 구분. 반복처리에 효과적.
		//예: 3과목에 점수의 합을 구하기
		int kor, eng, mat;	//단순변수: 모든 기억장소를 독립적으로 선언.
		kor=90; eng=80; mat=100;
		int tot=kor+eng+mat;
		System.out.println("세과목 점수의 합은 " + tot);
		
		//예: 배열을 사용한 3과목에 점수의 합을 구하기
		int jumsu[]= new int[3];	//int[] jumsu=new int[3];   <<<이렇게 작성해도 무관.
		jumsu[0]=90; //마찬가지로 Scanner 사용 가능
		jumsu[1]=80;
		jumsu[2]=100;
		int tot2=0;
		for(int i=0; i<3;i++) {
			tot2=tot2+jumsu[i];
		}
		System.out.println("세과목 점수의 합은 " + tot2);
		
		
		System.out.println();
		int ar[];	//배열로 선언(아직 기억장소를 확보하지 못함). int[] ar;과 같음
		ar= new int[5];	//5개의 기억장소가 확보됨. 대표명 ar인 int type의 변수 5개를 선언.
		System.out.println("배열의 크기: " + ar.length);	//배열의 크기 구하기
		ar[0]=10;
		ar[1]=20;
		ar[2]=ar[0]+ar[1];
		System.out.println("ar[2]: "+ar[2]);
		System.out.println(ar[3]);	//지정하지 않은 index의 값은 0
		//System.out.println(ar[5]);	//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//배열의 index(첨자)는 0부터 출발
		
		System.out.println();
		int kbs=2;
		System.out.println("ar[2]: "+ar[2]+" "+ar[kbs]+" "+ar[kbs+1-1]);	//양의 정수만 사용 가능.
		//ar[kbs] <<< kbs를 첨자변수 또는 색인 변수, index variable이라고 함.

		System.out.println();	//배열 선언 후 초기값 저장
		int[] ar2= {1,2,3,4,5};	//내부적으로 new를 함
		System.out.println(ar2[0]+" "+ar2[4]);
		
		System.out.println();
		for(int i=0; i<ar2.length;i++) {	//배열 요소값 반복문으로 출력
			System.out.print(ar2[i]+" ");
		}
		System.out.println();
		for(int k=0; k<ar2.length;k++) {	//반복문으로 배열 요소에 값 저장
			ar2[k]=k+10;
		}
		for(int k=0; k<ar2.length;k++) {	//표준 for문으로 배열을 반복
			System.out.print(ar2[k] + " ");
		}
		
		//배열을 이용한 반복처리시 향상된 for를 사용할 수 있다.
		System.out.println();
		for(int no:ar2) {	//ar2 배열 요소가 차례대로 no에 치환되면서 반복처리
			System.out.print(no + " ");
		}
		System.out.println();
		double silsu[]= {3.5, 2.1, 6.8};
		for(int i=0;i<silsu.length; i++) {
			System.out.print(silsu[i] + " ");
		}
		System.out.println();
		String[] city= {"서울", "제주", "원주"};
		for(int i=0;i<city.length; i++) {
			System.out.print(city[i] + " ");
		}
		System.out.println();
		for(String i:city) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("사람 키(정수)를 배열에 저장하고 평균 키 출력");
		int[] height= {178,166,177,175,180};
		int sum=0;
		for(int i=0; i<height.length; i++) {
			sum +=height[i];
		}
		double heightAver = (double)sum/height.length;
		System.out.println(height.length + "명의 키 평균은 " + heightAver);
		//height 기억장소는 1차원 배열: 한 행에 요소(열)로만 구성되어 있는 배열.
		
		
		System.out.println("2차원(다차원) 배열");
		//int su;	//한개의 독립 변수
		//int su[];	//열로만 구성된 집합 변수: 1차원 배열
		int su[][];	//행과 열로 구성된 집합 변수: 2차원 배열
		su=new int[3][4];	//1차원 배열로 선언할 경우: int su=new int[12]
		System.out.println("행의 갯수: " + su.length);
		System.out.println("열의 갯수: " + su[0].length);
		su[0][0]=7;	//2차원 su의 0행 0열에서 7을 기억
		System.out.println("su[0][0]: " + su[0][0]);
		
		//2차원 배열 su에 값 저장
		int num = 10;
		for(int i=0; i<su.length; i++){
			for(int j=0; j<su[i].length;j++) {
				su[i][j]=num++;	//su[i][j]=++num;	>>> 늘어난 후 들어감.
			}
		}
		System.out.println("su[0][0]: " + su[0][0]);
		
		System.out.println();
		for(int i=0; i<su.length; i++){
			for(int j=0; j<su[i].length;j++) {
				System.out.print(su[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("문제1) 1차원 배열 요소에서 홀수와 짝수의 합 각각 출력");
		int arr[] = {1,2,3,4,5,6};
		int odd=0;
		int even=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==1) {
//				odd+=arr[i];				
//			}
//			else {
//				even+=arr[i];
//			}
//		}
		for(int i:arr) {
			if(i%2==1) {
				odd+=i;				
			}
			else {
				even+=i;
			}
		}

		System.out.println("홀수의 합은 " + odd + ", 짝수의 합은 " + even);
		
		System.out.println();
		System.out.println("문제2) 2차원 배열 전체 요소의 합을 출력");
		int total=0;
		int arr2[][] = {{1,2},{3,4}};
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				total+=arr2[i][j];
//			}
//		}
		
//		for(int i[]:arr2) {
//			for(int j=0;j<i.length;j++) {
//				total+=i[j];
//			}
//		}
		
		for(int i[]:arr2) {
			for(int j:i) {
				total+=j;
			}
		}
		System.out.println(total);
	}
}









