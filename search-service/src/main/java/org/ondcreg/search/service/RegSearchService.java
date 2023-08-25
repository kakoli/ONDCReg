package org.ondcreg.search.service;

import org.ondcreg.search.persistence.entity.NetworkParticipant;

import java.util.List;
import java.util.Optional;

public interface RegSearchService {

    public Optional<NetworkParticipant> getNP(Integer id);

    public List<NetworkParticipant> getNPByDomain(Integer domainId);
}
