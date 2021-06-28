package utils;

import java.io.File;

public class PathFileUtils {

    public static String getAbsolutePath(String myFilePath) {
        File file = new File(myFilePath);
        return file.getAbsolutePath();
    }

}
