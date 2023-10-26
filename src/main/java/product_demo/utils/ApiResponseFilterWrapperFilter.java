//package product_demo.utils;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.http.MediaType;
//import org.springframework.web.util.ContentCachingResponseWrapper;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//import product_demo.dto.ApiResponse;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//@WebFilter("/api/*")
//public class ApiResponseFilterWrapperFilter implements Filter {
//
//    private ObjectMapper objectMapper = new ObjectMapper();
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        // Initialization, if needed
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//        response.setCharacterEncoding("UTF-8");
//        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper((jakarta.servlet.http.HttpServletResponse) response);
//
//        chain.doFilter(request, responseWrapper);
//
//        // Get the response content as a string
//        String responseBody = new String(responseWrapper.getContentAsByteArray(), StandardCharsets.UTF_8);
//
//        Object responseObject = parseResponseData(responseBody);
//
//        // Create the API response object
//        ApiResponse<Object> apiResponse = new ApiResponse<>();
//        apiResponse.setData(responseObject);
//        apiResponse.setMessage("Request processed successfully");
//        apiResponse.setSuccess(true);
//
//        // Serialize the API response to JSON
//        String responseJson = objectMapper.writeValueAsString(apiResponse);
//
//        // Modify the response content and headers
//        responseWrapper.setHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE);
//        responseWrapper.setHeader("Content-Length", String.valueOf(responseJson.length()));
//        responseWrapper.resetBuffer();
//        responseWrapper.getWriter().write(responseJson);
//
//        // Flush the response
//        responseWrapper.copyBodyToResponse();
//    }
//
//    private Object parseResponseData(String responseData) {
//        try {
//            // Parse the response data as JSON
//            return objectMapper.readValue(responseData, Object.class);
//        } catch (Exception e) {
//            // Handle any exceptions that occur during parsing
//            return responseData; // Return the original response data as a string if parsing fails
//        }
//    }
//    @Override
//    public void destroy() {
//        // Cleanup, if needed
//    }
//}
