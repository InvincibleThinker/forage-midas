package com.jpmc.midascore.foundation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.kafka.annotation.KafkaListener;

@JsonIgnoreProperties(ignoreUnknown = true)
@KafkaListener(topics = "${kafka.topic.name}", groupId = "midas-core-group")
public class Transaction {
    private long senderId;
    private long recipientId;
    private float amount;
    private float incentive;


    public Transaction() {
    }

    public Transaction(long senderId, long recipientId, float amount) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.amount = amount;
    }

    public Transaction(long senderId, long recipientId, float amount, float incentive) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.amount = amount;
        this.incentive = incentive;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(long recipientId) {
        this.recipientId = recipientId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction {senderId=" + senderId + ", recipientId=" + recipientId + ", amount=" + amount + "}";
    }

    public void setIncentive(float incentive) {
        this.incentive = incentive;
    }

    public float getIncentive() {
        return incentive;
    }
}
