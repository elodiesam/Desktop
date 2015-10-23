package upo.cpo1;

public class Main {

    public static void main(String[] args) {
        SalleCinema s = new SalleCinema("Terminator", 300, 6);

        s.vendrePlace();
        s.vendrePlace();
        s.vendrePlace();
        s.vendrePlace();
        s.vendrePlace();
        System.out.println(s);
    }

}