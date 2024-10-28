package com.example.inicial1.services;

import com.example.inicial1.dtos.StatsResponse;
import com.example.inicial1.repositories.MutantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {

    private final MutantRepository dnaRepository;

    @Autowired
    public StatsService(MutantRepository dnaRepository){
        this.dnaRepository = dnaRepository;
    }

    public StatsResponse getStats(){
        long countMutantDna = dnaRepository.countByIsMutant(true);
        long countHumanDna = dnaRepository.countByIsMutant(false);
        double ratio = countHumanDna == 0 ? 0 : (double) countMutantDna / countHumanDna;
        return new StatsResponse(countMutantDna,countHumanDna,ratio);
    }

}
