/*
실습 6 : calc_volume.c
작성일 : 2018.09.13
작성자 : 김동영
프로그램 설명 : cost라는 이름의 변수를 출력
*/

#include <stdio.h>

int main(int argv, char* argc[]) {
	/*너비 , 높이 , 깊이를 변수로 선언 & 값 저장*/
	int width = 2; //너비 변수 선언 및 초기화
	int height = 3; //높이 변수 선언 및 초기화
	int deepness = 2; //깊이 변수 선언 및 초기화

	/*부피 계산*/
	int volume = width * height * deepness;

	/*부피 값 출력*/
	printf("너비 %d 높이 %d 깊이 %d의 부피는 %d입니다.\n", width, height, deepness, volume);

	/*함수의 종료*/
	return 0;
}