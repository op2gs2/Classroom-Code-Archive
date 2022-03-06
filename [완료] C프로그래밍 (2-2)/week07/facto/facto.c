/*
실습7
작성자: 김동영
작성일: 2018.10.18
프로그램 설명: 팩토리얼을 계산하는 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리

int isPrimeNumber(int num); //수식 계산 함수

int main(int argc, char* argv) { //main 함수
	int num, cnt, facto = 1; //필요한 변수 선언
	printf("팩토리얼 num값을 입력하시오 : "); //입력을 위한 메시지 출력
	scanf_s("%d", &num); //입력 받기
	for (cnt = 1; cnt <= num; cnt++) { //펙토리얼 계산을 위한 반복문
		facto *= cnt; //펙토리얼 계산
	}

	printf("%d! = %d\n", num, facto); //펙토리얼 출력
	return 0; //프로그램의 종료
}