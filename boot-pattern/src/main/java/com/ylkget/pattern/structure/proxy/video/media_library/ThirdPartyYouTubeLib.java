package com.ylkget.pattern.structure.proxy.video.media_library;

import java.util.HashMap;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 09:49
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
