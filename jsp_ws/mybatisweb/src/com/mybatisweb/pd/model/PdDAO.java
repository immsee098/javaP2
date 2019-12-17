package com.mybatisweb.pd.model;

import java.util.List;
import java.util.Map;

import com.mybatisweb.cmt.model.CommentVO;

public interface PdDAO {
	public int insertPd(PdDTO dto);	
	public List<PdDTO> selectAll(Map<String, String> map);	
	public PdDTO selectByNo(int no);
	
	public int updatePd(PdDTO dto);
	public int deletePd(int no);
	public List<CommentVO> selectCmtAll();
	
}
