package com.javabrains.learningproject.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class catalogItem {
    private String movieName;

    private String movieDescription;
    private int  rating;

}

