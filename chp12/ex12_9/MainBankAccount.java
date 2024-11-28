package chp12.ex12_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("신승아","240-111-0270",10000000);
        BankAccount b2 = new BankAccount("손현진","250-111-0270",10000000);




        try {
            File file = new File("result_account.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(b1.toString()+"\n");
            fw.write(b2.toString()+"\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
