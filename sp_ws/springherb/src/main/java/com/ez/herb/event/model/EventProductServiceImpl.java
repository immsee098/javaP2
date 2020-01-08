package com.ez.herb.event.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ez.herb.product.model.ProductVO;

@Service
public class EventProductServiceImpl implements EventProductService{
	
	@Autowired
	private EventProductDAO eventProductDao;

	@Override
	@Transactional
	public int insertEventProduct(List<ProductVO> list, String eventName) {
		int cnt=0;
		try {
			for(ProductVO pdVo : list) {
				int productNo=pdVo.getProductNo();
				if(productNo!=0) {
					EventProductVO eventPdVo = new EventProductVO();
					eventPdVo.setProductNo(productNo);
					eventPdVo.setEventName(eventName);
					
					int count
					  =eventProductDao.selectEventProductCount(eventPdVo);
					if(count>0) {
						cnt=1;  //이미 해당 상품이 해당 이벤트로 등록된 경우 성공으로 간주
						//하고 skip
					}else {
						cnt=eventProductDao.insertEventProduct(eventPdVo);
					}
				}
			}//for
		}catch(RuntimeException e) {
			e.printStackTrace();
			cnt=-1;
		}
		
		return cnt;		
	}
	
	
	
}
