package java1206;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double eng, prg, mat, arc, avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("영작문 점수: ");
		eng = scan.nextDouble();
		System.out.print("프로그래밍 점수: ");
		prg = scan.nextDouble();
		System.out.print("이산수학 점수: ");
		mat = scan.nextDouble();
		System.out.print("컴퓨터구조 점수: ");
		arc = scan.nextDouble();
		
		avg = (eng + prg + mat + arc) / 4;
		System.out.println("영작문 점수: " + eng + "점");
		System.out.println("프로그래밍 점수: " + prg + "점");
		System.out.println("이산수학 점수: " + mat + "점");
		System.out.println("컴퓨터구조 점수: " + arc + "점");
		System.out.println("평균 점수: " + avg + "점");
		
		scan.close();
	}

}

/*
final double PI = 3.141592;
double radius, area;

Scanner scan = new Scanner(System.in);
System.out.print("원의 반지름: ");
radius = scan.nextDouble();
System.out.print("원의 반지름은 " + radius + "이다.");

area = radius * radius * PI;
System.out.println("원의 면적은 " + area + "이다.");
*/