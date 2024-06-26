package com.cisco.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Town implements Serializable {
    private Long id;
    private String code;
    private String article;
    private String name;
//    private String local;
}
