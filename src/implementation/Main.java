package implementation;

import definition.QuequeList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("press 1 for add element in queque\n " +
                "press 2 for remove element in queque\n " +
                "press 3 for poll element in queque\n " +
                "press 4 for element element in queque\n " +
                "press 5 for peek element in queque\n" +
                " press 6 for print queque ");
        Scanner sc = new Scanner(System.in);
        QuequeList<String> list = new QuequeList<>();
        System.out.println("first Queque is empty " + list);
        String ch = sc.nextLine();
        switch (ch) {
            case "1":
                list.add(sc.nextLine());
                System.out.println("element is added");
                break;
            case "2":
                System.out.println("removed element of queque using remove() method is " + list.remove());
                break;
            case "3":
                System.out.println("removed element of queque using poll() method is " + list.poll());
                break;
            case "4":
                System.out.println("topmost of element of queque is by using element() method is  " + list.element());
                break;
            case "5":
                System.out.println("topmost of element of queque is by using peek() method is  " + list.peek());
                break;
            case "6":
                System.out.println("new list is  " + list);
                break;
            default:
                System.exit(0);
                break;


        }
    }
}
