package br.com.atividadejava.view;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AtividadeServlet
 */
public class AtividadeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtividadeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));
		String categoria = "";
		if(idade >=5 && idade <=7)
		{
			categoria = "Categoria Infantil A";
		}
		else if(idade >=8 && idade <=10)
		{
			categoria = "Categoria Infantil B";
		}
		else if(idade >=11 && idade <=13)
		{
			categoria = "Categoria Juvenil A";
		}
		else if(idade >=14 && idade <=17)
		{
			categoria = "Categoria Juvenil B";
		}
		else
		{
			categoria = "Adulto";
		}
		
		request.setAttribute("pessoa", nome);
		request.setAttribute("idade", idade);
		request.setAttribute("categoria", categoria);
		
		
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("resposta.jsp");
		
		rd.forward(request, response);
	}

}
