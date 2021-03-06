# testing timeit()
import timeit
print(timeit.timeit('output = 10*5'))
print("---------------")

#Timing Multiple lines in python code
#Example 1: Using semicolon
import timeit
print("The time taken is ",timeit.timeit(stmt='a=10;b=10;sum=a+b'))

#Example 2: Using triple quotes
import timeit
import_module = "import random"
testcode = ''' 
def test(): 
    return random.randint(10, 100)
'''
print(timeit.repeat(stmt=testcode, setup=import_module))

print("---------------")

# testing timeit()
import timeit
import_module = "import random"
testcode = ''' 
def test(): 
    return random.randint(10, 100)
'''
print(timeit.timeit(stmt=testcode, setup=import_module))
print("---------------")

# testing timeit()

import timeit
import random


def test():
    return random.randint(10, 100)


starttime = timeit.default_timer()
print("The start time is :", starttime)
test()
print("The time difference is :", timeit.default_timer() - starttime)
print("---------------")

# testing timeit()
import timeit
import_module = "import random"
testcode = ''' 
def test(): 
    return random.randint(10, 100)
'''
print(timeit.repeat(stmt=testcode, setup=import_module, repeat=5))
print("---------------")



