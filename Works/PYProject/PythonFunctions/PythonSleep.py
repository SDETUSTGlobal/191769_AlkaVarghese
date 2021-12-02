#Example
import time
print("Welcome to Python")
time.sleep(5)
print("This message will be printed after a wait of 5 seconds")
print("---------------")
#How to delay the execution of function using sleep()?
#Example:
import time
print('Code Execution Started')
def display():
    print('Welcome to Python')
    time.sleep(5)
display()
print('Function Execution Delayed')
print("---------------")
#Using sleep() function
#Example:
import time
my_message = "Python"
for i in my_message:
   print(i)
   time.sleep(1)
print("---------------")
#Using asyncio.sleep function available from (Python 3.4 or higher)
#Example:
import asyncio
print('Code Execution Started')
async def display():
    await asyncio.sleep(5)
    print('Welcome to Python')
asyncio.run(display())
print("---------------")
#Using Event().wait
#Example
from threading import Event
print('Code Execution Started')
def display():
    print('Welcome to Python')
Event().wait(5)
display()
print("---------------")
#Using Timer
#Example:

from threading import Timer
print('Code Execution Started')
def display():
    print('Welcome to Python')
t = Timer(5, display)
t.start()
print("---------------")


