public class String_countVoiledWorld53 {
    public static void main(String[] args) {
        String s[] = {"pay", "attre", "practice", "attend"};
        String pref = "at";
        int count = 0;
        for (int i = 0; i <s.length; i++) {
            if (s[i].startsWith(pref)){
                count++;
            }
        }
        System.out.println(count);
    }
}
