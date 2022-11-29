package com.chosun.cui.competition;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CompetitionService {

    private final CompetitionRepository competitionRepository;

    public Page<Competition> getList(int page){
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("CNumber"));
        Pageable pageable = PageRequest.of(page,10,Sort.by(sorts));
        return this.competitionRepository.findAll(pageable);
    }

}
