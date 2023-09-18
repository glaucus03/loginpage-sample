package com.app.loginServer.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun configureHttpSecurity(httpSecurity: HttpSecurity): SecurityFilterChain {
        httpSecurity
            .authorizeHttpRequests()
            .requestMatchers("/login").permitAll()
            .anyRequest().authenticated()
            .and()
            .csrf().disable()
            .formLogin()
            .loginProcessingUrl("/login")
            .usernameParameter("loginId")
            .passwordParameter("loginPassword")
            .and()
            .cors()
            .configurationSource(corsConfigurationSource())
        return httpSecurity.build()
    }

    @Bean
    fun users(): UserDetailsService {
        val user = User.builder()
            .username("user")
            .password(passwordEncoder()?.encode("password"))
            .roles("USER")
            .build()
        return InMemoryUserDetailsManager(user)
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder? {
        return BCryptPasswordEncoder()
    }

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource  {
        var configuration = CorsConfiguration()

        // Access-Control-Allow-Origin
        configuration.allowedOrigins = listOf("http://localhost:8081")

        // Access-Control-Allow-Methods
        configuration.allowedMethods = listOf("GET", "POST")

        // Access-Control-Allow-Headers
        configuration.addAllowedHeader(CorsConfiguration.ALL)

        // Access-Control-Allow-Credentials
        configuration.setAllowCredentials(true)

        var source = UrlBasedCorsConfigurationSource()

        source.registerCorsConfiguration("/**", configuration)

        return source
    }
}
