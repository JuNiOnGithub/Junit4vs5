import org.springframework.stereotype.Controller;


@Controller
public class CarController {
    private CarRepository repository;

    public CarController(CarRepository repository) { this.repository = repository; }


    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Car addCarByName(String name) {
        Car car = new Car();
        car.setName(name);
        repository.save(car);
        return car;
    }

    public void updateNameOfCarById(Long id, String name) {
        Car car = repository.findById(id).get();
        car.setName(name);
    }

    public Car getNameOfCarById(Long id) {
        return repository.findById(id).get();
    }

}
