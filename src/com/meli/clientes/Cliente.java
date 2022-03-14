package com.meli.clientes;

import java.math.BigDecimal;

public abstract class Cliente {
    private BigDecimal saldo;

    public Cliente(){

    }

    public Cliente(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
