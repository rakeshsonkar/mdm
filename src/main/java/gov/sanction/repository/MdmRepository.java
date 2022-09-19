package gov.sanction.repository;

import java.util.List;

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
import gov.sanction.request.ExpenditureDivisionRequest;
import gov.sanction.request.UserInfoRequest;
import gov.sanction.response.UserInfoResponse;

public interface MdmRepository {

	List<MstMajorHeadDTO> getAllMstMajorHead() throws IFMSException;

	List<MstSubMajorHead> getAllSubMajorHead(String majorHeadCode) throws IFMSException;

	List<MstMinorHead> getAllMinorHead(String majorHeadCode) throws IFMSException;

	List<MstBfcDivision> getAllExpenditureDivision(ExpenditureDivisionRequest expenditureDivisionRequest) throws IFMSException;

	List<MstBfcDivisionType> getAllBFCDivisionType() throws IFMSException;

	List<MstDocuments> getDocumentType() throws IFMSException;

	List<MstDesignation> getAllDesignation() throws IFMSException;

	List<MstDepartment> getDepartmentsByAdminDeptId(Integer adminDeptId) throws IFMSException;

	List<DepartmentType> getAllDepartmentType() throws IFMSException;

	List<DepartmentType> getAllDepartmentType(Integer adminDeptId) throws IFMSException;

	List<MstSubMinorHead> getSubMinorHeads(String majorHeadCode) throws IFMSException;

	List<MstSubGroupHead> getSubGroupHead(String majorHeadCode) throws IFMSException;

	AdminDepartment getAdminDepartmentById(Integer adminDeptId) throws IFMSException;

	UserInfoResponse getInfo(UserInfoRequest userRequest) throws IFMSException;

}
