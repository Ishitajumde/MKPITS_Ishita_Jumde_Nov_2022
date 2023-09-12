package com.example.bankmanagementsystem;

import java.sql.*;

public class Master {


    String fullName;
    String password;
    String address;
    String city;
    double balance;
    Connection con;
    public Master() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver load successfully");
            DriverManager.getConnection("Jdbc:mysql://localhost:3306/bankdb", "root", "Albatros01@");
            System.out.println("database connected successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public Master(String fullName, String password, String adresss, String city, double balance) {
        this.fullName = fullName;
        this.password = password;
        this.address = adresss;
        this.city = city;
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int insertData() throws SQLException {
        int r = 0;
        try {
            PreparedStatement ps = con.prepareStatement("Insert into accountinfo(name,password,address,city,balance) values (?,?,?,?,?)");
            ps.setString(1, fullName);
            ps.setString(2, password);
            ps.setString(3, address);
            ps.setString(4, city);
            ps.setDouble(5, balance);
            r = ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

}

