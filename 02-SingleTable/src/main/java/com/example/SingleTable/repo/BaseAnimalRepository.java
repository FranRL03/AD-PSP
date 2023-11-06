package com.example.SingleTable.repo;

import com.example.SingleTable.modals.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseAnimalRepository<T extends Animal> extends JpaRepository<T, Long> {

}
