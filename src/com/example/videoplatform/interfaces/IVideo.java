package com.example.videoplatform.interfaces;
import com.example.videoplatform.Subject;

import java.util.HashSet;

public interface IVideo {
    String getUrl();

    String getTitle();

    int getViews();

    int getLikes();

    Subject getSubject();

    int getDislikes();

    void setComments(HashSet<IComment> comments);

    HashSet<IComment> getComments();
}
