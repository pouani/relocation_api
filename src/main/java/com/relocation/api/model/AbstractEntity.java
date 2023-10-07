package com.relocation.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "creationDate")
    private Instant creationDate;

    @Column(name = "updatedDate")
    private Instant updatedDate;

    @PrePersist
    void prePersist(){
        creationDate = Instant.now();
        updatedDate = Instant.now();
    }

    @PreUpdate
    void preUpdate(){
        updatedDate = Instant.now();
    }

}
