package chp11.ex11_5;

public class MainVehcle {
    public static void main(String[] args) {


        Vehicle vehicle = new Bicycle();
        vehicle.horn();
        vehicle.move("보광동","이태원");

        Bicycle bicycle = new Bicycle();
        bicycle.horn();
        bicycle.move("한강진","이태원");
        Bicycle.stop("맥심프랜트");

        Train train = new Train();
        train.horn();
        train.move("서울","남원");

        Vehicle.stop("대전");
    }
}
