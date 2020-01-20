package model;

import java.math.BigDecimal;

public class NumberResource {
    private BigDecimal number;
    private String client;

    public NumberResource(){
        this.client = "Client zawsze ten sam";
    }
    public NumberResource(BigDecimal number) {
        this.number = number;
        this.client = "Client zawsze ten sam";
    }

    @Override
    public String toString() {
        return "NumberResource{" +
                "number=" + number +
                ", client='" + client + '\'' +
                '}';
    }
}
