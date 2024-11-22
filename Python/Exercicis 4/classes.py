class Person:
    def __initalize__(self, first_name, last_name):
        self.first = first_name
        self.last = last_name
    def speak(self):
        print(f"My name is {self.first} {self.last}")

if __name__ == "__main__":
    me = Person.__initalize__("Brandon", "Walsh")
    you = Person.__initalize__("Ethan", "Reed")
    me.speak()
    you.speak()