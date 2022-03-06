/*
작성자: 김동영
작성일: 2018.10.04
프로그램 설명: 원뿔의 부피값을 계산하는 함수와 원뿔의 부피값을 출력하는 함수를 만들고
이를 활용하는 프로그램
*/

#include <stdio.h> //표준입출력라이브러리 불러오기
#define PI 3.141592653589793238462643383279502884197169399375105820974 //원주율값 정의

double getVolume(double h, double r); //함수의 선언
void printVolume(double vol); //함수의 선언

int main(int argc, char* argv[]) { //메인함수의 시작
	double h, r, vol; //원뿔의 높이, 반지름, 부피 변수 선언
	printf("원뿔의 높이와 반지름을 입력하세요 : "); //입력을 받기 위한 메시지 출력
	scanf_s("%lf %lf", &h, &r, 2); // 입력을 받는 부분

	vol = getVolume(h, r); //함수를 호출하고 반환 된 값을 저장
	printVolume(vol); // 저장된 값을 함수에 넘겨줌

	return 0; //함수의 종료
}

double getVolume(double h, double r) { //원뿔의 부피를 구하는 프로그램
	double vol; //부피값 저장하는 변수 선언
	vol = (PI * r*r*h) / 3; //부피 값 계산
	return vol; //부피 값 반환 해줌 (함수의 종료)
}

void printVolume(double vol) { //원뿔의 부피를 출력하는 함수
	printf("원뿔의 부피 : %lf\n", vol); //값의 출력
	return 0; //함수의 종료
}