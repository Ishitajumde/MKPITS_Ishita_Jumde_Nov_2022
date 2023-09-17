package com.example.bank;

import java.io.Serializable;
import java.sql.*;

public class UserAccount implements Serializable {
    private String name;
    private String password;
    private String address;
    private String city;
    private double balance;
    Connection con;
    PreparedStatement ps;
    public UserAccount() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded Successfully");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root","Albatros01@");
            System.out.println("connected successfully");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public UserAccount(String name, String password, String address, String city, double balance) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.city = city;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int insertData(){
        int r = 0;
        try {
            ps = con.prepareStatement("Insert into accountinfo(name,password,address,city,balance) values (?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, password);
            ps.setString(3, address);
            ps.setString(4, city);
            ps.setDouble(5, balance);
            r = ps.executeUpdate();
            System.out.println(r);
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    public int check(){
        int result=0;
        try {
            ps=con.prepareStatement("select name,password from accountinfo where name=? and password=?");
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet r=ps.executeQuery();
            if (r.next()){
                result=0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

