/*
실습 6 : operatorExample6.c
작성일 : 2018년 09월 20일
작성자 : 김동영
프로그램 설명 :  논리식의 계산 및 결과 확인
*/

#include <stdio.h> //표준입출력 헤더파일

int main(int argc, char* argv[]) {
	int result_a = -1, result_b = -1, result_c = -1, result_d = -1, result_e = -1; // 결과 변수 선언
	int x = 1, z = 0, y = 0; //e. ( x = 1 && z = 0 ) || y = 0식의 계산을 위한 변수의 선언

	printf("참고!!\n0이면 거짓(false)\n1이면 참(true)입니다.\n\n\n"); //출력 값에 대한 설명 메시지 출력

	/*a. !( 7 >= 6) 계산*/
	result_a = !(7 >= 6); //계산 및 계산 결과 저장
	printf("a식의 결과는 %d입니다.\n", result_a); //계산 결과 출력

	/*b. 6 % 2 != 0 || 3 / 2 == 1 계산*/
	result_b = 6 % 2 != 0 || 3 / 2 == 1; //계산 및 계산 결과 저장
	printf("b식의 결과는 %d입니다.\n", result_b); //계산 결과 출력

	/*c. 1 > 5 || ( 6 < 50 && 2 < 5 ) 계산*/
	result_c = 1 > 5 || (6 < 50 && 2 < 5); //계산 및 계산 결과 저장
	printf("c식의 결과는 %d입니다.\n", result_c); //계산 결과 출력

	/*d. 5 * 5 != 25 && !(13 < 29) || 31 < 52 계산*/
	result_d = (5 * 5 != 25) && (!(13 < 29) || 31 < 52); //계산 및 계산 결과 저장
	printf("d식의 결과는 %d입니다.\n", result_d); //계산 결과 출력

	/*e. ( x = 1 && z = 0 ) || y = 0 계산*/
	result_e = (x  && z ) || y ; //계산 및 계산 결과 저장
	printf("e식의 결과는 %d입니다.\n", result_e); //계산 결과 출력

	return 0; //함수의 종료


}