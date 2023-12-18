import java.util.HashSet;
public class testLab7 {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();

        System.out.println("---------------------------------------ADD DATA--------------------------------------------");

        a.add("pp");
        a.add("cat");
        a.add("cow");
        a.add("dog");

        System.out.println("Size : " + a.size());

        System.out.println("Contain pp : " + a.contains("pp"));

        System.out.println("Is empty: " + a.isEmpty());

        //showข้อมูลในset a
        System.out.println("Information in the set:");
        for (String element : a) {
            System.out.println(element);
        }

        //เอามาคั่นไว้เฉยๆค่ะจะได้ดูง่ายๆ
        System.out.println("----------------------------------------REMOVE COW-------------------------------------------");


        //remove cow
        a.remove("cow");
        System.out.println("Size : " + a.size());
        System.out.println("Contain cow : " + a.contains("cow"));
        System.out.println("Is empty: " + a.isEmpty());
        System.out.println("Information in the set:");
        for (String element : a) {
            System.out.println(element);
        }



        //เอามาคั่นไว้เฉยๆค่ะจะได้ดูง่ายๆ
        System.out.println("-----------------------------------------CLEAR SET------------------------------------------");


        a.clear();
        System.out.println("Size : " + a.size());
        System.out.println("Contain pp : " + a.contains("pp"));
        System.out.println("Contain cow : " + a.contains("cow"));
        System.out.println("Contain dog : " + a.contains("dog"));
        System.out.println("Contain cat : " + a.contains("cat"));
        System.out.println("Is empty: " + a.isEmpty());
        System.out.println("Information in the set:");
        for (String element : a) {
            System.out.println(element);
        }



    }
}
