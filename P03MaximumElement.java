package StacksAndQueues;

import java.util.*;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int commands[] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int command = commands[0];
            switch (command) {
                case 1:
                    stack.push(commands[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
