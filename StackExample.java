import java.util.LinkedList;

// 泛型 Stack，繼承 LinkedList<T>
class MyStack<T> extends LinkedList<T> {

    // 將元素推入堆疊頂端（放在 LinkedList 的尾巴）
    public void push(T item) {
        addLast(item);
    }

    // 將堆疊頂端元素彈出並回傳
    public T pop() {
        return removeLast();   // LinkedList 內建的方法
    }

    // 檢查堆疊是否為空
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // 回傳堆疊大小
    @Override
    public int size() {
        return super.size();
    }
}

public class StackExample {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        // 這裡你可以自己加一些測試
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 20
        System.out.println(stack.pop()); // 10
        System.out.println(stack.isEmpty()); // true
    }
}

//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------
