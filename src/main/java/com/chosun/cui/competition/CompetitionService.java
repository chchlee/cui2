package com.chosun.cui.competition;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CompetitionService {

    private final CompetitionRepository competitionRepository;

    public List<Competition> getList(){
        return this.competitionRepository.findAll();
    }
}
