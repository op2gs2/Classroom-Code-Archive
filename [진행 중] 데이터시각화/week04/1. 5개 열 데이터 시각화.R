# 0. 패키지 설치하기
install.packages("dplyr")
library(dplyr)

# 1. 파일 읽고, 데이터 편집하기
accident <- read.csv("c:/도로교통공단_시도_시군구별_월별_교통사고(2018).csv")
# 춘천시 교통사고 데이터 추출
accident_ch <- accident %>% filter(시군구 == "춘천시") %>% select("사망자수", "부상자수", "중상", "경상", "부상신고")
# 춘천시 교통사고 데이터 평균화
accident_ch_avg <- accident_ch%>% summarise('사망자수' = mean(사망자수), '부상자수' = mean(부상자수), '중상' = mean(중상), '경상' = mean(경상), '부상신고' = mean(부상신고))
# 레이블 데이터 생성
lables <- c("사망자수", "부상자수", "중상", "경상", "부상신고")

# 2. 선 그래프 만들기
# 일반적인 선 그래프 그리기
plot(accident_ch$사망자수, type='l', col=1, xlab="사고 발생 월", xlim = c(1,12), ylab="사고 인원", ylim = c(0,300))
par(new=T)
lines(accident_ch$부상자수, type='l', col=2)
par(new=T)
lines(accident_ch$중상, type='l',col=3)
par(new=T)
lines(accident_ch$경상, type='l',col=4)
par(new=T)
lines(accident_ch$부상신고, type='l',col=5)
legend(10,120,lables, cex=0.67, col=c(1,2,3,4,5), lty=1)
title("춘천시 교통사고 사고별 인원 시각화")

# 선의 모양을 달리하여, 그래프 그리기
plot(accident_ch$사망자수, type='l', lty=1, col=1, xlab="사고 발생 월", xlim = c(1,12), ylab="사고 인원", ylim = c(0,300))
par(new=T)
lines(accident_ch$부상자수, type='l', lty=2, col=2)
par(new=T)
lines(accident_ch$중상, type='l', lty=3, col=3)
par(new=T)
lines(accident_ch$경상, type='l', lty=4, col=4)
par(new=T)
lines(accident_ch$부상신고, type='l', lty=5, col=5)
legend(10,120,lables, cex=0.67, col=c(1,2,3,4,5), lty=1)
title("춘천시 교통사고 사고별 인원 시각화")

# 선의 타입을 달리하여, 그래프 그리기
plot(accident_ch$사망자수, type='p', col=1, xlab="사고 발생 월", xlim = c(1,12), ylab="사고 인원", ylim = c(0,300))
par(new=T)
lines(accident_ch$부상자수, type='l', col=2)
par(new=T)
lines(accident_ch$중상, type='b',col=3)
par(new=T)
lines(accident_ch$경상, type='c',col=4)
par(new=T)
lines(accident_ch$부상신고, type='o',col=5)
legend(10,120,lables, cex=0.67, col=c(1,2,3,4,5), lty=1)
title("춘천시 교통사고 사고별 인원 시각화")

# 선의 타입과, 점의 모양을 달리하여 그래프 그리기
plot(accident_ch$사망자수, type='p', pch=1, col=1, xlab="사고 발생 월", xlim = c(1,12), ylab="사고 인원", ylim = c(0,300))
par(new=T)
lines(accident_ch$부상자수, type='l', pch=3, col=2)
par(new=T)
lines(accident_ch$중상, type='b', pch=5, col=3)
par(new=T)
lines(accident_ch$경상, type='c', pch=7, col=4)
par(new=T)
lines(accident_ch$부상신고, type='o', pch=9, col=5)
legend(10,120,lables, cex=0.67, col=c(1,2,3,4,5), lty=1)
title("춘천시 교통사고 사고별 인원 시각화")

# 굵기가 다른 선 그래프 그리기
plot(accident_ch$사망자수, type='l', lwd=1, col=1, xlab="사고 발생 월", xlim = c(1,12), ylab="사고 인원", ylim = c(0,300))
par(new=T)
lines(accident_ch$부상자수, type='l', lwd=2, col=2)
par(new=T)
lines(accident_ch$중상, type='l', lwd=3, col=3)
par(new=T)
lines(accident_ch$경상, type='l', lwd=4, col=4)
par(new=T)
lines(accident_ch$부상신고, type='l', lwd=5,col=5)
legend(10,120,lables, cex=0.67, col=c(1,2,3,4,5), lwd=1)
title("춘천시 교통사고 사고별 인원 시각화")

# 3. 막대 그래프 만들기
accident_ch_mt <- as.matrix(accident_ch)
# 일반적인 세로 막대 그래프 만들기: 무지개색 팔래트 사용
barplot(accident_ch_mt, col=rainbow(12), names.arg = lables, ylab = "인원 수")
legend(5,1500, c(1:12), cex=0.67, col=rainbow(12), lty=1)
title("춘천시 교통사고 월별 사고 인원 시각화")

# 일반적인 세로 막대 그래프 만들기: heat.colors() 팔래트 사용
barplot(accident_ch_mt, col=heat.colors(12), names.arg = lables, ylab = "인원 수")
legend(5,1500, c(1:12), cex=0.67, col=heat.colors(12), lwd=2)
title("춘천시 교통사고 월별 사고 인원 시각화")

# 일반적인 가로 막대 그래프 만들기: 무지개색 팔래트 사용
barplot(accident_ch_mt, col=rainbow(12), names.arg = lables, ylab = "인원 수",horiz=T)
legend(2000,6, c(1:12), cex=0.67, col=rainbow(12), lty=1)
title("춘천시 교통사고 월별 사고 인원 시각화")

# 일반적인 가로 막대 그래프 만들기: heat.colors() 팔래트 사용
barplot(accident_ch_mt, col=heat.colors(12), names.arg = lables, ylab = "인원 수",horiz=T)
legend(2000,6, c(1:12), cex=0.67, col=heat.colors(12), lwd=2)
title("춘천시 교통사고 월별 사고 인원 시각화")

# 4. 파이차트 만들기
# 여러 개의 pie차트 만들기
par(mfrow=c(2,2))
pie(accident_ch$사망자수, col=rainbow(12), xlab="사망자수")
pie(accident_ch$부상자수, col=rainbow(12), xlab="부상자수")
pie(accident_ch$중상, col=rainbow(12), xlab="중상")
pie(accident_ch$경상, col=rainbow(12), xlab="경상")

