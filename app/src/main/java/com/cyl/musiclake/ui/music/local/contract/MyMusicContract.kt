package com.cyl.musiclake.ui.music.local.contract

import com.cyl.musiclake.base.BaseContract
import com.cyl.musiclake.data.db.Music
import com.cyl.musiclake.data.db.Playlist

interface MyMusicContract {

    interface View : BaseContract.BaseView {

        fun showSongs(songList: MutableList<Music>)

        fun showEmptyView()

        fun showPlaylist(playlists: MutableList<Playlist>)

        fun showHistory(musicList: MutableList<Music>)

        fun showLoveList(musicList: MutableList<Music>)

        fun showDownloadList(musicList: MutableList<Music>)

    }

    interface Presenter : BaseContract.BasePresenter<View> {
        fun loadSongs()

        fun loadPlaylist()
    }
}
