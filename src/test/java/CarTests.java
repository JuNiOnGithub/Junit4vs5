import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;


public class CarTests {
    private HashMap<Integer, Car> repository = new HashMap<>();




@Before
    public void initTest() {
    System.out.println("Hello, this is the test init");
    Car car = new Car();
    car.setName("Test");
    Car car2 = new Car();
    car.setName("Test2");
    repository.put(1,car);
    repository.put(2,car2);
}

@After
    public void displayAll() {
    System.out.println(repository.toString());
}

@Test
    public void addCarInRepositoryTest() {
        Car car1 = new Car();
        car1.setName("Jaguar");
        repository.put(3,car1);
}

@Test
    public void deleteCarInRepositoryTest() {
    repository.remove(1);
}
}
