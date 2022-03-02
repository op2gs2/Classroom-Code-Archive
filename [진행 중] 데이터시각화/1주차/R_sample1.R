# Print various plot with single variable.
y <- c(90,60,80,100,70)
plot(y)
plot(y,type='l') # Print plot with long line.
barplot(y, col=rainbow(5)) # Print bar plot with rainbow color.
pie(y)
boxplot(y)