package com.example.showlist;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "manager", value = "/customer")
public class Manager extends HttpServlet {
    protected  List<Customer> customerList;

    protected  void setup() {
        customerList = new ArrayList<>();
        customerList.add( new Customer("Mai Văn Hoàn","1983-08-20","Ha Noi","vv"));
        customerList.add( new Customer("Nguyen Van Nam","1983-08-20","Ha Noi","vv"));
        customerList.add( new Customer("Nguyen Thai Hoa","1983-08-20","Ha Noi","vv"));
        customerList.add( new Customer("Tran Dang Khoa","1983-08-20","Ha Noi","vv"));
        customerList.add( new Customer("Nguyen Dinh Thi","1983-08-20","Ha Noi","vv"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      setup();
        RequestDispatcher rD= req.getRequestDispatcher("client.jsp");
        req.setAttribute("customerList",customerList);
        rD.forward(req,resp);
    }
}
