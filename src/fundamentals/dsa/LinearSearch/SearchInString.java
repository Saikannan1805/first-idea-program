package fundamentals.dsa.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Saikannan";
        char target = 'n';
        System.out.println(Search(name , target));
    }

    static boolean Search (String str , char target) {

        if (str.length() == 0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == target) {
                return true;
            }
        }

        return false;
    }
}
