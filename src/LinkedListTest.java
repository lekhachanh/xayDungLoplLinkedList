public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(1, 6);
        list.add(2, 3);
        list.add(3, 4);
        list.add(1, 9);
        list.add(2, 3);
        list.add(3, 4);
        System.out.println(list.size());
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.get(2));
        System.out.println(list.getFisrt());
        System.out.println(list.getLast());
        LinkedList<Integer> newlist = (LinkedList<Integer>) list.clone();
    }
}
