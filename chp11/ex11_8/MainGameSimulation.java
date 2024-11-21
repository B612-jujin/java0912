package chp11.ex11_8;

public class MainGameSimulation {
    public static void main(String[] args) {

        Knight atomic = new Knight("아토믹");//휴먼
        Knight uther = new HolyKnight("우서");//신성능력
        Knight gneji = new MagicKnighr("겐지");//마법능력

        atomic.slash();
        uther.slash();
        gneji.slash();


        Healer healer1 = (HolyKnight) uther;
        Healer healer2 = new HolyKnight("우서동생");

        healer1.heal();
        healer1.recovery();
        //healer1.slash(); 힐러 인터페이스의 참조변수이므로 힐러 인터페이스를 통해 구현된 메소드만 호출할 수 있다.


        Magician magician1 = (MagicKnighr) gneji;
        magician1.magicShield();
        magician1.teleport();


        MagicKnighr magicKnighr2= new MagicKnighr("겐지동생");
        magicKnighr2.magicShield();
        magicKnighr2.teleport();
        magicKnighr2.slash();


    }
}
