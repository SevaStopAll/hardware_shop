package ru.shops.hardwareShop.repository;

import org.springframework.data.repository.CrudRepository;
import ru.shops.hardwareShop.domain.Laptop;

public interface LaptopRepository extends CrudRepository<Laptop, Long> {
}
