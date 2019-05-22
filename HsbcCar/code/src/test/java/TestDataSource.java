import hbCar.carBox.CarBox;
import hbCar.carEntiy.Car;
import hbCar.carEntiy.HbCar;
import org.junit.Test;

public class TestDataSource {
    @Test
    public void testHbcar() {
      //  Car car = new HbCar(new CarBox(3,3));
        Car car = new HbCar(4,4);
        car.move("turn");
        car.move("turn");
        car.move("turn");
        try{
            car.move("www");
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            car.move("move,2");
        }catch (Exception e){
            System.out.println(e);
        }
        car.move("turn");
        car.move("move,2");
        car.move("move,1");
    }
}
