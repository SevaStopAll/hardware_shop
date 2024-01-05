package ru.shops.hardwareShop.service;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import ru.shops.hardwareShop.domain.HardDisk;

import java.util.List;
import java.util.Optional;

public class SimpleHardDiskService implements HardDiskService {


    public Optional<HardDisk> save(HardDisk hardDisk) {
        return Optional.of(sites.save(hardDisk));
    }

    @Transactional
    public boolean update(HardDisk hardDisk) {
        if (sites.findById(hardDisk.getId()) != null) {
            sites.save(hardDisk);
            return true;
        }
        return false;
    }


    public List<HardDisk> findAll() {
    }
}
