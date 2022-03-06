/*
작성자: 김동영
작성일: 2018.10.04
프로그램 설명: 팩토리얼을 재귀함수로 구현하는 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리 불러오기

int factorial(int num);//함수의 선언

int main(int argc, char*argv[]) {
	int num; //계산할 팩토리얼 크기 변수 선언
	long long fact; //팩토리얼 계산 결과 변수 선언

	printf("계산할 팩토리얼 크기를 입력하세요 : "); //입력을 위한 메시지 출력
	scanf_s("%d", &num); //입력 받기
	fact = factorial(num); //함수를 호출하고 반환된 값을 저장

	printf("1부터 %d까지 팩토리얼 값은 : %lld입니다.\n",num,fact); //저장된 값을 출력

	return 0; //함수의 종료
}

int factorial(int num) { //팩토리얼 값을 구하는 함수
	if (num == 1) { //만약 매개변수 값이 1이면
		return 1; //1로 반환
	}
	else { //1이 아니면
		return num*factorial(num - 1);
		//재귀적 특성을 이용해 자기 자신을 호출(단, 호출된 함수는 다른 함수임)
	}
}