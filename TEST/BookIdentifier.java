package TEST;

import java.util.Scanner;


public class BookIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("책의 이름을 입력하세요: ");
        String title = scanner.nextLine();

        System.out.print("저자의 이름을 입력하세요: ");
        String author = scanner.nextLine();

        System.out.print("번역가의 이름을 입력하세요: ");
        String translator = scanner.nextLine();

        String uniqueId = generateUniqueId(title, author, translator);
        System.out.println("생성된 고유 번호: " + uniqueId);
    }

    private static String generateUniqueId(String title, String author, String translator) {
        int length = title.length() + author.length() + translator.length();
        int hashCode = (title + author + translator).hashCode();

        // 고유 번호 생성
        return String.format("%d-%d", length, Math.abs(hashCode));
    }
}