package com.meli.transacoes;

import java.math.BigDecimal;

public interface Transacao {

    void transacaoOk();

    void transacaoNaoOk();


}

/*
void deposito(BigDecimal amount);

    void transferencia(BigDecimal amount, String destination);

    BigDecimal saque(BigDecimal amount);

    BigDecimal consultaSaldo();

    void pagamentoServicos(String servico);
 */