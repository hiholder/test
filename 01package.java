public class 背包问题 {
	/**
	 * @param args
	 */
	//前M个物体，不超过N
	static void f(int[][] F,int[] w,int[] v)//动态规划找出最优解
	{
		
		for(int i=1;i<5;i++)
			for(int j=1;j<9;j++)
			{
				if(j<w[i])
				{				
					F[i][j]=F[i-1][j];
				}
				else{
					if(F[i-1][j]<F[i-1][j-w[i]]+v[i])F[i][j]=v[i]+F[i-1][j-w[i]];
					else F[i][j]=F[i-1][j];
				}			
				}
	}
	static void find(int i,int j,int[][] F,int[] item,int[] w,int[] v)//找到所取物品
	{
		if(i>=0)
		{
			if(F[i][j]==F[i-1][j])
			{
				item[i]=0;
				find(i-1,j,F,item,w,v);
			}
			else if(j-w[i]>=0&&F[i][j]==F[i-1][j-w[i]]+v[i])
				{
				item[i]=1;
				//System.out.print(i);
				if(j-w[i]==0)return;
				find(i-1,j-w[i],F,item,w,v);
				}
			//else find(i-1,j,F,item,w,v);
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] w={0,2,3,4,5};
		int[] v={0,3,4,5,6};
		int M,N;
 
		M=w.length;
		N=9;
 int[][] F=new int[M][N];
int val;
for(int i=0;i<M;i++)
	for(int j=0;j<9;j++)
		F[i][j]=0;
f(F,w,v);
int[] item=new int[5];
find(4,8,F,item,w,v);
System.out.println("选择商品"+" ");
for(int i=0;i<item.length;i++)
	if(item[i]!=0)System.out.print(i+" ");
System.out.println();
System.out.println("总价值:"+F[4][8]);
	}
}
