package com.example.SingleTable.service.base;

import com.example.SingleTable.modals.Animal;
import com.example.SingleTable.repo.BaseAnimalRepository;

public class BaseAnimalService<T extends Animal, R extends BaseAnimalRepository<T>> extends BaseService<T,Long,R> {


}
