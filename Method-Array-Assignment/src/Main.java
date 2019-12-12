import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Problem 1 Method
    static int[] arrAdd(int[] arrTest, int b){
        int c = arrTest.length+1;
        int [] arrAdded = new int[c];
        for(int i = 0;i<arrTest.length;i++){
            arrAdded[i] = arrTest[i];
        }

        arrAdded[arrTest.length] = b;
        return arrAdded;
    }

    //Problem 2 Method
    static int[] arrDel(int[] arrTest){
        int d = arrTest.length-1;
        int [] arrDelete = new int[d];
        for (int a = 0;a<d;a++){
            arrDelete[a]=arrTest[a];
        }

        return arrDelete;
    }

    //Problem 3 Method
    static int[] arrIns(int[] arrTest, int indexPos, int valueAdd ){
        int [] arrInserted = new int[arrTest.length+1];
        for (int b = 0;b<arrTest.length+1;b++){
            if(b == indexPos){
                arrInserted[indexPos] = valueAdd;
            }
            if(b<indexPos) {
                arrInserted[b] = arrTest[b];
            }
            if(b>indexPos){
                arrInserted[b] = arrTest[b-1];
            }
        }

        return arrInserted;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Original Array
        System.out.println("The original array:");
        int [] arrOne = new int [5];
        for(int i = 0;i<arrOne.length;i++){
            arrOne[i] = i;
        }

        //Problem 1 (Adds a number to the end of an array)
        System.out.println(Arrays.toString(arrOne));
        System.out.println("What value would you like to add to the end of this array?");
        int userAdd = Integer.parseInt(scan.nextLine());
        System.out.println(Arrays.toString(arrAdd(arrOne, userAdd)));

        //Problem 2 (Delete a value at the end of an array  by 1)
        System.out.println("Here's the array with the last digit deleted!");
        System.out.println(Arrays.toString(arrDel(arrOne)));

        //Problem 3 (Insert at t a value specific index value)
        System.out.println("Now here's the original array again:");
        System.out.println(Arrays.toString(arrOne));
        System.out.println("Which position would you like to add a value? (0-5)");
        int userPos = Integer.parseInt(scan.nextLine());
        System.out.println("What value would you like to add in this position?");
        int userValue = Integer.parseInt(scan.nextLine());
        System.out.println(Arrays.toString(arrIns(arrOne,userPos, userValue)));

    }

}