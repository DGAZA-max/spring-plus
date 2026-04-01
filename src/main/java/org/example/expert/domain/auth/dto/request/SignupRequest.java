package org.example.expert.domain.auth.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {

    @NotBlank @Email
    private String email;
    @NotBlank
    @Size(min = 2, max = 25)
    @Pattern(regexp = "^[a-zA-Z0-9가-힣!@#$%^&*()_+=\\-]+$",
            message = "닉네임은 한글, 영문, 숫자 및 특정 특수 문자만 사용할 수 있습니다.")
    private String nickname;
    @NotBlank
    private String password;
    @NotBlank
    private String userRole;
}
