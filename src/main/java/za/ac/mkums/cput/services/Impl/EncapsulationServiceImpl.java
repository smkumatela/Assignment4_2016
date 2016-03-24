package za.ac.mkums.cput.services.Impl;

import za.ac.mkums.cput.domain.StdInfo_Encapsulation;

/**
 * Created by Songezo on 2016-03-20.
 */
public class EncapsulationServiceImpl {

    public StdInfo_Encapsulation getStudentInfo(){
        StdInfo_Encapsulation stdInfo = new StdInfo_Encapsulation();
        stdInfo.setSurname("Mkumatela");
        stdInfo.setStdNumber("2130542999");
        stdInfo.setYearOfStudy("3rd Year");

        return stdInfo;
    }

}
