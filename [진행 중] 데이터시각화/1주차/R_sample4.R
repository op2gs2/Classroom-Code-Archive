# Setting plot function with Various Parameters.
y = c(90,60,80,100,70) # You can use '=' operator when decalre variables.
x = c(1,2,3,4,5)

par(mfrow(1,1)) # Print one plot in screen.

plot(x, y, col="red") # Col of color
plot(x, y,  main = "Graph 2") # Name of graph name.
plot(x, y, xlab="Axis X") # Name of X axis 
plot(x, y, ylab="Axis Y") # Name of y axis
plot(x,y, type='l')  # Graph type (type="p","l",'b','c','o','h','s','S','n')
plot(x,y, lty=3, type='s') # Line type (lty= 0 to 6)
plot(x,y, lwd=2, lty=3, type='S') # Line width (lwd)
plot(x,y, pch=25) # Point shape (pch)
plot(x,y, cex=3) # Point size (cex: character expension)
plot(x,y, bg="yellow",pch=25) # Background color of plot element(?)
