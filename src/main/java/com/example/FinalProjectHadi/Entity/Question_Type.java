package com.example.FinalProjectHadi.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@ToString
@Entity
@Table(name = "Question_Type")
public class Question_Type {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "Question_Type_id_Sequence", sequenceName = "Question_TypeID_SEQ")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "question_type", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Question> questions;
    @OneToMany(mappedBy = "qt_id", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Shuffle_Question> shuffle_questions;
}
