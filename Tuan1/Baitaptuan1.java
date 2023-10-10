package Tuan1;

public class Baitaptuan1 {
    public static String daoNguocchucai(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        return reversed.trim();
    }

    public static void main(String[] args) {
        String sentence = "Xin chao cac ban";
        String reversed = daoNguocchucai(sentence);
        System.out.println(reversed);
    }
}