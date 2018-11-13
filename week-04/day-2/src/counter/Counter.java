package counter;

public class Counter {
    int field = 0;
    int origiInt = field;

    public Counter () {
    }
    public Counter (int field) {
        this.field = field;
        this.origiInt = field;
    }

    public void add(int number) {
        field += number;
    }

    public void add() {
        field++;
    }

    public int get() {
        return field;
    }

    public void reset () {
        if (origiInt == 0) {
            this.field = 0;
        } else {
            this.field = this.origiInt;
        }
    }
}
