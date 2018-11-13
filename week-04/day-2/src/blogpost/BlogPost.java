package blogpost;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    BlogPost(String author, String title, String content, String publicationDate) {
        this.authorName = author;
        this.title = title;
        this.text = content;
        this.publicationDate = publicationDate;
    }
}
