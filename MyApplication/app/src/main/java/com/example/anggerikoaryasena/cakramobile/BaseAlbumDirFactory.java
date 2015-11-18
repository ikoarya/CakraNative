package com.example.anggerikoaryasena.cakramobile;

/**
 * Created by Anggeriko Aryasena on 10/19/2015.
 */

import android.os.Environment;

import java.io.File;

public final class BaseAlbumDirFactory extends AlbumStorageDirFactory {

    // Standard storage location for digital camera files
    private static final String CAMERA_DIR = "/dcim/";

    @Override
    public File getAlbumStorageDir(String albumName) {
        return new File (
                Environment.getExternalStorageDirectory()
                        + CAMERA_DIR
                        + albumName
        );
    }
}
