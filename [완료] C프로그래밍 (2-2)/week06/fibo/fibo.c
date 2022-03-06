/*
실습6
작성자: 김동영
작성일: 2018.10.11
프로그램 설명: 피보나치의 반복횟수를 입력 받고, 결과값을 출력하는 프로그램
*/

#include <stdio.h> //표준입출력라이브러리 불러오기
long long fibo(long long value); //함수를 미리 선언

int main(int argc, char*argv[]) { //main 함수의 시작
	long long value = 0, result = 0; //변수 선언
	printf("반복횟수를 입력해주세요\t"); //입력을 위한 메시지 출력
	scanf_s("%lld", &value); //값을 불러들이기
	//value -= 1; //결과를 맞춰주기 위한 값의 변경
	result = fibo(value-1); //함수를 호출하고 값을 반환 받기
	printf("%lld번째 피보나치 수열의 값은 : %lld\n", value, result);// 결과 확인
	return 0; //함수의 종료
}

long long fibo(long long value) { //피보나치 수열을 구하는 함수
	if (value <= 1) { //값이 1보다 크면 
		return value; //해당 값을 반환
	}
	//if (value == 1) { //값이 1이면 
		//return 1;//1 반환
	//}
	return fibo(value-1) + fibo(value -2); //피보나치 수열 시행
}