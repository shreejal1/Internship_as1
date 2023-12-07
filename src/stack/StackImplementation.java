package stack;


public class StackImplementation {
    int[] array;
    int top;
    final int size;

    public StackImplementation(int size) {
        this.size = size;
        array = new int[this.size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(int input) {
        if((top+1) >= this.size){
            return false;
        }else {
            array[++top] = input;
            return true;
        }
    }

    public boolean pop(){
        if(isEmpty()){
            return false;
        }else {
            System.out.println(array[top]);
            top--;
            return true;
        }
    }

    public int peek(){
        if (isEmpty()){
            return 0;
        }else{
            return array[top];
        }
    }
}
