/*
실습6
작성자: 김동영
작성일: 2018.10.18
프로그램 설명: 사용자의 선택에 따른 연산을 수행하는 계산기 프로그램
*/

#include <stdio.h> //표준 입출력 라이브러리

int printMenu(void); //메뉴 출력 함수

int main(int argc, char* argv) { //main 함수
	int num1=0, num2=0; //피연산자
	int select; //메뉴 선택 변수
	select = -1; //-1로 초기화
	do {
		select = printMenu(); //메뉴값을 대신 입력하는 함수 호출

		switch (select) { //메뉴 값에 따라
		case 1: //계산 값을 입력 받거나
			printf("계산할 값을 입력하세요 : ");
			scanf_s("%d", &num1);
			printf("계산할 값을 입력하세요 : ");
			scanf_s("%d", &num2);
			break;

		case 2: //더하거나
			printf("결과 : %d\n", (num1 + num2));
			break;

		case 3: //빼거나
			printf("결과 : %d\n", (num1 - num2));
			break;

		case 4: //곱하거나
			printf("결과 : %d\n", (num1 * num2));
			break;

		case 5: //나누거나
			printf("결과 : %d\n", (num1 / num2));
			break;

		case 6: //종료함
			printf("종료합니다\n");
			break;

		default: //메뉴 값이 잘못 입력 되어 있으면 아예 새로운 값을 요구함
			printf("메뉴를 다시한번 입력해주세요.\n");
			break;
		}
	} while (select!=6); //메뉴 값이 6이 아니면 참으로 다시 반복
	return 0; //프로그램 종료
}

int printMenu(void) { //메뉴 출력 함수
	int menu; //메뉴 값 저장
	menu = -1; //초기화
	/*메뉴 출력*/
	printf("1. 숫자입력\n");
	printf("2. 더하기\n");
	printf("3. 빼기\n");
	printf("4. 곱하기\n");
	printf("5. 나누기\n");
	printf("6. 종료\n");
	printf(">>메뉴선택 : ");
	scanf_s("%d", &menu); //메뉴 변수 입력 받기
	return menu; //메뉴 값 출력
}