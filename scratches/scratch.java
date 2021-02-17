
class Counter {
    static int count = 0;

    Counter(){
        System.out.println(++count);
    }
}
class Scratch {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 2
        Counter c3 = new Counter() ;// 3
        Counter c4 = new Counter(); // 4
    }
}