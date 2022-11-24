package ru.mirea.krekova20;

public class Main {
    public static void main(String[] args) {
        String[] a1 = new String[]{"aa", "dffs", "sdfsfsf"};
        Integer[] a2 = new Integer[]{1,0,2,4,2,9};
        Double[] a3 = new Double[]{1.8,2.4,2.7,4.6,2.3,9.1};
        MinMax<String> ix = new MinMax<>(a1);
        System.out.println(ix.min());
        System.out.println(ix.max());

    }
}