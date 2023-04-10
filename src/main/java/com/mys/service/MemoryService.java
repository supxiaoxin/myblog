package com.mys.service;

import com.mys.entity.Memory;

import java.util.List;

/**
 * @ClassName: MemoryService
 * @Description: 流年记业务层接口
 * @Author: supxiaoxin
 */
public interface MemoryService {
    List<Memory> listMemory();

    int saveMemory(Memory memory);

    Memory getMemory(Long id);

    int updateMemory(Memory memory);

    void deleteMemory(Long id);
}
