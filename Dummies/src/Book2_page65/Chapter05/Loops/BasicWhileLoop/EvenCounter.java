package Book2_page65.Chapter05.Loops.BasicWhileLoop;

public class EvenCounter {
    public static void main(String[] args) {
        int number = 2;
        while (number <= 20) {
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
