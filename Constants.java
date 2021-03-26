public class Constants {
    /** программа, демонстрирующая использование константа */
    public static void main(String[] args){
        // Константы для посчета очков
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;

        // Подсчет очков
        int td, pat, fg, total;
        td = 4 * TOUCHDOWN;
        pat = 3 * CONVERSION;
        fg = 2 * FIELDGOAL;
        total = (td + pat + fg); // 24 + 3 + 6 = 33

        // Вывод вычесленной суммы.
        System.out.println("Всего очков: " + total);
    }
}
