package ticket_contracts.events;

import ticket_contracts.enums.EnumOrderStatus;

public class OrderNotificationEvent {
    private Long orderId;
    private String costumerEmail;
    private EnumOrderStatus orderStatus;
}
