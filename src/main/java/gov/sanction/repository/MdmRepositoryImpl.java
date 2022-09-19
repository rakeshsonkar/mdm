package gov.sanction.repository;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import gov.sanction.dto.MstMajorHeadDTO;
import gov.sanction.entity.AdminDepartment;
import gov.sanction.entity.DepartmentType;
import gov.sanction.entity.MstBfcDivision;
import gov.sanction.entity.MstBfcDivisionType;
import gov.sanction.entity.MstDepartment;
import gov.sanction.entity.MstDesignation;
import gov.sanction.entity.MstDocuments;
import gov.sanction.entity.MstMajorHead;
import gov.sanction.entity.MstMinorHead;
import gov.sanction.entity.MstSubGroupHead;
import gov.sanction.entity.MstSubMajorHead;
import gov.sanction.entity.MstSubMinorHead;
import gov.sanction.exception.IFMSException;
import gov.sanction.request.ExpenditureDivisionRequest;
import gov.sanction.request.UserInfoRequest;
import gov.sanction.response.UserInfoResponse;
import gov.sanction.utils.DataMapper;

@ApplicationScoped
public class MdmRepositoryImpl implements MdmRepository {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<MstMajorHeadDTO> getAllMstMajorHead() throws IFMSException {
		try {

			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<MstMajorHead> cq = cb.createQuery(MstMajorHead.class);
			Root<MstMajorHead> rootEntry = cq.from(MstMajorHead.class);
			CriteriaQuery<MstMajorHead> all = cq.select(rootEntry);
			TypedQuery<MstMajorHead> allQuery = entityManager.createQuery(all);
			final List<MstMajorHeadDTO> resultdata = new ArrayList<>();
			allQuery.getResultList().forEach(data -> {
				MstMajorHeadDTO mstMajorHeadDTO = DataMapper.converTo(data, MstMajorHeadDTO.class);
				resultdata.add(mstMajorHeadDTO);
			});
			return resultdata;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}

	}

	@Override
	public List<MstSubMajorHead> getAllSubMajorHead(String majorHeadCode) throws IFMSException {
		try {
			List<MstSubMajorHead> mdmSubMajorHead = entityManager
					.createQuery("select e from MstSubMajorHead e where e.majorHeadCode=:majorHeadCode",
							MstSubMajorHead.class)
					.setParameter("majorHeadCode", majorHeadCode).getResultList();
			System.out.println(mdmSubMajorHead.toString());
			return mdmSubMajorHead;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}

	}

	@Override
	public List<MstMinorHead> getAllMinorHead(String majorHeadCode) throws IFMSException {
		try {
			List<MstMinorHead> mdmMstMinorHead = entityManager
					.createQuery("select e from MstMinorHead e where e.majorHeadCode=:BFC_DIV_TYPE_ID",
							MstMinorHead.class)
					.setParameter("BFC_DIV_TYPE_ID", majorHeadCode).getResultList();
			System.out.println(mdmMstMinorHead);

			return mdmMstMinorHead;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}

	}

	@Override
	public List<MstBfcDivision> getAllExpenditureDivision(ExpenditureDivisionRequest expenditureDivisionRequest)
			throws IFMSException {
		try {
			if (expenditureDivisionRequest.getBfcDivTypeId() == null) {
				Query query = entityManager.createNativeQuery(
						"select * from mdm.mst_bfc_division where BFC_DIVISION_ID IN ( select Distinct exp_division_id from mdm.mst_bfc_unit where admin_dept_id=:admindeptId)",
						MstBfcDivision.class);
				query.setParameter("admindeptId", expenditureDivisionRequest.getAdminDeptId());
				return query.getResultList();

			} else {

				Query query = entityManager.createNativeQuery(
						"select a.* from mdm.mst_bfc_division a where a.BFC_DIVISION_ID IN ( select Distinct b.exp_division_id from mdm.mst_bfc_unit b where b.admin_dept_id=:admindeptId ) and a.BFC_DIV_TYPE_ID =:BfcDivTypeId",
						MstBfcDivision.class);
				query.setParameter("admindeptId", expenditureDivisionRequest.getAdminDeptId());
				query.setParameter("BfcDivTypeId", expenditureDivisionRequest.getBfcDivTypeId());
				List<MstBfcDivision> test = query.getResultList();
				return test;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			throw new IFMSException("Something went Wrong");
		}

	}

	@Override
	public List<MstBfcDivisionType> getAllBFCDivisionType() throws IFMSException {

		try {

			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<MstBfcDivisionType> cq = cb.createQuery(MstBfcDivisionType.class);
			Root<MstBfcDivisionType> rootEntry = cq.from(MstBfcDivisionType.class);
			CriteriaQuery<MstBfcDivisionType> all = cq.select(rootEntry);
			TypedQuery<MstBfcDivisionType> allQuery = entityManager.createQuery(all);

			return allQuery.getResultList();

		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstDocuments> getDocumentType() throws IFMSException {
		try {

			List<MstDocuments> listOfDocumentTypes = entityManager
					.createQuery("SELECT a FROM MstDocuments a", MstDocuments.class).getResultList();

			return listOfDocumentTypes;
		} catch (Exception e) {
			e.printStackTrace();
			throw new IFMSException("Something went Wrong");
		}
	}

	@Override
	public List<MstDesignation> getAllDesignation() throws IFMSException {
		try {
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<MstDesignation> cq = cb.createQuery(MstDesignation.class);
			Root<MstDesignation> rootEntry = cq.from(MstDesignation.class);
			CriteriaQuery<MstDesignation> all = cq.select(rootEntry);
			TypedQuery<MstDesignation> allQuery = entityManager.createQuery(all);
			return allQuery.getResultList();
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstDepartment> getDepartmentsByAdminDeptId(Integer adminDeptId) throws IFMSException {
		try {
			String qlQuery = "SELECT dept FROM MstDepartment dept WHERE dept.adminDeptId=" + adminDeptId;
			List<MstDepartment> departmentList = new ArrayList<MstDepartment>();
			Query query = entityManager.createQuery(qlQuery);
			departmentList = query.getResultList();
			return departmentList;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<DepartmentType> getAllDepartmentType() throws IFMSException {
		try {
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<DepartmentType> cq = cb.createQuery(DepartmentType.class);
			Root<DepartmentType> rootEntry = cq.from(DepartmentType.class);
			CriteriaQuery<DepartmentType> all = cq.select(rootEntry);
			TypedQuery<DepartmentType> allQuery = entityManager.createQuery(all);
			return allQuery.getResultList();

		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<DepartmentType> getAllDepartmentType(Integer adminDeptId) throws IFMSException {
		try {
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<DepartmentType> cq = cb.createQuery(DepartmentType.class);
			Root<DepartmentType> rootEntry = cq.from(DepartmentType.class);
			CriteriaQuery<DepartmentType> all = cq.select(rootEntry);
			TypedQuery<DepartmentType> allQuery = entityManager.createQuery(all);
			return allQuery.getResultList();
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstSubMinorHead> getSubMinorHeads(String majorHeadCode) throws IFMSException {
		try {
			String qlQuery = "SELECT minor FROM MstSubMinorHead minor WHERE minor.majorHeadCode=" + majorHeadCode;
			List<MstSubMinorHead> subMinorHeadList = new ArrayList<MstSubMinorHead>();
			Query query = entityManager.createQuery(qlQuery);
			subMinorHeadList = query.getResultList();
			return subMinorHeadList;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public List<MstSubGroupHead> getSubGroupHead(String majorHeadCode) throws IFMSException {
		try {
			String qlQuery = "SELECT m FROM MstSubGroupHead m WHERE m.majorHeadCode=" + majorHeadCode;
			List<MstSubGroupHead> subGroupHeadList = new ArrayList<MstSubGroupHead>();
			Query query = entityManager.createQuery(qlQuery);
			subGroupHeadList = query.getResultList();
			return subGroupHeadList;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public AdminDepartment getAdminDepartmentById(Integer adminDeptId) throws IFMSException {
		try {
			AdminDepartment adminDept = entityManager.find(AdminDepartment.class, adminDeptId);
			return adminDept;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

	@Override
	public UserInfoResponse getInfo(UserInfoRequest userRequest) throws IFMSException {

		try {
			Query query = entityManager.createNativeQuery(
					"select CODE_ENGLISH_NAME, CODE_HINDI_NAME from mdm.vw_identity_value_master where identifier_id=:aType and identifier_value=:aValue");
			query.setParameter("aType", userRequest.getaType());
			query.setParameter("aValue", userRequest.getaValue());
			Object[] UserInfo = (Object[]) query.getSingleResult();
			UserInfoResponse userInfoResponse = new UserInfoResponse();
			userInfoResponse.setNameEng((String) UserInfo[0]);
			userInfoResponse.setNameHin((String) UserInfo[1]);

			return userInfoResponse;
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);
		}
	}

}
