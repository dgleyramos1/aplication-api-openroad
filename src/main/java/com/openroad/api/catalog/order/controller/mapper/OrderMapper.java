package com.openroad.api.catalog.order.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.openroad.api.catalog.order.controller.dtos.OrderDTO;
import com.openroad.api.catalog.order.model.Order;

public class OrderMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public OrderDTO toOrderDTO(Order order) {
        return MODEL_MAPPER.map(order, OrderDTO.class);
    }

    public List<OrderDTO> toOrderListDTO(List<Order> list) {
        return list.stream().map(this::toOrderDTO).collect(Collectors.toList());
    }

    public Order toorderCreateDTO(OrderDTO dto) {
        return MODEL_MAPPER.map(dto, Order.class);
    }
}
