package com.chosun.cui.creator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CreatorService {
    private final CreatorRepository creatorRepository;

    public List<Creator> getList(){
        return this.creatorRepository.findAll();
    }
}
