package W02.example;

public class Sorter {

    private int[] a;
    

    public Sorter(int[] a) {
        this.a = a;
    }

    public void bubbleSort() {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swap(i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    public String plan = "";

}
