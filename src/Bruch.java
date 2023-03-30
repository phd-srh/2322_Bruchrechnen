// immutable
public class Bruch {
    private final long zähler;
    private final long nenner;

    public Bruch(long zähler, long nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public Bruch add(Bruch b) {
        long neuerNenner = this.nenner * b.nenner;
        long neuerZähler = this.zähler * b.nenner + b.zähler * this.nenner;
        return new Bruch(neuerZähler, neuerNenner).kürze();
    }

    public Bruch kürze() {
        long teiler = ggT(zähler, nenner);
        return new Bruch( zähler/teiler, nenner/teiler );
    }

    private long ggT(long a, long b) {
        while (a != b) {
            if (a > b) a = a - b;
            else       b = b - a;
        }
        return a;
    }

    public String toString() {
        return zähler + "/" + nenner;
    }
}
