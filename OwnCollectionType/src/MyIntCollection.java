import java.util.ArrayList;

public class MyIntCollection extends ArrayList<Integer> {

    private int smallestInt;
    private int largestInt;
    private int total;


    public MyIntCollection() {
        //utilizamos super() para aprovechar el código base del constructor original
        //aunque esta implícita para los constructores de una clase derivada
        super();
        total = 0;
    }

    // método publico sobreescrito
    public boolean add(int i) {

        if (this.isEmpty()) {
            smallestInt = i;
            largestInt = i;
        } else {
            if (i < smallestInt) smallestInt = i;
            if (i > largestInt) largestInt = i;
        }

        total = total + i;
        // regresamos el valor llamando al método original de la clase extendida
        return super.add(i);
    }


    public int getSmallestInt() {
        return smallestInt;
    }

    public int getLargestInt() {
        return largestInt;
    }

    public double getAverage() {
        return ((double) total) / ((double) this.size());
    }
}
