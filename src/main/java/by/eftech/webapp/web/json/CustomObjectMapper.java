package by.eftech.webapp.web.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class CustomObjectMapper extends ObjectMapper {
    private static final ObjectMapper MAPPER = new CustomObjectMapper();


    public static ObjectMapper getMapper() {
        return MAPPER;
    }


    private CustomObjectMapper() {
        registerModule(new Hibernate4Module());
        registerModule(new JavaTimeModule());
        configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
        setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }
}
