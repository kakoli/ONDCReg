package org.ondcreg.search.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "network_participant")
public class NetworkParticipant {
    @Id
    @Column(name = "id", nullable = false)
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;

    @Column(name = "api_version")
    private Integer apiVersion;

    @Column(name = "created_by", length = 36)
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "type")
    private String type;

    @Column(name = "msn", nullable = false)
    private Boolean msn = false;

    @Column(name = "source_ip")
    private String sourceIp;

    @Column(name = "updated_by", length = 36)
    private String updatedBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Column(name = "updated_source_ip")
    private String updatedSourceIp;

    @Column(name = "version")
    private Integer version;

    @Column(name = "city_code")
    private String cityCode;

    @Column(name = "status")
    private String status;

    @Column(name = "subscriber_id")
    private String subscriberId;

    @Column(name = "subscriber_url")
    private String subscriberUrl;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "domain_id", referencedColumnName="id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Domain domain;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entity_id")
    @JsonIgnore
    private EntityMaster entity;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name="network_participant_id")
    private List<SellerOnRecord> sellerList = new ArrayList<>();
}