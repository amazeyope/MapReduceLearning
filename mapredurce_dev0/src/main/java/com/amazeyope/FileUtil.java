package com.amazeyope;
import java.io.File;
/**
 * Created by yope on 2017/7/9.
 */
public class FileUtil {

    public static boolean deleteDir(String path) {
        File dir = new File(path);
        if (dir.exists()) {
            for (File f : dir.listFiles()) {
                if (f.isDirectory()) {
                    deleteDir(f.getName());
                } else {
                    f.delete();
                }
            }
            dir.delete();
            return true;
        } else {
            System.out.println("文件(夹)不存在!");
            return false;
        }
    }

}