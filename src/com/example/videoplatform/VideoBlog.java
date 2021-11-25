package com.example.videoplatform;
import com.example.videoplatform.interfaces.*;

import java.util.HashSet;

public class VideoBlog implements IVideoBlog {
    private String name;
    private HashSet<IVideo> videos;

    public VideoBlog(String name){
        this.name = name;
        videos = new HashSet<IVideo>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        if (name == null){
            throw new NullPointerException("Name is not specified");
        }

        return name;
    }

    public void setVideos(HashSet<IVideo> videos){
        this.videos = videos;
    }

    public HashSet<IVideo> getVideos(){
        HashSet<IVideo> newVideos = new HashSet<IVideo>();
        for(IVideo video : videos){
            newVideos.add(video);
        }

        return newVideos;
    }

    @Override
    public String toString() {
        return "VideoBlog{" +
                "name=" + name + "\'" +
                ", videos=" + videos.toString() +
                '}';
    }
}
