package greenfox.reddit.service;

import greenfox.reddit.model.Post;
import greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  PostRepository postRepo;

  @Autowired
  public PostService(PostRepository postRepo) {
    this.postRepo = postRepo;
  }

  public Iterable<Post> getAllPosts() {
    return postRepo.findAll();
  }

  public void addPost(Post newPost) {
    postRepo.save(newPost);
  }

  public Iterable<Post> search(String text) {
    if (text != null) {
      return postRepo.findPostsByTitleContainingOrPostBodyContainingOrderByScores(text, text);
    } else return getAllPosts();
  }
}
