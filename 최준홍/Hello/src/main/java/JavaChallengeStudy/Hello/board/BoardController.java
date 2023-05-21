package JavaChallengeStudy.Hello.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @GetMapping("/api/board/{id}")
    public void getBoard(){

    }

    @PostMapping("/api/board/{id}")
    public void joinBoard(@RequestBody ){

    }

}
