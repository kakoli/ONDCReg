package org.ondcreg.search.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NetworkParticipantData {
    private String createdBy;
    private String createdOn;
    private String type;
    private Boolean msn;
    private String cityCode;
    private String status;
    private String subscriberId;
    private String subscriberUrl;
}
