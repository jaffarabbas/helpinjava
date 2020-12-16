import numpy as np

class diagnoal_sum:
    def sum_diagonal(self,a, r,c):
        if  c==0 and r==0:
            return print("Enter valid matrix ,Matrix should be (n x n) format")    
    
        print("diagonal elements are :",a.diagonal())
        result =  np.trace(a)
        print("mean of diagonals Elements :",result/4)
       


def main():
    digsum=diagnoal_sum()
    
    row,col=input("enter row and column :").split()
    r=int(row)
    c=int(col)
    
    a=np.arange(r*c).reshape(r,c)
    print("Original matrix :\n", a)
    
    digsum.sum_diagonal(a,r,c)
if _name_ == "_main_":
    main()