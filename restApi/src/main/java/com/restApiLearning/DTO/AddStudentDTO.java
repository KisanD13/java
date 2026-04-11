package com.restApiLearning.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddStudentDTO {
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 30, message = "name should be of character 0 to 30")
    private String name;

    @Email
    @NotBlank(message = "email is required")
    private String email;
}


