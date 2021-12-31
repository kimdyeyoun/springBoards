package org.example.springboard2.board;

import org.apache.ibatis.annotations.Mapper;
import org.example.springboard2.board.model.BoardEntity;
import org.example.springboard2.board.model.BoardVo;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> selBoardList();
    BoardVo selBoard(BoardEntity entity);
    int insBoard(BoardEntity entity);
    int delBoard(BoardEntity entity);
    int updBoard(BoardEntity entity);
}
