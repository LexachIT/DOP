import java.util.Random;
public class Main {
    public static void main(String[] args) {
        final int n = 10000; // Максимальное количество элементов
        int[] numbers = new int[n];
        Random random = new Random();
        // Генерация случайной последовательности целых чисел от 0 до 100
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(101); // Генерируем случайное число от 0 до 100
        }
        int maxSumOfSquares = Integer.MIN_VALUE;
        // Поиск максимальной суммы квадратов двух элементов
        for (int i = 0; i < n; i++) {
            for (int j = i + 10; j < n; j++) {
                int sumOfSquares = numbers[i] * numbers[i] + numbers[j] * numbers[j];
                if (sumOfSquares > maxSumOfSquares) {
                    maxSumOfSquares = sumOfSquares;
                }
            }
        }
        System.out.println("Максимальная сумма квадратов двух элементов: " + maxSumOfSquares);
    }
}