import java.util.Scanner;


public class 神奇口袋递归 {

	/**
	 * @param args
	 */
	static int[] a=new int[30]; 
	static int N;
	static int Ways(int w ,int k )// 从前k种物品中选择一些，凑成体积w的做法数目
  { 
		if( w == 0 ) return 1;
		if( k <= 0 ) return 0;
		return Ways(w, k -1 ) + Ways(w - a[k], k -1 );//根据拿不拿第i个物品分两种情况讨论
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		 N=in.nextInt();
		for( int i = 1;i <= N; ++ i )
		      a[i]=in.nextInt();
	System.out.println(Ways(40,N));
	}

}
