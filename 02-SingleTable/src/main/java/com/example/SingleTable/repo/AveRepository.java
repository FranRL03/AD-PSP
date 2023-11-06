package com.example.SingleTable.repo;

import com.example.SingleTable.modals.Animal;
import org.springframework.stereotype.Repository;

@Repository
public interface AveRepository extends BaseAnimalRepository<Animal> {
}