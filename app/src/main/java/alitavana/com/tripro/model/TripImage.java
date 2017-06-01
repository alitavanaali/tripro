package alitavana.com.tripro.model;

import java.io.Serializable;

/**
 * Created by eric on 5/29/17.
 */

public class TripImage implements Serializable{

    private String hash;
    private String downloadLink;
    private String name;
    private byte[] photoValue;

    public byte[] getPhotoValue() {
        return photoValue;
    }

    public void setPhotoValue(byte[] photoValue) {
        this.photoValue = photoValue;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
