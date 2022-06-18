package com.revoltcode.account.common.event.transaction;
import com.revoltcode.account.common.dto.TransactionType;
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
public class TransactionEvent extends BaseEvent {
    private String accountName;
    private double amount;
    private String description;
    private TransactionType transactionType;
    private LocalDateTime transactionTime;
}
