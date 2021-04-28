package bll;

import bll.validators.OrderValidator;
import bll.validators.QuantityValidator;
import bll.validators.Validator;
import dao.OrderDAO;
import model.Order;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderBLL {
    private List<Validator<Order>> validators;
    private OrderDAO orderDAO;

    public OrderBLL()
    {
        validators = new ArrayList<Validator<Order>>();
        validators.add(new QuantityValidator());
        validators.add(new OrderValidator());
        orderDAO = new OrderDAO();
    }

    public List<Order> findAllOrders()
    {
        List<Order> list = orderDAO.findAll();
        if(list == null)
            throw new NoSuchElementException();
        return list;
    }

    public Order findOrderById(int id)
    {
        Order order = orderDAO.findById(id);
        if(order == null)
            throw new NoSuchElementException();
        return order;
    }

    public boolean insertOrder(Order order) throws IllegalAccessException {
        for(Validator<Order> v : validators)
            v.validate(order);
        return orderDAO.insert(order);
    }

    public void updateOrder(Order order) throws IllegalAccessException {
        orderDAO.update(order);
    }

    public void deleteOrder(Order order) throws SQLException, IllegalAccessException {
        orderDAO.delete(order);
    }

}
