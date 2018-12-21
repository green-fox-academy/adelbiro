package greenfox.reddit.controller;

import greenfox.reddit.model.Post;
import greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {


  PostService postService;

  @Autowired
  public PostController(PostService service) {
    this.postService = service;
  }

  @GetMapping("/")
  public String main(Model model) {
    model.addAttribute("posts", postService.getAllPosts());
    return "main";
  }

  @GetMapping("/add")
  public String createPost(Model model) {
    model.addAttribute("post", new Post());
    return "new";
  }

  @PostMapping("/add")
  public String createPost(@ModelAttribute Post post) {
    postService.addPost(post);
    return "redirect:/";
  }

  @GetMapping("/search")
  public String search(@RequestParam(value = "text", required = false) String text, Model model) {
    model.addAttribute("posts", postService.search(text));
    return "main";
  }

}
