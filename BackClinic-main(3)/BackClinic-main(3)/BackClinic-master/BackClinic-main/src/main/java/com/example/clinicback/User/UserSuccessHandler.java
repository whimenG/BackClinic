package com.example.clinicback.User;


import java.util.Optional;

@Service
public class UserSuccessHandler  implements AuthenticationSuccessHandler {
    public UserSuccessHandler() {
    }

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        Collection<? extends GrantedAuthority> authourities = authentication.getAuthorities();
        Optional<String> roles = authourities.stream().map((r) -> {
            return r.getAuthority();
        }).findFirst();
        if (((String)roles.orElse("")).equals("ADMIN")) {
            response.sendRedirect("/User");
        } else if (((String)roles.orElse("")).equals("USER")) {
            response.sendRedirect("/User");
        } else {
            response.sendRedirect("/error");
        }

    }


}
