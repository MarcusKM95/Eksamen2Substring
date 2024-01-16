import java.util.ArrayList;

public class Article {

    private String heading;
    private String body;
    private String author;


    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongesWord(){
        String[] liste = body.split(" ");
        String longestWord = " ";
        for (String ord : liste){
            if (ord.length() > longestWord.length()){
                longestWord = ord;
            }
        }
        return longestWord;
    }
    public void getWords(){
        String[] words = body.split(" ");
        for (String word : words){
            System.out.println(word);
        }
    }


}
