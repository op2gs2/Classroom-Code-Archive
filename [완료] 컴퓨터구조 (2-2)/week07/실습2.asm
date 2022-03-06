.data

.text
.globl main

main:
	li $s0, 0xFFFF0000
	li $s1, 0x46A1F0B7
	
	and $s2, $s0, $s1
	or $s3, $s0, $s1
	xor $s4, $s0, $s1
	nor $s5, $s0, $s1
	
	li $v0, 10
	syscall
