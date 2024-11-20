package com.example.demo.new_transaction.Entity;



import jakarta.persistence.*;

@Entity
@Table(name = "new_transaction")//Give you the Table Structure
public class Tr_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Primary Key
    private long trId;
    private String status;
    private String type;
    private String amount;
    private String acc_no;

    public long getTrId() {
        return trId;
    }

    public void setTrId(long trId) {
        this.trId = trId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }
}
