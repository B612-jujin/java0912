package chp12.ex12_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainBankAccountReader {

    public static void main(String[] args) {

        File file = new File("result_account.txt");

        try {
            FileReader fr = new FileReader(file);//에러처리 필요
            int ch;
            while((ch = fr.read()) != -1){ //이친구도 필요
                System.out.printf("%c",(char)ch);
                Thread.sleep(200);
            }
            fr.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
