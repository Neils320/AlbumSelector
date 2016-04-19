package io.github.lijunguan.album.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.LoaderManager;

import java.util.ArrayList;
import java.util.List;

import io.github.lijunguan.album.model.entity.AlbumFloder;
import io.github.lijunguan.album.model.entity.ImageInfo;


/**
 * Created by lijunguan on 2016/4/8
 * email: lijunguan199210@gmail.com
 * blog : https://lijunguan.github.io
 */
public interface LoadAlbumModel {

    List<AlbumFloder> mAlbumFloderList = new ArrayList<>();

    void loadAllImage(@NonNull Context context, @NonNull LoaderManager loaderManager, @NonNull OnLoadAllImageFinish listener);

    AlbumFloder getAlbumFloder(@NonNull ImageInfo imageInfo);

    static interface OnLoadAllImageFinish {
        void onFinsh(@NonNull List<AlbumFloder> floders);
    }
}

