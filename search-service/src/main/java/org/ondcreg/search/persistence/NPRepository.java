package org.ondcreg.search.persistence;

import org.ondcreg.search.persistence.entity.NetworkParticipant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NPRepository extends JpaRepository<NetworkParticipant, String> {

    @Query("SELECT n FROM NetworkParticipant n JOIN n.domain d WHERE d.id = ?1")
    /*@Query("SELECT new com.example.model.NetworkParticipantData(e.firstname, e.lastname, d.name, a.city, a.state, a.zip) " +
            "FROM Department d JOIN d.emps e JOIN e.address a WHERE d.name = ?1")
    public List<EmpData> getEmpsFromDept(String name);*/
    public List<NetworkParticipant> findNPByDomain(String domainId);

}
