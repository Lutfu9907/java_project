package Abstract_class_example;

abstract class MotorBike{
    abstract void speed();
}

class MountainBike extends MotorBike{
    public void speed(){
        System.out.println("Yavaş gider");
    }   
}

class SportsBike extends MotorBike{
    public void speed(){
        System.out.println("Hızlı gider");
    }
}

public class Main {
    public static void main(String[] args) {
        MountainBike m = new MountainBike();
        SportsBike s = new SportsBike();

        m.speed();
        s.speed();
    }
}
