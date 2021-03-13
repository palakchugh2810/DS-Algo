package Scalar;

public class SpiralMatrix {
	public static void main(String args[])
	{
		generateMatrix(4);
    }
public static int[][] generateMatrix(int A) {
	int n=A*A;int varz=1;
    int[][] arr = new int[A][A];
    int[][] tmp = new int[A][A];

    int l=0,r=A-1,t=0,b=A-1;
    
    for(int i=0; i<A ; i++)
    {
        for(int j=0; j<A; j++)
        {
            arr[i][j]=varz;
            varz++;
        }
    }
    System.out.println("array is "+arr);
    while(l<r && t<b)
    {
    for(int k=l;k<=r;k++)
    {
         tmp[t][k] =arr[t][k];
    }
    t++;
    
    for(int u=t; u<=b; u++)
    {
        tmp[u][r]=arr[u][r];
    }
    r--;
    for(int v=r; v>=l;v--)
    {
        tmp[b][v]=arr[b][v];
    }
    b--;
    for(int x=b; x>=t; x--)
    {
        tmp[x][l]=arr[x][l];
    }
    l++;
    }
    System.out.println("array returned is "+tmp);
    return tmp;
}
}
