package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jiadian implements Switch{
    private String name;
    //状态：开或者关.
    private boolean status;//false默认是关闭
    @Override
    public void press(){
        //控制当前设备开和关
        status=!status;
        }
    }

