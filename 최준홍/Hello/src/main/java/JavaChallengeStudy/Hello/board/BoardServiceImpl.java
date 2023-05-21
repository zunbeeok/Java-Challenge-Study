package JavaChallengeStudy.Hello.board;

import JavaChallengeStudy.Hello.board.repository.BoardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl {
    private final BoardsRepository boardsRepository;

    @Autowired
    public BoardServiceImpl(BoardsRepository boardsRepository){
        this.boardsRepository = boardsRepository;
    }
}
