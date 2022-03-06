/*
실습1
작성자: 김동영
작성일: 2018.10.18
프로그램 설명: 짝수와 홀수 그리고 총합을 구하는 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리

int sum(int, int);

int main(int argc, char* argv) { //main 함수
	int num; //합을 출력할 마지막 값을 저장

	/*값을 입력받기*/
	printf("합을 출력할 마지막 값을 입력하세요 : "); //입력을 위한 메시지 출력
	scanf_s("%d", &num); //입력 받기
	
	/*결과 출력해주기*/
	printf("1부터 %d까지의 \n",num); //메시지 출력
	printf("\t짝수의 합 : %d\n", sum(num, 2)); //짝수의 합을 출력
	printf("\t홀수의 합 : %d\n", sum(num, 1)); //홀수의 합을 출력
	printf("\t총합 : %d\n", sum(num, 0)); //총합 출력
	return 0; //프로그램 종료
}

int sum(int num, int select) { //짝수 / 홀수 / 총합을 구하는 함수
	int cnt; //for문을 위한 횟수 변수 선언
	int result; //계산 결과 저장 변수
	result = 0; //누적합 저장을 위해 변수를 0으로 초기화
	switch (select) {
	case 2: //짝수의 합을 계산
		for (cnt = 1; cnt <= num; cnt++) { //반복문 이용
			if (cnt % 2 == 0) { //짝수 일 경우
				result += cnt; //누적합 연산 수행
			}
		}
		return result; //결과를 반환
	case 1: //홀수의 합을 계산
		for (cnt = 1; cnt <= num; cnt++) { //반복문 이용
			if (cnt % 2 != 0) { //홀수 일 경우
				result += cnt; //누적합 연산 수행
			}
		}
		return result; //결과를 반환
	case 0: //총합을 계산
		for (cnt = 1; cnt <= num; cnt++) { //반복문 이용
			result += cnt; //누적합 연산 수행
		}
		return result; //결과를 반환
	default:
		printf("타입 입력이 잘못 되었습니다. 다시 입력해주세요.");
		return 0;

	}
}