package com.ylkget.pattern.structure.proxy.video.media_library;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 09:48
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
