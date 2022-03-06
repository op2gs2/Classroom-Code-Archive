/*
실습 8 : calc_Square_area.c
작성일 : 2018.09.13
작성자 : 김동영
프로그램 설명 : 가로, 세로 값을 입력 받아 사각형의 넓이 계산
*/

#include <stdio.h>

int main(int argv, char*argc[]) {
	/*가로, 세로 변수 선언*/
	int horizontal; //가로 변수
	int Vertical; //세로 변수

	/*가로, 세로 값 입력*/
	printf_s("가로 값을 입력해주세요: "); //입력을 위한 안내문 출력
	scanf_s("%d", &horizontal);	//가로 값 입력

	printf_s("세로 값을 입력해주세요: "); //입력을 위한 안내문 출력
	scanf_s("%d", &Vertical); //세로 값 입력

	/*사각형의 넓이 계산*/
	int squ_area = horizontal * Vertical; //사각형의 넓이 계산

	/*이 프로그램의 값 출력*/
	printf_s("가로: %d, 세로: %d\n", horizontal, Vertical);
	printf_s("사각형의 넓이: %d\n", squ_area);

	/*함수의 종료*/
	return 0;
}
