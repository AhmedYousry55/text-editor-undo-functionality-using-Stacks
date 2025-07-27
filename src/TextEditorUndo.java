import java.util.*;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // 1: initialize the stack array
        stack = new String[size];
        // 2: set initial top index to -1 to keep track of the top element to prevent edge cases
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        int lastItem = stack.length-1;
        // 3: check if the stack is full
        if (top == lastItem){
            // 4: print message if the stack is full
            System.out.println("The stack is full");
        }else{
            // 5: increment top and add action to the stack
            stack[++top] = action;
            // 6: print confirmation message
            System.out.println(action + " Added to the stack");
        }




    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        // 7: Check if the stack is empty to prevent underflow
        String poppedValue = null;
        if (top == -1) {
            // 8: Print message if the stack is empty and return null
            System.out.println("The stack is empty");
        } else {
            // 9: Retrieve and remove the top action from the stack
            poppedValue = stack[top--];
            // 10: Print confirmation message, return and replace empty string with the undone action
            System.out.println(poppedValue + " popped from the stack");

        }
        return poppedValue;
    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // 11: Check if the stack is empty to prevent under flow
        if (top == -1){
            // 12: Print message if the stack is empty and return null
            System.out.println("The stack is empty");
            return null;
        }else{
            //  13: Return a string with the most recent action without removing it
            String topElement = stack[top];
            return topElement;
        }

    }

    // Method to display all actions in the stack
    public void display() {
        // 14: Check if the stack is empty
        if (top ==-1){
            // 15: Print message if the stack is empty
            System.out.println("The stack is empty");

        }else{
            // 16: Iterate through the stack and print each action
            for(int i = 0 ;i<=top;i++){
                System.out.print("The stack contains " + stack[i] + " ");

            }
            // 17: Print a new line after displaying all actions
            System.out.println();
        }




    }
}
