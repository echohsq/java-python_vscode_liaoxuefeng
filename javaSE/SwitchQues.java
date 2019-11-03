public class SwitchQues{
    public static void main(String[] args){
        //Exception in thread "main" java.lang.NullPointerException
        String param = null;
        switch (param) {
            case "null":
            
                System.out.println("null");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
