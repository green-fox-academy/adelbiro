package greenfox.reddit.repository;

import greenfox.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
  Iterable<Post> findTop10ByScoresOrderByScores(int score);

  //public Iterable<Post> findAllByTitleOrPostBodyOrderByScores(String title, String desc);

  Iterable<Post> findPostsByTitleContainingOrPostBodyContainingOrderByScores(String title, String text);
}
