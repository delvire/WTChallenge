package me.elvira.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Users
{
    @Id
    @NotNull
    //@Size(min=2, max=50)
    private String userid;
    @NotNull
    //@Size(min=2, max=200)
    private String name;
    //@Size(min=2, max=200)
    private String emailaddr;
    //@Size(min=2, max=200)
    private String organisation;
    @NotNull
    //@Size(min=10, max=10)
    private String startdate;
    //@Size(min=10, max=10)
    private String enddate;


    public String getUserid() { return userid; }

    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmailaddr()
    {
        return emailaddr;
    }

    public void setEmailaddr(String emailaddr)
    {
        this.emailaddr = emailaddr;
    }

    public String getOrganisation()
    {
        return organisation;
    }

    public void setOrganisation(String organisation)
    {
        this.organisation = organisation;
    }

    public String getStartdate() { return startdate; }

    public void setStartdate(String startdate)
    {
        this.startdate = startdate;
    }

    public String getEnddate()
    {
        return enddate;
    }

    public void setEnddate(String enddate)
    {
        this.enddate = enddate;
    }
}