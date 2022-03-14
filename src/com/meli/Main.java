package com.meli;

import com.meli.clientes.Executivo;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Executivo cliente = new Executivo(BigDecimal.valueOf(2432.2));

        cliente.fazerDeposito(cliente.getSaldo());
    }
}
