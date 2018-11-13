package counter;

public class Counter {
    int field = 0;

    public Counter () {
    }
    public Counter (int field) {
        this.field = field;
    }

    public void add(int number) {
        field += number;
    }

    public void add() {
        field++;
    }

    public void get() {
        System.out.println(field);
    }

    public void reset () {
        this.field = 0;

    }
}
