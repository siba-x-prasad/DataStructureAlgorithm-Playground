package codingPrograms.geeksforgeeks.strings.level1;

/**
 * Input: str = "(())))("
 * Output: 4
 * Explanation:
 * After index 4, string splits into (())
 * and ))(. Number of opening brackets in the
 * first part is equal to number of closing
 * brackets in the second part.
 */
public class EqualPointsInaStringOfBracket {
    public static void main(String[] args) {
        // ))))(()
        int pos = getPosition("(())))(");
        System.out.println("Position is "+pos);
    }

    public static int getPosition(String str){
        int position = 0;
        String[] arr = str.split("");
        int leftBracket  = 0;
        int rightBracket  = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals("(")){
                leftBracket++;
            }
            else  if(arr[i].equals(")")){
                leftBracket--;
            }
            if(leftBracket == 0){
                position = i;
                break;
            }
        }

        return position+1;
    }

}
