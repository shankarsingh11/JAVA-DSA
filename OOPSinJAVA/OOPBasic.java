package OOPSinJAVA;

public class OOPBasic {
    // here, main function is no static
    public static void main(String[] args) {
        Box box = new Box();
        box.depth = 10;
        box.height = 30;
        box.width = 15;

        int  volume = (int)(box.depth * box.width * box.height);
        System.out.println(volume);


    }
    // here, no static class

    public  static class  Box {
        double height;
        double width;
        double depth;
    }


}
