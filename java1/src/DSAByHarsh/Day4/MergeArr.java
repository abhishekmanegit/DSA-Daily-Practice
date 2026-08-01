package DSAByHarsh.Day4;

import java.util.Arrays;
//Merge Two Array
public class MergeArr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m -1;
        int j = n -1;
        int k = nums1.length-1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums2[i];
                k--;
                i--;
            }
            else{

                nums1[i] = nums2[j];
                i--;
                j--;
            }
        }
        while( j >= 0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,4,0,0,0};
        int[] nums2 = {3,4,1};
        int m =3;
        int n = nums2.length;


        merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(nums1));

    }
}
