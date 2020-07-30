package com.accp.service.lyb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StarsMapper;
import com.accp.domain.Stars;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class starService {
   @Autowired
   private StarsMapper stamapper;
   
   public PageInfo<Stars> findBypage(Integer pageNum,Integer pageSize){
	   Page<Stars> page=PageHelper.startPage(pageNum, pageSize);
	   stamapper.selectByExample(null);
	   return page.toPageInfo();
   }
   public int remove(Integer sid) {
	   return stamapper.deleteByPrimaryKey(sid);
   }
   public int create(Stars sta) {
	   return stamapper.insert(sta);
   }
   public int update(Stars sta) {
	   return stamapper.updateByPrimaryKeySelective(sta);
   }
}
