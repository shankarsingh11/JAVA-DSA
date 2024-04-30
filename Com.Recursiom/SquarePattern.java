package Com.Recursiom;

public class SquarePattern {
    public static void square(int r,int c){

        if(r==0)return;

        if (r>0 && c>0){
            System.out.print("* ");
            square(r,c-1);
        }else{
            System.out.println();
            square(r-1,4);
        }

    }

    public static void main(String[] args) {
        square(4,4);
    }
}
