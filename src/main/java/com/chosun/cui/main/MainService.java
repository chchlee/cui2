package com.chosun.cui.main;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MainService {
    private final MainRepository mainRepository;

    public List<Main> getList(){ return this.mainRepository.findAll();}
}
