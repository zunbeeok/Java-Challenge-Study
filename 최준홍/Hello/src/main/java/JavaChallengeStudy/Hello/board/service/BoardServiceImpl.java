package JavaChallengeStudy.Hello.board.service;

import JavaChallengeStudy.Hello.board.dto.RequestBoardDto;
import JavaChallengeStudy.Hello.board.dto.ResponseBoardDto;
import JavaChallengeStudy.Hello.board.entity.Board;
import JavaChallengeStudy.Hello.board.repository.BoardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.List;

@Service
@Transactional
public class BoardServiceImpl implements  BoardService{
    private final BoardsRepository boardsRepository;

    @Autowired
    public BoardServiceImpl(BoardsRepository boardsRepository){
        this.boardsRepository = boardsRepository;
    }

    @Override
    public ResponseBoardDto getBoardId(Long id){
        Board board = this.boardsRepository.findById(id).orElseThrow(IllegalAccessError::new);
        return ResponseBoardDto.builder()
                .id(board.getId())
                .boardName((board.getBoardName()))
                .content(board.getContent())
                .build();
    }



    @Override
    public String joinTag(RequestBoardDto requestBoardDto) {
        List<String> tagsList= requestBoardDto.getTagsList();
        return String.join(",",tagsList);
    }

    @Override
    public void join(RequestBoardDto requestBoardDto) {
        this.boardsRepository.save(requestBoardDto.mapToEntity(requestBoardDto));
    }
}
