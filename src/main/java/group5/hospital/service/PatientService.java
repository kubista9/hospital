package group5.hospital.service;

import group5.hospital.entity.Patient;
import group5.hospital.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PatientService {
	private PatientRepository patientRepository;

	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	// METHODS //

	public void addPatient(Patient patient){
		patientRepository.save(patient);
	}

	public List<Patient> getAllPatients(){
		List<Patient> patients = new ArrayList<>();
		patientRepository.findAll().forEach(patient -> patients.add(patient));
		return patients;
	}

	public Optional<Patient> getPatientById(int id){
		return patientRepository.findById(id);
	}
}
