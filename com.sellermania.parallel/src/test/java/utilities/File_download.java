package utilities;

import java.io.File;

public class File_download {


	 // Project download folder path
    public static final String DOWNLOAD_PATH =
            System.getProperty("user.dir") + "/downloads";

    // 1️⃣ Clean download folder
    public static void cleanDownloadFolder() {
        File folder = new File(DOWNLOAD_PATH);

        if (folder.exists()) {
            for (File file : folder.listFiles()) {
                file.delete();
            }
        }
    }

    // 2️⃣ Wait for file download to complete
    public static File waitForDownload(String fileNameContains,
                                       String extension,
                                       int timeoutSeconds) throws InterruptedException {

        File folder = new File(DOWNLOAD_PATH);
        File downloadedFile = null;
        int waited = 0;

        while (waited < timeoutSeconds) {
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.getName().contains(fileNameContains)
                            && file.getName().endsWith(extension)
                            && !file.getName().endsWith(".crdownload")) {

                        downloadedFile = file;
                        return downloadedFile;
                    }
                }
            }

            Thread.sleep(1000);
            waited++;
        }

        return null;
    }


















}
