package com.meli.clientes;

import com.meli.transacoes.Deposito;
import com.meli.transacoes.Transferencia;

import java.math.BigDecimal;

public class Executivo extends Cliente implements Deposito, Transferencia {

    public Executivo(BigDecimal amount) {
        this.setSaldo(amount);
    }

    @Override
    public void fazerDeposito(BigDecimal amount) {
        System.out.println("Depósito " + amount + " sendo feito...");
        transacaoOk();
    }

    @Override
    public void transferencia(BigDecimal amount, String destino) {
        System.out.println("Transferencia " + amount + " para " + destino);
        transacaoOk();
    }

    @Override
    public void transacaoOk() {
        System.out.println("");
    }

    @Override
    public void transacaoNaoOk() {

    }
}
