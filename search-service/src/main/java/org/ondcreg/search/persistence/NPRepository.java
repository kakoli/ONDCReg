package org.ondcreg.search.persistence;

import org.ondcreg.search.persistence.entity.NetworkParticipant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NPRepository extends JpaRepository<NetworkParticipant, Integer> {

    @Query("SELECT n FROM NetworkParticipant n JOIN n.domain d WHERE d.id = ?1")
    public List<NetworkParticipant> findNPByDomain(Integer domainId);

    @Query("SELECT n FROM NetworkParticipant n JOIN n.domain d WHERE d.id = ?1 and " +
            "n.cityCode = ?2")
    public List<NetworkParticipant> filterNP_DomainCity(Integer domainId, String city);

}
