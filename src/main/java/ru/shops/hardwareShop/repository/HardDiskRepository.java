package ru.shops.hardwareShop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shops.hardwareShop.domain.HardDisk;

@Repository
public interface HardDiskRepository extends CrudRepository<HardDisk, Long> {
}
