

example_list = list(input("Enter sequence of numbers").split(","))
print(example_list)
sum=0
for i in example_list:
    sum+=int(i)
print(sum)