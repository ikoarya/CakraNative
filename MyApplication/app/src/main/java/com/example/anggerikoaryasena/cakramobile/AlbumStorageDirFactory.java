package com.example.anggerikoaryasena.cakramobile;

/**
 * Created by Anggeriko Aryasena on 10/21/2015.
 */
import java.io.File;

abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
