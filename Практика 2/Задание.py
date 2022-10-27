x = float(input("Введите x "))
y = float(input("Введите y "))
z1 = float(input("Введите z1 "))
import math
z = z1*(10**(-4))
s = (math.pow(2,(math.pow(y,x))))+(math.pow(math.pow(3,x),y)) - ((y*(math.asin(math.pow(1/1+z**2),0.5)))-1/3)/(math.fabs(x))+(1/((math.pow(y,2)+1)))
print(s)
