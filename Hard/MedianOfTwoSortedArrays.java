
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int a=nums1.length+nums2.length;
        for(int i=0;i<nums1.length;i++)
        {
            
            arr[i]=nums1[i];
            
        }
          for(int i=0;i<nums2.length;i++)
        {
            
            arr[nums1.length+i]=nums2[i];
            
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        int low=0;
        int high=arr.length-1;
        int mid=0;
        double ans=0;
        if(arr.length%2==1){
        mid=(low+high)/2;
         ans=arr[mid];
        }
        else{
            mid=(low+high)/2;
           ans=(arr[mid]+arr[mid+1])/2.0;
        }
        return ans;
    }
}
