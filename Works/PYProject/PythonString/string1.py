#accessing values in string
var1 = "Python!"
var2 = "Software Testing"
print ("var1[0]:",var1[0])
print ("var2[1:5]:",var2[1:5])
print("------END------")

#replace
oldstring = "I like Python"
newstring = oldstring.replace('like', 'love')
print(newstring)
print("------END------")

#uppercase lowercase
string="python at Python"
print(string.upper())
# capitalize
string="python at Python"
print(string.capitalize())
#lower
string="PYTHON AT Python"
print(string.lower())
print("------END------")

#“join” function
print(" ".join("Python"))
print("------END------")

#Reversing string
string="12345"
print(':'.join(reversed(string)))
print("------END------")


#Split Strings
word="Python career Python"
print(word.split(' '))
print("------END------")


#strip() Method in Python
str1 = "Welcome to Python!"
after_strip = str1.strip()
#strip() on Invalid Data Type
#mylist = ["a", "b", "c", "d"]
#print(mylist.strip())

#strip() Without character parameter
str1 = "Welcome to Python!"
after_strip = str1.strip()
print(after_strip)
str2 = "Welcome to Python!"
after_strip1 = str2.strip()
print(after_strip1)

#strip() Passing character parameters
str1 = "****Welcome to Python!****"
after_strip = str1.strip("*")
print(after_strip)

str2 = "Welcome to Python!"
after_strip1 = str2.strip("!")
print(after_strip1)

str3 = "Welcome to Python!"
after_strip3 = str3.strip("to")
print(after_strip3)
print("------END------")




