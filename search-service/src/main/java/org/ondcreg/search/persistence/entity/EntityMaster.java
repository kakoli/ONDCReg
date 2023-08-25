package org.ondcreg.search.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "entity")
public class EntityMaster {
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

    @Column(name = "address_of_authorised_signatory")
    private String addressOfAuthorisedSignatory;

    @Column(name = "business_address")
    private String businessAddress;

    @Column(name = "callback_url")
    private String callbackUrl;

    @Column(name = "city_code")
    private String cityCode;

    @Column(name = "country")
    private String country;

    @Column(name = "date_of_incorporation", nullable = false)
    private LocalDate dateOfIncorporation;

    @Column(name = "effective_date_of_registration")
    private LocalDateTime effectiveDateOfRegistration;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "encryption_public_key")
    private String encryptionPublicKey;

    @Column(name = "gst_number")
    private String gstNumber;

    @Column(name = "legal_entity_name")
    private String legalEntityName;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "name_as_per_pan")
    private String nameAsPerPan;

    @Column(name = "name_of_authorised_signatory")
    private String nameOfAuthorisedSignatory;

    @Column(name = "pan_number")
    private String panNumber;

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

}