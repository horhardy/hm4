public class Main {
    public static void main(String[] args) {
        int n = 0;
        int m= 20;
        while ( n < 10 ) {
            n=n+1;
            System.out.print(n + " ");
        }

        System.out.println();

        for (m=10; 0 < m; m--) {
            System.out.print(m + " ");
        }
        System.out.println();

        // ЗАДАНИЕ 2
        int a=5;
        for (; a <= 31; a=a+7) {
            System.out.println( " Сегодня пятница," + a + " число. Необходимо подготовить отчёт!");

        }

        System.out.println();

        // ЗАДАНИЕ 3
        // Я ВЗЯЛ ГОД 2022
        int start = 1822;
        int finish = 2122;
        for (start = 1822; start < finish; start= start + 79) {
            System.out.println( start );
        };
    }
}