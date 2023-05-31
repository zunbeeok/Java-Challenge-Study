package JavaChallengeStudy.Hello.board.controller;

import JavaChallengeStudy.Hello.board.dto.RequestBoardDto;
import JavaChallengeStudy.Hello.board.dto.ResponseBoardDto;
import JavaChallengeStudy.Hello.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    @GetMapping("/api/board/{id}")
    public ResponseBoardDto getBoard(@PathVariable Long id){
        return this.boardService.getBoardId(id);
    }

//    @PostMapping("/api/board/{id}")
//    public void joinBoard(@RequestBody ){
//        this.boardService.getBoardId()
//    }

    @PostMapping("/api/board")
    public void setBoard(@RequestBody RequestBoardDto requestBoardDto){
        this.boardService.join(requestBoardDto);
    }

}
