package org.example.springboard2.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnt;
    private int writer;
    private int hit;
    private String rdt;
    private String mdt;
}
