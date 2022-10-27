import re
str = 'Нннннна тебе! Ах ты! Я тебе покажу!'
nnn = re.findall('[Нн]+',str)
nnn_len = map(len,nnn)
max_n = max(nnn_len)
str_r = str.replace('!','.')
print(max_n)
print(str_r)
