package com.patika.creditapplication.service.strategy;

import com.patika.creditapplication.enums.CreditStatus;
import org.springframework.stereotype.Component;

@Component
public class LowIncome implements CreditStrategy {

    @Override
    public Float calculateCreditLimit(Float monthlyIncome, Float collateral) {
        if (collateral > 0) {
            return 10000 + (collateral * 0.1f);
        }
        return 10000f;
    }

    @Override
    public boolean isSuitableStrategy(Integer creditScore, Float monthlyIncome) {
        return creditScore >= 500 && creditScore < 1000 && monthlyIncome < 5000;
    }

    @Override
    public CreditStatus getCreditStatus() {
        return CreditStatus.APPROVED;
    }
}
