def square(n):
    return n*n
my_list = [2,3,4,5,6,7,8,9]
updated_list = map(square, my_list)
print(updated_list)
print(list(updated_list))
print("---------------")

#Using map() with Tuple
def myMapFunc(n):
    return n.upper()

my_tuple = ('php','java','python','c++','c')

updated_list = map(myMapFunc, my_tuple)
print(updated_list)
print(list(updated_list))
print("---------------")

#Using map() with Dictionary
def myMapFunc(n):
    return n*10
my_dict = {2,3,4,5,6,7,8,9}
finalitems = map(myMapFunc, my_dict)
print(finalitems)
print(list(finalitems))
print("---------------")

#Using map() with Set
def myMapFunc(n):
    return n*5
my_set = {2,3,4,5,6,7,8,9}
finalitems = map(myMapFunc, my_set)
print(finalitems)
print(list(finalitems))
print("---------------")

#Using map() with Lambda function
my_list = [2,3,4,5,6,7,8,9]
updated_list = map(lambda x: x * 2, my_list)
print(updated_list)
print(list(updated_list))
print("---------------")

#Using Multiple Iterators inside map() function
#Example 1: Passing two list iterators to map()
def myMapFunc(list1, list2):
    return list1+list2

my_list1 = [2,3,4,5,6,7,8,9]
my_list2 = [4,8,12,16,20,24,28]

updated_list = map(myMapFunc, my_list1,my_list2)
print(updated_list)
print(list(updated_list))
print("---------------")

#Example 2: Passing one Tuple and a list iterator to map()
def myMapFunc(list1, tuple1):
    return list1+"_"+tuple1

my_list = ['a','b', 'b', 'd', 'e']
my_tuple = ('PHP','Java','Python','C++','C')

updated_list = map(myMapFunc, my_list,my_tuple)
print(updated_list)
print(list(updated_list))
print("---------------")



