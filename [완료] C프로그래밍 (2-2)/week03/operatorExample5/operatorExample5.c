/* 실습 5 : operatorExample5.c
작성일 : 2018년 09월 20일
작성자 : 김동영
프로그램 설명 :   2차 방정식의 계수 a,b,c 입력 & 2차 방정식의 근을 계산
*/

#include <stdio.h> //표준입출력 헤더파일
#include<math.h> //표준 수식 계산 헤더 파일

int main(int argc, char* argv[]) {
	/*변수 선언*/
	double a = 0, b = 0, c = 0; //2차 방정식의 계수변수 선언
	double root1 = 0, root2 = 0, d = 0; //계산을 위한 변수 선언
	
	/*입력 받기*/
	printf("ax^2+bx+c에서\n"); //값을 입력 받기 위한 메시지 출력
	puts("a의 값을 입력해주세요"); //값을 입력 받기 위한 메시지 출력
	scanf_s("%lf", &a); //a 입력 받기
	puts("b의 값을 입력해주세요"); //값을 입력 받기 위한 메시지 출력
	scanf_s("%lf", &b); //b 입력 받기
	puts("c의 값을 입력해주세요"); //값을 입력 받기 위한 메시지 출력
	scanf_s("%lf", &c); //c 입력 받기


	/*계산하기*/
	d = ((b*b) - (4.0 * a*c)); //판정식 계산후 결과 저장
	root1 = ((-b + sqrt(d)) / 2.0 * a); //근1 계산후 결과 저장
	root2 = ((-b - sqrt(d)) / 2.0 * a); //근2 계산후 결과 저장

	printf("근1의 결과: %lf\n 근2의 결과: %lf\n", root1, root2);//결과 출력
	return 0;//함수의 종료
}
