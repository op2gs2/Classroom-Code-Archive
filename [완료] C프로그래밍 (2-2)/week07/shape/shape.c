/*
실습2
작성자: 김동영
작성일: 2018.10.18
프로그램 설명: 사각형, 직각사각형, 이등변사각형, 역삼각형을 출력하는 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리

void printRect(int height, int width); //사각형 출력함수
void printRightAngleTriangle(int height, int width); //직각 삼각형 출력함수
void printIsoscelesTriangle(int height, int width); //이등변 삼각형 출력함수
void printInvertedTriangle(int height, int width); //역삼각형 출력함수

int main(int argc, char* argv) { //main 함수
	int height; //도형의 높이 정보 저장
	int width; //도형의 넓이 정보 저장

	/*입력 받기*/
	printf("도형의 높이 : "); //입력을 위한 메시지 출력
	scanf_s("%d", &height); //입력 받기

	printf("도형의 너비 : "); //입력을 위한 메시지 출력
	scanf_s("%d", &width); //입력 받기

	/*출력 하기*/
	printf("사각형\n");
	printRect(height, width); //사각형 출력
	printf("직각 삼각형\n");
	printRightAngleTriangle(height, width); //직각 삼각형 출력
	printf("이등변 삼각형\n");
	printIsoscelesTriangle(height, width); //이등변 삼각형 출력
	printf("역삼각형\n");
	printInvertedTriangle(height, width); //역삼각형 출력

	return 0; //프로그램 종료
}

void printRect(int height, int width) { //사각형 출력함수
	int cnt_height; //높이의 반복 횟수를 저장
	int cnt_width; //넓이의 반복횟수를 저장

	for (cnt_height = 0; cnt_height < height; cnt_height++) { //높이 연산
		for (cnt_width = 0; cnt_width < width; cnt_width++) { //너비 연산
			printf("*"); //별 출력
		}
		printf("\n"); //개행
	}
}
void printRightAngleTriangle(int height, int width) { //직각 삼각형 출력함수
	int cnt_height; //높이의 반복 횟수를 저장
	int cnt_width; //넓이의 반복횟수를 저장

	int cnt_plus; //안쪽 반복문의 가변 반복횟수를 저장
	cnt_plus = 1; //1로 초기화

	for (cnt_height = 0; cnt_height < height; cnt_height++) { //높이 연산
		for (cnt_width = 1; cnt_width <= cnt_plus; cnt_width++) { //너비 연산
			printf("*"); //별 출력
		}
		cnt_plus++; //가변 반복횟수 추가
		printf("\n"); //개행
	}
}
void printIsoscelesTriangle(int height, int width) { //이등변 삼각형 출력함수
	int cnt_height; //높이의 반복 횟수를 저장
	int cnt_width; //넓이의 반복횟수를 저장

	int cnt_plus; //안쪽 반복문의 가변 반복횟수를 저장
	cnt_plus = 1; //1로 초기화

	int cnt_empty; //빈칸을 출력하는 반복문의 반복 횟수 변수
	int cnt_minus_empty; //빈칸을 출력하는 반복문의 가변 반복횟수를 저장
	cnt_minus_empty = (height-1); //(height-1)로 초기화

	for (cnt_height = 0; cnt_height < height; cnt_height++) { //높이 연산
		for (cnt_empty = 1; cnt_empty <= cnt_minus_empty; cnt_empty++) { //빈칸 연산
			printf(" "); //빈칸 출력
		}
		cnt_minus_empty--; //반복횟수 1감소
		for (cnt_width = 1; cnt_width <= cnt_plus; cnt_width++) { //너비 연산
			printf("*"); //별 출력
			
		}
		cnt_plus += 2; //반복 횟수 2증가
		printf("\n"); //개행
	}
}
void printInvertedTriangle(int height, int width) { //역삼각형 출력함수
	int cnt_height; //높이의 반복 횟수를 저장
	int cnt_width; //넓이의 반복횟수를 저장

	int cnt_minus; //안쪽 반복문의 가변 반복횟수를 저장
	cnt_minus = (width+2); //1로 초기화

	int cnt_empty; //빈칸을 출력하는 반복문의 반복 횟수 변수
	int cnt_plus_empty; //빈칸을 출력하는 반복문의 가변 반복횟수를 저장
	cnt_plus_empty = 0; //1로 초기화

	for (cnt_height = 0; cnt_height < height; cnt_height++) { //높이 연산
		for (cnt_empty = 1; cnt_empty <= cnt_plus_empty; cnt_empty++) { //빈칸 연산
			printf(" "); //빈칸 출력
		}
		cnt_plus_empty++; //반복 횟수 1증가
		
		for (cnt_width = 1; cnt_width <= cnt_minus; cnt_width++) { //너비 연산
			printf("*"); //별 출력
		}
		cnt_minus -= 2; //반복 횟수 2 감소
		printf("\n"); //개행
	}
}
