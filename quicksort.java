import java.util.Arrays;


public class Quicksort {

	/**
	 * @param args
	 */
	static void swap(int a,int b)
	{
		int t;
		t=a;
		a=b;
		b=t;
	}
	static void Quicksort(int[] a,int s,int e){
		if(s>=e)return;
		int k=a[s];
		int i=s,j=e;
		int t;
		while(i!=j)
		{
			while(j>i&&a[j]>=k)
				--j;
				//swap(a[i],a[j]);
			t=a[i];
			a[i]=a[j];
			a[j]=t;
				while(i<j&&a[i]<=k)
					++i;
				//swap(a[i],a[j]);
				t=a[i];
				a[i]=a[j];
				a[j]=t;
		}//a[i]=k
		Quicksort(a,s,i-1);
		Quicksort(a,j+1,e);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
int[] a={93,27,30,2,8,12,2,8,30,89};
Quicksort(a,0,a.length-1);
//System.out.println(a[1]);
System.out.println(Arrays.toString(a));
	}

}
