package org.ondcreg.search.model;

import lombok.Builder;
import lombok.Getter;
import org.ondcreg.search.persistence.entity.NetworkParticipant;

import java.util.List;

@Getter
public class SearchGetResponse extends BaseResponse {
    private List<NetworkParticipant> npList;

    @Builder
    public SearchGetResponse(List<Error> errList, List<NetworkParticipant> npList) {
        super(errList);
        this.npList = npList;
    }
}
