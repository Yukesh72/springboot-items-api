package com.example.JavaTest;

import jakarta.validation.constraints.NotBlank;

public class model
{

    private Long id;

    @NotBlank                  //VALIDATION
    private String name;

    @NotBlank                       //VALIDATION
    private String description;



    //GETTERS AND SETTERS

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

}
