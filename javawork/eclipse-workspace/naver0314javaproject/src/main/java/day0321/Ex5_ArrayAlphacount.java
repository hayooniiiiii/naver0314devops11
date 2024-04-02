package day0321;
import java.util.Scanner;

public class Ex5_ArrayAlphacount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;

        msg = sc.nextLine();
        msg = msg.toUpperCase();
        int l = msg.length();
        int[] alpha = new int[26];        

        for (int i = 0; i < l; i++) {
            char c = msg.charAt(i);
            if (Character.isLetter(c)) { // 알파벳인 경우에만 처리
                alpha[c - 'A']++;
            }
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.printf("%d", alpha[i]);
        }
    }
}
