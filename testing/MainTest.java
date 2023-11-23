package com.main.maintest;
import com.data.hospital.Hospital;
import org.doc.doctor.Doctor;
import sam.info.patient.Patient;
import java.util.Scanner;
public class MainTest
{
	public static void main(String[]args)
	{
       System.out.println("Start of Main Method");
       Hospital h1 = new Hospital();
       Doctor d1 = new Doctor();
       Patient p1 = new Patient();

    
       Scanner sc = null;
       String hospitalName,hospitalId,doctorId, doctorName,doctorSpeciality = null;
       String patientId,patientName =null;
       String patientRoom = null;
       sc = new Scanner(System.in);
       System.out.println("Enter the Hospital Id : ");
       hospitalId = sc.nextLine();
       System.out.println("Enter the Hospital Name : ");
       hospitalName = sc.nextLine();
       System.out.println("Enter Doctor Id : ");
       doctorId = sc.nextLine();
       System.out.println("Enter Doctor Name : ");
       doctorName = sc.nextLine();
       System.out.println("Enter Doctor Speciality : ");
       doctorSpeciality = sc.nextLine();
       System.out.println("Enter Patient Id : ");
       patientId = sc.nextLine();
       System.out.println("Enter Patient Name : ");
       patientName = sc.nextLine();
       System.out.println("Enter Patient Room : ");
       patientRoom = sc.nextLine();
       h1.setHospitalName(hospitalName);
       h1.setHospitalId(hospitalId);
       d1.setDoctorId(doctorId);
       d1.setDoctorName(doctorName);
       p1.setPatientId(patientId);
       p1.setPatientName(patientName);
       p1.setPatientRoom(patientRoom);
       String hid = h1.getHospitalId();
       String hname = h1.getHospitalName();
       String did = d1.getDoctorId();
       String dname = d1.getDoctorName();
       String dspeciality = d1.getDoctorSpeciality();
       String pid = p1.getPatientId();
       String pname = p1.getPatientName();
       String proom = p1.getPatientRoom();
       System.out.println("Hospital Information:");
       System.out.println("=====================");
       System.out.println("Hospital Id Number : "+hid);
       System.out.println("Hospital Name : "+hname);
       System.out.println("Patient Id Number :"+pid);
       System.out.println("Patient Name :" +pname);
       System.out.println("Patient Room : "+proom);
       System.out.println("Doctor Id : "+did);
       System.out.println("Doctor Name : "+dname);
       System.out.println("Doctor Speciality : "+dspeciality);
       double pBill = h1.payBill(1500.00);

       System.out.println("End of Main Method");

	}
}