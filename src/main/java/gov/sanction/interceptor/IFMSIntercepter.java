package gov.sanction.interceptor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;

import org.json.JSONObject;

//@Provider
public class IFMSIntercepter implements ReaderInterceptor, ContainerResponseFilter {

	@Override
	public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
		InputStream is = context.getInputStream();
		String body = new Scanner(is, "UTF-8").useDelimiter("\\A").next();
		context.setProperty("requestData", body);
		context.setInputStream(new ByteArrayInputStream((body).getBytes()));
		Object result = context.proceed();
		return result;
	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		UriInfo uriInfo = requestContext.getUriInfo();
		System.out.println("URI - " + uriInfo.getAbsolutePath());
		System.out.println("REQUEST BODY" + requestContext.getProperty("requestData"));
		if (!uriInfo.getAbsolutePath().toString().contains("action")) {
			if (responseContext.getEntity() != null) {
				JSONObject jsonObject = new JSONObject(responseContext.getEntity());
				System.out.println("RESPONSE BODY - " + jsonObject);
			}
		} else {
			if (responseContext.getEntity() != null) {
				System.out.println("RESPONSE BODY - " + responseContext.getEntity());
			}
		}

	}

}
