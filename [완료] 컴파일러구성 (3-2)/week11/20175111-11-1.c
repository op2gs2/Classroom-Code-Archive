#include <stdio.h>
#include <string.h>
#include "ST.h"

enum code_ops { HALT, STORE, JMP_FALSE, GOTO, DATA, LD_INT, LD_VAR, READ_INT, WRITE_INT, LT, EQ, GT, ADD, SUB, MULT, DIV, PWR};

char *op_name[] = {"halt", "store", "jmp_false", "goto", "data", "ld_int", "ld_var", "read_int", "write_int", "lt", "eq", "gt", "add", "sub", "mult", "div", "pwr"};

struct instruction{
    enum code_ops op;
    int arg;
};

/* 메모리는 코드 세그먼트와 실행시점 자료와 수식 스택, 두 개의 세그먼트로 나뉜다. */
struct instruction code[999];
int stack[999]; 

int pc = 0; // 프로그램 카운터
struct instruction ir; // 명령어 레지스터
int ar = 0; // 활성레코드 포인터 (현재 활성레코드의 시작위치 지정)
int top = 0;

/* 인출(fetch)-실행(execute) 과정은 중지(halt) 명령어를 만날때까지 반복된다. */
void fetch_execute_cycle(){
    do{
        // fetch
        ir = code[pc++];
        // execute
        switch (ir.op){
            case HALT: printf("halt\n"); break;
            case READ_INT: printf("Input: "); 
                           scanf("%ld", &stack[ar+ir.arg]); break;
            case WRITE_INT: printf("Output: %d\n", stack[top--]); break;
            case STORE: stack[ir.arg] = stack[top--]; break;
            case JMP_FALSE: if(stack[top--] == 0)
                            pc = ir.arg; break;
            case GOTO: pc = ir.arg; break;
            case DATA: top = top + ir.arg; break;
            case LD_INT: stack[++top] = ir.arg; break;
            case LD_VAR: stack[++top] = stack[ar+ir.arg]; break;
            case LT: if(stack[top-1] < stack[top])
                     stack[--top] = 1;
                     else
                     stack[--top] = 0;
                     break;
            case EQ: if(stack[top-1] == stack[top])
                     stack[--top] = 1;
                     else
                     stack[--top] = 0;
                     break;
            case GT: if(stack[top-1] > stack[top])
                     stack[--top] = 1;
                     else
                     stack[--top] = 0;
                     break;
            case ADD: stack[top-1] = stack[top-1] + stack[top];
                      top--;
                      break;
            case SUB: stack[top-1] = stack[top-1] - stack[top];
                      top--;
                      break;
            case MULT: stack[top-1] = stack[top-1] * stack[top];
                      top--;
                      break;
            case DIV: stack[top-1] = stack[top-1] / stack[top];
                      top--;
                      break;
            case PWR: stack[top-1] = stack[top-1] * stack[top];
                      top--;
                      break;
            default: printf("%sInternal Error: Memory Dump\n");
                     break;
        }
    } while (ir.op != HALT);
}

int main(int argc, char *argv[]){
    /* 주어진 입력 파일 열기 */
    FILE *fp;
    fp = fopen("./test.as","r");
    /* 입력파일의 내용을 열어서 op_name[]에 따라
        코드로 변환하여 code[]에 저장 */
    char buffer[999] = {0};
    while(fgets(buffer,sizeof(buffer), fp) != NULL){
        printf("%s\n",buffer);
        for(int i = 0; i<sizeof(op_name); i++){
            if(strcmp(buffer,op_name[i]) == 0){
                strcpy(buffer, op_name[i]);
            }
        }
    }
    fetch_execute_cycle();

    return 0;
}