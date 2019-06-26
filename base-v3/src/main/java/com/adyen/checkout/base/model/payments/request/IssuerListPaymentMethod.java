/*
 * Copyright (c) 2019 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by caiof on 28/5/2019.
 */

package com.adyen.checkout.base.model.payments.request;

import android.support.annotation.Nullable;

@SuppressWarnings("MemberName")
public abstract class IssuerListPaymentMethod extends PaymentComponentData {

    static final String ISSUER = "issuer";

    private String issuer;

    @Nullable
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(@Nullable String issuer) {
        this.issuer = issuer;
    }
}
