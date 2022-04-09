package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    // prints each decimal numbers of double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    // prints each char of char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    // prints each String of String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    // returns the maximum number of integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the maximum number of double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the minimum number of integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the minimum number of double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. returns boolean contains(int[], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;      //{1,2,3,4}     6

        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. returns boolean contains(int[], int)
    public static boolean contains(double[] array, double element) {
        boolean result = false;      //{1,2,3,4}     6

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. returns boolean contains(int[], int)
    public static boolean contains(char[] array, char element) {
        boolean result = false;      //{1,2,3,4}     6

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean contains(int[], int)
    public static boolean contains(String[] array, String element) {
        boolean result = false;      //{1,2,3,4}     6

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    //adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element; // element need to be assigned to the last index i:result.length-1

        return result;
    }

    //adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element; // element need to be assigned to the last index i:result.length-1

        return result;
    }

    //adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element; // element need to be assigned to the last index i:result.length-1

        return result;
    }

    //Returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){

        int count = 0;

        for (int each : array) {

            if(each==element){
                count++;
            }
        }
        return count;

    }

    //Returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){

        int count = 0;

        for (double each : array) {

            if(each==element){
                count++;
            }
        }
        return count;

    }

    //Returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){

        int count = 0;

        for (char each : array) {

            if(each==element){
                count++;
            }
        }
        return count;

    }

    //Returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){

        int count = 0;

        for (String each : array) {

            if(each.equals(element)){
                count++;
            }
        }
        return count;

    }

    //Returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){

        int[] result={};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //Returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){

        double[] result={};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //Returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){

        char[] result={};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //Returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){

        String[] result={};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the index from the array,returns new array
    public static int[] removeElement(int[] array,int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];

        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    // removes the index from the array,returns new array
    public static double[] removeElement(double[] array,int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        double[] result = new double[array.length-1];

        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    // removes the index from the array,returns new array
    public static char[] removeElement(char[] array,int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        char[] result = new char[array.length-1];

        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    // removes the index from the array,returns new array
    public static String[] removeElement(String[] array,int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String[] result = new String[array.length-1];

        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    // merge the given two arrays and return the new array
    public static int[] merge(int[] arr1,int[] arr2){

        int[] result ={};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }

    // merge the given two arrays and return the new array
    public static double[] merge(double[] arr1,double[] arr2){

        double[] result ={};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }

    // merge the given two arrays and return the new array
    public static char[] merge(char[] arr1,char[] arr2){

        char[] result ={};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }

    // merge the given two arrays and return the new array
    public static String[] merge(String[] arr1,String[] arr2){

        String[] result ={};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }

    //reverses the given array,returns a new array
    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;

    }

    //reverses the given array,returns a new array
    public static double[] reverse(double[] array) {

        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;

    }

    //reverses the given array,returns a new array
    public static char[] reverse(char[] array) {

        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;

    }

    //reverses the given array,returns a new array
    public static String[] reverse(String[] array) {

        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;

    }

    //replace the element of the array at given index with the new element
    public static int[] replaceElement(int[] array, int index, int newElement){

        if(index<0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] =newElement;
        return array;
    }

    //replace the element of the array at given index with the new element
    public static double[] replaceElement(double[] array, int index, double newElement){

        if(index<0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] =newElement;
        return array;
    }

    //replace the element of the array at given index with the new element
    public static char[] replaceElement(char[] array, int index, char newElement){

        if(index<0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] =newElement;
        return array;
    }

    //replace the element of the array at given index with the new element
    public static String[] replaceElement(String[] array, int index, String newElement){

        if(index<0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] =newElement;
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array,double oldValue,double newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array,char oldValue,char newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array,String oldValue,String newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;

    }

    // removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[]result={};

        for (int each : array) {

            if(!ArraysUtility.contains(result,each))
                result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[]result={};

        for (double each : array) {

            if(!ArraysUtility.contains(result,each))
                result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[]result={};

        for (char each : array) {

            if(!ArraysUtility.contains(result,each))
                result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[]result={};

        for (String each : array) {

            if(!ArraysUtility.contains(result,each))
                result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // inserts the element at the given index,returns new array
    public static int[] insert(int[] array,int index,int element){

        int[] arr =new int[array.length+1]; //arr = {10, 20, 30, 40, 50}  ==> {10, 20, 100, 30, 40, 50}


        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                arr[i]=array[i];
            else if(i==index)
                arr[i]=element;
            else
                arr[i]=array[i-1];
        }
        return arr;

    }

    // inserts the element at the given index,returns new array
    public static double[] insert(double[] array,int index,double element){

        double[] arr =new double[array.length+1];


        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                arr[i]=array[i];
            else if(i==index)
                arr[i]=element;
            else
                arr[i]=array[i-1];

        }
        return arr;

    }

    // inserts the element at the given index,returns new array
    public static char[] insert(char[] array,int index,char element){

        char[] arr =new char[array.length+1];


        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                arr[i]=array[i];
            else if(i==index)
                arr[i]=element;
            else
                arr[i]=array[i-1];

        }
        return arr;

    }

    // inserts the element at the given index,returns new array
    public static String[] insert(String[] array,int index,String element){

        String[] arr =new String[array.length+1];


        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                arr[i]=array[i];
            else if(i==index)
                arr[i]=element;
            else
                arr[i]=array[i-1];

        }
        return arr;

    }

    //Swaps the given elements
    public static int[] swap(int[] array,int index1,int index2){

        int temp = array[index2]; //50
        array[index2]=array[index1];//20
        array[index1]=temp;
        return array;

    }

    //Swaps the given elements
    public static double[] swap(double[] array,int index1,int index2){


        double temp = array[index2];
        array[index2]=array[index1];
        array[index1]=temp;
        return array;

    }

    //Swaps the given elements
    public static char[] swap(char[] array,int index1,int index2){


        char temp = array[index2];
        array[index2]=array[index1];
        array[index1]=temp;
        return array;

    }

    //Swaps the given elements
    public static String[] swap(String[] array,int index1,int index2){

        String temp = array[index2];
        array[index2]=array[index1];
        array[index1]=temp;
        return array;



    }






}
