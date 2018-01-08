package com.twu.biblioteca.entity;

public class User {

    private String libraryNumber;
    private String password;
    private ProfileInfo profileInfo;

    public User(String libraryNumber, String password) {
        this(libraryNumber, password, null);
    }

    public User(String libraryNumber, String password, ProfileInfo profileInfo) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.profileInfo = profileInfo;
    }

    public String getLibraryNumber() {
        return this.libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public boolean checkPassword(String password) {
        return (this.password.equals(password));
    }

    public ProfileInfo getProfileInfo() {
        return this.profileInfo;
    }
}
