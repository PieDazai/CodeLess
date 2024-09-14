import java.util.Random;
public class qwee {
    public static void main(String[] args) {
int summ = 0;
int people =0;
        int []ves = new int[10];
        for (int i = 0; i < ves.length; i++) {
            ves[i]= new Random().nextInt(40, 100);
            summ += ves[i];
        }
        for (int i = 0; i < ves.length; i++) {
            if(ves[i]>=60&&ves[i]<=80){
                people++;
            }

        }
        System.out.println("средний вес: "+summ/ ves.length);
        System.out.println("колво людей: "+people);
    }
}
