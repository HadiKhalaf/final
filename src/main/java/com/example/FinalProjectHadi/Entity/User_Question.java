package com.example.FinalProjectHadi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@ToString
@Entity
@Table(name = "user_question")
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name="SAVE_GRADES",procedureName = "SAVE_GRADES",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name="grade", type= Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name="pp", type= String.class)
        })})
public class User_Question {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "User_Question_id_Sequence", sequenceName = "User_Question_ID_SEQ")
    @Column(name = "id")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private UserEntity user_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    @JsonIgnore
    private Question question_id;

    @Column(name="grade")
    private Long grade;
}
