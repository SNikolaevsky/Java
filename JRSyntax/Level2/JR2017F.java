package Level2;

/* 
ћинимум двух чисел
*/
public class JR2017F {
    public static int min(int a, int b) {
        //напишите тут ваш код
        int m = min(a, b);
//        int min = min();
        if (a < b)
            m = a;
            else
            m = b;
//        m = min();
        return m;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}