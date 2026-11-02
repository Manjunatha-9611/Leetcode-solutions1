class MyCircularDeque {
    int cap;
    int front;
    int rear;
    int size;
    int arr[];

    public MyCircularDeque(int k) {
        this.cap = k;
        this.arr = new int[cap];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        // if(arr[0] != 0){
        // for(int i = rear+1;i>0;i--){
        //     arr[i]= arr[rear];
        // }
        // }
        
        front = (front-1+cap)%cap;
        arr[front] = value;
        if(size == 0){
            rear = front;
        }
        size++;
        
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        rear = (rear+1)%cap;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%cap;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear = (rear-1+cap)%cap;
        size--;
        return true;
    }

    // public boolean insertFront(int value) {
    //     if(isFull()){
    //         return false;
    //     }
    //     if(arr[0] != 0){
    //     for(int i = rear;i>0;i--){
    //         arr[i+1]= arr[i];
    //     }
    //     }
    //     front = (front-1+cap)%cap;
    //     arr[front] = value;
    //     if(size == 0) rear = front;
    //     size++;
        
    //     return true;
    // }
    
    // public boolean insertLast(int value) {
    //     if(isFull()){
    //         return false;
    //     }
    //     rear = (rear+1)%cap;
    //     arr[rear] = value;
    //     size++;
    //     return true;
    // }
    
    // public boolean deleteFront() {
    //     if(isEmpty()){
    //         return false;
    //     }
    //     front = (front+1)%cap;
    //     size--;
    //     return true;
    // }
    
    // public boolean deleteLast() {
    //     if(isEmpty()){
    //         return false;
    //     }
    //     rear = (rear-1+cap)%cap;
    //     size--;
    //     return true;
    // }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */