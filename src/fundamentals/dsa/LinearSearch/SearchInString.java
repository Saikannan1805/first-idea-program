package fundamentals.dsa.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Saikannan";
        String namelower = name.toLowerCase();
        String nameupper = name.toUpperCase();
        char target = 'e';
        System.out.println( Search(name,namelower,nameupper,target) );
    }

    static boolean Search (String str , String strlow , String strUp, char target) {

        if (str.length() == 0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (strlow.charAt(index) == target) {
                return true;
            } else if (strUp.charAt(index) == target) {
                return true;
            }
        }

        return false;
    }
}
