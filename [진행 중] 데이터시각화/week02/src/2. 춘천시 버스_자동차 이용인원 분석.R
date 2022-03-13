# 데이터를 불러온다.
car <- c(108568,112984,116836)
bus_custmer <- seq(12503205, 8638146, 7232545)
year <- c(2019,2020,2021)

# 데이터프레임을 생성한다.
car_bus_df = data.frame('car'= car, 'bus' = bus_custmer, 'year' = year)

# 데이터프레임을 CSV파일로 저장한다.
write.csv(car_bus_df, "./car_bus_data.csv")

# CSV파일로부터 데이터를 불러온다.
car_bus_df = read.csv('./car_bus_data.csv')

# 데이터프레임에서 각 열을 가져온다.
car = car_bus_df$car 
bus_custmer = car_bus_df$bus_custmer
year = car_bus_df$year

# 데이터프레임의 열의 이름을 출력한다.
colnames(car_bus_df)

# 데이터프레임의 행의 이름을 출력한다.
rownames(car_bus_df)

# 그래프 시각화
par(mfrow=c(3,1))
plot(year, car, type='h')
plot(year, bus_custmer, type='S', col=rainbow(1))
barplot(car, names.arg = year)

