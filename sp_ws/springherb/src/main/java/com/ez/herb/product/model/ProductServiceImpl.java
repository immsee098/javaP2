package com.ez.herb.product.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ez.herb.common.SearchVO;
import com.ez.herb.event.model.EventProductVO;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDao;

	@Override
	public List<ProductVO> selectProductByEvent(String eventName) {
		return productDao.selectProductByEvent(eventName);
	}

	@Override
	public ProductVO selectProduct(int productNo) {
		return productDao.selectProduct(productNo);
	}

	@Override
	public List<ProductVO> selectProductByCategory(int categoryNo) {
		return productDao.selectProductByCategory(categoryNo);
	}

	@Override
	public int insertProduct(ProductVO productVo) {
		return productDao.insertProduct(productVo);
	}

	@Override
	public List<ProductVO> selectProductAll(EventProductVO searchVo) {
		return productDao.selectProductAll(searchVo);
	}

	@Override
	public int getTotalRecord(EventProductVO searchVo) {
		return productDao.getTotalRecord(searchVo);
	}

	@Override
	@Transactional
	public int deleteMulti(List<ProductVO> list) {
		int cnt=0;
		try {
			for(ProductVO vo : list) {
				int productNo=vo.getProductNo();
				if(productNo!=0) {
					cnt=productDao.deleteProduct(productNo);
				}
			}
		}catch(RuntimeException e) {
			//선언적 트랜잭션에서는 런타임 예외가 발생하면 롤백한다. 
			//반면에 예외가 전혀 발생하지 않으면 커밋한다. 
			e.printStackTrace();
			cnt=-1;
		}
		
		return cnt;
	}

	
}
