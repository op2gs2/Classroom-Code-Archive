# 데이터를 불러온다.
data_2017 <- c(
  9766,
  3424,
  2458,
  2924,
  1495,
  1528,
  1159,
  266,
  12786,
  1521,
  1609,
  2153,
  1829,
  1795,
  2675,
  3339,
  635
)

data_2020 = c(
  9602,
  3344,
  2419,
  2951,
  1488,
  1500,
  1140,
  349,
  13405,
  1515,
  1632,
  2204,
  1792,
  1764,
  2655,
  3350,
  670
)

labels_data= c(
  "서울",
  "부산",
  "대구",
  "인천",
  "광주",
  "대전",
  "울산",
  "세종",
  "경기",
  "강원",
  "충북",
  "충남",
  "전북",
  "전남",
  "경북",
  "경남",
  "제주"
)

# 데이터프레임을 생성한다.
census_df = data.frame('2017'= data_2017, '2020' = data_2020, '지역' = labels_data)

# 데이터프레임을 CSV파일로 저장한다.
write.csv(census_df, "./census_data.csv")

# 데이터프레임에서 각 열을 가져온다.
data_2017 = census_df$X2017 
data_2020 = census_df$X2020
labels_data = census_df$지역

# 데이터프레임의 열의 이름을 출력한다.
colnames(census_df)

# 데이터프레임의 행의 이름을 출력한다.
rownames(census_df)

# 그래프를 출력한다.
par(mfrow=c(3,3)) 
barplot(census_df$X2017, names.arg=labels_data) 
barplot(census_df$X2020, col='Red', names.arg=labels_data) 
barplot(census_df$X2017, names.arg=labels_data, axes=False) 
barplot(census_df$X2020, col=rainbow(10), ann=False) 
pie(census_df$X2017, col=rainbow(8), labels=labels_data) 
pie(census_df$X2020, labels=labels_data)

