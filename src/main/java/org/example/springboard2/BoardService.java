package org.example.springboard2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper mapper;

    public int insBoard(BoardEntity entity){
        return mapper.insBoard(entity);
    }

    public List<BoardEntity> selBoardList(){
        return mapper.selBoardList();
    }

    public int delBoard(BoardEntity entity){
        return mapper.delBoard(entity);
    }
}