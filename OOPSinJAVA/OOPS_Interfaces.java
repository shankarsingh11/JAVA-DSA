package OOPSinJAVA;
// interface property and implementation


// multiple inheritance possible using interfaces

interface  Herbivore{
    void eatveg();
}

interface Carbivore{
     void eatanything();
}


class Dogs implements Herbivore,Carbivore{
    public void eatanything(){
        System.out.println("Meat , Bread , Rice");
    }
    public void eatveg(){
        System.out.println("Vegetables , Fruits ");
    }

}


// interface is blueprint of class
interface  ChessPlayer{
    void moves();
}

class Queen implements  ChessPlayer{
    public  void moves(){
        System.out.println("Up,Down,Left,Right,Diagonal -(Moves in 4 direction)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Left,Right");
    }
}

class Rook implements  ChessPlayer{
    public  void  moves(){
        System.out.println("Up,Down,Left,Right,Diagonal");
    }
}
public class OOPS_Interfaces {
    public static void main(String[] args) {
//        Queen q = new Queen();
//        q.moves();
        Dogs d = new Dogs();
        d.eatanything();
        d.eatveg();

    }
}
