package ru.shops.hardwareShop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shops.hardwareShop.domain.Monitor;

@Repository
public interface MonitorRepository extends CrudRepository<Monitor, Long> {

}
