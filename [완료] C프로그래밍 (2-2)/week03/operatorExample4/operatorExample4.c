/* 실습 4 : operatorExample4.c
작성일 : 2018년 09월 20일
작성자 : 김동영
프로그램 설명 :   키보드로부터 원뿔의 높이(h)와 반지름(r)을 입력 &
								원뿔의 부피(v)를 계산 출력하는 프로그램
*/


#include <stdio.h> //표준입출력 헤더파일
#define PI 3.1415926535897932384626433

int main(int argc, char* argv[]) {
	double r = 0, h = 0, v=0; //원뿔의 높이(h)와 반지름(r), 결과(v) 변수 선언 및 초기화
	
	puts("원뿔의 높이를 입력해주세요."); //값을 입력 받기 위한 메시지 출력
	scanf_s("%lf", &h); //높이 값 입력

	puts("원뿔의 반지름을 입력해주세요."); //값을 입력 받기 위한 메시지 출력
	scanf_s("%lf", &r); //반지름 값 입력

	v = (1.0 / 3.0)*PI*(r*r)*h; //부피 계산 및 부피 계산 결과 변수 (r)에 저장
	printf("원뿔의 부피는 %lf입니다.", v); //결과 출력

	return 0; //함수의 종료
}