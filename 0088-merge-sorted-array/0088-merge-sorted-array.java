class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1, b = n-1, c = m+n-1;
        while(a >= 0 && b >= 0) {
            if(nums2[b] > nums1[a]) 
                nums1[c--] = nums2[b--];
            else 
                nums1[c--] = nums1[a--];
        }

        while (b >= 0) 
            nums1[c--] = nums2[b--];
         
        // another solution 
        // copy all elements form nums2 to nums1
        // for(int i = m ; i<m+n; i++)
        //     nums1[i] = nums2[i-m];

        // use any sorting alogrithm
        // i have used bubble sort
        // for(int i = 0; i < nums1.length; i++) {
        //     for(int j = i+1; j < nums1.length; j++) {
        //         if(nums1[i] > nums1[j]) {
        //             int temp = nums1[i];
        //             nums1[i] = nums1[j];
        //             nums1[j] = temp;
        //         }
        //     }
        // }
    }
}