package org.example.springboard2.board.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVo extends BoardEntity{
    private String writerNm;
    private String profileImg;
}
