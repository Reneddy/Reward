public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных и параметров программы
        // начальный счет:
        int initialAmount = 500;
        // сумма пополнения
        int add = 5000;
        int bonus;


        // Условным оператором проверяем, превысила ли
        // сумма пополнения порог
        if (add > 1000) {
            // и для этих двух разных
            // сценариев рассчитываем сумму бонуса
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        // и итоговый счет
        int finalAmount = initialAmount + add + bonus;
        // выводим на экран результат
        System.out.println("Итоговый счет: " + finalAmount);
        System.out.println("Бонусы: " + bonus);
    }
}
