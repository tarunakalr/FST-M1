example_list = list(input("Enter sequence of numbers").split(","))
print(example_list)

firstnum= print(example_list[0])

Lastnum= print(example_list[-1])

if (firstnum==Lastnum):
    print("First and last elements are equal")
else:
    print ("First and last elements are not equal")  
