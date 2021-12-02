#Using range()
for i in range(10):
    print(i, end =" ")
print("---------------")
# Using start, stop and Steps
for i in range(3, 10, 2):
    print(i, end="::")
print("---------------")

#Incrementing the values in range using a positive Steps.
for i in range(1, 30, 5):
    print(i, end =" ")
print("---------------")

#Reverse Range: Decrementing the values using negative Steps.
for i in range(15, 5, -1):
    print(i, end =" ")
print("---------------")

#Using floating numbers in Python range()
#for i in range(10.5):
#    print(i, end =" ")
#print("---------------")

#Using for-loop with Python range()
arr_list = ['Mysql', 'Mongodb', 'PostgreSQL', 'Firebase']

for i in range(len(arr_list)):
    print(arr_list[i], end =" ")
print("---------------")

#Using Python range() as a list
print(list(range(10)))
print("---------------")

#Using characters in python range()
#for c in range ('z'):
#        print(c, end =" ? ")
#print("---------------")

def get_alphabets(startletter, stopletter, step):
    for c in range(ord(startletter.lower()), ord(stopletter.lower()), step):
        yield chr(c)
print(list(get_alphabets("a", "h", 1)))
print("---------------")

#How to Access Range Elements Using for-loop
for i in range(6):
    print(i)
print("---------------")

#Using index
startvalue = range(5)[0]
print("The first element in range is = ", startvalue)

secondvalue = range(5)[1]
print("The second element in range is = ", secondvalue)

lastvalue = range(5)[-1]
print("The first element in range is = ", lastvalue)
print("---------------")

#Using list()
print(list(range(10)))
print("---------------")

#Example: Get even numbers using range()
for i in range(2, 20, 2):
    print(i, end =" ")
print("---------------")

#Merging two-range() outputs
from itertools import chain

print("Merging two range into one")
frange =chain(range(10), range(10, 20, 2))
for i in frange:
    print(i, end=" ")
print("---------------")

# Working Example of arange() using NumPy
import numpy as np
for i in np.arange(10):
   print(i, end =" ")
print("---------------")

#Floating point numbers using NumPy arange()
import numpy as np
for  i in np.arange(0.5, 1.5, 0.2):
   print(i, end =" ")
print("---------------")