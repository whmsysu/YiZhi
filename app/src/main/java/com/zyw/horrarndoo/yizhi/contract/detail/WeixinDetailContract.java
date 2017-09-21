package com.zyw.horrarndoo.yizhi.contract.detail;

import com.zyw.horrarndoo.sdk.base.BasePresenter;
import com.zyw.horrarndoo.sdk.base.IBaseModel;

/**
 * Created by Horrarndoo on 2017/9/21.
 * <p>
 * 微信精选详情页接口
 */

public interface WeixinDetailContract {

    abstract class WeixinDetailPresenter extends BasePresenter<IWeixinDetailModel,
            IWeixinDetailView> {
        /**
         * 加载微信精选详情
         *
         * @param url url
         */
        public abstract void loadWeixinChoiceDetail(String url);
    }

    interface IWeixinDetailModel extends IBaseModel {
    }

    interface IWeixinDetailView extends BaseDetailContract.IBaseDetailView {
        /**
         * 显示微信精选详细内容
         *
         * @param url url
         */
        void showWeixinChoiceDetail(String url);
    }
}