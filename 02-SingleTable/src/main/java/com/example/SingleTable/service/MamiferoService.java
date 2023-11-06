package com.example.SingleTable.service;

import com.example.SingleTable.modals.Mamifero;
import com.example.SingleTable.repo.Mamiferorepository;
import com.example.SingleTable.service.base.BaseAnimalService;
import org.springframework.stereotype.Service;

@Service
public class MamiferoService extends BaseAnimalService<Mamifero, Mamiferorepository> {
}
