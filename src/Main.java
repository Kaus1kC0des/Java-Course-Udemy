import abstractKeyword.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("Blue", 2.4, 5.34);

        Object obj = new Object(){

            @Override
            public String toString(){
                System.out.println("Anonymous class method!");
                return "";
            }
        };
        obj.toString();

    }
}