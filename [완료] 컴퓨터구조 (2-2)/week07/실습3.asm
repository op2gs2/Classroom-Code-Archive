.data

.text
.globl main

main:
	li $s0, 0xFF
	
	andi $s1, $s0, 0x4A7C
	ori $s2, $s0, 0x4A7C
	xori $s3, $s0, 0x4A7C
	
	li $v0, 10
	syscall
