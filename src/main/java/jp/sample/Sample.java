package jp.sample;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Sample() {
    	super();
    }
    private String id;
    private String name;
    public Sample(String id, String name) {
    	this.id =id;
    	this.name = name;
    }
    public String getId() { return id; }
    public String getName() { return name; }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=UTF-8");
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		
	}
}
