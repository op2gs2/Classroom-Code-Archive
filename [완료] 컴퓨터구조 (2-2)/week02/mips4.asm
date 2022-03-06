.data
str: .asciiz "20175111 / KimDongYoung"
newline: .asciiz  "\n"


.text
.globl main
main:
	li $v0, 4
	la $a0, str
	syscall
	
	li $v0, 4
	la $a0, newline
	syscall
	
	li $s0, 5
	li $s1, 3
	mult $s0, $s1
	
	li $v0, 1
	mflo $a0
	syscall
	
	li $v0, 4
	la $a0, newline
	syscall
	
	div $s0, $s1
	
	li $v0, 1
	mflo $a0
	syscall
	
	li $v0, 4
	la $a0, newline
	syscall
	
	li $v0, 1
	mfhi $a0
	syscall
	
	li $v0, 10
	syscall