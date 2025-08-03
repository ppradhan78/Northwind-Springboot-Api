package com.northwindspringbootapi.controllers.v1;

import com.northwindspringbootapi.dto.LoginRequest;
import com.northwindspringbootapi.services.impl.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginRequest loginRequest) {
//    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
    //public ResponseEntity<String> login(String username, String password) {
        //String token = authService.login(username, password);
         String token = authService.login(loginRequest.getUsername(), loginRequest.getPassword());
        Map<String, String> response = new HashMap<>();
        response.put("message", "Login successful");
        response.put("token", token);
        //return ResponseEntity.ok(token);
        return ResponseEntity.ok(response);
    }
}
