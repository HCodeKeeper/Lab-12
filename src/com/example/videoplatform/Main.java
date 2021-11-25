package com.example.videoplatform;
import com.example.videoplatform.interfaces.*;
import java.util.Random;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        //too many calls for creating a single videoBlog
        //Am I supposed to return Set<> instead of HashSet<>?
        int videoCount1 = 10;
        int commentCount1 = 100;
        Set<IVideo> videos = new HashSet<>();
        //generating videos
        for(int i=0; i < videoCount1; i++){
            IVideo video = new Video("www.url.com/something", "Video " + (i + 1), 100, 1, 9 + i, Subject.); //random values
            videos.add(video);
            Set<IComment> comments1 = new HashSet<>();
            for (int j=0; j < commentCount1; j++){
                comments1.add(new Comment("COMMENT", j, i+j)); //random values
            }
            video.setComments((HashSet<IComment>)comments1);
        }
        IVideoBlog videoBlog1 = new VideoBlog("penguinz0");
        videoBlog1.setVideos((HashSet<IVideo>) videos);
        //System.out.println(videoBlog1);

        for(IVideo video : videoBlog1.getVideos()){
            //System.out.println(video);
        }

        IUtils utils = new Utils();
        int overallViews = utils.getOverallViews(videoBlog1);
        System.out.println("VIEWS OVERALL: " + overallViews);
        HashSet<IVideo> mostDislikedVideos = utils.getMostDislikedVideos(videoBlog1.getVideos());
        System.out.println("MOST DISLIKED VIDEOS: " + mostDislikedVideos);
        boolean hasOverLikedComment =  utils.hasOverLikedComment(videoBlog1.getVideos().iterator().next());
        System.out.println("COMMENT MORE LIKED THAN THE VIDEO ITSELF " + (hasOverLikedComment ? "exist" : "doesn't exist"));
    }
}
