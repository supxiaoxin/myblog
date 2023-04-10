package com.mys.dao;

import com.mys.entity.Memory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: MemoryDao
 * @Description: 流年记持久层接口
 * @Author supxiaoxin
 */
@Mapper
@Repository
public interface MemoryDao {
    // 查询流年记
    List<Memory> listMemory();

    int saveMemory(Memory memory);

    Memory getMemory(Long id);

    int updateMemory(Memory memory);

    void deleteMemory(Long id);
}
