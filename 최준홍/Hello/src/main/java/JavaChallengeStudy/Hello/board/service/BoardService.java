package JavaChallengeStudy.Hello.board.service;



import JavaChallengeStudy.Hello.board.dto.RequestBoardDto;
import JavaChallengeStudy.Hello.board.dto.ResponseBoardDto;
import JavaChallengeStudy.Hello.board.entity.Board;
import org.springframework.stereotype.Service;


public interface BoardService {
    public ResponseBoardDto getBoardId(Long id);

    public String joinTag(RequestBoardDto requestBoardDto);

    public void join(RequestBoardDto requestBoardDto);
}
