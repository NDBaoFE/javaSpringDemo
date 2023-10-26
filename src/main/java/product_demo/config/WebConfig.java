//package product_demo.config;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import product_demo.utils.ApiResponseFilterWrapperFilter;
//
//@Configuration
//public class WebConfig {
//    @Bean
//    public FilterRegistrationBean<ApiResponseFilterWrapperFilter> responseWrapperFilter() {
//        FilterRegistrationBean<ApiResponseFilterWrapperFilter> filterRegistrationBean = new FilterRegistrationBean<>();
//        filterRegistrationBean.setFilter(new ApiResponseFilterWrapperFilter());
//        filterRegistrationBean.addUrlPatterns("/api/*"); // Specify the URL patterns to apply the filter to
//        return filterRegistrationBean;
//    }
//}
