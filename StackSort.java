package StackSort;

import java.util.Scanner;
import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	Stack<Integer> stack = new Stack<>();
    	
    	
    	stack.push(10);
    	stack.push(80);
    	stack.push(60);
    	stack.push(50);
    	stack.push(30);
    	
    	 
    	int count = stack.size();
    	int n = sc.nextInt();
    	int size = stack.size();
    	int a = sc.nextInt();
    	
    	
    	
    	
    	if(n>= size) {
    		System.out.println("Gia tri loi");
    	}else {
            int nthElement = stack.get(size - n -0);

    		System.out.println("Phan tu thu  "+ n +" 	trong Stack la :"+ nthElement);
    	}
    	
    	System.out.println("SO luong Stack la  : "+ count + "  elements");
    		
    	stack.forEach(item -> {
    	    System.out.print( +item + " ");
    	});
    	
    	System.out.println();
    	if(stack.size() >= a) {
    		 int elementToRemove = stack.get(stack.size() - a);
    		 stack.remove(stack.size() - a);
    		 
    		 System.out.println(" Da xoa phan tu : "+ elementToRemove+" khoi Stack");
    		 
    	}else {
    		System.out.println("vui long nhap lai a");
    	}
    	   System.out.println("Stack ban đầu: " + stack);
    	reverseStack(stack);
    	System.out.println("Stack sau kh dao nguoc : "+stack);
    	

    }
    

public static void reverseStack(Stack<Integer> stack) {
    Stack<Integer> tempStack = new Stack<>();
    while(!stack.isEmpty()) {
        int temp = stack.pop();
        tempStack.push(temp);
    }
    while(!tempStack.isEmpty()) {
        int temp = tempStack.pop();
        stack.push(temp);
    }
}
}