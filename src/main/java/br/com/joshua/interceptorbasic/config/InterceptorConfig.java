package br.com.joshua.interceptorbasic.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.joshua.interceptorbasic.filter.CachedRequestFilter;
import br.com.joshua.interceptorbasic.interceptor.LoggerInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggerInterceptor());
	}

	@Bean
	public FilterRegistrationBean<CachedRequestFilter> cacheRequestFilter() {
		final var registration = new FilterRegistrationBean<CachedRequestFilter>();
		registration.setFilter(new CachedRequestFilter());
		registration.addUrlPatterns("/*"); 
		registration.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return registration;
	}

}
