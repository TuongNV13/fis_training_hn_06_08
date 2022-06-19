package vn.fis.training.ordermanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.fis.training.ordermanagement.domain.Customer;
import vn.fis.training.ordermanagement.domain.Order;
import vn.fis.training.ordermanagement.domain.OrderItem;
import vn.fis.training.ordermanagement.domain.OrderStatus;
import vn.fis.training.ordermanagement.repository.OrderRepository;
import vn.fis.training.ordermanagement.service.OrderService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {

        return orderRepository.save(order);
    }

    @Override
    public Order addOrderItem(Long orderId, OrderItem orderItem) {

        Optional<Order> order = orderRepository.findById(orderId);
        order.get().getOrderItems().add(orderItem);
        Double amount;
        amount = order.get().getTotalAmount() + (orderItem.getAmount() * orderItem.getQuantity());
        order.get().setTotalAmount(amount);
        orderRepository.save(order.get());
        return order.get();
    }

    @Override
    public Order removeOrderItem(Long orderId, OrderItem orderItem) {

        Optional<Order> order = orderRepository.findById(orderId);
        order.get().getOrderItems().remove(orderItem);
        Double amount;
        amount = order.get().getTotalAmount() - (orderItem.getAmount() * orderItem.getQuantity());
        order.get().setTotalAmount(amount);
        orderRepository.save(order.get());
        return order.get();
    }

    @Override
    public Order updateOrderStatus(Order order, OrderStatus orderStatus) {
        // TODO
        return null;
    }

    @Override
    public List<Order> findOrdersBetween(LocalDateTime fromDateTime, LocalDateTime toDateTime) {

        List<Order> orderList = orderRepository.findByStartDateBetween(fromDateTime, toDateTime);
        return orderList;
    }

    @Override
    public List<Order> findWaitingApprovalOrders() {
        return orderRepository.findAll().stream().filter(t -> t.getStatus().equals("WAITING_APPROVAL"))
                .collect(Collectors.toList());
    }

    @Override
    public List<Order> findOrdersByOrderStatus(OrderStatus orderStatus) {
        return orderRepository.findAll().stream().filter(t -> t.getStatus().equals(orderStatus))
                .collect(Collectors.toList());

    }

    @Override
    public List<Order> findOrdersByCustomer(Customer customer) {
        return orderRepository.findAll().stream().filter(t -> t.getId().equals(customer.getId()))
                .collect(Collectors.toList());
    }
}
