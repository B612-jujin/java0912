package chp11.ex11_1;

public class iPhone implements Phone, Alarm,Messenger {

    @Override
    public void playMusic(String music) {
        System.out.println(music+"음악을"+PROUDUCT_NAME+"Music으로 재생한다.");
    }

    @Override
    public void beep() {
        System.out.println("beep음이 삐삐삐삐 발생한다.");

    }

    @Override
    public void sandMessage(String content) {
        System.out.println(content+"메시지를 전송한다.");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content+"메시지를 받는다.");
    }

    @Override
    public void callPhone(String PhoneNumber) {
        System.out.println(PhoneNumber+" 로 전화를 건다.");
    }

    @Override
    public void receivePhone(String PhoneNumber) {
        System.out.println(PhoneNumber+"의 전화를 받는다.");
    }

    public void snadAirdrop(String content){
        System.out.println("에어드롭으로 "+content+"를(을) 전송하였습니다.");
    }

    public void receiveAirdrop(String content){
        System.out.println("에어드롭으로 "+content+"를(을) 받았습니다.");
    }
}
