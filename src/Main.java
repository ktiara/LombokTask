public class Main {

    public static void main(String[] args) {


        CarData car1 = new CarData(
                "GLE", "Mercedes", 2020, 350000, "white", 5
        );

        CarData car2 = new CarData(
                "GLC", "Mercedes", 2023, 200000, "silver", 3
        );

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getColor());

//            int year = car1.getYear();

        car1.setColor("black");

        System.out.println("Are these objects equal? "
                + car1.equals(car2));

        System.out.println("HashCode 1: " + car1.hashCode());
        System.out.println("HashCode 2: " + car2.hashCode());
    }
}