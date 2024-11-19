package com.cursojava;

public class MyBankAccount
{
	private double saldo;

    public MyBankAccount(double saldoInicial)
    {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws MyNotFoundException
    {
        if(cantidad > saldo)
        {
            throw new MyNotFoundException();
        }
        saldo -= cantidad;
    }
}
