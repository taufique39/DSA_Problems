class MyCircularDeque {
    int[] arr;
    int count;
    int maxSize;
    int head;

    public MyCircularDeque(int k) {
        arr = new int[k];
        count = 0;
        maxSize = k;
        head = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        head = (head - 1 + maxSize) % maxSize;
        arr[head] = value;
        count++;

        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        arr[(head + count) % maxSize] = value;
        count++;

        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        head = (head + 1) % maxSize;
        count--;

        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        count--;

        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return arr[head];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return arr[(head + count - 1) % maxSize];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
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