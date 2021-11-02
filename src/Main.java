public class Main {

    public static void main(String[] args) {
        System.out.println(lastChar("hostel"));
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {7,8,9};
        System.out.println(median(arr, arr.length));
        System.out.println(arrSum(arr1, arr));
        System.out.println(SumArr(arr1)); //11
        System.out.println(highLow(arr)); //12
        
    }
    //3
    public static boolean asd(int first, int second){
        return first % 10 == second % 10;
    }

    //5
    public static String lastChar(String word){
        StringBuffer newWord = new StringBuffer(word);
        char lChar = newWord.charAt(newWord.length() -1);
        StringBuffer endWord = new StringBuffer(newWord);
        endWord.append(lChar);
        endWord.insert(0, lChar);
        return endWord.toString();
    }
    //7


    //8
    public static int median(int[] arr, int arrLength){
        int result = arr[arrLength / 2];
        return result;

    }

    //9
    public static int[] arrSum(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] newArr = new int[arr1Length + arr2Length];
        int count = 0;

        for (int i = 0; i<arr1Length; i++){
            newArr[i] = arr1[i];
            count++;
        }

        for (int j = 0; j < arr2Length; j++) {
            newArr[count] = arr2[j];
        }

        return newArr;
    }

    //10
    public static int[] firstToLast(int[] arr) {
        int[] newArray = arr.clone();
        int first = newArray[newArray[0]];
        int last = newArray[newArray.length - 1];

        newArray[0] = last;
        newArray[newArray.length - 1] = first;
        return newArray;
    }

    //11

    public static int SumArr(int[] arr) {
        int arrLength = arr.length;
        int counter = 0;

        for(int i = 0; i < arrLength; i++) {
            counter += arr[i] * arr[i];
        }

        return counter;
    }

    //12

    public static int highLow(int[] arr) {
        int arrL = arr.length;
        int max = arr[0];
        int min = arr[0];
        int total;

        for (int i = 0; i < arrL; i++) { //минимальное и максимальное число
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        total = max - min;
        return total;
    }

    //13


    //15
    public static boolean task15(int[] arr){
        int arrL = arr.length;
        int last;
        int follow;
        int num;
        boolean answer;

        for(int i = 0; i < arrL; i++) {
            last = arr[i-1];
            follow = arr[i];
            num = follow - last;

            if (num % 2 == 0 & num = num){

            }
        }
    }
 }






