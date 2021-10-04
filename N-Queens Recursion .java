import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [][]chess=new int[n][n];
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row)     {
        if(row>chess.length)
        return ;
        if(row==chess.length)
        {
           
                System.out.println(qsf+".");
           
            return ;
        }
        
        for(int i=0;i<chess.length;i++)
        {
            if(isValid(row,i,chess))
            {
               
                chess[row][i]=1;
                //System.out.println(qsf+row+"-"+i+",");
                printNQueens(chess,(qsf+row+"-"+i+", "),row+1);
                chess[row][i]=0;
            }
        }
        return ;
        
    }
    public static boolean isValid(int row,int column,int chess[][])
    {
        boolean f1=true;
        // first diagonal
        for(int i=0;i<chess.length;i++)
        {
          
            f1=f1&&index(i,column,chess);
            f1=f1&&index(row,i,chess);
            
        }
          
        int sub=1;
        for(int i=row-1;i>=0;i--)
        {
            f1=f1&&index(i,column-sub,chess);
            sub++;
        }
          
        sub=1;
        for(int i=row+1;i<chess.length;i++)
        {
            f1=f1&&index(i,i+sub,chess);sub++;
        }
          
        sub=1;
        for(int i=row-1;i>=0;i--)
        {
             f1=f1&&index(i,column+sub,chess);sub++;
        }
       
        sub=1;
        for(int i=row+1;i<chess.length;i++)
        {
            f1=f1&&index(i,column-sub,chess);sub++;
        }
         
        return f1;
    }
    public static boolean index(int row,int column,int[][]chess)
    {
        if(row<0||column<0||row>=chess.length||column>=chess.length)
        return true;
         return (chess[row][column]==0)?true:false;
    }
}
