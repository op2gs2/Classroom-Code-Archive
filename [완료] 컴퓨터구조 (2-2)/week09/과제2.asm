.data
str1:	.asciiz "$s0 * 64: "
str2:	.asciiz "\n$s0/8: "

.text
.globl main

main:
	li $s0, -152
	
	sll $s1,$s0,6
	sra $s2,$s0,3

	li $v0, 4
	la $a0,str1
	syscall
	
	li $v0,1
	move $a0, $s1
	syscall
	
	li $v0, 4
	la $a0,str2
	syscall
	
	li $v0,1
	move $a0, $s2
	syscall
	
	li $v0, 10
	syscall