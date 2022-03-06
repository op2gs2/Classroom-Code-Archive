/*
실습8
작성자: 김동영
작성일: 2018.10.18
프로그램 설명: 피보나치 수열을 계산하는 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리

int isPrimeNumber(int num); //수식 계산 함수

int main(int argc, char* argv) { //main 함수
	int i; //for문 반복 횟수
	int n; //피보나치 수
	int head = 0; //앞
	int mid = 0; //중간
	int rear = 1; //뒤
	int sum = 0; //합 계산

	printf("\n 피보나치 수 입력 : "); //입력을 위한 메시지 출력
	scanf_s("%d", &n); //입력 받기

	for (i = 0; i < n; i++) {
		sum += head; //총합 계산
		printf("%d ", head); //출력
		/*값을 이동시키기*/
		mid = head + rear;
		head = rear;
		rear = mid;
		
	}
	printf("\n총 합 : %d", sum); //합 출력
	return 0; //프로그램 종료
}