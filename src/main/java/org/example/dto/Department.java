package org.example.dto;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Department {
    private String id;
    private String departmentName;
    private static int nextId = 1;

    public Department(String departmentName) {
        this.id = "D" + String.format("%03d", nextId);
        nextId++;
        this.departmentName = departmentName;
    }

    public String getId() {
        return id;
    }
}
