package Level2;

/* 
��� ������ ���������!
*/

public class JR2006F {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double TF = ((9d/5d)*celsius+32);
        //�������� ��� ��� ���
        return TF;
        
//   also works: 
//        return ((9d/5d)*celsius+32);
    }
}