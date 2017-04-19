import java.io.File;

/**
 * Created by Pantho on 2017-03-29.
 */
public class Filemanipulation {

    public static void main(String[] args) {

        String home= System.getProperty("user.home");
        System.out.println(home);

        System.out.println(
                System.getProperty("java.io.tmpdir"));

        System.out.println(System.getenv("PATH"));

        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("os.version"));

        String tmpDir = System.getProperty("java.io.tmpdir");
        File tmpDirFile = new File(tmpDir);
        File[] fileList = tmpDirFile.listFiles();
        for (File f : fileList) {
            System.out.println(f + " " + f.isDirectory()
                    + " " + f.length());
        }

    }
}
