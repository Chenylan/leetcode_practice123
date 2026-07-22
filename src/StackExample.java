import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        // 使用 Deque 接口，用 ArrayDeque 实现来创建一个栈
        Deque<String> stack = new ArrayDeque<>();

        // 1. 压栈 (Push)
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");
        System.out.println("当前栈: " + stack); // 输出: [Charlie, Bob, Alice]

        // 2. 查看栈顶 (Peek)
        String topElement = stack.peek();
        System.out.println("栈顶元素: " + topElement); // 输出: Charlie
        System.out.println("Peek 后栈内容: " + stack); // 输出: [Charlie, Bob, Alice]

        // 3. 弹栈 (Pop)
        String poppedElement = stack.pop();
        System.out.println("弹出的元素: " + poppedElement); // 输出: Charlie
        System.out.println("Pop 后栈内容: " + stack); // 输出: [Bob, Alice]

        // 4. 再次弹栈和查看
        System.out.println("再次弹出: " + stack.pop()); // 输出: Bob
        System.out.println("现在栈顶是: " + stack.peek()); // 输出: Alice
        System.out.println("栈是否为空? " + stack.isEmpty()); // 输出: false

        // 5. 清空栈
        stack.pop();
        System.out.println("栈是否为空? " + stack.isEmpty()); // 输出: true

        // 尝试对空栈进行 pop 操作会抛出异常
        // stack.pop(); // 这会抛出 NoSuchElementException
    }
}