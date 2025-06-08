public class SoupKochenApp {
    static int potato = 0;

    static final long POTATOSIZE = 100000;

    public static void main(String[] args) {
        Thread kolya = new Thread(() -> {
            for (int i = 0; i < POTATOSIZE; i++) {
                addPotato();
            }
            System.out.println(potato);
        });
        kolya.start();

        Thread petya = new Thread(() -> {
            for (int i = 0; i < POTATOSIZE; i++) {
                addPotato();
            }
            System.out.println(potato);

        });
        petya.start();

    }
    synchronized static void addPotato() {
        potato++;
    }
}
