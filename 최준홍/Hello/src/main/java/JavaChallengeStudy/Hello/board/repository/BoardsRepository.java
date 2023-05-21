package JavaChallengeStudy.Hello.board.repository;

import JavaChallengeStudy.Hello.board.entity.Boards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardsRepository extends JpaRepository<Boards,Long> {
}
