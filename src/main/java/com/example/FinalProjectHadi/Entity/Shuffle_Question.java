package com.example.FinalProjectHadi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table(name = "Shuffle_Question")
public class Shuffle_Question {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "Shuffle_Question_id_Sequence", sequenceName = "Shuffle_Question_ID_SEQ")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "qt_id")
    @JsonIgnore
    private Question_Type qt_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ques_id", nullable = false)
    @JsonIgnore
    private Question ques_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userid", nullable = false)
    @JsonIgnore
    private UserEntity userid;

}
