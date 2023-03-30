public class Main {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(3, 4);
        Bruch b3 = b1.add(b2);
        System.out.println( b3.toString() );
        System.out.println( b1.sub(b2).toString() );
        System.out.println( b1.mult(b2).toString() );
        System.out.println( b1.div(b2).toString() );

        Bruch b4 = new Bruch(1, 3);
        Bruch b5 = new Bruch(2, 5);
        Bruch b6 = b4.add(b5);
        System.out.println( b6.toString() );
        System.out.println( b4.sub(b5).toString() );
        System.out.println( b4.mult(b5).toString() );
        System.out.println( b4.div(b5).toString() );
    }
}
