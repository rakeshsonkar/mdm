package gov.sanction.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.json.JSONObject;

import gov.sanction.dto.MstMajorHeadDTO;
import gov.sanction.entity.AdminDepartment;
import gov.sanction.entity.DepartmentType;
import gov.sanction.entity.MstBfcDivision;
import gov.sanction.entity.MstBfcDivisionType;
import gov.sanction.entity.MstDepartment;
import gov.sanction.entity.MstDesignation;
import gov.sanction.entity.MstMinorHead;
import gov.sanction.entity.MstSubGroupHead;
import gov.sanction.entity.MstSubMajorHead;
import gov.sanction.entity.MstSubMinorHead;
import gov.sanction.exception.IFMSException;
import gov.sanction.request.AdminDepartmentDto;
import gov.sanction.request.DepartmentDto;
import gov.sanction.request.ExpenditureDivisionRequest;
import gov.sanction.request.MajorHeadDto;
import gov.sanction.request.MinorHeadDto;
import gov.sanction.request.UserInfoRequest;
import gov.sanction.response.AdminDepartmentResponseDto;
import gov.sanction.response.ApiResponse;
import gov.sanction.response.DepartmentResponseDto;
import gov.sanction.response.DesignationResponseDto;
import gov.sanction.response.DocumentTypeResponse;
import gov.sanction.response.Error;
import gov.sanction.response.MstBfcDivisionTypeResponse;
import gov.sanction.response.MstMajorHeadResponse;
import gov.sanction.response.SubGroupHeadResponseDto;
import gov.sanction.response.UserInfoResponse;
import gov.sanction.service.MdmService;
import gov.sanction.utils.DataMapper;

@Path("/SanctionSvc/mdm/v1.0/")
@RequestScoped
public class MdmController {

	@Inject
	private MdmService mdmService;

	@Path("/getMajorHead")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMajorHead() {
		try {
			List<MstMajorHeadDTO> mstMajorHeadDTO = mdmService.getAllMstMajorHead();
			final List<MstMajorHeadResponse> resultdata = new ArrayList<>();
			mstMajorHeadDTO.forEach(data -> {

				final MstMajorHeadResponse mstMajerHeadResponse = DataMapper.converTo(data, MstMajorHeadResponse.class);
				resultdata.add(mstMajerHeadResponse);
			});
			return Response.ok(ApiResponse.success(resultdata)).build();
		} catch (IFMSException e) {
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, e.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}
	}

	@Path("/getSubMajorHead")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSubMajorHead(@RequestBody String majorHeadCode) {
		try {
			JSONObject jsonObject = new JSONObject(majorHeadCode);
			List<MstSubMajorHead> mdmSubMajorHead = mdmService
					.getAllgetSubMajorHead((String) jsonObject.get("majorHeadCode"));
			return Response.ok(ApiResponse.success(mdmSubMajorHead)).build();
		} catch (IFMSException e) {
			e.printStackTrace();
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, e.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}
	}

	@Path("/getMinorHead")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMinorHead(@RequestBody String majorHeadCode) {
		try {
			JSONObject jsonObject = new JSONObject(majorHeadCode);
			final List<MstMinorHead> mdmSubMajorHead = mdmService
					.getAllMinorHead((String) jsonObject.get("majorHeadCode"));
			return Response.ok(ApiResponse.success(mdmSubMajorHead)).build();
		} catch (IFMSException m) {
			System.out.println(m);
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}
	}

	@Path("/getExpenditureDivision")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getExpenditureDivision(@RequestBody  ExpenditureDivisionRequest  expenditureDivisionRequest) {

		try {
			List<MstBfcDivision> expenditureDivisionList = mdmService
					.getAllExpenditureDivision(expenditureDivisionRequest);
			
			return Response.ok(ApiResponse.success(expenditureDivisionList)).build();
		} catch (IFMSException m) {
			System.out.println(m);
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}

	}

	@Path("/getBFCDivisionType")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBFCDivisionType() {
		try {
			List<MstBfcDivisionType> mstBfcDivisionTypes = mdmService.getAllBFCDivisionType();
			final List<MstBfcDivisionTypeResponse> resultdata = new ArrayList<>();
			mstBfcDivisionTypes.forEach(data -> {

				final MstBfcDivisionTypeResponse mstBfcDivisionTypeResponse = DataMapper.converTo(data,
						MstBfcDivisionTypeResponse.class);
				resultdata.add(mstBfcDivisionTypeResponse);
			});

			return Response.ok(ApiResponse.success(resultdata)).build();
		} catch (IFMSException m) {
			System.out.println(m);
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}
	}

	@POST
	@Path("/getDesignation")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllDesignation() {
		try {

			List<DesignationResponseDto> designationResponseList = new ArrayList<DesignationResponseDto>();
			List<MstDesignation> designationList = mdmService.getAllDesignation();
			for (MstDesignation designation : designationList) {
				DesignationResponseDto designationResponseDto = new DesignationResponseDto();

				designationResponseDto.setDesignationId(designation.getDesignationId());
				designationResponseDto.setDesignationDesEn(designation.getDesignationDesEn());
				designationResponseDto.setDesignationDesHi(designation.getDesignationDesHi());
				designationResponseDto.setIsActive(designation.getIsActive());
				designationResponseDto.setEffStartDt(designation.getEffStartDate());
				designationResponseDto.setEffEndDt(designation.getEffEndDate());
				designationResponseList.add(designationResponseDto);
			}
			return Response.ok(ApiResponse.success(designationResponseList)).build();

		} catch (IFMSException m) {
			System.out.println(m);
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}

	}

	@POST
	@Path("/getAdminDepartment")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAdminDepartmentById(@RequestBody AdminDepartmentDto adminDepartmentDto) {
		try {
			AdminDepartment adminDept = mdmService.getAdminDepartmentById(adminDepartmentDto.getAdminDeptId());
			AdminDepartmentResponseDto adminDeptResponse = new AdminDepartmentResponseDto();
			adminDeptResponse.setAdminDeptId(adminDept.getAdminDeptId());
			adminDeptResponse.setAdminNameEng(adminDept.getAdminNameEng());
			adminDeptResponse.setAdminNameHin(adminDept.getAdminNameHin());
			adminDeptResponse.setIsActive(adminDept.getIsActive());
			adminDeptResponse.setEffStartDate(adminDept.getEffStartDate());
			adminDeptResponse.setEffEndDate(adminDept.getEffEndDate());
			return Response.ok(ApiResponse.success(adminDeptResponse)).build();

		} catch (Exception m) {
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}
	}

	@POST
	@Path("/getDepartment")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDepartmentsByAdminDeptId(@RequestBody DepartmentDto departmentDto) {
		try {
			List<DepartmentResponseDto> departmentResponseList = new ArrayList<DepartmentResponseDto>();
			List<MstDepartment> departmentList = mdmService.getDepartmentsByAdminDeptId(departmentDto.getAdminDeptId());
			List<DepartmentType> departmentTypeList = mdmService.getAllDepartmentType();

			for (MstDepartment department : departmentList) {
				DepartmentResponseDto departmentResponseDto = new DepartmentResponseDto();
				for (DepartmentType departmentType : departmentTypeList) {

					if (departmentType.getDeptTypeId() == department.getDepartmentTypeId()) {
						departmentResponseDto.setDepartmentId(department.getDepartmentId());
						departmentResponseDto.setAdminDeptId(department.getAdminDeptId());
						departmentResponseDto.setDepartmentNameEng(department.getDepartmentNameEng());
						departmentResponseDto.setDepartmentNameHin(department.getDepartmentNameHin());
						departmentResponseDto.setHodOfficeId(department.getHodOfficeId());
						departmentResponseDto.setIsACTIVE(department.getIsACTIVE());
						departmentResponseDto.setEffStartDate(department.getEffStartDate());
						departmentResponseDto.setEffEndDate(department.getEffEndDate());
						departmentResponseDto.setDeptTypeId(departmentType.getDeptTypeId());
						departmentResponseDto.setDeptTypeCategory(departmentType.getDeptTypeCategory());
						departmentResponseDto.setTypeOfDepartment(departmentType.getTypeOfDepartment());

						departmentResponseList.add(departmentResponseDto);
					}
				}
			}
			return Response.ok(ApiResponse.success(departmentResponseList)).build();

		} catch (Exception m) {
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}
	}

	@POST
	@Path("/getSubMinorHead")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSubMinorHead(@RequestBody MinorHeadDto minorHeadDto) {
		try {

			List<MstSubMinorHead> subMinorHeadList = mdmService.getSubMinorHeads(minorHeadDto.getMajorHeadCode());
			return Response.ok(ApiResponse.success(subMinorHeadList)).build();

		} catch (Exception m) {
			m.printStackTrace();
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}

	}

	@POST
	@Path("/getSubGroupHead")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSubGroupHead(@RequestBody MajorHeadDto majorHeadDto) {
		try {
			List<SubGroupHeadResponseDto> subGroupHeadResponseList = new ArrayList<SubGroupHeadResponseDto>();
			List<MstSubGroupHead> subGroupHeadList = mdmService.getSubGroupHead(majorHeadDto.getMajorHeadCode());

			for (MstSubGroupHead subGroupHead : subGroupHeadList) {
				SubGroupHeadResponseDto subGroupHeadResponseDto = new SubGroupHeadResponseDto();
				subGroupHeadResponseDto.setBudgetHeadId(subGroupHead.getBudgetHeadId());
				subGroupHeadResponseDto.setCreatedBY(subGroupHead.getCreatedBY());
				subGroupHeadResponseDto.setCreatedDT(subGroupHead.getCreatedDT());
				subGroupHeadResponseDto.setEffEndDT(subGroupHead.getEffEndDT());
				subGroupHeadResponseDto.setEffStartDT(subGroupHead.getEffStartDT());
				subGroupHeadResponseDto.setGroupSubHeadCode(subGroupHead.getGroupSubHeadCode());
				subGroupHeadResponseDto.setGroupSubHeadNameEN(subGroupHead.getGroupSubHeadNameEN());
				subGroupHeadResponseList.add(subGroupHeadResponseDto);
			}
			return Response.ok(ApiResponse.success(subGroupHeadResponseList)).build();

		} catch (Exception m) {
			final String errorCode = "Internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}

	}

	@Path("/getDocumentType")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDocumentType() {
		try {
			List<DocumentTypeResponse> documentTypeResponse = new ArrayList<DocumentTypeResponse>();
			mdmService.getDocumentType().forEach(data -> {
				DocumentTypeResponse documentTypeResponse1 = DataMapper.converTo(data, DocumentTypeResponse.class);
				documentTypeResponse.add(documentTypeResponse1);
			});
			return Response.ok(ApiResponse.success(documentTypeResponse)).build();
		} catch (IFMSException m) {
			System.out.println(m);
			final String errorCode = "internal Server Error";
			final Error error = Error.create(errorCode, m.getMessage());
			return Response.ok(ApiResponse.error(error)).build();
		}
	}
	
	@Path("/getInfo")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getInfo(@RequestBody UserInfoRequest userRequest ) {
		try {
			UserInfoResponse userInfoResponse = mdmService.getInfo(userRequest);
			return Response.ok(ApiResponse.success(userInfoResponse)).build();
		} catch (Exception e) {
			e.printStackTrace();
			final String errorCode = "internal Server Error";
			final Error error = Error.create(errorCode, e.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(ApiResponse.error(error)).build();
		}

	}

}
