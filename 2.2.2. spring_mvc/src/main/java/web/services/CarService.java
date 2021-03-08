package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carsList = new ArrayList<>();

    public List<Car> returnListCar(int count) {
        if (count > carsList.size())
            count = carsList.size();

        List<Car> returnCarsList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            returnCarsList.add(carsList.get(i));
        }
        return returnCarsList;
    }

    @PostConstruct
    public void createDefaultCarsList() {
        Car car1 = new Car();
        car1.setName("Lada");
        car1.setModel("Ptiora");
        car1.setVersion(1213);

        Car car2 = new Car();
        car2.setName("Kia");
        car2.setModel("Sorento");
        car2.setVersion(234);

        Car car3 = new Car();
        car3.setName("Ford");
        car3.setModel("Mustang");
        car3.setVersion(34);

        Car car4 = new Car();
        car4.setName("Uaz");
        car4.setModel("Patriot");
        car4.setVersion(45);

        Car car5 = new Car();
        car5.setName("Niva");
        car5.setModel("Shevrolet");
        car5.setVersion(66);

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
    }

}
