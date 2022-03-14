package com.meli.transacoes;

import java.math.BigDecimal;

public interface Transferencia extends Transacao{

    void transferencia(BigDecimal amount, String destino);
}
