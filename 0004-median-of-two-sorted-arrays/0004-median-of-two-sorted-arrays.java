class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int[] merge=new int[n1+n2];
        for(int i=0;i<n1;i++){
            merge[x]=nums1[i];
            x++;

        }

        for(int i=0;i<n2;i++){
            merge[x]= nums2[i];
            x++;
        }
        Arrays.sort(merge);
        int n=merge.length;

        if(n %2!=0){
            return merge[n/2];
        }
        else{
            return (merge[n/2-1]+merge[n/2])/ 2.0;
        }
        
    }
}