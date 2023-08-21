package org.ondcreg.search.persistence;

import org.ondcreg.search.model.NetworkParticipantData;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NetworkParticipantMapper implements RowMapper<NetworkParticipantData> {

    @Override
    public NetworkParticipantData mapRow(ResultSet rs, int rowNum) throws SQLException {
        NetworkParticipantData networkParticipantData = NetworkParticipantData.builder()
                        .createdBy(rs.getString("created_by"))
                        .build();

        return networkParticipantData;
    }
}
