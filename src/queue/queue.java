package queue;

public class queue {
    int  rear = -1;
    int size;
    int array[];
    queue(int n){
        array = new int[n];
        this.size = n;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean enqueue(int data){
        if((rear+1) == size){
            System.out.println("Full");
            return false;
        }
        rear++;
        array[rear] = data;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        int front = array[0];
        for(int i = 0; i<rear; i++){
            array[i] = array[i+1];
        }
        rear--;
        return front;
    }

    public int peekFirst(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return array[0];
    }
}
