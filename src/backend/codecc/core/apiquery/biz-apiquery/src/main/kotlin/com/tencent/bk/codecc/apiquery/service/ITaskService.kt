package com.tencent.bk.codecc.apiquery.service

import com.tencent.bk.codecc.apiquery.task.TaskQueryReq
import com.tencent.bk.codecc.apiquery.task.model.CustomProjModel
import com.tencent.bk.codecc.apiquery.task.model.TaskInfoModel
import com.tencent.bk.codecc.apiquery.task.model.ToolConfigInfoModel
import com.tencent.devops.common.api.pojo.Page

interface ITaskService {

    /**
     * 根据入参获取任务清单
     */
    fun getTaskList(taskQueryReq: TaskQueryReq): List<Long>

    /**
     * 根据入参获取任务详情清单
     */
    fun getTaskDetailList(
        taskQueryReq: TaskQueryReq, pageNum: Int?,
        pageSize: Int?,
        sortField: String?,
        sortType: String?
    ): Page<TaskInfoModel>

    /**
     * 通过项目id查询任务详情清单
     */
    fun getTaskDetailByProjectId(
        projectId : String,
        pageNum: Int?,
        pageSize: Int?,
        sortField: String?,
        sortType: String?
    ): Page<TaskInfoModel>

    /**
     * 通过任务id查询个性化触发清单
     */
    fun findCustomProjByTaskIds(
        taskQueryReq: TaskQueryReq,
        pageNum: Int?,
        pageSize: Int?,
        sortField: String?,
        sortType: String?
    ): Page<CustomProjModel>

    /**
     * 根据任务id查询工具清单
     */
    fun findToolListByTaskIds(
        taskQueryReq: TaskQueryReq,
        pageNum: Int?,
        pageSize: Int?,
        sortField: String?,
        sortType: String?
    ) : Page<ToolConfigInfoModel>

}