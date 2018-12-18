import org.junit.*;

import java.util.HashMap;


public class CarTests {
    private static HashMap<Integer, Car> repository = new HashMap<>();




@BeforeClass
// Doit être static si on souhaite @BeforeClass
    public static void initTest() {
    System.out.println("Hello, this is the test init");
    Car car = new Car();
    car.setName("Test");
    Car car2 = new Car();
    car2.setName("Test2");
    repository.put(1,car);
    repository.put(2,car2);
}

@After
    public void displayAll() {
    System.out.println("Displaying informations :");
    repository.forEach((k,v) -> System.out.println("key : "+k+" value : "+v));
}

@Test
@Ignore
    public void isVoitureVolante() {
    System.out.println("On ne passe pas ici.  :) ");
    // Assert.assertTrue(repository.get(1).isVoitureVolante());
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
