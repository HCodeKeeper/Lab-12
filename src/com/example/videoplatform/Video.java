package com.example.videoplatform;

import com.example.videoplatform.interfaces.*;

import java.util.HashSet;

public class Video implements IVideo{
    private String url;
    private String title;
    private int views;
    private int likes;
    private int dislikes;
    private Subject subject;
    private HashSet<IComment> comments;
    //Issue! It's possible to write different instances of video with the same url
    public Video(String url, String title, int views, int likes, int dislikes, Subject subject ){
        this.url = url;
        this.title = title;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
        this.subject = subject;
        setComments(new HashSet<IComment>());
    }

    public String getTitle(){
        return title;
    }

    public String getUrl(){
        return url;
    }

    public Subject getSubject(){
        return subject;
    }

    public int getViews(){
        return views;
    }

    public int getLikes(){
        return likes;
    }

    public int getDislikes(){
        return dislikes;
    }

    public HashSet<IComment> getComments(){
        HashSet<IComment> newComments = new HashSet<IComment>();
        for(IComment comment : comments){
            newComments.add(comment);
        }
        return newComments;
    }

    public void setComments(HashSet<IComment> comments){
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "url: " + this.url + "\nTitle: " + this.title + "\nViews: " + this.views + "\nLikes: " +
                this.dislikes + "\nDislikes: " + this.dislikes ;
    }
}
