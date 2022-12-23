package com.example.FinalProjectHadi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
@Entity
@Table(name = "Question")
public class Question {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "Question_Sequence", sequenceName = "QuestionID_SEQ")
    @Column(name = "id")
    private Long id;

    @Column(name = "question")
    private String question;

    @OneToMany(mappedBy = "question_id", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<User_Question> user_questions;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_type_id", nullable = false)
    @JsonIgnore
    private Question_Type question_type;

    @OneToMany(mappedBy = "ques_id", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Shuffle_Question> shuffle_questions;

    /*@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="user_question", joinColumns = @JoinColumn(name="question", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="user", referencedColumnName = "id"))
            private Set<UserEntity> users = new HashSet<>();*/

}
