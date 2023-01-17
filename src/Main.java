import java.util.Objects;
import java.util.Stack;

public class Main {
    public static boolean isStackEquals(Stack<Integer> first, Stack<Integer> second) {
        Stack<Integer> tmp = new Stack<>();
        int tmp1;
        int tmp2;
        /*
        boolean equals = true;
        int counter = 0;
        while (!first.isEmpty() && !second.isEmpty()) {
            tmp1 = first.pop();
            tmp2 = second.pop();
            if (tmp1 != tmp2) equals = false;
            tmp.push(tmp1);
            tmp.push(tmp2);
        }
         */
        boolean equals = true;
        if(first.size()!=second.size()) return false;
        else {
            while (!first.isEmpty()) {
                tmp1 = first.pop();
                tmp2 = second.pop();
                if(tmp1!=tmp2) equals = false;
                tmp.push(tmp1);
                tmp.push(tmp2);
            }
            while (!tmp.isEmpty()) {
                second.push(tmp.pop());
                first.push(tmp.pop());
            }
            return equals;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        for(int i = 0; i<5; i++) {
            first.push(i);
            second.push(i);
        }
        second.pop();
        second.push(1);
        System.out.println(isStackEquals(first, second));
        System.out.println(first);
        System.out.println(second);
    }
}