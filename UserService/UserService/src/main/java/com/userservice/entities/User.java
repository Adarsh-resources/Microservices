package com.userservice.entities;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name ="microservices")
public class User {
    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="NAME",length = 25)
    private String name;
     @Column(name="EMAIL")
    private String email;
     @Column(name="ABOUT")
    private String about;

     @Transient
     private List<Rating> ratings= new   ArrayList<>();




}