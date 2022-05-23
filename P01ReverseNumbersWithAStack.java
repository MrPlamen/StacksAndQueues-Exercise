package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] intInput = sc.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<intInput.length; i++) {
            stack.push(Integer.parseInt(intInput[i]));
        }
        for(int j=0;j< intInput.length;j++) {
            System.out.printf("%s ", stack.pop());
        }
    }
}
