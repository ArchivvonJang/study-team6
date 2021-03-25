package com.team6.home;



public interface CommandService {
	public String processStart(HttpServletRequest req, HttpServletResponse res) throws ServletExeption, IOException;
}
