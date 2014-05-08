package uk.ac.ebi.pride.archive.doi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * DOIRegistration represents the result of a DOI registration request
 *
 * @author Rui Wang
 * @version $Id$
 */
public class DOIRegistration implements Serializable{
    private String doi;
    private String mappedUrl;
    private RegistrationStatus status;
    private String message;
    private Date date;

    public DOIRegistration() {
    }

    public DOIRegistration(String doi,
                           String mappedUrl,
                           RegistrationStatus status,
                           String message,
                           Date date) {
        this.doi = doi;
        this.mappedUrl = mappedUrl;
        this.status = status;
        this.message = message;
        this.date = date;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getMappedUrl() {
        return mappedUrl;
    }

    public void setMappedUrl(String mappedUrl) {
        this.mappedUrl = mappedUrl;
    }

    public RegistrationStatus getStatus() {
        return status;
    }

    public void setStatus(RegistrationStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DOIRegistration)) return false;

        DOIRegistration that = (DOIRegistration) o;

        if (!date.equals(that.date)) return false;
        if (!doi.equals(that.doi)) return false;
        if (!mappedUrl.equals(that.mappedUrl)) return false;
        if (!message.equals(that.message)) return false;
        if (status != that.status) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = doi.hashCode();
        result = 31 * result + mappedUrl.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + message.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DOIRegistration{" +
                "doi='" + doi + '\'' +
                ", mappedUrl='" + mappedUrl + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
