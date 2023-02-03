package pl.sda.collections;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); //kolejka typu LIFO

        stack.push(20);
        stack.push(34);
        stack.push(65);
        stack.push(98);

        System.out.println(stack.pop()); //zwraca i usuwa wierzchołek stosu
        System.out.println(stack.peek());//zwraca, ale NIE usuwa wierzchołka stosu
        System.out.println(stack.peek());//zwraca, ale NIE usuwa wierzchołka stosu

        for (Integer i : stack) {
            System.out.print(i + " ");
        }

    }

}
