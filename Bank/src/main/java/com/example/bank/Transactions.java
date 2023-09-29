package com.example.bank;

import java.sql.*;

public class Transactions {

    private java.util.Date transactionDate;
    private double amount;
    private String transactionType;

    private String masterId;

    private  String transferTo;

    Connection con;
    PreparedStatement ps;

    PreparedStatement ps1;

    public Transactions() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded Successfully");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Albatros01@");
            System.out.println("connected successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public Transactions(double amount, String transactionType, String masterId) {

        this.amount = amount;
        this.transactionType = transactionType;
        this.masterId = masterId;
    }

    public Transactions(String transferTo) {
        this.transferTo = transferTo;
    }

    public String getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(String transferTo) {
        this.transferTo = transferTo;
    }

    public Transactions(java.util.Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public java.util.Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(java.util.Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public int deposit() {
        int r = 0;
        try {
            ps = con.prepareStatement("Insert into transactions(transactionDate,amount,transactionType,masterId) values (?,?,?,?)");
            ps.setDate(1, (Date) transactionDate);
            ps.setDouble(2, amount);
            ps.setString(3, transactionType);
            ps.setString(4, masterId);
            r = ps.executeUpdate();
            System.out.println(r);

            ///////////////////////////////////////////

            ps = con.prepareStatement("update accountinfo set balance=balance+? where name=? ");
            ps.setDouble(1, amount);
            ps.setString(2, masterId);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;

    }

    public int withdraw() {
        int r = 0;
        try {
            ps1 = con.prepareStatement("Insert into transactions(transactionDate,amount,transactionType,masterId) values (?,?,?,?)");
            ps1.setDate(1, (Date) transactionDate);
            ps1.setDouble(2, amount);
            ps1.setString(3, transactionType);
            ps1.setString(4, masterId);
            r = ps1.executeUpdate();
            System.out.println(r);


            ///////////////////////////////////////////

            ps1 = con.prepareStatement("update accountinfo set balance=balance-? where name=? ");
            ps1.setDouble(1, amount);
            ps1.setString(2, masterId);
            ps1.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }



    public ResultSet balanceSheet() throws SQLException {

            ps1= con.prepareStatement("select transactionDate,transactionType,amount from transactions where masterId=?");
            ps1.setString(1, masterId);

            ResultSet rs =ps1.executeQuery();


        return rs;
    }

    public void transferFrom() throws SQLException {
        int r1=0;
        ps = con.prepareStatement("Insert into transactions(transactionDate,amount,transactionType,masterId) values (?,?,?,?)");
        ps.setDate(1, (Date) transactionDate);
        ps.setDouble(2, amount);
        ps.setString(3, "TransferFrom");
        ps.setString(4, masterId);
        r1 = ps.executeUpdate();
        if(r1==1) {
            ps = con.prepareStatement("update accountinfo set balance=balance-? where name=?");
            ps.setDouble(1, amount);
            ps.setString(2, masterId);
            ps.executeUpdate();
        }
        else {
            System.out.println("Error in your page");
        }

        ps = con.prepareStatement("Insert into transactions(transactionDate,amount,transactionType,masterId) values (?,?,?,?)");
        ps.setDate(1, (Date) transactionDate);
        ps.setDouble(2, amount);
        ps.setString(3, "TransferTo");
        ps.setString(4, transferTo);
        r1 = ps.executeUpdate();
        if(r1==1) {
            ps = con.prepareStatement("update accountinfo set balance=balance+? where name=?");
            ps.setDouble(1, amount);
            ps.setString(2, transferTo);
            ps.executeUpdate();
        }
        else {
            System.out.println("Error in you page");
        }
    }

}
