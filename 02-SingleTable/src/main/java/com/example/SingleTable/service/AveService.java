package com.example.SingleTable.service;

import com.example.SingleTable.modals.Animal;
import com.example.SingleTable.repo.AveRepository;
import com.example.SingleTable.service.base.BaseAnimalService;
import org.springframework.stereotype.Service;

@Service
public class AveService extends BaseAnimalService<Animal, AveRepository> {
}
