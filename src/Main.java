import java.io.*;
public class Main {
    public static void numSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file.dat");
        int str[] = new int[10];

        for (int i = 0; i < str.length; i++) {
            str[i] = (int)(Math.random()*100);
            fw.write(str[i] + " ");
        }
        fw.close();

        FileWriter fw1 = new FileWriter("fileout.dat");
        numSort(str);
        int i = 0;
        while (i <  str.length) {
            fw1.write(str[i] + " ");
            i++;
        }
        fw1.close();
    }
}