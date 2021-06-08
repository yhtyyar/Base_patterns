package com.java.base_patterns.structural_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class OpenAPharmacy {

    public static void main(String[] args) {

        PersonnelDepartment personnelDepartment = new PersonnelDepartment();

        List<Staff> staffList = new ArrayList<>();

        staffList.add(personnelDepartment.getStaffBySpecialty("pharmacist"));
        staffList.add(personnelDepartment.getStaffBySpecialty("pharmacist"));
        staffList.add(personnelDepartment.getStaffBySpecialty("junior pharmacist"));
        staffList.add(personnelDepartment.getStaffBySpecialty("junior pharmacist"));
        staffList.add(personnelDepartment.getStaffBySpecialty("pharmacy manager"));


        for (Staff staff : staffList) {
            staff.doJob();
        }

    }
}
