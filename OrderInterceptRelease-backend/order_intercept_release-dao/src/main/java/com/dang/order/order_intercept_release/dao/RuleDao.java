package com.dang.order.order_intercept_release.dao;
import java.util.List;

import com.dang.order.order_intercept_release.dto.Rule;
import com.dang.rocket.dao.mybatis.MyBatisBaseDao;

/**
 * 
 * @description:	 TODO add description
 * @version  Ver 1.0
 * @author   code generate
 * @Date	 2014
 *
 */
public interface RuleDao extends MyBatisBaseDao<Rule, java.lang.Long> {
	List<Rule> findAllRules();
}
