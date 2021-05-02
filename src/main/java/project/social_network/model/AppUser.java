package project.social_network.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.util.Set;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, max = 30)
    private String username;
    @Size(min = 6, max = 25)
    private String password;
    private String displayName;
    private String avatar;
    @Email
    @NotBlank
    private String email;
    private String address;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<AppRole> appRole;


    public AppUser() {
    }

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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<AppRole> getAppRoles() {
        return appRole;
    }

    public void setAppRoles(Set<AppRole> appRoles) {
        this.appRole = appRoles;
    }
}