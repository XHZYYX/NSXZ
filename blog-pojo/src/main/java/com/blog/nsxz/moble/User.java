package com.blog.nsxz.moble;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * user
 * @author 
 */
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @NotEmpty
    private String username;

    /**
     * nsxz
     */
    @NotEmpty
    private String password;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}