package com.smartcold.zigbee.manage.service;

import com.smartcold.zigbee.manage.dto.RdcDTO;
import com.smartcold.zigbee.manage.entity.RdcEntity;

import java.util.List;

/**
 * Author: qiunian.sun
 * Date: qiunian.sun(2016-04-29 00:13)
 */
public interface RdcService {

    List<RdcEntity> findRdcList();

    List<RdcDTO> findAllRdcDtos();

}
