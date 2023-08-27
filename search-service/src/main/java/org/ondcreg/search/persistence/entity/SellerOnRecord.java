package org.ondcreg.search.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "seller_on_record")
public class SellerOnRecord {
    @Id
    @Column(name = "id", nullable = false)
   // @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;

    @Column(name = "api_version")
    private Integer apiVersion;

    @Column(name = "created_by", length = 36)
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

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

    @Column(name = "encryption_public_key")
    private String encryptionPublicKey;

    @Column(name = "signing_public_key")
    private String signingPublicKey;

    @Column(name = "status")
    private String status;

    @Column(name = "subscriber_id")
    private String subscriberId;

    @Column(name = "unique_key_id")
    private String uniqueKeyId;

    @Column(name = "valid_from")
    private LocalDateTime validFrom;

    @Column(name = "valid_until")
    private LocalDateTime validUntil;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "network_participant_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private NetworkParticipant networkParticipant;*/
}