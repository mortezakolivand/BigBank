package com.mk.bigBank.service;

import com.mk.bigBank.model.LoanRequest;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public boolean calculate(LoanRequest loanRequest){

     double coefficient = 0.69;
     double sec=0.0;
     double thi=0.0;
     double fis=0.0;

     switch (Integer.parseInt(loanRequest.getCurrenciesNumber())){

         case 1:
                sec = Integer.parseInt(loanRequest.getsEC()) * (1/1.08);
                thi = Integer.parseInt(loanRequest.gettHI()) * (1/17.87);
                fis = Integer.parseInt(loanRequest.getfIS()) * 1.0;
                break;
         case 2:
             sec = Integer.parseInt(loanRequest.getsEC()) * (1.0);
             thi = Integer.parseInt(loanRequest.gettHI()) * (1/17.87);
             fis = Integer.parseInt(loanRequest.getfIS()) * 1.08;
             break;
        case 3:
             sec = Integer.parseInt(loanRequest.getsEC()) * ( 17.87 / 1.08);
             thi = Integer.parseInt(loanRequest.gettHI()) * 1.0;
             fis = Integer.parseInt(loanRequest.getfIS()) * 17.87;
             break;

     }

        if ( sec + thi + fis < Double.parseDouble(loanRequest.getIncome()) * coefficient ){
        return true;
        }else{
        return false;
        }

    }
}
