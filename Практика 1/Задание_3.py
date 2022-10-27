ag = int(input())
im = str(input())
if (ag >= 16) and (im != "иван") and (0 < ag < 75):
    print("Поздравляем, вы поступили во ВГУИТ")
else:
    print("Сначала  нужно окончить школу!")
    print("Вам", 16-ag)
