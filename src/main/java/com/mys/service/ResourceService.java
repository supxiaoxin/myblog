package com.mys.service;

import com.mys.entity.Picture;
import com.mys.entity.Resources;

import java.util.List;

/**
 * @Description: 资源库业务层接口
 * @Author: supxiaoxin
 */
public interface ResourceService {

    int savePicture(Resources resources);

    List<Resources> listResources();

    Resources getResource(Long id);

    int updateResource(Resources resources);

    void deleteResource(Long id);

    void is_published(Long id);


    int changePublished(boolean flage,Long id);


    List<Resources> getStudyResource(String studyResource);

    List<Resources> getPictureResource(String pictureResource);

    List<Resources> getOfficeResource(String officeResource);

    List<Resources> getRecreationResource(String recreationResource);

    List<Resources> getDesignResource(String designResource);

    List<Resources> getSearchResource(String searchResource);

    List<Resources> getToolResource(String toolResource);

    Integer getStudyResourceTotle(String studyResource);

    Integer getPictureResourceTotle(String pictureResource);

    Integer getOfficeResourceTotle(String officeResource);

    Integer getRecreationResourceTotle(String recreationResource);

    Integer getDesignResourceTotle(String designResource);

    Integer getSearchResourceTotle(String searchResource);

    Integer getToolResourceTotle(String toolResource);
}