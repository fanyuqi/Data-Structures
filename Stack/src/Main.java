public class Main {

    public static void main(String[] args) {
	    ArrayStack<Integer> stack = new ArrayStack<>();
	    for (int i=0 ; i < 5 ; i ++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
	    System.out.println(stack);
//        stack.push("a");
//        stack.push(1);
//        stack.push(2);
//        stack.push(7);
//        System.out.println(stack);
    }
}
