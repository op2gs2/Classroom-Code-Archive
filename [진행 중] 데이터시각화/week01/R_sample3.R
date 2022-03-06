# Print many plot in one screen. (Using par())
a <- c(1,2,3,4,5)
par(mfrow=c(1,4)) # Number of col = 1, Number of row=4
plot(a)
barplot(a)
pie(a)
boxplot(a)
