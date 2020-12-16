#import numpy library 
import numpy as np
# create a class 
class diagnoal_sum:
    # create function
    def sum_diagonal( self,a, r,c):
        # check wheather a given a row and column is valid or not.
        if r!= c or c==0 or r==0:
            return print("Enter valid matrix ,Matrix should be (n x n) format")
        # calculate the size of matrix
        l=len(a[0])
        # if size is null then return matrix 
      
        # initialize variable with 0 value    
        main=0
        second=0
        for i in range(r):
        #count matrix diagonal element which is principal element of matrix a[n][n]    
            main +=a[i][i]
        #count matrix diagonal element which is secondary element of matrix a[n][l-i-1] .example:
        # a[2][0],a[1][1] a[0][2] f matrix is 3 x 3.   
            second+=a[i][l-i-1]/4
        print("main diagonal elements sum :", main) 
        print("second diagonal elements sum :", second) 

#  define main() function.
def main():
    digsum=diagnoal_sum()
    #taking input from console.
    row = input("enter row and column :")
    col=input("enter row and column :")
    r=int(row)
    c=int(col)
    # create matrix using numpy function arange() in sequential order.
    a=np.arange(r*c).reshape(r,c)
    print("given matrix :\n", a)
    #call function to execute .
    digsum.sum_diagonal(a,r,c)
if __name__ == "__main__":
    main()