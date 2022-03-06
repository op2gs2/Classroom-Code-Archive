.data

.text
.globl main

main:
	li $t0, 0xA7D295F6
	li $t1, 0xE74FB45F
	
	and $s0, $t0, $t1
	or $s1, $t0, $t1
	
	xor $s2, $s0, $s1
	nor $s3, $s0, $s1
	
	li $v0, 10
	syscall
