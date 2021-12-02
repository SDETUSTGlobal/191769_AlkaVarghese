#Python Constructors
class User:
    name = ""

    def __init__(self, name):
        self.name = name

    def sayHello(self):
        print("Welcome, My Name is , " + self.name)

User1 = User("alka")
User1.sayHello()