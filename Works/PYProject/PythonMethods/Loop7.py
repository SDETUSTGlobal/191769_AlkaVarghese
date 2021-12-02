#while loop#
#Example file for working with loops
x=0
#define a while loop
while(x <4):
		print(x)
		x = x+1
print("----------------------")
#Example file for working with loops
x=0
#Define a for loop
for x in range(0,7):
		print(x)

print("----------------------")
#For Loop
#use a for loop over a collection
Months = ["Jan","Feb","Mar","April","May","June"]
for m in Months:
		print(m)

print("----------------------")

# use the break and continue statements
for x in range(10, 20):
	if (x == 15): break
	# if (x % 2 == 0) : continue
	print(x)
print("----------------------")

# use the break and continue statements
for x in range (10,20):
			if (x % 5 == 0) : continue
			print(x)

print("----------------------")

#Enumerate use a for loop over a collection
Months = ["Jan","Feb","Mar","April","May","June"]
for i, m in enumerate (Months):
		print(i,m)

print("----------------------")
