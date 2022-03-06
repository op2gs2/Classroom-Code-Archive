/*
실습5
작성자: 김동영
작성일: 2018.10.18
프로그램 설명: 소수를 계산하는 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리

int isPrimeNumber(int num); //수식 계산 함수

int main(int argc, char* argv) { //main 함수
	int num; //출력 최대값
	int cnt; //반복 횟수

	printf("출력 최대값 입력 : "); //입력을 위한 메시지 출력
	scanf_s("%d", &num); //입력 받기

	printf("소수 : \t"); //메시지 출력
	for (cnt =  1; cnt <=num; cnt++) //소수 구하기 & 출력
	{
		if (isPrimeNumber(cnt)) //cnt가 소수라면
		{
			printf("%d\t ", cnt); //cnt를 출력
		}
	}
	printf("\n"); //개행
	return 0; //프로그램 종료
}

int isPrimeNumber(int num) //함수 정의문
{
	int i = 0; //반복 함수
	int last = num / 2;   //약수가 없는 수가 소수이므로 2부터 n/2(자기자신/2)까지만 확인하면 됨
	if (num <= 1)//소수는 1보다 큰 자연수여야 함
	{
		return 0; //아닐 경우, 0을 반환
	}
	//(자기자신/2)보다 큰수는 약수가 될 수 없음
	for (i = 2; i <= last; i++) //i를 2부터 last까지 1씩 증가시키며 반복 수행
	{
		if ((num%i) == 0) //num을 i로 나누었을때 나머지가 0이면(즉, i는 n의 약수가 아님)
		{
			return 0; //소수가 아니므로 0반환(i가 약수이므로 n은 소수가 아님)
		}
	}
	return 1; //1~last(자기자신/2)사이에 약수가 없으므로 소수임
}