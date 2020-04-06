package Level2;


/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double moon = (earthWeight*0.17);
        return moon;
        //напишите тут ваш код
    }
}