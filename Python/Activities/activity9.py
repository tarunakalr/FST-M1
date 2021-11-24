List1=[2,3,4,5,6,7]
List2=[8,9,10,11,12,13]
print("My First list is - ",List1)
print("My second list is - ",List2)
List3=[]

for i in List1:
    if(i%2 != 0):
       List3.append(i)
for j in List2:
    if(j%2 ==0):
        List3.append(j)
print("My third list is-",List3)