package org.ondcreg.search.service;

import org.ondcreg.search.persistence.entity.NetworkParticipant;

import java.util.List;
import java.util.Optional;

public interface RegSearchService {

    public Optional<NetworkParticipant> getNP(String id);

    public List<NetworkParticipant> getNPByDomain(String domainId);
}
