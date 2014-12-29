package com.fmr;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PurchaseTest {

    @Test
    public void shouldNotBeChargedWhenNotPurchasingBooks() {
        Purchase purchase = new Purchase();
        assertThat(purchase.price(), is(new Price(BigDecimal.ZERO)));
    }

}
