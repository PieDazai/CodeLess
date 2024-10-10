package Wine;
import java.time.LocalDate;

import java.time.LocalDate;

public class Main {
        public static void main (String[] args) {
            Wine wine = new Wine("Водка", "Очень редко вино",
                    LocalDate.of(2001, 1,1), "США","Три Богатыря");

            System.out.println(wine.getNameWine());
        }
    }

