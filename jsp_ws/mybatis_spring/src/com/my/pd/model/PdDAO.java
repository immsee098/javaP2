package com.my.pd.model;

import java.util.List;
import java.util.Map;

public interface PdDAO {
	public int insertPd(PdDTO dto);	
	public List<PdDTO> selectAll(Map<String, String> map);	
	public PdDTO selectByNo(int no);
	
	public int updatePd(PdDTO dto);
	public int deletePd(int no);
	
}
