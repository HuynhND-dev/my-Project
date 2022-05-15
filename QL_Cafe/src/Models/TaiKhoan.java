/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class TaiKhoan {
    private int id;
    private String UserName,Password;
    public TaiKhoan()
    {
        id=0;
        UserName = "";
        Password = "";
    }
    public TaiKhoan(int id,String Username,String PassWord)
    {
        this.id=id;
        this.UserName=Username;
        this.Password=PassWord;
    }
    public void SetID(int id)
    {
        this.id=id;
    }
    public int GetID()
    {
        return this.id;
    }

     public void SetUsername(String Username)
    {
        this.UserName=Username;
    }
    public String GetUsername()
    {
        return this.UserName;
    }
     public void SetPassword(String Password)
    {
        this.Password=Password;
    }
    public String GetPassword()
    {
        return this.Password;
    }
}
