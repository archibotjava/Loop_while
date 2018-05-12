package whl;
// тут все как обычно. Либры
import java.io.*;
import java.util.*;

public class wh {
//А здесь собсна сама магия и происходит. Пока x миньше либо равен 9 выводится SOP и
// x инкрементируется. Цикл с предусловием
        void wh (int x){
       while (x<=9){
           System.out.println("Короче вывод и идет дикрементация");
           x++;
       }
   }
    public static void main(String[] args) {
       wh res =new wh();
       Scanner in = new Scanner(System.in);
       System.out.println("Введите X кароч и будет маджик =)");
       int t = in.nextInt();
       res.wh(t);
    }
}
