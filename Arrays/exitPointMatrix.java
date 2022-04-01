public class exitPointMatrix {
    public void solution(int[][] arr){

        int rowIndex = 0;
        int colIndex = 0;
        int direction = 0;

                // north
        // west            east
                // south


        while(true){

            // correcting the journey by tweaking the direction 
            direction = (direction + arr[rowIndex][colIndex]);

            // journey starts with east -> south -> west ->  north
            if(direction == 0){
                colIndex++;
            }else if(direction == 1){
                rowIndex++;
            }else if(direction == 2){
                colIndex--;
            }else if(direction == 3){
                rowIndex--;
            }

            // breaking conditions

            if(rowIndex < 0){
                rowIndex++;
                break;
            }else if(colIndex < 0){
                colIndex++;
                break;
            }else if(rowIndex == arr.length){
                rowIndex--;
                break;
            }else if(colIndex == arr[0].length){
                colIndex--;
                break;
            }
        }

        System.out.println(rowIndex);
        System.out.println(colIndex);
    }
}
