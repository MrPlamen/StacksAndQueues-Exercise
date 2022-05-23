package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] operations = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] stackElements = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int add = operations[0];
        int remove = operations[1];
        int toBeChecked = operations[2];
        for (int i=0; i<add; i++) {
            queue.offer(stackElements[i]);
        }
        for (int j=0; j<remove; j++) {
            queue.poll();
        }
        if (queue.contains(toBeChecked)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                System.out.println(0);
            }
        }
    }
}
