# 데이터를 불러온다.
homepage = c(
  3043,
  3157,
  1115,
  1056,
  567,
  764
)

intrusion = c(
  53,
  91,
  175,
  247,
  500,
  603
)

malware_site = c(
  0,
  13018,
  47703,
  11044,
  14754,
  6034
)

year = c(
  2010,
  2012,
  2014,
  2016,
  2018,
  2020
)

# 데이터프레임을 생성한다.
hacking_data_df = data.frame(
  '홈페이지 변조'= homepage, 
  '침해사고 신고접수' = intrusion,
  '악성코드 은닉사이트 탐지' = malware_site,
  '년도' = year
)

# 데이터프레임을 CSV파일로 저장한다.
write.csv(hacking_data_df, "./hacking_data.csv")

# CSV파일로부터 데이터를 불러온다.
hacking_data_df = read.csv('./hacking_data.csv')

# 데이터프레임의 열의 이름을 출력한다.
colnames(hacking_data_df)

# 데이터프레임의 행의 이름을 출력한다.
rownames(hacking_data_df)

# 그래프 시각화
par(mfrow=c(3,2))
plot(year, homepage, type='s')
barplot(homepage, names.arg = year, col = rainbow(5))
plot(year, intrusion, type='b')
barplot(intrusion, names.arg = year, col = rainbow(3))
plot(year, malware_site, type='h')
barplot(malware_site, names.arg = year, col = rainbow(1))