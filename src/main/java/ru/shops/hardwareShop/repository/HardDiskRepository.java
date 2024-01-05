package ru.shops.hardwareShop.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shops.hardwareShop.domain.HardDisk;

import java.util.List;

@Repository
public interface HardDiskRepository extends CrudRepository<HardDisk, Long> {

    @Query("select p from product p join hard_disk where product_id = p.id")
    public List<HardDisk> findAll();

}
