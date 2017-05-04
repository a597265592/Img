package com.example.admin.img.ImageLoader;

import android.graphics.Bitmap;

/**
 * Created by admin on 2017/5/4.
 */

public interface ImageCache {
    public void put(String url, Bitmap bitmap);
    public Bitmap get(String url);
}
