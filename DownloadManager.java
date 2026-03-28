class DownloadManager implements Runnable {

    String fileName;

    DownloadManager(String name) {
        fileName = name;
    }

    public void run() {
        System.out.println("Downloading " + fileName);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager("File1"));
        Thread t2 = new Thread(new DownloadManager("File2"));

        t1.start();
        t2.start();
    }
}