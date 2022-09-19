package gov.sanction.common;

public class MdmCommon {
	// getSubMajorHead endpiont Query Constant 
	public static final String GET_SUB_MAJOR_HEAD_QUERY= "select e from MstSubMajorHead e where e.majorHeadCode=:majorHeadCode";
	
	// getMinorHead endpiont Query Constant 
	public static final String MINOR_HEAD_QUERY="select e from MstMinorHead e where e.majorHeadCode=:BFC_DIV_TYPE_ID";
	
	// getExpenditureDivision  endpiont Query Constant 
	public static final String GET_EXPENDITURE_DIVISION_NULL_CONDITION_QUERY="select * from mdm.mst_bfc_division where BFC_DIVISION_ID IN ( select Distinct exp_division_id from mdm.mst_bfc_unit where admin_dept_id=:admindeptId)";
	public static final String GET_EXPENDITURE_DIVISION_QUERY="select a.* from mdm.mst_bfc_division a where a.BFC_DIVISION_ID IN ( select Distinct b.exp_division_id from mdm.mst_bfc_unit b where b.admin_dept_id=:admindeptId ) and a.BFC_DIV_TYPE_ID =:BfcDivTypeId";
	
	
}
