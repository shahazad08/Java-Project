from Utilities import utilities
m=int(input("Enter the No. of rows"))

print("Enter the array elements")
arr= [int(input()) for i in range(m)]
print(arr)

utilities.Triplets(arr)