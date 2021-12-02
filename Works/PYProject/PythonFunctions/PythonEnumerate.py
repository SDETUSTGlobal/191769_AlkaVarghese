# Enumerate() in Python Example
mylist = ['A', 'B', 'C', 'D']
e_list = enumerate(mylist)
print(list(e_list))
print("______________________")

# UsingEnumerate() on a list with startIndex
mylist = ['A', 'B', 'C', 'D']
e_list = enumerate(mylist, 2)
print(list(e_list))
print("______________________")

# Looping Over an Enumerate object
mylist = ['A', 'B', 'C', 'D']
for i in enumerate(mylist):
    print(i)
    print("\n")
print("Using startIndex as 10")
for i in enumerate(mylist, 10):
    print(i)
    #print("\n")
print("______________________")

# Enumerating a Tuple
my_tuple = ("A", "B", "C", "D", "E")
for i in enumerate(my_tuple):
    print(i)
print("______________________")

# Enumerating a String
my_str = "Guru99 "
for i in enumerate(my_str):
    print(i)
print("______________________")

# Enumerate a dictionary
my_dict = {"a": "PHP", "b": "JAVA", "c": "PYTHON", "d": "NODEJS"}
for i in enumerate(my_dict):
    print(i)
print("______________________")