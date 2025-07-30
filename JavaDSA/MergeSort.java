public class MergeSort
{
    public static void main(String[] args)
    {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        mergesort(array,0,array.length - 1);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    static void mergesort(int[] arr,int left,int right)
    {
        if(left<=right)
        {
            int mid=left+(right-left)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
        return;
    }
    static void merge(int[] arr,int left,int mid,int right)
    {
        int[] merge=new int[right - left + 1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right)
        {
            if(arr[i]<arr[j])
            {
                merge[k++]=arr[i++];
            }
            else
            {
                merge[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            merge[k++]=arr[i++];
        }
        while(j<=right)
        {
            merge[k++]=arr[j++];
        }

        // This is the trickiest Part
        for(int a=0;i<=high;a++)
        {
            arr[a]=merge[a-left];
        }

       // int bc=5;
    }
}