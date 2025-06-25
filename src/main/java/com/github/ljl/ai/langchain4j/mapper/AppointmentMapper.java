package com.github.ljl.ai.langchain4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.ljl.ai.langchain4j.entity.Appointment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: java-ai-langchain4j
 * @description:
 * @author: ljl
 * @create: 2025-06-25 23:06
 **/

@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
}
