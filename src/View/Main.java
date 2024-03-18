package View;

import kLn.Order.ControllerOrdenacao;

public class Main {
    public static void main(String[] args) {

        ControllerOrdenacao co = new ControllerOrdenacao();

        int[] v = {44, 43, 42, 41, 40, 39, 38};

        v = co.quickSort(v, 0, v.length - 1);

        for (int i: v) {

            System.out.print(i + " ");
        }


    }

}
