package edu.gatech.movierecommender;

public class User {

    /**
     * Name
     */
    private final String name;
    /**
     * Email
     */
    private final String email;
    /**
     * Username
     */
    private final String username;
    /**
     * Password
     */
    private final String password;
    /**
     * Status
     */
    private String status;
    /**
     * Profile
     */
    private Profile profile;

    /**
     * Constructor
     *
     * @param myName the person's name
     * @param myEmail the person's email
     * @param myUsername the person's username
     * @param myPassword the person's passwords
     */
    public User(String myName, String myEmail, String myUsername, String myPassword) {
        this.name = myName;
        this.email = myEmail;
        this.username = myUsername;
        this.password = myPassword;
        profile = null;
    }

    /**
     * Return the name for this user
     *
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Return the email for this user
     *
     * @return the person's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Return the username for this user
     *
     * @return the person's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Return the password for this user
     *
     * @return the person's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Return the profile for this user
     *
     * @return the person's name
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * Set the profile for this user
     *
     * @param myProfile profile of user
     */
    public void setProfile(Profile myProfile) {
        profile = myProfile;
    }

    /**
     * Return the status for this user
     *
     * @return the person's status
     */
    public String getStatus() { return status; }

    /**
     * Set the status for this user
     *
     * @param myStatus status of user
     */
    public void setStatus(String myStatus) { status = myStatus; }
}
