/*
실습3
작성자: 김동영
작성일: 2018.10.18
프로그램 설명: 0이 아닌 정수가 입력 될때 까지 합과 평균을 계산하는 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리

double average(int total, int count); //평균 계산 함수

int main(int argc, char* argv) { //main 함수
	int total; //누적합 결과 저장 변수
	total = 0; //0으로 초기화
	int count; //반복 횟수 저장 변수
	count = 0; //0으로 초기화
	int num; //정수를 입력 받는 변수
	do {
		printf("정수 입력 : "); //입력을 위한 메시지 출력
		scanf_s("%d", &num); //입력 받기
		if (num == 0) {//입력 값이 0이 아니면 종료
			printf("-> 종료\n"); //종료를 알리는 메시지 출력
			break; //반복문 종료
		}

		total += num; //누적합 계산
		count++; //반복 횟수 지정

		printf("-> 합: %d  평균: %lf\n", total, average(total, count)); //결과 출력
	} while (1); //무한 반복문

	return 0; //프로그램 종료
}

double average(int total, int count) { //평균 계산 함수
	return (double)total / count; //평균 값 반환
}