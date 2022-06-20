package com.nextuple.yash;

import java.util.Scanner;

public class AlgorithmsModule {
    public void addMatrix()
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        r=sc.nextInt();
        System.out.print("Enter number of columns : ");
        c=sc.nextInt();
        System.out.println("Enter values row by row for 1st matrix: ");
        int matrix1[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++) matrix1[i][j]=sc.nextInt();
        System.out.println("Enter values row by row for 2nd matrix: ");
        int matrix2[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++) matrix2[i][j]=sc.nextInt();


        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++) ans[i][j]=matrix1[i][j]+matrix2[i][j];

        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) System.out.print(ans[i][j]+" ");
            System.out.println("");
        }
    }
    public void multiplyMatrix()
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        r=sc.nextInt();

        c=r;

        System.out.println("Enter values row by row for 1st matrix: ");
        int matrix1[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++) matrix1[i][j]=sc.nextInt();
        System.out.println("Enter values row by row for 2nd matrix: ");
        int matrix2[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++) matrix2[i][j]=sc.nextInt();

        int ans[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=0;
                for(int k=0;k<r;k++)
                {
                    ans[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) System.out.print(ans[i][j]+" ");
            System.out.println("");
        }
    }

    public void transposeMatrix()
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        r=sc.nextInt();
        System.out.print("Enter number of columns : ");
        c=sc.nextInt();
        System.out.println("Enter values row by row for matrix: ");
        int matrix1[][]=new int[r][c];
        int transpose[][]=new int[c][r];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++) matrix1[i][j]=sc.nextInt();
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                transpose[i][j]=matrix1[j][i];
            }
        }
        for(int i=0;i<c;i++) {
            for (int j = 0; j < r; j++) System.out.print(transpose[i][j]+" ");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        AlgorithmsModule algorithmsModule=new AlgorithmsModule();
        algorithmsModule.addMatrix();;
        algorithmsModule.multiplyMatrix();
        algorithmsModule.transposeMatrix();
    }
}
