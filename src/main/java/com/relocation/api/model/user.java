package com.relocation.api.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "User")
public class User extends AbstractEntity {

    @Column(name = "userName")
    private String userName;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userPhone")
    private String userPhone;

    @Column(name = "userPassword")
    private String userPassword;

    @Column(name = "enabled")
    private boolean enabled = false;

}
