package com.flowershop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flowershop.bean.FlowerOrder;
import com.flowershop.factory.ServiceFactory;

/**
 * Servlet implementation class DeleteOrder
 */
@WebServlet("/DeleteOrder")
public class DeleteOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String flowerId = request.getParameter("item");
		
		FlowerOrder item = new FlowerOrder();
		item.setOrderId(Integer.valueOf(flowerId));
		
		boolean flag = ServiceFactory.createOrderService().deleteOrder(item);
		
		
		/**
		 * 将结果当作返回数返回！
		 * 删除成功，则返回0
		 * 删除失败，返回1
		 * */
		String ok = null;
		
		if(flag)
			ok = "0";
		else
			ok = "1";
		
		response.sendRedirect("/OnlineFlowerShop/pages/myorderListShow/myorderList.jsp?ok="+ok);
		
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
