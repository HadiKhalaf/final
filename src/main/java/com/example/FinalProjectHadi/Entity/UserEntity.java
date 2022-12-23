package com.example.FinalProjectHadi.Entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@ToString
@Entity
@Table(name = "UserEntity")
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name="PROCEDURE1",procedureName = "PROCEDURE1",
        parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name="dob", type= Date.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name="name", type= String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name="email", type= String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name="password", type= String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name="school_name", type= String.class)
})})
public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "UserEntity_id_Sequence", sequenceName = "UserEntity_ID_SEQ")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "date_of_birth")
    private Date dob;

    @Column(name="school_name")
    private String school;

    @OneToMany(mappedBy = "user_id", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<User_Question> user_questions;

    @OneToMany(mappedBy = "userid", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Shuffle_Question> shuffle_question;
}
