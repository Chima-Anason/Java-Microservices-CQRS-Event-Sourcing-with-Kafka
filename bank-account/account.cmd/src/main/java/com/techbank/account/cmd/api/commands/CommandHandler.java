package com.techbank.account.cmd.api.commands;

public interface CommandHandler {
    void handle(OpenAccountCommand command);
    void handle(DepositeFundsCommand command);
    void handle(WithdrawFundsCommand command);
    void handle(CloseAccountCommand command);
}
