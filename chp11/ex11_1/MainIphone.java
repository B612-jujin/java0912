package chp11.ex11_1;

public class MainIphone {
    public static void main(String[] args) {

        //업개스팅된 경우에 참조변수는 부모에서 오버라이딩 된 부분만 사용할 수 있다.
        Phone p = new iPhone();
/*        p.callPhone("1010 122");
        p.receivePhone("02-111-5555");*/

        iPhone i = new iPhone();
        i.beep();
        i.callPhone("02-111-5555");
        i.playMusic("APT");
        i.snadAirdrop("사진");
        i.sandMessage("오늘 수능 대박나라~ ");

// 이미 생성된 객체의 참조 값을 이용해서 업캐스팅이 가능하다.
        Alarm alarm = i;
        alarm.beep();
        alarm.playMusic("Sticky");

        //한번 업케스팅된 경우에는 더 업케스팅이 되지 않는다.
//        Alarm alarm2 = p;

    }
}
