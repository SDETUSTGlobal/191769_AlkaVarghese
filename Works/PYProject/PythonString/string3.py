#Empty Placeholder replaced with a string value
print ("Welcome to {} tutorials".format("Python"))
#Empty Placeholder replaced with a numeric value
print ("Welcome to Python{} Tutorials".format("!"))
#Using variable or keyword arguments inside the Placeholder
print ("Welcome to {name}{num} Tutorials".format(name="Python", num="!"))
#Using index or positional arguments inside the Placeholder
print ("Welcome to {0}{1} Tutorials".format("123","!"))
#Using multiple placeholders inside a string
print ("{} is {} new kind of {} experience!".format("Python", "totally","learning"))
print("------END------")

#Using class with format()
class MyClass:
    msg1="MY Name IS"
    msg2="Alka"
print("Welcome to my show! {c.msg1}! {c.msg2}!".format(c=MyClass()))
print("------END------")

#Using dictionary with format()
my_dict = {'msg1': "Welcome", 'msg2': 'Python'}
print("{m[msg1]} to {m[msg2]} Tutorials!".format(m=my_dict))
print("------END------")

#Padding Variable Substitutions
print("I have {:10} dogs and {:2} cat".format(2,1))
print("------END------")