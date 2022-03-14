package com.meli.transacoes;

import java.math.BigDecimal;

public interface Deposito extends Transacao{

    void fazerDeposito(BigDecimal amount);
}
