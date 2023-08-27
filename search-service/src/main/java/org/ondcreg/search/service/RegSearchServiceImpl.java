package org.ondcreg.search.service;

import org.ondcreg.search.persistence.NPRepository;
import lombok.extern.slf4j.Slf4j;
import org.ondcreg.search.persistence.entity.NetworkParticipant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class RegSearchServiceImpl implements RegSearchService {

    @Autowired
    private NPRepository npRepo;

    public Optional<NetworkParticipant> getNP(Integer id){
        Optional<NetworkParticipant> np = null;
        np = npRepo.findById(id);
        /*if(np.isPresent()) {
            if(np.get().getMsn() == true){
            }
        }*/
        return np;
    }

    public List<NetworkParticipant> getNPByDomain(Integer domainId){
        List<NetworkParticipant> npList = null;
        npList = npRepo.findNPByDomain(domainId);
        return npList;
    }

    public List<NetworkParticipant> getNPByDomainCity(Integer domainId, String city){
        List<NetworkParticipant> npList = null;
        npList = npRepo.filterNP_DomainCity(domainId, city);
        return npList;
    }

}
