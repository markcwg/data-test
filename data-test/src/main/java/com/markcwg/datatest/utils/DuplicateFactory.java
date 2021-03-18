package com.markcwg.datatest.utils;



import com.markcwg.datatest.entity.Duplicate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * email caiwg@sucsoft.com
 *
 * @author markcwg
 * @date 2021/3/18 10:27
 */
public class DuplicateFactory {
   public static Duplicate productOne () {
       Duplicate data = new Duplicate();
       data.setDuplicateCode("KM-CG-20210317-001");
       data.setDuplicateDriver("test");
       data.setComeDriverAgent("test");
       data.setDisposalEnterprisePhone("18468126183");
       data.setProductionEnterprisePhone("18468126183");
       data.setTransportEnterprisePhone("18468126183");
       data.setDisposalEnterpriseName("昆明丰德环保电力有限公司");
       data.setProductionEnterpriseName("昆明市呈贡区污水处理厂");
       data.setTransportEnterpriseName("上海同济建设有限公司");
       data.setTransportRoutes("测试路线");
       data.setTransportGrossWeight(11.1);
       data.setTransportNetWeight(22.2);
       data.setTransportTareWeight(33.3);
       data.setReceiveGrossWeight(11.1);
       data.setReceiveNetWeight(22.2);
       data.setReceiveTareWeight(33.3);
       data.setTransportTime(new Date());
       data.setReceiveTime(new Date());
       data.setTransportMoistureContent("60");
       data.setReceiveMoistureContent("60");
       data.setComeLicensePlate("云A345Y2");
       data.setTransportLicensePlate("云A345Y2");
       data.setProductionAgent("test");
       data.setTransportAgent("test");
       data.setReceiveAgent("test");
       return data;
   }

   public static List<Duplicate> productBatch () {
       List<Duplicate> data = new ArrayList<>();;
       for (int i = 1; i <= 9; i++) {
           Duplicate temp = productOne();
           temp.setDuplicateCode("KM-CG-20210317-00" + i);
           data.add(temp);
       }
       return data;
   }
}
