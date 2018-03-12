package com.king.api.smp;

import java.util.List;
import java.util.Map;

import com.king.dal.gen.model.smp.ScheduleJob;
import com.king.dal.gen.model.smp.ScheduleJobLog;
import com.king.dal.gen.service.BaseService;

/**
 * 定时任务
 * @author King chen
 * @email 396885563@qq.com
 * @date 2017年12月29日
 */
public interface ScheduleJobService extends BaseService<ScheduleJob>{

	
	/**
	 * 根据ID，查询定时任务日志
	 *//*
	ScheduleJobLog queryObject(Long jobId);
	
	*//**
	 * 查询定时任务日志列表
	 *//*
	List<ScheduleJobLog> queryList(Map<String, Object> map);
	
	*//**
	 * 查询总数
	 *//*
	int queryTotal(Map<String, Object> map);
	
	*//**
	 * 保存定时任务日志
	 *//*
	void save(ScheduleJobLog log);*/
	
	/**
	 * 根据ID，查询定时任务日志
	 */
	ScheduleJobLog queryScheduleJobLog(Long jobId);
	
	/**
	 * 查询定时任务日志列表
	 */
	List<ScheduleJobLog> queryScheduleJobLogList(Map<String, Object> map);
	
	/**
	 * 查询总数
	 */
	int queryScheduleJobLogTotal(Map<String, Object> map);
	
	/**
	 * 保存定时任务日志
	 */
	void save(ScheduleJobLog log);
	
	/**
	 * 保存定时任务
	 */
	void save(ScheduleJob scheduleJob);
	
	/**
	 * 更新定时任务
	 */
	void update(ScheduleJob scheduleJob);
	
	/**
	 * 批量删除定时任务
	 */
	void deleteBatch(Long[] jobIds);
	
	/**
	 * 批量更新定时任务状态
	 */
	int updateBatch(Long[] jobIds, int status);
	
	/**
	 * 立即执行
	 */
	void run(Long[] jobIds);
	
	/**
	 * 暂停运行
	 */
	void pause(Long[] jobIds);
	
	/**
	 * 恢复运行
	 */
	void resume(Long[] jobIds);
}
