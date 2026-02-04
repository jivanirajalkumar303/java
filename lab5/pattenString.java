public class pattenString {
    
public static void main(String[] args) {
    String name="jivanirajal";
    pettan(name);

}
public static void pettan(String name){
    for (int i = 0; i < name.length(); i++) {
        for (int j = 0; j <= i; j++) {
            char cu=name.charAt(j);
             System.out.print(cu);
            
        }
        System.out.println();
    }
}

}
