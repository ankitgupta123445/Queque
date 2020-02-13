package implementation;

import definition.QuequeList;

public class Main {
    public static void main(String[] args) {
        QuequeList<String> list = new QuequeList<>();
        list.add("ankit");
        list.add("akash");
        list.add("gandhi", 2);
        list.remove();
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list.element());
        //System.out.println(list);
    }
}
