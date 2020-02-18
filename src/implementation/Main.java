package implementation;

import definition.QuequeList;

public class Main {
    public static void main(String[] args) {
        QuequeList<String> list = new QuequeList<>();
        //System.out.println(list);
        //System.out.println(list.poll());
        System.out.println(list.peek());
        System.out.println(list.element());
        list.add("ankit");
        list.add("akash");
        list.add("mahatma");
        //list.add("gandhi", 3);

        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list.element());


        System.out.println(list);

        //System.out.println(list.peek());
        //System.out.println(list);

        //System.out.println(list.poll());
        //System.out.println(list);
        //System.out.println(list);
    }
}
