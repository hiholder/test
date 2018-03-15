
import java.util.Arrays;


public class Mergesort {


	/**
	 * @param args
	 */
public static void merge(int[]a,int s,int m,int e)
{
	int pb=0;
	int p1=s,p2=m+1;
	int[] tep=new int[e-s+1];
	while(p1<=m&&p2<=e)
	{
		if(a[p1]<a[p2])
		{ tep[pb++]=a[p1++];
		//System.out.println(a[p1]);
		}
		else
			{tep[pb++]=a[p2++];
			//System.out.println(a[p2]);
			}
			}
	while(p1<=m)
		tep[pb++]=a[p1++];
	while(p2<=e)
		tep[pb++]=a[p2++];
	for(int i=0;i<tep.length;i++)
	{
		a[s+i]=tep[i];
	}
}
static void mergesort(int[] a,int s,int e)
{int m=(s+e)/2;
	if(s<e)
	{
	
		mergesort(a,s,m);
		mergesort(a,m+1,e);
		merge(a,s,m,e);
		System.out.println(Arrays.toString(a));
	}
}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int a[]={13,27,19,2,12,8,30,89};	
			// int []b=new int[9];
System.out.println(Arrays.toString(a));
Arrays.sort(a);

//mergesort(a,0,a.length-1);
System.out.println(Arrays.toString(a));
	}

}
