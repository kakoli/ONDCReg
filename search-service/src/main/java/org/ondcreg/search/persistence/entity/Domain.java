package org.ondcreg.search.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "domain")
public class Domain {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonIgnore
    private String id;

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

    @Column(name = "allow")
    private Boolean allow;

    @Column(name = "name")
    private String name;

}