package kodlama.io.HRMS.adapters;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import kodlama.io.HRMS.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisAdapter implements ValidationService<JobSeeker>{
	

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		KPSPublicSoapProxy kpsPublic;
		try {
			kpsPublic = new KPSPublicSoapProxy();
			boolean durum = kpsPublic.TCKimlikNoDogrula(
					Long.parseLong(jobSeeker.getNationalityId()), 
					jobSeeker.getFirstName().toUpperCase(), 
					jobSeeker.getLastName().toUpperCase(), 
							Integer.parseInt(jobSeeker.getDateOfBirth()));
			return durum;
		} catch (RemoteException | NumberFormatException e1) {
			e1.printStackTrace();
		}
			return false;
	}
}