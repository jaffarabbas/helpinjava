#from number 

def fun1(a):
    if a < 0:
        return a
    return -1 * a

# from using concatination
def func(a):
    value = "-" + str(a)
    if value[0] == "-":
        return a
    return int(value)
    
print(fun1(-1))

print(func(-1))

print(type(func(-1)))