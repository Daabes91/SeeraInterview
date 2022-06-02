package resources;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException {
		
		
		if (req==null) {
		
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		
		req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl")).addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log)).addHeader("token",getGlobalValue("token") ).setContentType(ContentType.JSON).build();
		
		return req;
		}
		else
		return req;
	}
	public String getGlobalValue(String Key) throws IOException {
		Properties prop =  new Properties();
		FileInputStream fis = new FileInputStream("src/test/java/resources/global.properties");
		prop.load(fis);
		return prop.getProperty(Key);
		
		
	}
	public String getJsonPath(Response response , String key) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
	
		return js.get(key).toString();
		
	}

}
