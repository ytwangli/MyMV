package com.demo.zk.mymv.siteapi;

import android.support.v4.util.ArrayMap;

import com.demo.zk.mymv.model.SCAlbum;
import com.demo.zk.mymv.model.SCChannel;
import com.demo.zk.mymv.model.SCChannelFilter;
import com.demo.zk.mymv.model.SCVideo;

/**
 * Created by fire3 on 14-12-26.
 */
abstract public class BaseSiteApi {
    abstract public void doSearch(String key, OnGetAlbumsListener listener);

    /* pageNo start from 1 */
    abstract public void doGetAlbumVideos(SCAlbum album, int pageNo, int pageSize,  OnGetVideosListener listener);

    abstract public void doGetAlbumDesc(SCAlbum album, OnGetAlbumDescListener listener);
    abstract public void doGetVideoPlayUrl(SCVideo video, OnGetVideoPlayUrlListener listener);

    /* pageNo start from 1 */
    abstract public void doGetChannelAlbums(SCChannel channel, int pageNo, int pageSize, OnGetAlbumsListener listener);
    abstract public void doGetChannelAlbumsByFilter(SCChannel channel, int pageNo, int pageSize, SCChannelFilter filter, OnGetAlbumsListener listener);
    abstract public void doGetChannelFilter(SCChannel channel, OnGetChannelFilterListener listener);

}
