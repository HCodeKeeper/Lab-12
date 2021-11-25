package com.example.videoplatform.interfaces;
import com.example.videoplatform.*;

import java.util.HashSet;

public interface IUtils {
    int getOverallViews(IVideoBlog videoBlog);

    boolean hasOverLikedComment(IVideo video);

    HashSet<IVideo> getMostDislikedVideos(HashSet<IVideo> videos);
}
