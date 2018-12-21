package greenfox.reddit.service;

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

}
