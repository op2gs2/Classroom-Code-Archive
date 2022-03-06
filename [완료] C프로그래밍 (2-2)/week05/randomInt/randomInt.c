/*
작성자: 김동영
작성일: 2018.10.04
프로그램 설명: 1부터 입력받은 값 사이의 랜덤값을 출력하는 프로그램
*/

#include <stdio.h> //표준입출력라이브러리 불러오기
#include <stdlib.h> //표준라이브러리 불러오기

int main(int argc, char* argv[]) { //main함수의 시작
	int num, result; //변수 선언
	
	printf("정수 범위를 결정하세요 : 1 ~ "); //입력을 위한 메시지 출력
	scanf_s("%d", &num); //입력 받기
	result = rand() % num + 1; //범위내의 난수 값 받아오기
	printf("입력된 범위 중 결정된 랜덤 값은 %d입니다.\n", result); // 결과 출력

	return 0;// 함수의 종료
}