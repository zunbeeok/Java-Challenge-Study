package JavaChallengeStudy.Hello.board.repository;

import JavaChallengeStudy.Hello.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardsRepository extends JpaRepository<Board,Long> {
    public Optional<Board> findById(Long id);
}
