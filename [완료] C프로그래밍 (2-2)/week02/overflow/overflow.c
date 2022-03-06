/* 
실습 3 : overflow.c
작성일 : 2018.09.13
작성자 : 김동영
프로그램 설명 : 변수의 크기를 넘거나 작으면 발생하는 오버/언더 플로우 확인
*/

#include <stdio.h>

int main(int argc, char* argv[]) {
	unsigned char uc = 255 + 1; //unsigned char변수 uc의 오버플로우 설정
	short s = 32767 + 1; //short변수 s의 오버플로우 설정
	float min = 1.175E-50; //float변수 min의 언더플로우 설정
	float max = 3.403E39; //float변수 max의 오버플로우 설정

	printf("%u\n", uc); //오버플로우 발생
	printf("%d\n", s);		//오버플로 발생
	printf("%e\n", min);	//언더플로 발생
	printf("%f\n", max);	//오버플로 발생

	//함수의 종료
	return 0;
}