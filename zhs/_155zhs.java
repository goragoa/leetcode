import java.util.ArrayList;

public class _155zhs {
    ArrayList<Integer> array = new ArrayList<>();
    ArrayList<Integer> minIndex = new ArrayList<>();
    int minValue = Integer.MAX_VALUE;

    public void push(int x) {
        array.add(x);
        if (x <= minValue) {
            minIndex.add(array.size() - 1);
            minValue = x;
        } else {
            minIndex.add(minIndex.get(minIndex.size() - 1));
        }
    }

    public void pop() {
        if (array.size() == 1) {
            minValue = Integer.MAX_VALUE;
        }else{
            minValue = array.get(minIndex.get(minIndex.size() - 2));
        }
        array.remove(array.size() - 1);
        minIndex.remove(minIndex.size() - 1);
    }

    public int top() {
        return array.get(array.size() - 1);
    }

    public int getMin() {
        return array.get(minIndex.get(minIndex.size() - 1));
    }

    public static void main(String[] args) {
        _155zhs obj = new _155zhs();
        obj.push(2147483646);
        obj.push(2147483646);
        obj.push(2147483647);
        obj.top();
        obj.pop();
        obj.getMin();
        obj.pop();
        obj.getMin();
        obj.pop();
        obj.push(2147483647);
        obj.top();
        obj.getMin();
        obj.push(-2147483648);
        obj.top();
        obj.getMin();
        obj.pop();
        obj.getMin();
    }
}