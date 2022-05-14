package com.design.mvvm.view.adapter;

import com.design.mvvm.view.adapter.base.BaseViewHolderItem;

public interface ICartoonItem extends BaseViewHolderItem {

    int typeText = 0;
    int typeImage = 1;

    /**
     * 获取标题名称
     *
     * @return
     */
    String getITitleName();

    /**
     * 获取图片lian
     *
     * @return
     */
    String getPictureUrl();

}
