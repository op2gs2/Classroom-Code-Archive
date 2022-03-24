# 1. 데이터 불러오기
ctNames <- c("폴란드","영국","인도","프랑스","소련","유고","미국","독일","일본","이탈리아")
milDeaths <- c(240,383.7,87,210,8668,300,407.3,4440,2100,319.2)
milWounds <- c(766.606,376.239,390,64.354,14685.593,425,671.801,7300,326,225)
civDeaths <- c(5620,67.2,2100,390,4500,581,12.1,1500,550,153.2)
totDeaths <- c(5900,450.9,2200,600,20000,1027,419.4,6900,2500,492.4)

# 2. 데이터프레임과 행렬 생성하기
# 데이터프레임과 생성하기
ww2_casualty_df <- data.frame(milDeaths,milWounds,civDeaths,totDeaths)
# 데이터프레임의 행과 열 이름 지정하기
rownames(ww2_casualty_df) = ctNames 
colnames(ww2_casualty_df) = c('군사사망자','군사부상자','민간사망자','종합사망자')
ww2_casualty_df
# 데이터프레임을 행렬로 전환하기 
ww2_casualty_mat = as.matrix(ww2_casualty_df)

# 3. 선 그래프 그리기 by 데이터프레임
# 선 그래프 그리기 #1: 여러 개의 선 그래프 그리기
plot(ww2_casualty_df$군사사망자, type="l", col=1, ylim=c(0,20000))
par(new=T)
plot(ww2_casualty_df$군사부상자, type="l", col=2, ylim=c(0,20000))
par(new=T)
plot(ww2_casualty_df$민간사망자, type="l", col=3, ylim=c(0,20000))
par(new=T)
plot(ww2_casualty_df$종합사망자, type="l", col=4, ylim=c(0,20000))

# 선 그래프 그리기 #2: lines()를 이용해, y축 레이블이 중복되는 현상을 피함
plot(ww2_casualty_df$군사사망자, type="l", col=1, ylim=c(0,20000))
par(new=T)
lines(ww2_casualty_df$군사부상자, type="b", col=2, ylim=c(0,20000))
par(new=T)
lines(ww2_casualty_df$민간사망자, type="c", col=3, ylim=c(0,20000))
par(new=T)
lines(ww2_casualty_df$종합사망자, type="o", col=4, ylim=c(0,20000))

# 선 그래프 그리기 #3: 선 그래프의 범례추가
plot(ww2_casualty_df$군사사망자, type="l", col=1, ylim=c(0,20000))
par(new=T)
plot(ww2_casualty_df$군사부상자, type="l", col=2, ylim=c(0,20000))
par(new=T)
plot(ww2_casualty_df$민간사망자, type="l", col=3, ylim=c(0,20000))
par(new=T)
plot(ww2_casualty_df$종합사망자, type="l", col=4, ylim=c(0,20000))
legend(7, 17000, colnames(ww2_casualty_df), cex=0.9, col = c(1,2,3,4), lty=1)

# 선 그래프 그리기 #4: x축에 이름으로 변경
plot(ww2_casualty_df$군사사망자, type="l", col=1, axes = FALSE ,ann = FALSE, ylim=c(0,20000))
par(new=T)
lines(ww2_casualty_df$군사부상자, type="l", col=2, ylim=c(0,20000))
par(new=T)
lines(ww2_casualty_df$민간사망자, type="l", col=3, ylim=c(0,20000))
par(new=T)
lines(ww2_casualty_df$종합사망자, type="l", col=4, ylim=c(0,20000))
axis(1, at = 1:10,label = ctNames)
axis(2, ylim = c(0,15000))
legend(7, 17000, colnames(ww2_casualty_df), cex=0.9, col = c(1,2,3,4), lty=1)

# 4. Bar 그래프 그리기 by 데이터프레임
# bar그래프 그리기 #1: 일반적인 그래프
barplot(ww2_casualty_mat, col=rainbow(10))
legend(3,40000, ctNames, fill=rainbow(10), cex=0.6)

# bar그래프 그리기 #2: 수평 그래프
barplot(ww2_casualty_mat, col=rainbow(10), horiz = T)
legend(34000, 3, ctNames, fill=rainbow(10), cex=0.6)

# bar그래프 그리기 #3: col값별로 분리된 그래프
barplot(ww2_casualty_mat, col=rainbow(10), beside = T)
legend(28, 15000, ctNames, fill=rainbow(10), cex=0.6)

# 행렬을 전치하기
ww2_casualty_mat_t = t(ww2_casualty_mat)

# bar그래프 그리기 #4: 전치된 행렬로 수평 그래프 그리기
barplot(ww2_casualty_mat_t, col=rainbow(4), horiz = T)
legend(38000, 11, colnames(ww2_casualty_df), fill=rainbow(4), cex=0.8)

# bar그래프 그리기 #5: 전치된 col값별로 분리된 그래프 그리기
barplot(ww2_casualty_mat_t, col=rainbow(4), beside = T)
legend(35, 15000, colnames(ww2_casualty_df), fill=rainbow(4), cex=1)

