package com.dtm.service;

import org.springframework.transaction.annotation.Transactional;

import com.dtm.businessobject.OwnedVehicleBO;
import com.dtm.businessobject.OwnerBO;
import com.dtm.dao.OwnerDao;
import com.dtm.dao.VehicleDao;
import com.dtm.valueobject.VehicleRegistrationVO;

public class VehicleService {
	private OwnerDao ownerDao;
	private VehicleDao vehicleDao;
	private int vehicleId;
	private int ownerId;
	
	private OwnerBO ownerBo;
	private OwnedVehicleBO ownerVehicleBo;
	
	
	public void setOwnerDao(OwnerDao ownerDao) {
		this.ownerDao = ownerDao;
	}

	public void setVehicleDao(VehicleDao vehicleDao) {
		this.vehicleDao = vehicleDao;
	}
	
    /**
     * Add annotation to enable global transaction using annotation-driven approach
     * 
     */
	
	@Transactional(readOnly=false)
	public void register(VehicleRegistrationVO vrbo){
		ownerBo = new OwnerBO();
		ownerBo.setFirstName(vrbo.getFirstName());
		ownerBo.setLastName(vrbo.getLastName());
		ownerBo.setGender(vrbo.getGender());
		ownerBo.setDob(vrbo.getDob());
		
		ownerId = ownerDao.saveOwnerAndReturnId(ownerBo);
		
		//System.out.println(ownerId);
		
		vehicleId = vehicleDao.findVehicleId(vrbo.getMake(), vrbo.getModel());
		
		//System.out.println(vehicleId);
		
		ownerVehicleBo = new OwnedVehicleBO();
		
		ownerVehicleBo.setOwnerId(ownerId);
		ownerVehicleBo.setVehicleId(vehicleId);
		ownerVehicleBo.setRegistrationNo(vrbo.getRegistrationNo());
		ownerVehicleBo.setEngineNo(vrbo.getEngineNo());
		ownerVehicleBo.setChachisNo(vrbo.getChachisNo());
		ownerVehicleBo.setPurchseDate(vrbo.getPurchaseDate());
		ownerVehicleBo.setDateOfRegistration(vrbo.getDateOfRegistration());
		
		vehicleDao.saveOwnedVehicle(ownerVehicleBo);
		
	}

}
