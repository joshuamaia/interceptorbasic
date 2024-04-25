package br.com.joshua.interceptorbasic.filter;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import br.com.joshua.interceptorbasic.wrapper.CachedBodyHttpServletRequest;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CachedRequestFilter extends OncePerRequestFilter {
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final var cachingRequest = new CachedBodyHttpServletRequest(request);
		filterChain.doFilter(cachingRequest, response);
	}
}