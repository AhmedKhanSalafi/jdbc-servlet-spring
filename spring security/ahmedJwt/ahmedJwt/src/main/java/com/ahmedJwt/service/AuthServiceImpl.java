package com.ahmedJwt.service;




import com.ahmedJwt.configJwt.JwtTokenProvider;
import com.ahmedJwt.dto.LoginDto;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;





@Service
    @AllArgsConstructor
    public class AuthServiceImpl implements AuthService {

        private AuthenticationManager authenticationManager;

        @Override
        public String login(LoginDto loginDto) {

            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    loginDto.getUsernameOrEmail(),
                    loginDto.getPassword()
            ));

            SecurityContextHolder.getContext().setAuthentication(authentication);

            JwtTokenProvider jwtTokenProvider = null;
            String token = jwtTokenProvider.generateToken(authentication);


          //  String token = jwtTokenProvider.generateToken(authentication);

            return token;
        }
    }




