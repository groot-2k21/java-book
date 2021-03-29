public class Logic {
    public static void main(String[] args){
        boolean yes = true;
        boolean no = false;

        System.out.println("Результат выражения yes и yes: " + (yes && yes));
        System.out.println("Результат выражения yes и no: " + (yes && no));
        System.out.println("Результат выражения yes или yes: " + (yes || yes));
        System.out.println("Результат выражения yes или no: " + (yes || no));
        System.out.println("Результат выражения no или no: " + (no || no));

        System.out.println("Первоначальное значение переменной yes: " + yes);
        System.out.println("Инвертированное значение переменной yes: " + !yes);
    }
}