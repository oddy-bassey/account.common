package com.revoltcode.account.common.event;

import com.revoltcode.account.common.dto.AccountType;
import com.revoltcode.cqrs.core.event.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AccountOpenedEvent extends BaseEvent {
    private String customerId;
    private AccountType accountType;
    private Date createdDate;
    private double openingBalance;
}
