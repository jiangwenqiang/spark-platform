package com.spark.platform.flowable.api.feign.client;

import com.spark.platform.common.base.constants.ServiceNameConstants;
import com.spark.platform.common.base.support.ApiResponse;
import com.spark.platform.common.feign.config.FeignRequestInterceptorConfig;
import com.spark.platform.flowable.api.feign.fallback.TaskFallBackFactory;
import com.spark.platform.flowable.api.request.TaskRequestQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author: wangdingfeng
 * @Date: 2020/4/8 22:38
 * @Description:
 */
@FeignClient(contextId = "taskClient", name = ServiceNameConstants.SPARK_FLOWABLE, configuration = FeignRequestInterceptorConfig.class, fallbackFactory = TaskFallBackFactory.class)
public interface TaskClient {
    /**
     * 执行任务
     * @param taskId
     * @param action
     * @param assignee
     * @param localScope
     * @param variables
     * @return
     */
    @PostMapping(value = "/runtime/tasks/{taskId}")
    ApiResponse executeTask(@PathVariable String taskId, @RequestParam("action") String action, @RequestParam(value = "assignee") String assignee,
                            @RequestParam(value = "localScope") boolean localScope, @RequestBody Map<String, Object> variables);

    /**
     * 添加批注信息
     * @param taskId 任务ID
     * @param processInstanceId 流程实例ID
     * @param message 批注信息
     * @return
     */
    @PostMapping(value = "/runtime/tasks/comment")
    ApiResponse addComments(@RequestParam String taskId,@RequestParam String processInstanceId,@RequestParam String message);

    /**
     *
     * @param taskRequestQuery
     * @return
     */
    @GetMapping(value = "/runtime/tasks")
    ApiResponse getTask(TaskRequestQuery taskRequestQuery);


}
