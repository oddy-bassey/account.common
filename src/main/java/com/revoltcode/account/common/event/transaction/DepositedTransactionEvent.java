package com.revoltcode.account.common.event.transaction;

import com.revoltcode.cqrs.core.event.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class DepositedTransactionEvent extends BaseEvent {
    private String accountName;
    private double amount;
    private String description;
    private LocalDateTime transactionTime;
}
