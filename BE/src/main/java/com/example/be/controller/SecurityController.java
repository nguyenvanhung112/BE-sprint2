package com.example.be.controller;

import com.example.be.dto.JwtRespone;
import com.example.be.dto.MessageRespone;
import com.example.be.dto.SignInForm;
import com.example.be.model.account.Account;
import com.example.be.security.jwt.JwtProvider;
import com.example.be.security.user_detail.MyUserDetail;
import com.example.be.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RequestMapping("/api/auth")
@RestController
public class SecurityController {
    @Autowired
    private IAccountService accountService;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private AuthenticationManager authenticationManager;
        @PostMapping("/signin")
    public ResponseEntity<?> login(@RequestBody SignInForm signInForm) {


        Account accountValidate = accountService.findAccountByUsername(signInForm.getUsername());

        if (accountValidate == null) {
            return new ResponseEntity<>(new MessageRespone("username not found"), HttpStatus.NOT_FOUND);
        }

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInForm.getUsername(), signInForm.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtProvider.createToken(authentication);

        MyUserDetail myUserDetail = (MyUserDetail) authentication.getPrincipal();

        return ResponseEntity.ok(new JwtRespone(token,
                myUserDetail.getAccount(), myUserDetail.getAccount().getUsers(),
                myUserDetail.getAuthorities()));
    }

}
