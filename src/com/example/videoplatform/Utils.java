package com.example.videoplatform;

import com.example.videoplatform.interfaces.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Utils implements IUtils {
    @Override
    public int getOverallViews(IVideoBlog videoBlog) {
        int overallViews = 0;
        Iterator<IVideo> it = videoBlog.getVideos().iterator();

        while(it.hasNext()){
            overallViews += it.next().getViews();
        }

        return overallViews;
    }

    @Override
    public boolean hasOverLikedComment(IVideo video) {
        boolean hasMoreLikesThanVideo = false;
        for(IComment comment : video.getComments()){
            if (comment.getLikes() > video.getLikes()){
                hasMoreLikesThanVideo = true;
                break;
            }
        }

        return hasMoreLikesThanVideo;
    }

    @Override
    public HashSet<IVideo> getMostDislikedVideos(HashSet<IVideo> videos) {
        //Very slow
        HashSet<IVideo> mostDislikedVideos = new HashSet<>();
        Iterator it = videos.iterator();
        int maxDislikes = 0;
        while(it.hasNext()){
            int localDislikes = ((IVideo)it.next()).getDislikes();
            if (localDislikes > maxDislikes){
                maxDislikes = localDislikes;
            }
        }
        it = videos.iterator();
        while(it.hasNext()){
            IVideo video = (IVideo)it.next();
            if (video.getDislikes() == maxDislikes){
                mostDislikedVideos.add(video);
            }
        }

        return mostDislikedVideos;
    }
}
