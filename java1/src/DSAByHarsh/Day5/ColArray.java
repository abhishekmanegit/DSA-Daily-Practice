//Color sort

package DSAByHarsh.Day5;

import java.util.Scanner;

public class ColArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
        int[][] arr ={ {1,2},{3,4},{5,6}};

//        for(int row = 0; row<arr.length;row++){
//            for(int col =0; col < arr[row].length;col++){
//                arr[row][col] = sc.nextInt();
//            }
//        }

        for(int col = 0; col<arr[0].length;col++){
            for(int row =0; row < arr.length;row++){
                System.out.print(arr[row][col] + " ");
            }

        }
    }
}
