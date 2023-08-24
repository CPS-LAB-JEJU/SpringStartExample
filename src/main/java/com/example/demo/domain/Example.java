package com.example.demo.domain;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="Example")
public class Example {
    @Id
    @Column(name="id")
    @GeneratedValue
    private long id;

    @Column(name="title", nullable = false, length = 512)
    private String title;

    private String content;
}
