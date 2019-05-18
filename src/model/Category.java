package model;

import java.util.ArrayList;

public class Category {

    private String name;

    private ArrayList<Object> downloadedFiles;


    public Category(){
        setDownloadedFiles(new ArrayList<>());
    }



    ////////////////////////////////////////////setter and getter function
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Object> getDownloadedFiles() {
        return downloadedFiles;
    }

    public void setDownloadedFiles(ArrayList<Object> downloadedFiles) {
        this.downloadedFiles = downloadedFiles;
    }
}
