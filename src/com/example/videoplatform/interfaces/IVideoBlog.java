package com.example.videoplatform.interfaces;
import java.util.HashSet;

public interface IVideoBlog {
    String getName();

    HashSet<IVideo> getVideos();

    void setVideos(HashSet<IVideo> videos);
}
