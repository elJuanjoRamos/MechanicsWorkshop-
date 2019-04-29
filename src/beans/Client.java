/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Juan José Ramos
 */
public class Client {
    private long dpi;
    private String fullName;
    private String username;
    private String password;
    private String role;
    private Car carList;
    private Client previous;
    private Client next;

    public Client() {
    }

    public Client(long dpi, String fullName, String username, String password, String role, Car carList) {
        this.dpi = dpi;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.role = role;
        this.carList = carList;
    }

    public Client(long dpi, String fullName, String username, String password, String role) {
        this.dpi = dpi;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    /**
     * @return the dpi
     */
    public long getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the carList
     */
    public Car getCarList() {
        return carList;
    }

    /**
     * @param carList the carList to set
     */
    public void setCarList(Car carList) {
        this.carList = carList;
    }

    /**
     * @return the previous
     */
    public Client getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(Client previous) {
        this.previous = previous;
    }

    /**
     * @return the next
     */
    public Client getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Client next) {
        this.next = next;
    }
    
}
