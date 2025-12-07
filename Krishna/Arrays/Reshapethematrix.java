
// 566. Reshape the Matrix
// https://leetcode.com/problems/reshape-the-matrix/description/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        

        if(mat.length*mat[0].length!=r*c)
        {
            return mat;
        }
        int[][] reshape=new int[r][c];
        int[] arr=new int[mat.length*mat[0].length];
        int count=0;
        int ri=0,rc=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                reshape[ri][rc]=mat[i][j];
                
                
                rc++;
                if(rc>=c)
                {
                    ri++;
                    rc=0;
                }
            }
        }
        
        
        // count=0;
        // for(int i=0;i<reshape.length;i++)
        // {
        //     for(int j=0;j<reshape[i].length;j++)
        //     {
        //         reshape[i][j]=arr[count++];
        //     }
        // }
        return reshape;


        
    }
}