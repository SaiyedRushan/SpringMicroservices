package org.rushan;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}