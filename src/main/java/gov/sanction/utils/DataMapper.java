package gov.sanction.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataMapper {

	private static final ObjectMapper MAPPER =new ObjectMapper();
	static {
		MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}
	
	public static<F,T> T converTo(final F from,final Class<T> tClass) {
		return MAPPER.convertValue(from, tClass); 
	}
}
