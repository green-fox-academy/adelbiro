public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String url1 = url.substring(0,4);
        String url2 = url.substring(5);
        url = url1 + ":" + url2;
        url = url.replace("bots", "odds");
        System.out.println(url);


        
    }
}