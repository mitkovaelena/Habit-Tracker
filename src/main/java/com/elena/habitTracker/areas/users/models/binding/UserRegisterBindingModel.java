package com.elena.habitTracker.areas.users.models.binding;

import com.elena.habitTracker.areas.users.util.Constants;
import com.elena.habitTracker.areas.users.validators.EqualFields;
import com.elena.habitTracker.areas.users.validators.Password;
import com.elena.habitTracker.areas.users.validators.UsernameUnique;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@EqualFields(baseField = "password", matchField = "confirmPassword", message = Constants.PASSWORDS_MISMATCH)
public class UserRegisterBindingModel {
    @NotNull
    @Size(min = 4, max = 30, message = Constants.USERNAME_LENGTH)
    @UsernameUnique
    private String username;

    @NotNull
    @Password(minLength = 6,
            maxLength = 50,
            containsDigit = false,
            containsLowerCase = false,
            containsUpperCase = false,
            containsSpecialSymbols = false)
    private String password;

    private String confirmPassword;

    @Pattern(regexp = "^[A-Za-z0-9][A-Za-z0-9.-_]*[A-Za-z0-9]@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\\w+$", message = Constants.INVALID_EMAIL)
    @NotNull
    private String email;

    private String firstName;

    private String lastName;

    public UserRegisterBindingModel() {
    }

    public UserRegisterBindingModel(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
