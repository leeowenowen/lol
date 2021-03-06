package com.owo.app.net.http;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by wangli on 15-5-26.
 */
public abstract class LayerJsonResponseHandler extends JsonResponseHandler {
    private JsonResponseHandler mHandler;

    public LayerJsonResponseHandler(JsonResponseHandler handler) {
        mHandler = handler;
    }

    @Override
    public void onSuccess(JSONObject jsonObject) {
        onSuccessImpl(jsonObject);
        if (mHandler != null) {
            mHandler.onSuccess(jsonObject);
        }
    }

    @Override
    public void onFailure(JSONObject jsonObject) {
        onFailureImpl(jsonObject);
        if (mHandler != null) {
            mHandler.onFailure(jsonObject);
        }
    }

    protected abstract void onSuccessImpl(JSONObject jsonObject);

    protected abstract void onFailureImpl(JSONObject jsonObject);
}
