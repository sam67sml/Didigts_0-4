package ru.sberbank;

import java.io.*;

public class Solution
{

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // File file = new File("E:\\ÑáåðÒåõ\\Java school\\HelloWorld\\src\\ru\\sberbank\\input.txt");
        // FileReader fileReader = new FileReader(file);
        //  BufferedReader br = new BufferedReader(fileReader);
        int count = Integer.parseInt(br.readLine());
        String[] stringArray = br.readLine().split(" ");
        int[] intArray = new int[stringArray.length];
        int[] numbers = new int[]{0,0,0,0,0 };
        for (int i = 0; i < count; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
            switch (intArray[i]) {
                case 0: numbers[0]++;
                    break;
                case 1: numbers[1]++;
                    break;
                case 2: numbers[2]++;
                    break;
                case 3: numbers[3]++;
                    break;
                case 4: numbers[4]++;
                    break;
            }
        }
        for (int i = 0; i<5; i++){
            if (numbers[i] != 0)
                System.out.println(i + " " + numbers[i]);
        }

    }
}