package kr.or.kosta.dao;

import java.util.List;

import kr.or.kosta.dto.EmpDTO;

public interface EmpDAO {
	/*사원 추가*/
	public int insert(EmpDTO emp);
	
	/*사원 리스트 출력*/
	public List<EmpDTO> emplist(EmpDTO emp);
	
	/*사원 업데이트*/
	public int update(EmpDTO emp);
	
	/*사원 삭제*/
	public int delete(EmpDTO emp);
}
