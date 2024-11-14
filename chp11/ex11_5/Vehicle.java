package chp11.ex11_5;

public interface Vehicle {
    void horn();
    default public void move(String from, String to) {
        System.out.println(from + " 에서 " + to+"으로");
    }

    static public void stop(String place) {
        System.out.printf("%s 에 멈춰섰다.\n",place);
    }
}
