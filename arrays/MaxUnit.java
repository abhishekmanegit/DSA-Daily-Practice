class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1],a[1]));

        int units = 0;

        for(int[] boxes:boxTypes){

            int numberofBoxes = boxes[0];
            int unitperBoxes = boxes[1];

            if(truckSize >= numberofBoxes){

                units += numberofBoxes * unitperBoxes;
                truckSize -= numberofBoxes;
            }
            else{

                units += truckSize * unitperBoxes;
                return units;
            }
        }

        return units;
        
    }
}