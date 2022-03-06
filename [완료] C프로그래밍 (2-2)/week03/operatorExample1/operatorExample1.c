/* 실습 2 : operatorExample1.c
작성일 : 2018년 09월 20일
작성자 : 김동영
프로그램 설명 : 증감 연산자 연습 및, 출력 연습
*/

#include <stdio.h> //표준입출력 헤더파일

int main(int argc, char* argv[]) {
	int x = 2, y = 3, z = 2.4; //int형 변수 x,y,z선언 및 각 변수 초기화

	/*a. x++ + y++ + z*/
	int result = (x++) + (y++) + z;  //계산 식
	printf("a식의 결과 : %d\n", result); //결과 출력

	/*b. ++x + y / 2 * 2 - (int)z*/
	result = ++x + y / 2 * 2 - (int)z;  //계산 식
	printf("b식의 결과: %d\n", result); //결과 출력

	/*c. (int)z - ( x + (int)z ) % 2 + 4.0*/
	result = (int)z - (x + (int)z) % 2 + 4.0;  //계산 식
	printf("c식의 결과: %d\n", result); //결과 출력

	/*d. x * 6 - 2 * (3 + z) + y*/
	result = x * 6 - 2 * (3 + z) + y;  //계산 식
	printf("d식의 결과: %d\n", result); //결과 출력
	
	
	return 0; //함수의 종료

}