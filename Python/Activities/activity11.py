fruits = {
    "apples": 100, 
    "Bananas": 60, 
    "orange":50, 
    "Mangos": 120
}

print(fruits)
Search_fruit= input("Enter the name of fruit").lower()

if Search_fruit in fruits:
    print("Fruit is available in shop")
else:
    print("fruit is not available in shop")


