package com.freedman.mybucketlist;

public class BucketListEntry {

    String heading;
    String description;
    int image;
    float ratingBar;


    public BucketListEntry(String heading, String description, int image, float ratingBar) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.ratingBar = ratingBar;
    }
}
