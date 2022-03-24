# 1. 데이터 불러오기
# 데이터를 불러온다.
data_2017 = c(9766,3424,2458,2924,1495,1528,1159,266,12786,1521,1609,2153,1829,1795,2675,3339,635)
data_2018 = c(9705,3400,2450,2939,1493,1518,1154,304,13031,1521,1619,2180,1820,1790,2674,3356,653)
data_2019 = c(9662,3373,2432,2944,1494,1509,1147,331,13238,1517,1626,2188,1803,1773,2665,3350,660)
data_2020 = c(9602,3344,2419,2951,1488,1500,1140,349,13405,1515,1632,2204,1792,164,2655,3350,670)
data_2021 = c(9509,3350,2385,2948,1441,1452,1121,371,12565,1538,1597,2119,1786,1832,2626,3314,676)
# 행과 열의 레이블을 지정한다.
row_label = c("서울","부산","대구","인천","광주","대전","울산","세종","경기","강원","충북","충남","전북","전남","경북","경남","제주")
col_label = c(2017,2018,2019,2020,2021)

# 2. 데이터프레임과 행렬 생성하기
# 데이터프레임과 생성하기
census_df = data.frame(data_2017,data_2018,data_2019,data_2020,data_2021)
census_df
# 데이터프레임의 행과 열 이름 지정하기
rownames(census_df) = row_label 
colnames(census_df) = col_label
census_df
# 데이터프레임을 행렬로 전환하기 
census_mat = as.matrix(census_df)

# 3. 선 그래프 그리기 by 데이터프레임
# 선 그래프 그리기 #1: 여러 개의 선 그래프 그리기
plot(census_df$`2017`, type="l", col=1, ylim=c(0,15000))
par(new=T)
plot(census_df$`2018`, type="l", col=2, ylim=c(0,15000))
par(new=T)
plot(census_df$`2019`, type="l", col=3, ylim=c(0,15000))
par(new=T)
plot(census_df$`2020`, type="l", col=4, ylim=c(0,15000))
par(new=T)
plot(census_df$`2021`, type="l", col=5, ylim=c(0,15000))

# 선 그래프 그리기 #2: lines()를 이용해, y축 레이블이 중복되는 현상을 피함
plot(census_df$`2017`, type="l", col=1, ylim=c(0,15000))
par(new=T)
lines(census_df$`2018`, type="b", col=2, ylim=c(0,15000))
par(new=T)
lines(census_df$`2019`, type="c", col=3, ylim=c(0,15000))
par(new=T)
lines(census_df$`2020`, type="o", col=4, ylim=c(0,15000))
par(new=T)
lines(census_df$`2021`, type="s", col=5, ylim=c(0,15000))

# 선 그래프 그리기 #3: 선 그래프의 범례추가
plot(census_df$`2017`, type="l", col=1, ylim=c(0,15000))
par(new=T)
plot(census_df$`2018`, type="l", col=2, ylim=c(0,15000))
par(new=T)
plot(census_df$`2019`, type="l", col=3, ylim=c(0,15000))
par(new=T)
plot(census_df$`2020`, type="l", col=4, ylim=c(0,15000))
par(new=T)
plot(census_df$`2021`, type="l", col=5, ylim=c(0,15000))
legend(15,13000, col_label, cex=0.5, col = c(1,2,3,4,5), lty=1)

# 선 그래프 그리기 #4: x축에 이름으로 변경
plot(census_df$`2017`,type="l",col = 1, axes = FALSE ,ann = FALSE)
par(new=T)
lines(census_df$`2018`, type="b", col=2, ylim=c(0,15000))
par(new=T)
lines(census_df$`2019`, type="c", col=3, ylim=c(0,15000))
par(new=T)
lines(census_df$`2020`, type="o", col=4, ylim=c(0,15000))
par(new=T)
lines(census_df$`2021`, type="s", col=5, ylim=c(0,15000))
axis(1, at = 1:17,label = row_label)
axis(2, ylim = c(0,15000))
legend(14,13000, col_label, cex=0.9, col = c(1,2,3,4,5), lty=1)

# 4. Bar 그래프 그리기 by 데이터프레임
# bar그래프 그리기 #1: 일반적인 그래프
barplot(census_mat, col=rainbow(17))
legend(4,45000, row_label, fill=rainbow(17), cex=0.4)

# bar그래프 그리기 #2: 수평 그래프
barplot(census_mat, col=rainbow(17), horiz = T)
legend(27000, 4, row_label, fill=rainbow(17), cex=0.4)

# bar그래프 그리기 #3: col값별로 분리된 그래프
barplot(census_mat, col=rainbow(17), beside = T)
legend(66, 12000, row_label, fill=rainbow(17), cex=0.4)

# 행렬을 전치하기
census_mat_t = t(census_mat)

# bar그래프 그리기 #4: 전치된 행렬로 수평 그래프 그리기
barplot(census_mat_t, col=rainbow(4), horiz = T)
legend(40000, 20, col_label, fill=rainbow(4), cex=0.7)

# bar그래프 그리기 #5: 전치된 col값별로 분리된 그래프 그리기
barplot(census_mat_t, col=rainbow(4), beside = T)
legend(66, 12000, col_label, fill=rainbow(4), cex=1)

