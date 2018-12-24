from Utilities import utilities
try:
    n=int(input("Enter the nth Value"))
except ValueError:
    print("Enter the Integer Number Only")
except NameError:
    print("Names Not allowed")
    utilities.Harmonic(n)


