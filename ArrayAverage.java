public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int count = 0;

        try {
            for (int i = 0; i <= arr.length; i++) {  // Обратите внимание на "<=" вместо "<"
                sum += arr[i];
                count++;
            }
            double average = (double) sum / count;
            System.out.println("Среднее арифметическое: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Выход за границы массива.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверные данные в массиве.");
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершена.");
        }
    }
}