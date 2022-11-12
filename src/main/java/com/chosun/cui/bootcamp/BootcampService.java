package com.chosun.cui.bootcamp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BootcampService {

    private final BootcampRepository bootcampRepository;

    public List<Bootcamp> getList(){
        return this.bootcampRepository.findAll();
    }
}
