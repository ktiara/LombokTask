public class Main {

    public static void main(String[] args) {


        CarData car1 = new CarData(
                "New", "Tesla", 2020, 350000, "White", 8
        );

        CarData car2 = new CarData(
                "New", "Tesla", 2023, 202300, "Grey", 2
        );

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getColor());

        car1.setColor("black");

        System.out.println("Are these objects equal? "
                + car1.equals(car2));

        System.out.println("HashCode 1: " + car1.hashCode());
        System.out.println("HashCode 2: " + car2.hashCode());
    }
}