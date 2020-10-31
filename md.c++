#include <iostream>
#include <bits/stdc++.h>
#include "darklord.cpp"
using namespace std;

// void mar(int row,int col){
//       int arr[row][col];
//         for(int i = 0 ; i<row;i++){
//             for(int j = 0 ; j<col ; j++){
//               cin >> arr[i][j];
//             }
//         }
//         for(int i = 0 ; i<row;i++){
//             for(int j = 0 ; j<col ; j++){
//              cout << arr[i][j];//print question
//             }
//            cout << endl;
//         }
// }

// void mar(int arr[][]){
//     //   int arr[row][col];   
//         for(int i = 0 ; i<row;i++){
//             for(int j = 0 ; j<col ; j++){
//              cout << arr[i][j];//print question
//             }
//            cout << endl;
//         }
// }

void mar(int *arr , int num_row , int num_col){
    //   int arr[row][col];   
        for(int i = 0 ; i<num_row;i++){//0,r=3
            for(int j = 0 ; j<num_col ; j++){//0,c=3
             cout << *(arr+i*num_col+j);//0*3+0 = 0,1*3+1 = 4
            }
           cout << endl;
        }
}

int main(int argc, char const *argv[])
{
    int row = 3,col =3;
      int arr[row][col];
      for(int i = 0 ; i<row;i++){
            for(int j = 0 ; j<col ; j++){
              cin >> arr[i][j];
            }
        }
    mar((int*)arr,row,col);
    return 0;
}
