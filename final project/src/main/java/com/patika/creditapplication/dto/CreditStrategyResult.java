package com.patika.creditapplication.dto;

import com.patika.creditapplication.enums.CreditStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditStrategyResult {
    private CreditStatus creditStatus;
    private Float creditLimit;
}
