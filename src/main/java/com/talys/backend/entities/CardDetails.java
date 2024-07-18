package com.talys.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class CardDetails {
    @Override
    public String toString() {
        return "CardDetails{" +
                "image='" + image + '\'' +
                ", code_qr='" + code_qr + '\'' +
                ", lastname='" + lastname + '\'' +
                ", localityName='" + localityName + '\'' +
                ", town='" + town + '\'' +
                ", number='" + number + '\'' +
                ", cardId='" + cardId + '\'' +
                ", job='" + job + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", validityDate=" + validityDate +
                ", releaseDate=" + releaseDate +
                '}';
    }

    public String image;
    public String code_qr;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCode_qr() {
        return code_qr;
    }

    public void setCode_qr(String code_qr) {
        this.code_qr = code_qr;
    }

    private String lastname;
    private String localityName;
    private String town;
    private String number;
    @Id
    private String cardId;
    private String job;
    private String sex;
    private String religion;
    private String maritalStatus;
    private String validityDate;
    private String releaseDate;

    // Getters and Setters


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getJob() {
        return job;
    }


    public void setJob(String job) {
        this.job = job;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}

