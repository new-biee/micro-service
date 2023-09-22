package com.noob.uaa.controller;

import com.noob.uaa.response.APIResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/uaa")
public class AuthController {

//    private final AuthenticationManager authenticationManager;
//
//    private final UserService userService;

//    private final JwtUtils jwtUtils;

//    public AuthController(AuthenticationManager authenticationManager, UserService userService, JwtUtils jwtUtils) {
//        this.authenticationManager = authenticationManager;
//        this.userService = userService;
//        this.jwtUtils = jwtUtils;
//    }

    @GetMapping("/abc")
    public APIResponse<?> test(){
        return APIResponse.newSuccessResponse("OK");
    }

//    @PostMapping("/login")
//    public APIResponse<?> login(@RequestBody LoginRequest loginRequest){
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt = jwtUtils.generateJwtToken(authentication);
//
//        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
//        List<String> roles = userDetails.getAuthorities().stream()
//                .map(GrantedAuthority::getAuthority)
//                .collect(Collectors.toList());
//
//        return APIResponse.newSuccessResponse(
//                new JwtResponse(jwt,
//                        userDetails.getId(),
//                        userDetails.getUsername(),
//                        userDetails.getEmail(),
//                        roles));
//    }
}
