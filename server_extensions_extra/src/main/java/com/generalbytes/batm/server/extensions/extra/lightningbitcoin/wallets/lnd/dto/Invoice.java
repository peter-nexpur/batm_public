package com.generalbytes.batm.server.extensions.extra.lightningbitcoin.wallets.lnd.dto;

public class Invoice {
    /**
     * A bare-bones invoice for a payment within the Lightning Network. With the details of the invoice, the sender has all the data necessary to send a payment to the recipient.
     */
    public String payment_request;
    /**
     * The hash of the preimage
     */
    public String r_hash;
    /**
     * The value of this invoice in satoshis
     */
    public Long value;
    /**
     * An optional memo to attach along with the invoice. Used for record keeping purposes for the invoice’s creator, and will also be set in the description field of the encoded payment request if the description_hash field is not being used
     */
    public String memo;
    /**
     * Payment request expiry time in seconds
     */
    public Long expiry;

    public String creation_date;
    public String settle_date;
    public String amt_paid_msat;
    public String state;
    public boolean settled;

    @Override
    public String toString() {
        return "Invoice{" +
            "value=" + value +
            ", creation_date=" + creation_date +
            ", expiry=" + expiry +
            ", memo='" + memo + '\'' +
            ", payment_request='" + payment_request + '\'' +
            '}';
    }
}
