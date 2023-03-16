package com.example.pr4;

public class ComixCard
{
    private String name;
    private String desc;
    private int logo;

    public ComixCard(String name, String desc, int logo)
    {
        this.name = name;
        this.desc = desc;
        this.logo = logo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public int getLogo()
    {
        return logo;
    }

    public void setLogo(int logo)
    {
        this.logo = logo;
    }
}
