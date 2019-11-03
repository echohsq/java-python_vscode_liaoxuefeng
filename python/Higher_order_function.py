# -*- coding: UTF-8 -*-
from functools import reduce

# 将函数当作参数
def add(x, y, f):
      return f(x) + f(y)

print(add(-6, 4, abs))

# map()函数有两个参数，将第一个参数在第二个参数环境下依次执行
# reduce()函数有两个参数，将第一个参数执行结果继续和序列的下一个元素做累积计算

DIGITS = {'0': 0, '1': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8':8, '9': 9}

def  char2num(s):
      return DIGITS[s]

def  str2int(s):
      return reduce(lambda x, y: x * 10 + y, map(char2num, s))

print(str2int('6789'))

# map()实现把用户输入的不规范的英文名字，变为首字母大写，其他小写的规范名字
def  normalize(name):
      return name[0].upper() + name[1:].lower()

# 测试:
L1 = ['adam', 'LISA', 'barT']
L2 = list(map(normalize, L1))
print(L2)

# 编写一个prod()函数，可以接受一个list并利用reduce()求积
def prod(L):
      return reduce(lambda x, y: x * y, L)

print('3 * 5 * 7 * 9 =', prod([3, 5, 7, 9]))
if prod([3, 5, 7, 9]) == 945:
    print('pass!')
else:
    print('fail!')

# 利用map和reduce编写一个str2float函数，把字符串'123.456'转换成浮点数123.456
def  str2float(s):
      # 先消除句点，将浮点数转为整数，使用split函数将小数部分长度算出，在reduce后除以相应的级数
      result = reduce(lambda x, y: x*10 + y, map(int, s.replace('.', '')))/10 ** len(s.split('.')[1])
      return result

print('str2float(\'123.456\') =', str2float('123.456'))
if abs(str2float('123.456') - 123.456) < 0.00001:
    print('pass!')
else:
    print('fail!')