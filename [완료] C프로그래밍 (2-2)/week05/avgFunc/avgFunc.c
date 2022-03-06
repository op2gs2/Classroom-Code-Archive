/*
작성자: 김동영
작성일: 2018.10.04
프로그램 설명: 평균값을 계산하는 함수와 평균값을 출력하는 함수를 만들고 이를 활용하는 프로그램
*/

#include <stdio.h> //표준입출력라이브러리 불러오기

double getAverage(double num1, double num2); //함수의 선언
void printResult(double result); //함수의 선언

int main(int argc, char* argv[]) { //메인함수의 시작
	double num1, num2, result; // 값과 결과를 저장하는 함수 선언
	printf("두 실수형을 입력하세요 : "); //입력을 받기 위한 메시지 출력
	scanf_s("%lf %lf", &num1, &num2,2); // 입력을 받는 부분

	result = getAverage(num1, num2); //함수를 호출하고 반환 된 값을 저장

	printResult(result); // 저장된 값을 함수에 넘겨줌
	return 0; //함수의 종료
}

double getAverage(double num1, double num2) { //평균을 계산하는 함수
	double func_result = (num1 + num2) / 2; //평균값을 계산하고 저장
	return func_result; //저장된 값을 반환
}

void printResult(double result) { //평균 값을 출력하는 함수
	printf("두 실수 평균 : %lf\n", result); //값의 출력
	return 0; //함수의 종료
}