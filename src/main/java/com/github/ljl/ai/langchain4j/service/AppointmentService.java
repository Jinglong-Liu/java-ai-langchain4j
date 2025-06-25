package com.github.ljl.ai.langchain4j.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.ljl.ai.langchain4j.entity.Appointment;

/**
 * @program: java-ai-langchain4j
 * @description:
 * @author: ljl
 * @create: 2025-06-25 23:07
 **/

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
