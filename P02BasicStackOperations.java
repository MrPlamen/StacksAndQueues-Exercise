package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] commandLine = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] stackArray = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < commandLine[0]; i++) {
            stack.push(stackArray[i]);
        }
        for (int j = 0; j < commandLine[1]; j++) {
            stack.pop();
        }
        if (stack.contains(commandLine[2])) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                int currentSmallest = stack.peek();
                for (int element : stack) {
                    if (element<currentSmallest) {
                        currentSmallest = element;
                    }
                }
                System.out.println(currentSmallest);
            }
        }
    }
}
