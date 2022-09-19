package gov.sanction.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import gov.sanction.dto.MstMajorHeadDTO;
import gov.sanction.entity.AdminDepartment;
import gov.sanction.entity.DepartmentType;
import gov.sanction.entity.MstBfcDivision;
import gov.sanction.entity.MstBfcDivisionType;
import gov.sanction.entity.MstDepartment;
import gov.sanction.entity.MstDesignation;
import gov.sanction.entity.MstDocuments;
import gov.sanction.entity.MstMinorHead;
import gov.sanction.entity.MstSubGroupHead;
import gov.sanction.entity.MstSubMajorHead;
import gov.sanction.entity.MstSubMinorHead;
import gov.sanction.exception.IFMSException;
import gov.sanction.repository.MdmRepository;
import gov.sanction.request.ExpenditureDivisionRequest;
import gov.sanction.request.UserInfoRequest;
import gov.sanction.response.UserInfoResponse;

@ApplicationScoped
public class MdmServiceImpl implements MdmService {

	@Inject
	private MdmRepository mdmRepository;

	@Override
	public List<MstMajorHeadDTO> getAllMstMajorHead() throws IFMSException {
		try {
			List<MstMajorHeadDTO> mstMajorHeadDTO = mdmRepository.getAllMstMajorHead();
			return mstMajorHeadDTO;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}

	}

	@Override
	public List<MstSubMajorHead> getAllgetSubMajorHead(String majorHeadCode) throws IFMSException {
		try {
			return mdmRepository.getAllSubMajorHead(majorHeadCode);
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstMinorHead> getAllMinorHead(String majorHeadCode) throws IFMSException {
		try {
			return mdmRepository.getAllMinorHead(majorHeadCode);
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstBfcDivision> getAllExpenditureDivision(ExpenditureDivisionRequest expenditureDivisionRequest) throws IFMSException {
		try {
			return mdmRepository.getAllExpenditureDivision(expenditureDivisionRequest);
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstBfcDivisionType> getAllBFCDivisionType() throws IFMSException {
		try {
			return mdmRepository.getAllBFCDivisionType();
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstDocuments> getDocumentType() throws IFMSException {
		try {
			return mdmRepository.getDocumentType();
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstDesignation> getAllDesignation() throws IFMSException {
		try {
			return mdmRepository.getAllDesignation();
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstDepartment> getDepartmentsByAdminDeptId(Integer adminDeptId) throws IFMSException {

		try {
			return mdmRepository.getDepartmentsByAdminDeptId(adminDeptId);
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<DepartmentType> getAllDepartmentType() throws IFMSException {
		try {
			return mdmRepository.getAllDepartmentType();
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

//	@Override
//	public List<DepartmentType> getAllDepartmentType(Integer adminDeptId) throws IFMSException {
//
//		try {
//			return mdmRepository.getAllDepartmentType(adminDeptId);
//		} catch (Exception e) {
//			final String mes = "Something went Wrong";
//			throw new IFMSException(mes);
//		}
//	}

	@Override
	public List<MstSubMinorHead> getSubMinorHeads(String majorHeadCode) throws IFMSException {
		try {
			return mdmRepository.getSubMinorHeads(majorHeadCode);
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}

	}

	@Override
	public List<MstSubGroupHead> getSubGroupHead(String majorHeadCode) throws IFMSException {

		try {
			return mdmRepository.getSubGroupHead(majorHeadCode);
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public AdminDepartment getAdminDepartmentById(Integer adminDeptId) throws IFMSException {
		try {
			return mdmRepository.getAdminDepartmentById(adminDeptId);
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public UserInfoResponse getInfo(UserInfoRequest userRequest) throws IFMSException {
		try {
			return mdmRepository.getInfo(userRequest);
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

}
