package Basics;


class Car{
    String name;
    String type;
    static  Car obj;
    private  Car(String name, String type){
        obj = new Car(name,type);
    }
    static  Car createObject(String name,String type){
        if (obj == null) {
            obj = new Car(name, type);
        }
        return  obj;
    }
}
public class SingleTon {


    public static void main(String[] args) {

        Car c1 = Car.createObject("Fortune","SUV");
        Car c2 = Car.createObject("Swift Desire","new Model");
        Car c3 = Car.createObject("martin","800");



//        Car c1 = new Car();
//        Car c2 = new Car();
//        Car c3 = new Car();
    }
}
