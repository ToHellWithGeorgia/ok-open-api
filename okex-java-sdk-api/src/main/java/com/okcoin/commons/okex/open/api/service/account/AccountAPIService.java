package com.okcoin.commons.okex.open.api.service.account;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.okcoin.commons.okex.open.api.bean.account.param.Transfer;
import com.okcoin.commons.okex.open.api.bean.account.param.Withdraw;
import com.okcoin.commons.okex.open.api.bean.account.result.Currency;
import com.okcoin.commons.okex.open.api.bean.account.result.Ledger;
import com.okcoin.commons.okex.open.api.bean.account.result.Wallet;
import com.okcoin.commons.okex.open.api.bean.account.result.WithdrawFee;

import java.math.BigDecimal;
import java.util.List;


public interface AccountAPIService {

    JSONObject transfer(Transfer transfer);

    JSONObject withdraw(Withdraw withdraw);

    List<Currency> getCurrencies();

    JSONArray getLedger(String type, String currency, String before, String after, String limit);

    List<Wallet> getWallet();

    List<Wallet> getWallet(String currency);

    JSONArray getDepositAddress(String currency);

    List<WithdrawFee> getWithdrawFee(String currency);

    JSONArray getOnHold(String currency);

    JSONObject lock(String currency, BigDecimal amount);

    JSONObject unlock(String currency, BigDecimal amount);

    JSONArray getDepositHistory();

    JSONArray getDepositHistory(String currency);
    //查看所有提币记录
    JSONArray getWithdrawalHistory();
    //查看单个提币记录
    JSONArray getWithdrawalHistory(String currency);
    //获取子账户余额信息
    String getSubAccount(String subaccount);
    //获取账户资产估值
    String getAssetValuation(String account_type,String valuation_currency);

}
