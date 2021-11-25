package com.example.videoplatform;
import com.example.videoplatform.interfaces.*;

public class Comment implements IComment {
    String text;
    int likes;
    int dislikes;

    public Comment(String text, int likes, int dislikes){
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getText(){
        return text;
    }

    public int getLikes(){
        return likes;
    }

    public int getDislikes(){
        return dislikes;
    }

    @Override
    public String toString() {
        return "Text: " + text + "\nLikes: " + likes + "\nDislikes: " + dislikes;
    }
}
