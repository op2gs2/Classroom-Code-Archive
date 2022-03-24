# 0. 패키지 설치하기
install.packages("dplyr")
library(dplyr)

# 1. 파일 읽고, 데이터 편집하기
accident <- read.csv("c:/도로교통공단_시도_시군구별_월별_교통사고(2018).csv")
accident
# 강원도 교통사고 데이터 추출 및 평균 계산
accident_gw <- accident %>% filter(시도 == "강원") %>% group_by(시군구)%>% summarise('경상' = mean(경상))
# 레이블 데이터 생성
lables <- accident_gw$시군구

# 2. 선 그래프 만들기
# 일반적인 선 그래프 그리기
plot(accident_gw$경상, type='l', col=10, axes = FALSE, ann = FALSE)
axis(1, at = 1:18,label = lables, xlim = c(1,18))
axis(2, ylim = c(0,300), ylab="사고 인원")
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 선의 모양을 달리하여, 그래프 그리기
plot(accident_gw$경상, type='l', col=1, lty=5, axes = FALSE, ann = FALSE)
axis(1, at = 1:18,label = lables, xlim = c(1,18))
axis(2, ylim = c(0,300), ylab="사고 인원")
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 선의 타입을 달리하여, 그래프 그리기
plot(accident_gw$경상, type='o', col=10, axes = FALSE, ann = FALSE)
axis(1, at = 1:18,label = lables, xlim = c(1,18))
axis(2, ylim = c(0,300), ylab="사고 인원")
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 선의 타입과, 점의 모양을 달리하여 그래프 그리기
plot(accident_gw$경상, type='c', pch=7, col=5, axes = FALSE, ann = FALSE)
axis(1, at = 1:18,label = lables, xlim = c(1,18))
axis(2, ylim = c(0,300), ylab="사고 인원")
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 굵기가 다른 선 그래프 그리기
plot(accident_gw$경상, type='l', lwd=5, col=4, axes = FALSE, ann = FALSE)
axis(1, at = 1:18,label = lables, xlim = c(1,18))
axis(2, ylim = c(0,300), ylab="사고 인원")
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 3. 막대 그래프 만들기
# 일반적인 세로 막대 그래프 만들기: 무지개색 팔래트 사용
barplot(accident_gw$경상, col=rainbow(18), names.arg = lables, ylab = "인원 수")
legend(17,160, lables, cex=0.67, col=rainbow(18), lty=1)
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 일반적인 세로 막대 그래프 만들기: heat.colors() 팔래트 사용
barplot(accident_gw$경상, col=heat.colors(18), names.arg = lables, ylab = "인원 수")
legend(17,160, lables, cex=0.67, col=heat.colors(18), lty=1)
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 일반적인 가로 막대 그래프 만들기: 무지개색 팔래트 사용
barplot(accident_gw$경상, col=rainbow(18), names.arg = lables, ylab = "인원 수", horiz=T)
legend(170,20, lables, cex=0.35, col=rainbow(18), lty=1)
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 일반적인 가로 막대 그래프 만들기: heat.colors() 팔래트 사용
barplot(accident_gw$경상, col=heat.colors(18), names.arg = lables, ylab = "인원 수", horiz=T)
legend(170,20, lables, cex=0.35, col=heat.colors(18), lty=1, lwd=2)
title("강원도 교통사고 경상 인원 시/군별 시각화")

# 4. 파이차트 만들기
pie(accident_gw$경상,col=rainbow(18),labels = accident_gw$시군구)
title("강원도 교통사고 경상 인원 시/군별 시각화")

