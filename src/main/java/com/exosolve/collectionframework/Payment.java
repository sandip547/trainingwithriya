package com.exosolve.collectionframework;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment  implements Comparable<Payment>{
    int paymentId;
    String paymentMethod;
    int paymentAmount;

    @Override
    public int compareTo(Payment o) {
      return Integer.compare(this.getPaymentId(),o.getPaymentId());
    }
}
